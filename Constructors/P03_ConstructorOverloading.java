//Constructor Overrloading

package Constructors;

class car {
    private String model;
    private String color;
    private int model_no;

     car() {
        model = "BMW";
        color = "Red";
    }

    car(String m, String c) {
        model = m;
        color = c;
    }

    car(String m, String c, int mn) {
        model = m;
        color = c;
        model_no = mn;
    }

    public void showInfo() {
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Model No: "+model_no);
    }
}

public class P03_ConstructorOverloading {
    public static void main(String[] args) {

        car car1 = new car();
        // Default Constructor called
        car car2 = new car("Lambo", "Black");
        // Parameterized Constructor called;
        car car3 = new car("Supra", "Black", 10);

        car1.showInfo();
        car2.showInfo();
        car3.showInfo();
    
    }
}
