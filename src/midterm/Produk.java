package midterm;

// Superclass 2: Produk
public class Produk {
    protected String namaProduk;
    protected int idProduk;
    protected boolean tersedia;

    // Konstruktor
    public Produk(String namaProduk, int idProduk) {
        this.namaProduk = namaProduk;
        this.idProduk = idProduk;
        this.tersedia = true; // Default value
    }

    // Method pertama tanpa parameter
    public void displayInfo() {
        System.out.println("Produk: " + namaProduk + ", ID: " + idProduk);
    }

    // Method kedua membutuhkan parameter
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    // Method ketiga yang mengembalikan nilai
    public boolean isTersedia() {
        switch (namaProduk) {
            case "Beras":
                return tersedia;
            case "Gula":
                return tersedia;
            default:
                return false;
        }
    }
}

