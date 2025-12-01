// Hierarchical Inheritance Example in Java

package OOP;

class Circle {
    double radius;
    void setRadius(double r) {
        radius = r;
    }
}

class CricleArea extends Circle {
    void area() {
        System.out.println("Area = "+3.14*radius*radius);
    }
}

class CriclePerimeter extends Circle {
    void perimeter() {
        System.out.println("Perimeter = "+2*3.14*radius);
    }
}

public class P03_HierarchicalInheritance {
    public static void main (String[] args) {
        CricleArea obj1 = new CricleArea();
        obj1.setRadius(5.2);
        obj1.area();
        
        CriclePerimeter obj2 = new CriclePerimeter();
        obj2.setRadius(3.2);
        obj2.perimeter();
    }
}
