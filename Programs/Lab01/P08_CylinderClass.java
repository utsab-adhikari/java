/*  Design a java class name cylinder with private fields for radius and height, including methods
to set these fields, calculate the volume and display the dimensions and volume. In the main
method, create two cylinder objects with different dimensions and display their details. */
package Programs.Lab01;

class Cylinder {
    private double radius;
    private double height;
    
    public void setDimensions(double r, double h) {
        radius = r;
        height = h;
    }

    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + calculateVolume());
    }
}

public class P08_CylinderClass {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        cylinder1.setDimensions(3.0, 5.0);

        Cylinder cylinder2 = new Cylinder();
        cylinder2.setDimensions(4.5, 7.2);

        System.out.println("Cylinder 1 details:");
        cylinder1.displayDetails();

        System.out.println("\nCylinder 2 details:");
        cylinder2.displayDetails();
    }
}