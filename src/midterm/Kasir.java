package midterm;

// Subclass 1: Kasir
public class Kasir extends Orang {
    private String idKasir;
    private int nomorRegistrasi;
    private boolean registrasiBuka;

    // Konstruktor
    public Kasir(String nama, int umur, boolean adalahKaryawan, String idKasir, int nomorRegistrasi, boolean registrasiBuka) {
        super(nama, umur, adalahKaryawan);
        this.idKasir = idKasir;
        this.nomorRegistrasi = nomorRegistrasi;
        this.registrasiBuka = registrasiBuka;
    }

    // Method pertama tanpa parameter
    public void printKasirInfo() {
        System.out.println("ID Kasir: " + idKasir + ", Nomor Registrasi: " + nomorRegistrasi);
    }

    // Method kedua membutuhkan parameter
    public void updateRegistrasi(boolean buka) {
        if (umur >= 18) {
            this.registrasiBuka = buka;
        } else {
            System.out.println("Anda belum cukup umur untuk melakukan registrasi.");
        }
    }

    // Method ketiga yang mengembalikan nilai
    public boolean isRegistrasiBuka() {
        int i = 0;
        do {
            i++;
        } while (i < 5);
        return registrasiBuka;
    }
}


