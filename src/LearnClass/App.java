package LearnClass;

public class App {
    public static void main(String[] args) {

        //RUMAH
        Rumah rumahAdi = new Rumah();
        rumahAdi.pemilik = "Adi Masaid";
        rumahAdi.harga = 120;
        rumahAdi.nomorRumah = "1A";

        System.out.println("Pemilik: " + rumahAdi.pemilik);
        System.out.println("Harga: " + rumahAdi.harga);
        System.out.println("Nomor Rumah: " + rumahAdi.nomorRumah);

        System.out.println("______________________________");

        Rumah rumahRtika = new Rumah();
        rumahRtika.pemilik = "Ratika Dewi";
        rumahRtika.harga = 130;
        rumahRtika.nomorRumah = "0A";

        System.out.println("Pemilik: " + rumahRtika.pemilik);
        System.out.println("Harga: " + rumahRtika.harga);
        System.out.println("Nomor Rumah: " + rumahRtika.nomorRumah);

        System.out.println("==============================");

        //PONSEL
        jenisPonsel samsung = new jenisPonsel();
        samsung.merekPonsel = "Samsung";
        samsung.ramPonsel = 16;
        samsung.hargaPonsel = 20000000;

        System.out.println("Merek: " + samsung.merekPonsel);
        System.out.println("Ram: " + samsung.ramPonsel);
        System.out.println("Harga: " + samsung.hargaPonsel);

        System.out.println("______________________________");

        jenisPonsel xiaomi = new jenisPonsel();
        xiaomi.merekPonsel = "xiaomi";
        xiaomi.ramPonsel = 8;
        xiaomi.hargaPonsel = 3000000;

        System.out.println("Merek: " + xiaomi.merekPonsel);
        System.out.println("Ram: " + xiaomi.ramPonsel);
        System.out.println("Harga: " + xiaomi.hargaPonsel);

        System.out.println("==============================");

        //KOSMETIK
        Kosmetik beliKosmetik1 = new Kosmetik();
        beliKosmetik1.harga = 12000;
        beliKosmetik1.nama = "Bedak";
        beliKosmetik1.merek = "SkinTific";
        beliKosmetik1.jumlahBeli = 4;

        System.out.println("Nama: " + beliKosmetik1.nama);
        System.out.println("Merek: " + beliKosmetik1.merek);
        System.out.println("Jumlah Beli: " + beliKosmetik1.jumlahBeli);
        System.out.println("Diskon: " + beliKosmetik1.getDiskon());
        System.out.println("Total: " + beliKosmetik1.total);

        System.out.println("______________________________");

        Kosmetik beliKosmetik2 = new Kosmetik();
        beliKosmetik2.harga = 100000;
        beliKosmetik2.nama = "Lipstik";
        beliKosmetik2.merek = "Sk-II";
        beliKosmetik2.jumlahBeli = 3;

        System.out.println("Nama: " + beliKosmetik2.nama);
        System.out.println("Merek: " + beliKosmetik2.merek);
        System.out.println("Jumlah Beli: " + beliKosmetik2.jumlahBeli);
        System.out.println("Diskon: " + beliKosmetik2.getDiskon());
        System.out.println("Total: " + beliKosmetik2.total);

        System.out.println("==============================");

        //BAJU
        Baju baju1 = new Baju();
        Baju baju2 = new Baju();

        baju1.harga = 200000;
        baju1.merk = "THREESECOND";
        baju1.size = "L";

        baju2.harga = 300000;
        baju2.merk = "HAMMER";
        baju2.size = "S";

        System.out.println("Merk : " + baju1.merk);
        System.out.println("Harga : " + baju1.harga);
        System.out.println("Size : " + baju1.size);
        System.out.println("Harga Diskon " + baju1.getHargaPotongan());

        System.out.println("==============================");

        System.out.println("Merk : " + baju2.merk);
        System.out.println("Harga : " + baju2.harga);
        System.out.println("Size : " + baju2.size);






    }
}
