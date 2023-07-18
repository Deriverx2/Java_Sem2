package Que04;

public class ComplexMain {
    public static void main(String[] args) {

        Complex ob1 = new Complex();
        ob1.initilaize();
        Complex ob2 = new Complex();
        ob2.initilaize();
        printOutput(ob1,ob2);
    }
    static void printOutput(Complex ob1,Complex ob2){
        System.out.println("********************OUTPUT********************");
        System.out.print("1st complex number: ");
        ob1.print();
        System.out.println("Modulus: "+ComplexOperations.modulus(ob1));
        System.out.print("2nd complex number: ");
        ob2.print();
        System.out.println("Modulus: "+ComplexOperations.modulus(ob2));
        System.out.print("\nSum of complex numbers: ");
        ComplexOperations.add(ob1,ob2).print();
        System.out.print("Product of complex numbers: ");
        ComplexOperations.multiply(ob1,ob2).print();
    }
}
