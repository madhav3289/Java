package day2;


public class demo {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Aditya";
        s.age=20;
        s.rollNo=18;
        s.college="IIT-G";
        
        s.markAttendence();

        System.out.println(s.name+" "+s.age+" "+s.rollNo+" "+s.college);


        // Defualt values

        Student s1=new Student();

        System.out.println(s1.name+" "+s1.age+" "+s1.rollNo+" "+s1.college);

        // Output -> null 0 0 null

        // String -> null
        // int -> 0
        // double -> 0.0
        // boolean -> false

        // int x; -> error the local varuable x may not have been initialised



    }
    
}

// a class can have both variables and methods.
// the varuiables are known as instance variables.

class Student{
    String name;
    int age;
    int rollNo;
    String college;

    void markAttendence(){
        System.out.println("Attendence is Marked by student");
    }
}
