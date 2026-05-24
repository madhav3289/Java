package day4;

// --x--x-- CALL BY REFERENCE --x--x--

// in java there is only call by value there is no concept of call by refernece unlike c++,c..

public class demo3 {
    public static void main(String[] args) {
        
        Random r=new Random(4,5);

        System.out.println(r.x+" , "+r.y);      // 4 , 5

        addTen(r);

        System.out.println(r.x+" , "+r.y);      // 14 , 15
    }

    public static void addTen(Random r){
        r.x+=10;
        r.y+=10;
    }
}

class Random{
    int x;
    int y;

    Random(int x,int y){
        this.x=x;
        this.y=y;
    }
}