package Que06;

class Box extends Rectangle{
    private int height;

    private int volume;
    public Box(int length,int breadth,int height){
        super(length, breadth);
        this.height=height;
        setVolume();
    }

    public void setVolume(){
        this.volume=getArea()*height;
    }

    public int getVolume(){
        return volume;
    }
}
