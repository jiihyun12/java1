//package chatting;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
////서버에서 직접 메세지를 입력 받아 클라이어느에 전송하는 메서드
//class ServerInputThread extends Thread{
//	private final List<PrintWriter> outputList;
//	
//	public ServerInputThread(List<PrintWriter> outputList) {
//		this.outputList = outputList;
//	}
//	
//	@Override
//	public void run() {
//		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//				){
//			String message;
//			
//			while((message = bufferedReader.readLine()) != null) {
//				System.out.println("서버 : " + message);
//				synchronized (outputList) {
//					for(PrintWriter out : outputList) {
//						out.println("서버" + message);
//					}
//				}
//			}
//			
//		} catch (Exception e) {
//			System.out.println("서버 입력을 처리하는 중 오류 발생 ");
//			e.printStackTrace();
//		}
//	}
//	
//}
//
////서버에서 직접 메세지를 입력 받아 클라이언트에 전송하는 메서드
//class ServerThread extends Thread{
//	private final Socket socket;
//	private final List<PrintWriter> outputList;
//	private PrintWriter output;
//	private BufferedReader input;
//	
//	public ServerThread(Socket socket, List<PrintWriter> outputList ) {
//		this.socket = socket;
//		this.outputList = outputList;
//		
//		try {
//			output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
//			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			
//			synchronized (outputList) {
//				outputList.add(output);
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			closeResource();		
//			}
//		
//	}
//	@Override
//	public void run() {
//		String line;
//		try{
//			while((line= input.readLine()) != null) {
////			서버 콘솔에 수신한 메세지를 출력
//				System.out.println(line);
//				
//				synchronized (outputList) {
//					for(PrintWriter out: outputList) {
//						out.println(line);
//					}
//				}
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			closeResource();
//		}
//	}
//	
//	private void closeResource() {
//		try {
//			synchronized (outputList) {
//				outputList.remove(output);
//			}
//			if(input != null) {
//				input.close();
//			}
//			if(output != null) {
//				output.close();
//			}
//			if(socket != null) {
//				socket.close();
//			}
//		} catch (IOException e) {
//			// TODO: handle exception
//		}
//	}
//	
//}
//
//
//public class Server {
//
//	public static void main(String[] args) throws IOException {
//		ServerSocket serversocket = null;
//		List<PrintWriter> outputList = Collections.synchronizedList(new ArrayList<>());
//		
//		try {
//			serversocket = new ServerSocket(8000);
//			System.out.println("[서버 실행 : 클라이언트 대기중...]");
//			
//			ServerInputThread serverInputThread = new ServerInputThread(outputList);
//			
//			serverInputThread.start();
//			
//			while(true) {
//				Socket clientSocket = serversocket.accept();
//				System.out.println("[접속 : " + clientSocket + "]");
//				ServerThread serverThread = new ServerThread(clientSocket, outputList);
//				serverThread.start();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if(serversocket != null && !serversocket.isClosed()) {
//				serversocket.close();
//			}
//		}
//	}
//}
//
//



package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

class ClientThread extends Thread{
   private BufferedReader input;
   
   public ClientThread(BufferedReader input) {
      this.input = input;
   }
   
   @Override
   public void run() {
      String line;
      try {
         
         while((line = input.readLine()) != null) {
            System.out.println(line);
         }
         
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         try {
            if(input != null) {
               input.close();
            }
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      
   }
}

public class Client {
   public static void main(String[] args) throws IOException{
      String name = "sehwan";
      String ip = "192.168.30.254";
      
//      try-with-resources
      try (
            Socket socket = new Socket(ip, 8000);
            PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader keyInput = new BufferedReader(new InputStreamReader(System.in));
         ){
         System.out.println("서버와 연결이 되었습니다.");
         
//         서버로부터 메세지를 처리하는 스레드
         ClientThread clientThread = new ClientThread(input);
         clientThread.start();
         
         String line;
         while((line = keyInput.readLine()) != null) {
            output.println(name + " :" + line);
         }
         
      } catch (UnknownHostException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } 
   }
}

