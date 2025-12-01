// Single Inheritance Example in Java

package OOP;

class A {
    int length;
    void setLength(int l) {
        length = l;
    }
}

class B extends A {
    int breadth;
    void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    
    void area() {
        int a = length * breadth;
        System.out.println("Area = "+a);
    }
}

public class P01_SingleInheritance {
    public static void main (String[] args) {
        B obj = new B();
        obj.setLength(5);
        obj.setBreadth(4);
        obj.area();
        
    }
}
