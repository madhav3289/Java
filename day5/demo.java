package day5;

// static keywords

// static >> It's a property of a class.
// It means that this variable/method belongs to a class not to a particular instance or object.
// Only one copy is created that is stored with the class itself.


public class demo {
    public static void main(String[] args) {

        // Static Methods

        // 1. doesn't have access to this keyword.
        // 2. they don't belong to any particular object
        // 3. they can't call non static fields or methods
        // 4. can be called with creating an instance

        Student s=new Student();
        // s.college="IIT-G";     // The static field demo.Student.college should be accessed in a static way
        System.out.println(Student.college);
        Student.college="IIT-G";        // correct way
        System.out.println(Student.college);

        System.out.println(s.age);

    

        System.out.println(MathUtils.square(10));       // no object needed

        // System.out.println(MathUtils.twice(10));        
        // Cannot make a static reference to the non-static method twice(int) from the type demo.MathUtils
        

    }
}
class Student{
    String name;     // instance variables
    int age;
    int rollNo;
    static String college;      // class variables
}

class MathUtils{
    public static int square(int x){
        return x*x;
    }

    // public int twice(int x){
    //     return 2*x;
    // }
}
