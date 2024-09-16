package midterm;

// Superclass 1: Orang
public class Orang {
    protected String nama;
    protected int umur;
    protected boolean adalahKaryawan;

    // Konstruktor
    public Orang(String nama, int umur, boolean adalahKaryawan) {
        this.nama = nama;
        this.umur = umur;
        this.adalahKaryawan = adalahKaryawan;
    }

    // Method pertama tanpa parameter
    public void greet() {
        System.out.println("Halo, nama saya " + nama);
    }

    // Method kedua membutuhkan parameter
    public void setUmur(int umurBaru) {
        this.umur = umurBaru;
    }

    // Method ketiga yang mengembalikan nilai
    public boolean isKaryawan() {
        if (umur >= 18) {
            return adalahKaryawan;
        } else {
            return false;
        }
    }
}