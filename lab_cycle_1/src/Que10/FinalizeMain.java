package Que10;

public class FinalizeMethod {

    public static void main(String[] args) {
        ABC ob1=new ABC(2,3,5);
        ABC ob2=new ABC(5,7,8);
        ob1.printProduct();
        ob2.printProduct();
        ob1=null;
        System.gc();
    }
}
