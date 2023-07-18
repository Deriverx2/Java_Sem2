package Que08;

public class Cylinder implements ThreeDShapes{
    private double radius;
    private double height;
    private double area;
    private double volume;

    public Cylinder(double radius, double height){
        this.radius=radius;
        this.height=height;
        setArea();
        setVolume();
    }
    public void setArea(){
        area=2*Math.PI*radius*(radius+height);
    }
    public void setVolume(){
        volume=Math.PI*radius*radius*height;
    }
    @Override
    public void printArea() {
        System.out.println("\nSurface area of sphere="+area);
    }

    @Override
    public void printVolume() {
        System.out.println("Volume of sphere="+volume);

    }
}
