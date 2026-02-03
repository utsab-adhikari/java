package DistributedProgramming.RMI.Question03;

import java.util.*;
import java.rmi.*;

public interface Product extends Remote {
    public int product(int a, int b) throws RemoteException;
}

