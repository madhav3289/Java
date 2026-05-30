package day6;

// Encapsulation and Its Types


public class demo {
    public static void main(String[] args) {
        
        // encapsulation ->
        // process of wrapping both data and methods into a class
        // and restircting the direct access of data 

        // 1. Both data and methods should be together within a class 
        // e.g. Student
        //         |-> Characterstices (name, rollno, college,...)
        //         |-> Behaviour (markattendence(), attendedLab(),...)

        // 2. we should not provide unrestriucted access to our data

        // Access Modifiers -> Who has access to variables, methods, constructors and classes.
        // why??

        // suppose we have a class for bankaccount so to avoid the direct changes in the data(balance) we need to restrict its usage. 

        // class BankAccount{
        //     int balance;

        //     BankAccount(int balance){
        //         this.balance=balance;
        //     }
        // }


        // types : 
        //     1. Private
        //     2. Default
        //     3. Protected
        //     4. Public

    }
}

class BankAccount{
    int balance;

    BankAccount(int balance){
        this.balance=balance;
    }
}


// Protected -> Anyone can access who is from same package or from inherited class (child class) in different packages..

// Public -> Anyone can access from everywhere in the programme no restriction on the scope.

// outer class/root class cann't be private or protected

// 1. private >> because we don't it is private in respect to what??
// 2. due to inheritance.
