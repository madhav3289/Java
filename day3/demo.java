package day3;

public class demo {
    public static void main(String[] args) {
        
        // Student s=new Student(); -> The constructor Student() is undefined

        Student s=new Student("Aditya",20,18,"IIT-G");    // parameterised constructor

        System.out.println(s.name+" "+s.age+" "+s.rollNo+" "+s.college);    // Aditya 20 18 IIT-G

    }
}

class Student{
    String name;
    int age;
    int rollNo;
    String college;

    // constructor ->  It is method that is called automatically when we create an object
    // used to initialise an object..

    // Properties : 
    // 1. we cann't call constructor manually
    // 2. can only be called
    //    a. while creating the object
    //    b. using this keyword


    // this -> reference to current object. lets an object refer to itself

    Student(String name,int age,int rollNo,String college){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
        this.college=college;

    }
}