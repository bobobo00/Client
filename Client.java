package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("------------client-------------------");
		Socket client=new Socket("localhost",8888);
		System.out.println("请输入用户名");
		new Thread(new Send(client)).start();
		new Thread(new Receive(client)).start();
	}
	

}
