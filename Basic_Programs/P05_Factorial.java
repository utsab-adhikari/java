// factorial by for loop
package Basic_Programs;

import java.util.Scanner;

public class P05_Factorial {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();

        int temp = num;
        int i, fact = 1;
        for (i = num; i > 0; i--) {
            fact = fact * i;
        }
            System.out.println("The Factorial of Number " + temp + " is "+ fact);
        sc.close();
    }
}
