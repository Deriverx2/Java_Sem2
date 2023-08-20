package Que12;

import java.util.Scanner;

class ArrayMenu {
    Scanner scan=new Scanner(System.in);

    DynamicArray array=new DynamicArray();
    private int element;
    private int position;
    private static int choice;
    public void printMenu(){
        System.out.println("*************** MENU ***************");
        System.out.println("1: Add element to array");
        System.out.println("2: Add element to a position of array");
        System.out.println("3: Search for an element");
        System.out.println("4: Remove element");
        System.out.println("5: Print array");
        System.out.println("6: Quit");
        System.out.print("Enter choice:");
    }

    public void setChoice(){
        choice=scan.nextInt();
        scan.nextLine();
    }

    public static int getChoice() {
        return choice;
    }

    public void addLast(){
        System.out.print("Enter element to add to array: ");
        element=scan.nextInt();
        array.addElement(element);
    }
    public void addToPosition(){
        System.out.print("Enter element to add to array: ");
        element=scan.nextInt();
        System.out.print("Enter position of element: ");
        position=scan.nextInt();
        array.addElement(element,position);
    }

    public void search(){
        System.out.print("Enter element to search in array: ");
        element=scan.nextInt();
        int i=array.searchElement(element);
        if (i==-1){
            System.out.println("Element not found");
        }
        else {
            System.out.printf("Element is in position %d %n",i);
        }
    }

    public void remove() {
        System.out.print("Enter position of element to remove from array: ");
        position = scan.nextInt();
        array.removeElement(position);
    }

    public void print(){
        System.out.print("Array: ");
        array.printArray();
    }
}
