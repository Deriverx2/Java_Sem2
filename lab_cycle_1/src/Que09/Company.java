package Que09;

import java.util.Scanner;
class Company {
    private SalarySlip[] employees;
    public Company(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of employees:");
        int N=scan.nextInt();
        scan.nextLine();
        String name;
        String code;
        double basicPay;
        employees=new SalarySlip[N];
        System.out.println("Enter details of employees:");
        for (int i=0;i<N;i++){
            System.out.print("Enter name of employee:");
            name=scan.nextLine();
            System.out.print("Enter code of employee:");
            code= scan.nextLine();
            System.out.print("Enter basic pay:");
            basicPay=scan.nextDouble();
            employees[i]=new SalarySlip(name,code,basicPay);
        }
        scan.close();
    }
    public void salarySlips(){
        System.out.println("\nEmployee salaryslips:");
        for (SalarySlip slips: employees){
            slips.salaryCalc();
            slips.printSlip();
            System.out.println();
        }
    }
}
