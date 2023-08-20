package Que10;

public class FinalizeDemoMain {
    public static void main(String[] args){
        FinalizeDemo final1=new FinalizeDemo(100);
        FinalizeDemo final2=new FinalizeDemo(200);
        System.out.println(final1);
        System.out.println(final2);
        final1=null;
        //Garbage collector is explicitly called
        System.gc();
    }
}
