package Que09;

class Employee {
    private String name;
    private String code;
    private double basicPay;

    public Employee(String name, String code, double basicPay){
        this.name=name;
        this.code=code;
        this.basicPay=basicPay;
    }
    public void intialize(String name, String code, int basicPay){
        this.name=name;
        this.code=code;
        this.basicPay=basicPay;
    }
    public void printinfo(){
        System.out.println("           Employee Details         ");
        System.out.println("Employee Name :\t"+name);
        System.out.println("Employee Code :\t"+code);
        System.out.println("-----------------------------------");
    }

    public double getBasicPay() {
        return basicPay;
    }
}
