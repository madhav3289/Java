package day6;

public class defaultAM {
    public static void main(String[] args) {


        // Default -> Classes or varibales that are accessible in same package.
        
        // since bank account is default is in same package therefore we can create a object of that class
        BankAccount ba=new BankAccount(500);

        System.out.println(ba.balance);
    }
}
