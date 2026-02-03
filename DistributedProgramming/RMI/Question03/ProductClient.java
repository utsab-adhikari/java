package DistributedProgramming.RMI.Question03;

import java.util.*;
import java.rmi.*;
import java.rmi.registry.*;

public class ProductClient {
    public static void main(String arr[]) throws RemoteException {
        ProductClient pc = new ProductClient();
        pc.connectRemote();
    }
    public void connectRemote() throws RemoteException {
        try{
            Scanner sc = new Scanner(System.in);
            Registry reg = LocateRegistry.getRegistry("localhost", 4444);
            Product pd = (Product) reg.lookup("");
            
            System.out.println("Enter First Number:");
            int num1 = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Second Number: ");
            int num2 = sc.nextInt();
            sc.nextLine();
            
            System.out.println("The Product is: "+pd.product(num2, num2));
            
        } catch(Exception e) {
            System.out.println("Exception: "+e);
        }
    }
}
