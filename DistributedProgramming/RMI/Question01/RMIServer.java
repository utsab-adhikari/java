package DistributedProgramming.RMI.Question01;

import java.rmi.*;
import java.rmi.registry.*;
import java.util.*;
import java.rmi.server.*;

public class RMIServer extends UnicastRemoteObject implements Adder {
    public RMIServer() throws RemoteException {
        super();
    }
    @Override
    public int add(int num1, int num2) throws RemoteException {
        int sum = num1+num2;
        return sum;
    }
     public static void main(String arr[]) {
        try {
            Registry reg = LocateRegistry.createRegistry(4435);
            reg.rebind("Hi Serverr", new RMIServer());
            System.out.println("Server is Ready");
        } catch(RemoteException e) {
            System.out.println("Exception"+e);
        }
    }
}

