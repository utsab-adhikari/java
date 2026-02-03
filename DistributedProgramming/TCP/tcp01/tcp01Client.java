
import java.net.*;
import java.io.*;
import java.util.*;

public class tcp01Client {
    public static void main(String arr[]) throws IOException {
        Socket socket = new  Socket("localhost", 4445);
        
        Scanner ins = new Scanner(socket.getInputStream());
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(ins.nextLine());
        int num = sc.nextInt();
        sc.nextLine();
        
        out.println(num);
        
        System.out.println(ins.nextLine());

        ins.close();
        out.close();
        socket.close();
        sc.close();
    }
    
}
