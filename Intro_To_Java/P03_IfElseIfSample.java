// If else-if else statement in java
import java.util.Scanner;

public class P03_IfElseIfSample {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int Age = sc.nextInt();
        
        if(Age >= 18) {
            System.out.println("Allowed for voting");
        } else if(Age <18) {
            System.out.println("You Cannot Vote");
        } else {
            System.out.println("Try Again");
        }
        
    }
} 
