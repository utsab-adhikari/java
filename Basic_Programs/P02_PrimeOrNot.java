// WAP to Check the number is Prime or Not

package Basic_Programs;

import java.util.Scanner;

public class P02_PrimeOrNot {
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
    }
}
