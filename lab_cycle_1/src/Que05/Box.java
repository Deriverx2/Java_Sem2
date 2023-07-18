package Que05;

class Box {
    private int l, b, h;
    private int volume;
    private int area;

    public Box(int l) {
        this.l = l;
        this.b = l;
        this.h = l;
        this.volume = setVolume();
        this.area = setArea();
    }

    public Box(int l, int b) {
        this.l = l;
        this.b = b;
        this.h = l;
        this.volume = setVolume();
        this.area = setArea();
    }

    public Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
        this.volume = setVolume();
        this.area = setArea();
    }

    public int setVolume() {
        return this.l * this.b * this.h;
    }

    public int setArea() {
        if (this.l == this.b && this.l == this.h) {
            return this.l * this.l * 6;
        } else if (this.l == this.h) {
            return this.l * this.l * 2 + this.b * this.h * 4;
        } else {
            return 2 * this.l * this.h + 2 * this.l * this.b + 2 * this.b * this.h;
        }
    }
    public int getArea(){
        return area;
    }
    public int getVolume(){
        return volume;
    }
}

