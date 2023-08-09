/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//Write a program to create a class DynamicArray to implement a dynamic array. Provide
//a. Constructor to initialize the array
//b. Function to print array
//c. Function to add elements to a position (if position not specified, add to end)
//d. Function to remove elements
//e. Function to search an element
package Que12;

import java.util.Scanner;


public class DynamicArray {
    private int[] array;
    private int length;
    
    public DynamicArray(int length){
        this.length = length;
        array = new int[length];
    }
    
    void getArray(){
        for(int i=0;i<length;i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the element at "+(i+1)+" : ");
            array[i] = sc.nextInt();
        }
    }
    
    void printArray(){
        for(int i=0;i<length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
    void addElement(int element){
        int newLength = length+1;
        int newArray[] = new int[newLength];
        for(int i=0;i<length;i++){
            newArray[i]=array[i];
        }
        array = newArray;
        array[length]=element;
        length++;
    }
    
    void addElement(int position,int element){
        int newLength = length+1;
        int newArray[] = new int[newLength];
        System.arraycopy(array, 0, newArray, 0, length);
        array = newArray;
        
        for(int i = newLength-1;i>=position;i--){
            array[i]=array[i-1];
        }
        array[position-1] = element;
        length++;
    }
    
    int searchElement(int element){
        for(int i=0;i<length;i++){
            if(array[i]==element){
                return i;
            }
        }
        return -1;
    }
    
    void removeElement(int element){
        int position = searchElement(element);
        if(position!=-1){
            for(int i=position;i<length-1;i++){
                array[i]=array[i+1];
            }
            length--;
        }
    }
  public static void main(String[] args){
        DynamicArray obj = new DynamicArray(5);
        obj.getArray();
        obj.printArray();
        obj.addElement(2);
        obj.printArray();
        obj.addElement(2,4);
        obj.printArray();
        obj.removeElement(3);
        obj.printArray();
        int x = obj.searchElement(4);
        System.out.println(x);
    }
}
