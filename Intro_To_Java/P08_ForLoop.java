// For Loop 
import java.util.Scanner;

public class P08_ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        
        for(int i=0;i<num;i++) {
            System.out.println("Hello "+name+" "+i);
        }
        
        
        System.out.println("For Loop Ends");
        sc.close();

       
    }
}
