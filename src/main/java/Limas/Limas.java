package Limas;

class Limas {
    private SegitigaSamaSisi[] segitigas;
    private Persegi persegi;
    public Limas(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        segitigas = new SegitigaSamaSisi[4];
        segitigas[0] = new SegitigaSamaSisi(x1, y1, x2, y2, x3, y3);
        segitigas[1] = new SegitigaSamaSisi(x2, y2, x3, y3, x4, y4);
        segitigas[2] = new SegitigaSamaSisi(x3, y3, x4, y4, x1, y1);
        segitigas[3] = new SegitigaSamaSisi(x4, y4, x1, y1, x2, y2);
        persegi = new Persegi(x1, y1, x3, y3);
    }
    public double hitungLuas() {
        double luasSegitiga = segitigas[0].hitungLuas();
        double luasPersegi = persegi.hitungLuas();
        return (4 * luasSegitiga) + luasPersegi;
    }
    public void tampil() {
        System.out.println("== Data Segitiga ==");
        for (SegitigaSamaSisi segitiga : segitigas) {
            segitiga.tampil();
        }
        System.out.println("\n== Data Persegi ==");
        persegi.tampil();
        System.out.println("\nLuas Limas : " + hitungLuas());
    }
}