package midterm;

public class App {
    public static void main(String[] args) {
        System.out.println("=====================================");
        // Membuat objek Kasir
        Kasir kasir = new Kasir("Kiki", 25, true, "KAS001", 1, true);
        kasir.greet(); // Memanggil method overridden dari superclass
        kasir.printKasirInfo(); // Memanggil method khusus dari subclass
        System.out.println("Apakah registrasi dibuka? " + kasir.isRegistrasiBuka()); // Memanggil method inherited

        System.out.println("=====================================");
        // Membuat objek Transaksi
        Transaksi transaksi = new Transaksi("Beras", 1001, "TRX001", 5, false);
        transaksi.displayInfo(); // Memanggil method overridden dari superclass
        transaksi.printTransaksiInfo(); // Memanggil method khusus dari subclass
        System.out.println("Apakah transaksi selesai? " + transaksi.isSelesai()); // Memanggil method inherited

        System.out.println("=====================================");
        // Memanggil method overloading dari subclass Transaksi
        transaksi.updateJumlah(3, true); // Menambah jumlah
        System.out.println("Jumlah setelah penambahan: " + transaksi.getJumlah());
        transaksi.updateJumlah(10, false); // Mengganti jumlah
        System.out.println("Jumlah setelah penggantian: " + transaksi.getJumlah());

        System.out.println("=====================================");
    }
}
