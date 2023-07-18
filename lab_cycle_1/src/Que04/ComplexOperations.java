package Que04;
import java.lang.Math;
class ComplexOperations {
    public static Complex add(Complex a1, Complex a2){
        return new Complex(a1.getReal()+a2.getReal(), a1.getImag()+ a2.getImag());
    }
    public static Complex multiply(Complex a1,Complex a2){
        return new Complex(a1.getReal()*a2.getReal()- a1.getImag()* a2.getImag(), a1.getReal()*a2.getImag()+a1.getImag()*a2.getReal());
    }
    public static double modulus(Complex a1){
        return Math.sqrt(a1.getReal()*a1.getReal()+ a1.getImag()* a1.getImag());
    }
}
