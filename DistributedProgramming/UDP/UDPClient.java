package DistributedProgramming.UDP;

import java.io.*;
import java.net.*;

public class UDPClient {
	public static void main(String arr[]) throws IOException {

		DatagramSocket socket = new DatagramSocket();

		byte[] buffer = new byte[256];

		InetAddress address = InetAddress.getByName("localhost");

		DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 4445);

		socket.send(packet);

		System.out.println("Request Sent to Server...");

		packet = new DatagramPacket(buffer, buffer.length);
		socket.receive(packet);

		String received = new String(packet.getData());
		System.out.println("Received Resonse:"+received);

		socket.close();
	}
}
