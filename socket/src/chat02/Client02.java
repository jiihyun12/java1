package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) throws IOException {
		Socket clientsocket = null;
//		PrintWriter writer = null;
//		양방향 통신을 할 때는 Buffer
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
//		String serverIP = "192.168.181.2";
		String serverIP = "localhost";  // 내가 나한테 접속할 때
		
		try {
//			IP, port
			clientsocket = new Socket(serverIP, 7777);
			System.out.println("서버와 연결되었습니다.");
			
			in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(clientsocket.getOutputStream()));
			
			
			while(true) {
				System.out.println("클라이언트에서 서버로 보내기 >>> ");
				String outMessage = sc.nextLine();
				
				out.write(outMessage + "\n");
				out.flush();
				
				String inMessage = in.readLine();
				System.out.println("서버 >>");
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sc != null) {
				sc.close();
			}
			if(out != null) {
				out.close();
			}
			if(in != null) {
				in.close();
			}	
			if(clientsocket != null) {
				clientsocket.close();
			}
		}
		
	}
};
