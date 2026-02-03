package DistributedProgramming.RMI.Question01;

import java.util.*;
import java.rmi.*;
import java.rmi.registry.*;

public class RMIClient {
    public static void main(String arr[]) throws RemoteException{
        RMIClient rc = new RMIClient();
        rc.connectRemote();
    }
    public void connectRemote() throws RemoteException {
        try{
            
            Scanner sc= new Scanner(System.in);
            Registry reg = LocateRegistry.getRegistry("localhost", 4435);
            Adder ad= (Adder)reg.lookup("Hi Serverr");
            System.out.println("Enter Two Number");
            int a = sc.nextInt();
            sc.nextLine();
            int b = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Addition is "+ ad.add(a, b));
            
        } catch(Exception e) {
            System.err.println("Exception : "+e);
        }
    }
}
