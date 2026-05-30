package day11;

// Object class   

public class demo {
    public static void main(String[] args) {

        // toString()

        Student s1=new Student();
        s1.name="Aditya";
        s1.age=22;

        // before override
        // System.out.println(s1.toString());      // day11.Student@7ad041f3

        // after override
        System.out.println(s1.toString());



        // equals()
        
        Student s2=new Student();
        s2.name="Aditya";
        s2.age=22;


        Student s3=new Student();
        s3.name="Aditya";
        s3.age=22;

        // before override
        // System.out.println(s1.equals(s2));      // false

        // after override
        System.out.println(s1.equals(s2));      // true
    }
}

// class Student {
//     String name;
//     int age;
// }

class Student {
    String name;
    int age;

    @Override
    public String toString(){
        return name+" "+age;
    }


    @Override
    public boolean equals(Object obj){

        Student s=(Student)obj;     // typecast

        return (this.name==s.name && this.age==s.age);
    }
}

