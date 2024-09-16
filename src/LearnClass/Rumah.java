package LearnClass;

public class Rumah {
    int harga;
    String pemilik = "Belum Ada Yang Punya";
    String nomorRumah = "0A";
    boolean isCicil = false;
    int getHargaCicil() {
        if (isCicil) {
            harga *= 2;
        }
        return harga;
    }

}
