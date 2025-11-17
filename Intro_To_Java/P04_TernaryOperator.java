import java.util.Scanner;

public class P04_TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        int max = (num1 > num2) ? num1 : num2;

        System.out.println("The Max among " + num1 + " and " + num2 + " is " + max);
    }
}
