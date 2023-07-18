package Que06;

import java.util.Scanner;

class ClassCall {
    private Rectangle rect;
    private Box box;
    private int l,b,h;
    private Scanner scan = new Scanner(System.in);
    public void getRect() {
        System.out.print("Enter length of rectangle: ");
        l = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter breadth of rectangle: ");
        b = scan.nextInt();
        scan.nextLine();
        rect = new Rectangle(l, b);
    }
    public void getBox(){
        System.out.print("\nEnter length of box: ");
        l= scan.nextInt();
        scan.nextLine();
        System.out.print("Enter breadth of box: ");
        b= scan.nextInt();
        scan.nextLine();
        System.out.print("Enter height of box: ");
        h= scan.nextInt();
        scan.nextLine();
        box=new Box(l,b,h);
    }
    public void printOutput(){
        System.out.println("\n********************OUTPUT********************");
        System.out.println("AREA of rectangle: "+rect.getArea());
        System.out.println("VOLUME of box: "+box.getVolume());
        scan.close();
    }
}
