package Que08;

public class Sphere implements ThreeDShapes{
    private double radius;
    private double area;
    private double volume;

    public Sphere(double radius){
        this.radius=radius;
        setArea();
        setVolume();
    }

    public void setArea(){
        area=4*Math.PI*radius*radius;
    }

    public void setVolume(){
        volume=(4/3)*Math.PI*radius*radius*radius;
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
