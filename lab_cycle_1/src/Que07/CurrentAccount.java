package Que07;

public class CurrentAccount extends Account{
    public CurrentAccount(String name, int accNo){
        super(name,accNo);
    }
    void withdrawal(double amount){
        if (getBalance()+getBalance()*0.05>=amount){
            deposit(-amount);
            System.out.println("You have withdrawn "+amount);
        }
        else{
            System.out.println("You don't satisfy the overdraft amount");
            System.out.println("Kindly deposit to continue");
        }
    }
}
