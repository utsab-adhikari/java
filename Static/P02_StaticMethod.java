// static method example

package Static;

class Student {
    String name;
    int roll;
    static String faculty;

    public void show(Student obj) {
        System.out.println("\nname: " + obj.name + " Roll: " + obj.roll + " Faculty: " + faculty);
    }
}

public class P02_StaticMethod {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.name = "Utsab";
        obj1.roll = 31;
        Student.faculty = "BEIT";

        Student obj2 = new Student();
        obj2.name = "Ram";
        obj2.roll = 11;
        Student.faculty = "BESE";

        Student obj3 = new Student();
        obj3.name = "Hari";
        obj3.roll = 41;
        Student.faculty = "BECE";

        obj1.show(obj1);
        obj2.show(obj2);
        obj3.show(obj3);
    }
}
