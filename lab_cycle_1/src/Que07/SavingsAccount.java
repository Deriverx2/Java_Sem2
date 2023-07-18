package Que07;

public class SavingsAccount extends Account{
    public SavingsAccount(String name, int accNo){
        super(name,accNo);
    }
    void withdrawal(double amount){
        if (getBalance()-amount>=1000){
            deposit(-amount);
            System.out.println("You have withdrawn "+amount);
        }
        else{
            System.out.println("You don't satisfy the minimum balance");
            System.out.println("Kindly deposit to continue");
        }
    }
}
