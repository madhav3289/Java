package day3;

// constructor chaining

// using one constructor to call another constructor.
// helps in avoiding duplicating initialisation of code.

public class demo3 {
    public static void main(String[] args) {
        
        Dog d1=new Dog();
        Dog d2=new Dog("GHI");
        Dog d3=new Dog("DEF",6);
        Dog d4=new Dog("ABC",5,"German Shephard");

        System.out.println(d1.name+" "+d1.age+" "+d1.breed);    // Unknown 0 Unknown

        System.out.println(d2.name+" "+d2.age+" "+d2.breed);    // GHI 0 Unknown

        System.out.println(d3.name+" "+d3.age+" "+d3.breed);    // DEF 6 Unknown

        System.out.println(d4.name+" "+d4.age+" "+d4.breed);    // ABC 5 German Shephard
        
    }
}

class Dog{
    String name;
    int age;
    String breed;


    // Duplicate initialisation :-

    // Dog(){
    // }
    // Dog(String name){
    //     this.name=name;
    // }
    // Dog(String name,int age){
    //     this.name=name;
    //     this.age=age;
    // }
    // Dog(String name,int age,String breed){
    //     this.name=name;
    //     this.age=age;
    //     this.breed=breed;
    // }

    // constructor chaining

    Dog(){
        this("Unknown");
    }

    Dog(String name){
        this(name,0);
    }

    Dog(String name,int age){
        this(name,age,"Unknown");
    }

    Dog(String name,int age,String breed){
        this.name=name;
        this.age=age;
        this.breed=breed;
    }
}
