package Limas;

class SegitigaSamaSisi extends Titik {
    private double sisiSegitiga;
    public SegitigaSamaSisi(double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x1, y1);
        this.sisiSegitiga = hitungJarak(new Titik(x2, y2));
    }
    public double hitungLuas() {
        return 0.5 * sisiSegitiga * hitungJarak(new Titik(getX(), getY()));
    }
    protected double getX() {
        return x;
    }
    protected double getY() {
        return y;
    }
    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Sisi Segitiga : " + sisiSegitiga);
        System.out.println("Luas Segitiga : " + hitungLuas());
    }
}