package Que06;

public class Rectangle {
    private int length,breadth;
    private int area;

    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        setArea();
    }

    public void setArea() {
        this.area = this.length*this.breadth;
    }

    public int getArea() {
        return area;
    }
}
