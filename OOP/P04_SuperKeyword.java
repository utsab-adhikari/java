// Super Keyword Example in Java

package OOP;

class Vehicle {
    int speed = 120;
}

class Car extends Vehicle {
    int speed = 180;
    void display() {
        System.out.println("Child speed: "+speed);
        System.out.println("Parent speed: "+super.speed);
        
    }
}

public class P04_SuperKeyword {
    public static void main (String[] args) {
        Car obj = new Car();
        obj.display();
    }
}   