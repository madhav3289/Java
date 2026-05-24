package day4;

// --x--x-- SHALLOW COPY AND DEEP COPY --x--x--

// Shallow copy -> The original and copy shares the same object. Copies the reference not the object it points to.

// Deep copy -> The original and copy are completely independent.

public class demo4 {
    public static void main(String[] args) {
        
        Pair r1=new Pair(4,5);

        Pair r2=new Pair(r1);         // creating deep copy

        Pair r3=r1;                   // creating shallow copy

        System.out.println(r1);       // @7ad041f3

        System.out.println(r2);       // @251a69d7

        System.out.println(r3);       // @7ad041f3

        // r1 and r3 both are giving same output as they are pointing to same address, beacuse of shallow copy
        // however r2 has different adddress than r1 beacuse of deep copy.
    }
}

class Pair{
    int x;
    int y;

    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }

    Pair(Pair r){
        this.x=r.x;
        this.y=r.y;
    }
}
