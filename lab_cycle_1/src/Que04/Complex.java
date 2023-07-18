package Que04;

import java.util.Scanner;

public class Complex {
    private int real,imag;

    public Complex(){
        this.imag=0;
        this.real=0;
    }
    public Complex(int real, int imag){
        this.imag=imag;
        this.real=real;
    }

    public void initilaize(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter real and imaginary part of complex number:");
        this.real=scan.nextInt();
        scan.nextLine();
        this.imag=scan.nextInt();
        scan.nextLine();
        scan.close();
    }
    private String CheckSign(){
        if(this.imag>0){
            return "+";
        }
        else return " ";
    }
    public void print(){
        System.out.println(this.real+CheckSign()+this.imag+"i");
    }
    public int getReal(){
        return this.real;
    }
    public int getImag(){
        return this.imag;
    }
}
