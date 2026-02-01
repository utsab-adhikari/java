package DistributedProgramming.General;

import java.net.*;

public class P01_GetIpAddress {
	public static void main(String arr[]) {
		try {
			InetAddress myIp = InetAddress.getLocalHost();

			System.out.println("Host Name:"+myIp.getHostName());
			System.out.println("Host Address: "+myIp.getHostAddress());
		} catch (Exception e) {
			System.out.println("Exception Occurs:"+e);
		}
	}
}
