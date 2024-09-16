package midterm;

// Subclass 2: Transaksi
public class Transaksi extends Produk {
    private String idTransaksi;
    private int jumlah;
    private boolean selesai;

    // Konstruktor
    public Transaksi(String namaProduk, int idProduk, String idTransaksi, int jumlah, boolean selesai) {
        super(namaProduk, idProduk);
        this.idTransaksi = idTransaksi;
        this.jumlah = jumlah;
        this.selesai = selesai;
    }

    // Method pertama tanpa parameter
    public void printTransaksiInfo() {
        System.out.println("ID Transaksi: " + idTransaksi + ", Jumlah: " + jumlah);
    }

    // Method kedua membutuhkan parameter
    public void updateJumlah(int jumlahBaru, boolean tambah) {
        if (tambah) {
            jumlah += jumlahBaru;
        } else {
            jumlah = jumlahBaru;
        }
    }

    // Getter method untuk mengakses nilai jumlah
    public int getJumlah() {
        return jumlah;
    }

    // Method ketiga yang mengembalikan nilai
    public boolean isSelesai() {
        boolean status = false;
        if (jumlah > 0) {
            status = true;
        }
        return status;
    }
}
