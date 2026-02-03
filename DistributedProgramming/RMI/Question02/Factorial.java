package DistributedProgramming.RMI.Question02;

import java.util.*;
import java.rmi.*;

public interface Factorial extends Remote{
    int factorial(int num) throws RemoteException;
}
