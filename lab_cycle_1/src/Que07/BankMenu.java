package Que07;

import java.util.Scanner;
class BankMenu {
    Scanner scan=new Scanner(System.in);
    private Account[] account=new Account[20];
    private int count=0;
    private String name;
    private int accNo;
    private int amount;
    private static int choice;

    public void printMenu(){
        System.out.println("*************** MENU ***************");
        System.out.println("1: Create a savings account");
        System.out.println("2: Create a current account");
        System.out.println("3: Deposit ");
        System.out.println("4: Withdraw ");
        System.out.println("5: Print bank statement");
        System.out.println("6: Quit");
        System.out.print("Enter choice:");
    }
    public void setChoice(){
        choice=scan.nextInt();
        scan.nextLine();
    }

    public static int getChoice() {
        return choice;
    }

    public void setAccount() {
        if (count < 20) {
            System.out.print("Enter name:");
            name = scan.nextLine();
            System.out.print("Enter account number:");
            accNo = scan.nextInt();
            scan.nextLine();
            if (choice==1){
                account[count] = new SavingsAccount(name, accNo);
            }else {
                account[count] = new CurrentAccount(name, accNo);
            }
            count++;
        } else {
            System.out.println("Account limit reached for program");
            System.out.println("Kindly update system to continue");
        }
    }

    private int getAccIndex(){
        System.out.print("Enter account number:");
        accNo=scan.nextInt();
        scan.nextLine();
        for (int i=0;i<count;i++){
            if (account[i].getAccNo()==accNo){
                return i;
            }
        }
        return -1;
    }

    public void depositAmount(){
        int i=getAccIndex();
        if (i==-1){
            System.out.println("Error!! Invalid account number");
        }
        else{
            System.out.print("Enter amount to deposit:");
            amount=scan.nextInt();
            scan.nextLine();
            account[i].deposit(amount);
            System.out.println(amount+" has been deposited");
        }
    }
    public void withdrawAmount(){
        int i=getAccIndex();
        if (i==-1){
            System.out.println("Error!! Invalid account number");
        }
        else{
            System.out.print("Enter amount to withdraw:");
            amount=scan.nextInt();
            scan.nextLine();
            account[i].withdrawal(amount);
        }
    }
    public void statement(){
        int i=getAccIndex();
        if (i==-1){
            System.out.println("Error!! Invalid account number");
        }
        else{
            account[i].accStatement();
        }
    }

}
