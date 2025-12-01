// Super Keyword for Method Example in Java

package OOP;

class Vehicle {
    void display() {
        System.out.println("Hey from Vehicle");
    }
}

class Car extends Vehicle {
     void display() {
         super.display();
        System.out.println("Hey from Car");
    }
}

public class P05_SuperKeywordForMethod {
    public static void main (String[] args) {
        Car obj = new Car();
        obj.display();
    }
}