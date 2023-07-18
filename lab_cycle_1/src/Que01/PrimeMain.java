package Que01;

public class PrimeMain {
    public static void main(String[] args){
        int N=Integer.parseInt(args[0]);
        Prime ob = new Prime(N);
        ob.print();
    }
}