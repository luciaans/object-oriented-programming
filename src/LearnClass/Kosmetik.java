package LearnClass;

public class Kosmetik {
    int harga;
    String nama;
    String merek;

    int jumlahBeli;
    int total;
    int getDiskon() {
        if (jumlahBeli >= 3) {
            total = (jumlahBeli * harga) / 10;
        }
        return harga;
    }
}
