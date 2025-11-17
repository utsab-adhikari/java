import java.util.Scanner;

public class P02_BasicIO {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String Name = sc.nextLine();
        
        System.out.println("Enter Roll_No: ");
        int Roll = sc.nextInt();
        
        System.out.println("Name: "+Name);
        System.out.println("Roll_No: "+Roll);
        
    }
}