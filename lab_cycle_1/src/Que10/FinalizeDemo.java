package Que10;

class FinalizeDemo {
    private int code;
    public FinalizeDemo(int code){
        this.code=code;
    }

    public void finalize() {
        System.out.println("Garbage collected");
    }

    public String toString(){
        return "Code is "+code;
    }
}
