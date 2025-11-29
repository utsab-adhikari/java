// Write a program to input a number and display whether it is prime or not.
package Programs.Lab01;

import java.util.Scanner;

public class P03_PrimeOrNot {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();

        int temp = num;
        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                break;
            }
        }

        if (temp == i) {
            System.out.println("The Number " + temp + " is Prime.");
        } else {
            System.out.println("The Number " + temp + " is Not a Prime");
        }
        sc.close();
    }
}
