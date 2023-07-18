package Que08;
import java.util.Scanner;
class ShapePrint {
    private double r,h;
    private Sphere sphere;
    private Cylinder cylinder;
    Scanner scan=new Scanner(System.in);

    public void setSphere() {
        System.out.print("Enter radius of sphere:");
        r = scan.nextInt();
        scan.nextLine();
        sphere = new Sphere(r);
        sphere.setArea();
        sphere.setVolume();
    }
    public void setCylinder(){
        System.out.print("\nEnter radius of cylinder:");
        r= scan.nextInt();
        scan.nextLine();
        System.out.print("Enter height of cylinder:");
        h= scan.nextInt();
        scan.nextLine();
        cylinder=new Cylinder(r,h);
        cylinder.setArea();
        cylinder.setVolume();
    }

    public void print(){
        System.out.println("*******************OUTPUT*******************");
        sphere.printArea();
        sphere.printVolume();
        cylinder.printArea();
        cylinder.printVolume();
    }
}
