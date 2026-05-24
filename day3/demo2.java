package day3;

public class demo2 {
    public static void main(String[] args) {
        

        Students s1=new Students();
        Students s2=new Students("Arnav");
        Students s3=new Students("Madhav",21);
        Students s4=new Students("Rishi",22,15);
        Students s5=new Students("Dev",20,5,"IIT-K");

        System.out.println(s1.name+" "+s1.age+" "+s1.rollNo+" "+s1.college);    // null 0 0 null

        System.out.println(s2.name+" "+s2.age+" "+s2.rollNo+" "+s2.college);    // Arnav 0 0 null

        System.out.println(s3.name+" "+s3.age+" "+s3.rollNo+" "+s3.college);    // Madhav 21 0 null        

        System.out.println(s4.name+" "+s4.age+" "+s4.rollNo+" "+s4.college);    // Rishi 22 15 null

        System.out.println(s5.name+" "+s5.age+" "+s5.rollNo+" "+s5.college);    // Dev 20 5 IIT-K
    }
    
}

class Students{
    String name;
    int age;
    int rollNo;
    String college;

    // constructor overloading -> a function can have multiple constuctor with different parameters

    Students(){
    }

    Students(String name){
        this.name=name;
    }

    Students(String name,int age){
        this.name=name;
        this.age=age;
    }

    Students(String name,int age,int rollNo){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
    }

    Students(String name,int age,int rollNo,String college){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
        this.college=college;
    }
}
