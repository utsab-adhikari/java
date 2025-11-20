// Parameterized constructor
package Constructors;

class car {
    private String model;
    private String color;

    car(String m, String c) {
        model = m;
        color = c;
    }
    public void showInfo() {
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
    }
}

public class P02_ParameterizedConstructor {
    public static void main(String[] args) {
        car car1 = new car("Lambo", "Black");
        // constructor called;
        car1.showInfo();
    }
}
