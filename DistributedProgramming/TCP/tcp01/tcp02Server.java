/*
2. Write a java program using TCP such that clients sends number to server and displays its
factorial. The server computes factorial of the number received from client.
*/
import java.io.*;
import java.util.*;
import java.net.*;

public class tcp02Server {
    public static void main(String arr[]) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4445);
        System.out.println("Server is running on portr 4445");
        
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client Connected ....");
        
        Scanner ins = new Scanner(clientSocket.getInputStream());
        
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        
        out.println("Enter Number :");
        int num = Integer.parseInt(ins.nextLine());
        
        int fact = 1;
        while(num!=0) {
            fact = fact*num;
            num--;
        }
        
       out.println("The Factoril is: "+fact);
       ins.close();
       out.close();
       serverSocket.close();
       clientSocket.close();
    }
}
