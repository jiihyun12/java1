package webSocket_test3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket clientSocket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
				
		String serverIP = "";
		
		try {
			clientSocket = new Socket(serverIP,7777);
			System.out.println("서버와 연결되었습니다.");
			
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			while(true) {
			System.out.println("클라이언트에서 서버로 보내기 >>");
			String outMessage = sc.nextLine();
			out.write(outMessage + "\n");
			out.flush();
			String inMessage = in.readLine();
			System.out.println("서버 >>" + inMessage);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
			if(clientSocket != null) {
				clientSocket.close();
			}
		}			
	}
};

	

