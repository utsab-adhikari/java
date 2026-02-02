package DistributedProgramming.UDP;

import java.net.*;
import java.io.*;

public class UDPServer {
	public static void main(String arr[]) throws IOException {

		
		DatagramSocket socket = new DatagramSocket(4445);
		System.out.println("Server is Running..");

		byte[] buffer = new byte[256];

		DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

		socket.receive(packet);

		InetAddress address = packet.getAddress();
		int port = packet.getPort();

		String reponse = "Hello there from UDP server";
		buffer = reponse.getBytes();

		packet = new DatagramPacket(buffer, buffer.length, address, port);

		socket.send(packet);

		System.out.println("Response Sent: "+reponse);
		socket.close();
		
	}
}
