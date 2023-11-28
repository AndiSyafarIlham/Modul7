package Perusahaan;

class Pegawai
{
    private String nama;
    private String NIP;
    public Pegawai()
    {
        System.out.println("Konstruktor pegawai dijalankan...");
    }
    public Pegawai(String NIP, String nama)
    {
        this.NIP=NIP;
        this.nama=nama;
        System.out.println("Konstruktor pegawai dijalankan...");
    }
    public void tampilPeg()
    {
        System.out.println("NIP : "+NIP+" ,Nama : "+nama);
    }
}
