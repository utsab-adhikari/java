package DistributedProgramming.RMI.Question02;

import java.util.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class FactorialServer extends UnicastRemoteObject implements Factorial {
    public FactorialServer() throws RemoteException {
        super();
    }
    public int factorial(int num) throws RemoteException{
        int fact = 1;
        
        while(num!=0) {
            fact = fact*num;
            num--;
        }
        return fact;
    }
    public static void main(String arr[]) {
        try {
            Registry reg = LocateRegistry.createRegistry(4465);
            reg.rebind("", new FactorialServer());
            System.out.println("Server is ready.");        
        } catch(Exception e) {
            System.out.println("Exeception: "+e);
        }
    }
}