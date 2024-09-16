package LearnClass;

public class Baju {
    int harga;
    String size;
    String merk;
    int gethargaPotongan;

    int getHargaPotongan () {
        if (size.equals("L")){
            int diskon = (int) (harga * 0.1);
            return harga - diskon;
        } else {
            return harga;
        }
    }
}
