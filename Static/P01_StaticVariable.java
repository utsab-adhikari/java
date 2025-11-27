// static variable example

package Static;

class Student {
     String name;
     int roll;
     static String faculty;
     
     public void show() {
         System.out.println("\nname: "+name+" Roll: "+roll+" Faculty: "+faculty);
     }
}

public class P01_StaticVariable {
    public static void main (String[] args) {
        Student obj1 = new Student();
        obj1.name = "Utsab";
        obj1.roll = 31;
        Student.faculty = "BEIT";
        obj1.show();
        
        Student obj2 = new Student();
        obj2.name = "Ram";
        obj2.roll = 11;
        Student.faculty = "BESE";
        obj1.show();
        obj2.show();
        
        Student obj3 = new Student();
        obj3.name = "Hari";
        obj3.roll = 41;
        Student.faculty = "BECE";
        
        obj1.show();
        obj2.show();
        obj3.show();
        
        Student.faculty = "Management";
        obj1.show();
        obj2.show();
        obj3.show();
    }
}