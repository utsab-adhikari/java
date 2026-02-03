package DistributedProgramming.RMI.Question03;

import java.util.*;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class ProductServer extends UnicastRemoteObject implements Product {
    public ProductServer() throws RemoteException {
        super();
    }
    public int product(int a, int b) throws RemoteException {
        return a*b;
    }
    public static void main(String arr[]) {
        try{
            Registry reg = LocateRegistry.createRegistry(4444);
            reg.rebind("", new ProductServer());
            System.out.println("Server is Ready");
            
        } catch(Exception e) {
            System.out.println("Exception: "+e);
        }
    }
}

