import java.util.Scanner;

public class P06_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        
        while(num!=0) {
            System.out.println("Hello "+name+" "+num);
            num--;
        }
        
        
        System.out.println("While Loop Ends");
       
    }
}
