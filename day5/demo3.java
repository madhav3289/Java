package day5;

// final keyword 
// 1. Variables 
// 2. Methods
// 3. Parameters
// 4. Class

public class demo3 {
    public static void main(String[] args) {
        // final keyword >> cann't be changed after initialization

        // declartion and defination should be done simultaneously or once

        final int MOD;      // declaration
        MOD=1_000_000_007;      // defination

        // MOD=1_000_000_008;    >>   // The final local variable MOD may already have been assigned

    }
}
class Random {
    final double PI=2.14;
}
