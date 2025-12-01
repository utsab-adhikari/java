// Multilevel Inheritance Example in Java

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
class C extends B {
    int height;
    void setHeight(int height) {
        this.height = height;
    }
    
    void volume() {
        int v = length * breadth * height;
        System.out.println("volume = "+v);
    }
}

public class P02_MultilevelInheritance {
    public static void main (String[] args) {
        C obj = new C();
        obj.setLength(5);
        obj.setBreadth(4);
        obj.setHeight(3);
        obj.area();
        obj.volume();
        
    }
}

