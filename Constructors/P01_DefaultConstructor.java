// Default Constructor Exampe
package Constructors;

class car {
    private String model;
    private String color;

    car() {
        model = "BMW";
        color = "Red";
    }
    public void showInfo() {
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
    }
}

public class P01_DefaultConstructor {
    public static void main(String[] args) {
        car car1 = new car();
        // constructor called;
        car1.showInfo();
    }
}
