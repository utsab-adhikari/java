package DistributedProgramming.RMI.Question02;

import java.util.*;
import java.rmi.*;
import java.rmi.registry.*;

public class FactorialClient {
    public static void main(String arr[]) throws RemoteException {
        FactorialClient fc = new FactorialClient();
        fc.connectRemote();
    }
    public void connectRemote() throws RemoteException {
        try {
            Scanner sc = new Scanner(System.in);
            Registry reg = LocateRegistry.getRegistry("localhost", 4465);
            Factorial fact = (Factorial) reg.lookup("");
            
            System.out.println("Enter a Number: ");
            int num = sc.nextInt();
            sc.nextLine();
            
            System.out.println("The Factorial Is: "+fact.factorial(num));
            
        } catch (Exception e) {
            System.out.println("Exception: "+e);
        }
    }
}
