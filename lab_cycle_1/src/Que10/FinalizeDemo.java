package Que10;

class FinalizeDemo {
  int a,b,c;
    ABC(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void printProduct(){
        System.out.println("product="+(a+b+c));
    }
    public void finalize(){
        System.out.println("garbageCollected ");
    }
    
}
