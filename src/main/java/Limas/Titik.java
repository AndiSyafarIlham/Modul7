package Limas;

import java.lang.Math;
class Titik {
    protected double x;
    protected double y;
    public void tampil() {
        System.out.println("Point : (" + x + ", " + y + ")");
    }
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double hitungJarak(Titik t2) {
        return Math.sqrt(Math.pow((t2.x - this.x), 2) + Math.pow((t2.y - this.y), 2));
    }
}