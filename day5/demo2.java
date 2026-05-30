package day5;

// static blocks

public class demo2 {
    public static void main(String[] args) {
        Students s1=new Students("Aditya",20,101);
        Students s2=new Students("Abhay",21,102);

        // Students.college="IIT-G";   
        System.out.println(s1.age+" "+s1.name+" "+Students.college+" ");

    }
}
class Students{
    String name;
    int age;
    int rollNo;
    static String college;
    static int grade;

    Students(String name,int age,int rollNo){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
    }

    // static block
    static{
        college="IIT-G";
        grade=9;
    }
}