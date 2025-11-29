/*Write a java program to create Rectangle class with data member length and breadth. Include
methods getData() and displayArea() in the class. Finally create an object of Rectangle class
and display its area. */
package Programs.Lab01;

import java.util.Scanner;

class Rectangle {

    int length;
    int breadth;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
        sc.close();
    }

    void displayArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class P04_RectangleClass {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.getData();
        rect.displayArea();
    }
}