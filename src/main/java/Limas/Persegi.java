package Limas;

class Persegi extends Titik {
    private double sisiPersegi;
    public Persegi(double x1, double y1, double x2, double y2) {
        super(x1, y1);
        this.sisiPersegi = hitungJarak(new Titik(x2, y2));
    }
    public double hitungLuas() {
        return sisiPersegi * sisiPersegi * Math.sqrt(3);
    }
    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Sisi Persegi : " + sisiPersegi);
        System.out.println("Luas Persegi : " + hitungLuas());
    }
}