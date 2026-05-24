package day1;

// OOP-> A paradigm based on the concept of object.

// why we use oop??

// In traditional way of writing code -> 

// 1. We need a lot of variables to represent an entity.
// 2. Need to pass a lot of parameters for a single entity.
// 3. No authority over data


public class demo {
    public static void main(String[] args) {
        
        // object -> a real world entity
        // non primitive data type
        
        // creating an instance of a class

        Student s=new Student();
        //declaration    defination

        // new -> dynamically allocates memory (dynamically means on runtime)
        // allocates a space in heap memory to store the information of an object.

        // compile time (static memory allocation) -> int x=4;

        // we use dot(.) to point to that address

        s.name="Aditya";
        s.age=28;
        s.rollno=10;
        s.college="IIT-G";

        System.out.println(s.name+" "+s.age+" "+s.rollno+" "+s.college); 

        
    }
}
// class -> blueprint of an object

// defining a class 
class Student{
    String name;
    int age;
    int rollno;
    String college;
}