import java.util.Scanner;

public class P07_DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        
        do {
            System.out.println("Hello "+name+" "+num);
            num++;
        } while(num<5);
        
        
        System.out.println("Do-While Loop Ends");
       
    }
}
