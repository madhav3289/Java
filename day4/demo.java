package day4;

// --x--x-- OBJECTS DEEP DIVE --x--x--

public class demo {
    public static void main(String[] args) {

        // whenever we create simple variables like int , String they take a fixed amount of memory 4byte

        // however size of object depents on multiple fields :-

        // 1. header size/object header
        // 2. exact fields
        // 3. Padding

        // header size -> metadata
        //                 /    \
        //                /      \
        //8bytes <- markwords   class pointers -> 4bytes/8bytes
        //          1. lock
        //          2. synchronisation
        //          3. garbage collector

        // together header size is about 12bytes.


        // 2. exact fields -> depends on the fields of object

        // class Student{
        //     String name;     -> 4bytes
        //     int age;         -> 4bytes
        //     String college;  -> 4bytes
        //     int rollNo       -> 4bytes
        // }

        // student object will use 16bytes


        // 3. padding 

        // remaining space to make the total size of object a multiple of 8

        // in this case size= 12(header)+16(fields) = 28bytes
        // to make it a multiple of 8 we need 4bytes of space so padding = 4bytes

    }
}


