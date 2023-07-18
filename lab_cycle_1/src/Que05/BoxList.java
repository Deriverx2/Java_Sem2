package Que05;

import java.util.Scanner;

class BoxList {
    private Box[] boxes=new Box[3];
    public BoxList(){
        Scanner scan=new Scanner(System.in);
        int l,b,h;
        System.out.print("Enter side of cube: ");
        l=scan.nextInt();
        scan.nextLine();
        boxes[0]=new Box(l);
        System.out.print("Enter sides of square prism: ");
        l=scan.nextInt();
        scan.nextLine();
        h=scan.nextInt();
        scan.nextLine();
        boxes[1]=new Box(l,h);
        System.out.print("Enter sides of rectangle prism: ");
        l=scan.nextInt();
        scan.nextLine();
        b=scan.nextInt();
        scan.nextLine();
        h=scan.nextInt();
        scan.nextLine();
        boxes[2]=new Box(l,b,h);
        scan.close();
    }
    public void printBoxes(){
        System.out.println("\n********************CUBE********************");
        System.out.println("AREA: "+boxes[0].getArea());
        System.out.println("VOLUME: "+boxes[0].getVolume());
        System.out.println("\n****************SQUARE PRISM****************");
        System.out.println("AREA: "+boxes[1].getArea());
        System.out.println("VOLUME: "+boxes[1].getVolume());
        System.out.println("\n****************RECTANGLE PRISM****************");
        System.out.println("AREA: "+boxes[2].getArea());
        System.out.println("VOLUME: "+boxes[2].getVolume());
    }
}
