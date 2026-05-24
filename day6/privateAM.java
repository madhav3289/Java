package day6;

public class privateAM {
    public static void main(String[] args) {
        
        Student s=new Student();
        // s.age=10;   // since it is privatec class so it will show this message -> The field Student.age is not visible.


        // then how can we access these varibles??
        // using getter and setter

        // these are public methods used to retrieve and update the values of a class's private variables. 

        s.setName("Abhay");
        s.setCollege("IIT-G");
        System.out.println(s.getName());
        
    }
}

// Private Class -> The method or data members declared as private can only be accessible within the same class.
class Student{
    private String name;
    private int age;
    private int rollNo;
    private String college;

    // Student(String name,int age,int rollNo,String college){
    //     this.name=name;
    //     this.age=age;
    //     this.rollNo=rollNo;
    //     this.college=college;
    // }


    // setter
    public void setName(String name){
        this.name=name;
    }

    public void setCollege(String college){
        // validations
        this.college=college;
    }

    // getter
    public String getName(){
        return name;
    }

}