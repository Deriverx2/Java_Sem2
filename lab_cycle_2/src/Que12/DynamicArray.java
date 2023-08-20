package Que12;

class DynamicArray {
    private int[] array;
    private int capacity;
    private int size;

    public DynamicArray(int initialCapacity){
        capacity=initialCapacity;
        array=new int[capacity];
        size=0;
    }
    public DynamicArray(){
        this(10);
    }

    public void printArray(){
        for (int i=0;i<size;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void addElement(int element){
        if (size==capacity){
            resizeArray(capacity*2);
        }
        array[size]=element;
        size++;
    }

    public void addElement(int element, int position){
        if ( position < 0 || position>=size){
            System.out.println("Invalid position");
            return;
        }
        if (size==capacity){
            resizeArray(capacity*2);
        }
        for (int i=size-1;i>=position;i--){
            array[i+1]=array[i];
        }
        array[position]=element;
        size++;
    }

    public void removeElement(int position){
        if ( position < 0 || position>=size){
            System.out.println("Invalid position");
            return;
        }
        for (int i=position;i<size-1;i++){
            array[i]=array[i+1];
        }
        size--;
    }

    public int searchElement(int element){
        for(int i=0;i<size;i++){
            if (element==array[i]){
                return i;
            }
        }
        return -1;//Element not found
    }

    public void resizeArray(int newCapacity){
        int[] newArray=new int[newCapacity];
        for(int i=0;i<size;i++){
            newArray[i]=array[i];
        }
        array=newArray;
        capacity=newCapacity;
    }
}
