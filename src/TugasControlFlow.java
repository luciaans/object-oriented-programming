public class TugasControlFlow {
    public static void main(String[] args) {

        //NO 1
        byte usiaAni = 17;
        boolean punyaKTP = false;

        if (usiaAni >= 1 ) {
            punyaKTP = true;
            System.out.println(punyaKTP + " Ani Mempunyai KTP");
            System.out.println("======");
        }

        //NO 2
        int angka = 66;
        if(angka % 2 == 0){
            System.out.println("Ini Bilangan Genap");
        }else {
            System.out.println("Ini Bilangan Ganjil");
        }
        System.out.println("======");

        //NO 3
        int hargaBarang = 150000;
        byte jumlahBeli = 10;
        String pesanError;

        if (jumlahBeli < 0){
            pesanError = "Minimal Pesan Satu";
            System.out.println(pesanError);
        }else {
            System.out.println( "Harga Yang Harus Di bayar " + hargaBarang * jumlahBeli);
            System.out.println("======");
        }

        //NO 4 TERNARY DARI SOAL NOMOR 2 DAN 3
        angka = 27;
        String status = (angka % 2 == 0) ? "Ini Bilangan Genap" : "Ini Bilangan Ganjil";
        System.out.println(status);

        System.out.println("======");

        String output = (jumlahBeli < 0) ? "Minimal Pesan Satu" : String.valueOf( "Harga Yang Harus Di bayar " + hargaBarang * jumlahBeli);
        System.out.println(output);
        System.out.println("======");

        //NO 5
        byte nilaiAngka = 89;
        String pesanNilai;

        if (nilaiAngka <= 49) {
            pesanNilai = "Buruk";
        } else if (nilaiAngka <= 60) {
            pesanNilai = "Baik";
        } else {
            pesanNilai = "Nilai Sangat Baik";
            System.out.println(pesanNilai);

        }
    }
}
