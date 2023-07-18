package Que07;

abstract public class Account {
    private String name;
    private int accNo;
    private double balance;
    public Account(String name, int accNo){
        this.name=name;
        this.accNo = accNo;
        this.balance=0;
    }
    public void deposit(double deposit){
        balance+=deposit;
    }
    abstract void withdrawal(double amount);

    public int getAccNo() {
        return accNo;
    }

    public double getBalance(){
        return balance;
    }
    public void accStatement(){
        System.out.println("****************************************");
        System.out.println("           ACCOUNT STATEMENT            ");
        System.out.println("----------------------------------------");
        System.out.println("NAME:\t"+name);
        System.out.println("ACCOUNT NO.:\t"+ accNo);
        System.out.println("BALANCE:\t"+balance);
        System.out.println("****************************************");
    }
}
