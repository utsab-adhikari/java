// Super Keyword for Constructor Example in Java

package OOP;

class Len {
    int length;
    Len(int l) {
        length = l;
    }
}

class B extends Len {
    int breadth;
    B(int l, int b) {
        super(l);
        // for constructor call of parent class
        breadth = b;
    }
    
    void area() {
        int a = length * breadth;
        System.out.println("Area = "+a);
    }
}

public class P06_SuperKeywordForConstructor {
    public static void main (String[] args) {
        B obj = new B(4, 5);
        obj.area();
        
    }
}

