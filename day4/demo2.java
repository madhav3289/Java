package day4;

// --x--x-- CALL BY VALUE --x--x--

public class demo2 {
    public static void main(String[] args) {
        
        int x=4;
        int y=5;

        System.out.println(x+" "+y);    // 4 5

        addTen(x,y);

        System.out.println(x+" "+y);    // 4 5

        // 14 15 will not be printed since both are diffenent values 
        // when we call a function inside stack a new varible will be formed 
        // so all operation will be done on new variable not the original 
        // and when the function call is executed completely the new variables will be removed from the call stack 
        // and hence there is no change on original values..
    }

    public static void addTen(int x,int y){
        x+=10;
        y+=10;
    }
}
