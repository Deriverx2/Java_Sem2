package Que03;

class Student {
    private String name;
    private int rollNo;
    private int[] mark;
    private int total;

    public Student(String name, int rollNo, int[] mark) {
        this.name = new String(name);
        this.rollNo = rollNo;
        this.mark = mark;
        setTotal();
    }
    public void setTotal(){
        total=0;
        for (int i=0;i<5;i++){
            total+=mark[i];
        }
    }

    public int getTotal(){
        return this.total;
    }

    public void printDetails(){
        System.out.println("Name:\t"+this.name);
        System.out.println("Roll No:\t"+this.rollNo);
        for(int i=0;i<5;i++){
            System.out.println("Mark of Subject "+ (i+1) +":\t"+this.mark[i]);
        }
        System.out.println("Total:\t"+getTotal()+"\n\n");
    }

}

