package Que09;

class SalarySlip extends Employee implements Salary {
    private double netSalary;
    private double houseAllowance;
    private double medicalAllowance;
    private double taxReduction;
    private double providentFund;
    private double grossSalary;




    public SalarySlip(String name, String code, double basicPay){
        super(name,code,basicPay);
    }
    public void salaryCalc(){
        houseAllowance=0.2*getBasicPay();
        medicalAllowance=0.1*getBasicPay();
        taxReduction=0.15*getBasicPay();
        providentFund=0.12*getBasicPay();
        grossSalary=getBasicPay()+houseAllowance+medicalAllowance;
        netSalary=grossSalary-taxReduction-providentFund;
    }

    public void printSlip(){
        System.out.println("***********************************");
        System.out.println("             SALARY SLIP           ");
        System.out.println("***********************************");
        printinfo();
        System.out.println("             Earnings            ");
        System.out.println("Basic Pay:\t"+getBasicPay());
        System.out.println("House Allowance:\t"+houseAllowance);
        System.out.println("Medical Allowance:\t"+medicalAllowance);
        System.out.println("\nGross Pay:\t"+grossSalary);
        System.out.println("-----------------------------------");
        System.out.println("             Deductions            ");
        System.out.println("Tax Reduction:\t"+taxReduction);
        System.out.println("Provident Fund:\t"+providentFund);
        System.out.println("-----------------------------------");
        System.out.println("Net Salary:\t"+netSalary);
        System.out.println("-----------------------------------");
        System.out.println("Thank You For Your Hardwork");
    }

}
