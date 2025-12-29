package OOP;
// in Java we cannot extends two classes
/*
but we can implement multiple interfaces OR Class and Interfaces
 */ 

interface College {
    String c_name = "NCIT College";
    void showInfo();
}

class Student {
    String s_name;
    String faculty;

    Student (String a, String b) {
        s_name = a;
        faculty = b;
    }
}

class StudentDetails extends Student implements College {
    public StudentDetails(String a, String b) {
        super(a,b);
    }
    public void showInfo() {
        System.out.println("Student Name: "+s_name);
        System.out.println("College Name: "+c_name);
    }
}

public class P07_MultipleInheritance {
    public static void main (String[] args) {
        StudentDetails obj = new StudentDetails("Utsab Adhikari", "BEIT");
        obj.showInfo();
    }
} 