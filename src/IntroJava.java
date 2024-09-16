public class IntroJava {
    public static void main(String[] args) {
        System.out.println("Aplikasi Absensi Mahasiswa");

            //deklarasi variable
            String namaMahasiswa;
            //inisialisasi
            namaMahasiswa = "Dony";
            //deklarasi dan inisialisasi
            byte usiaMahasiswa = 24;

            float ipSemester = 3.25f;
            boolean aktifKuliah = true;
            char nilaiPBO = 'A';

            String namaBuku = "Doraemon Vol 1";
            int harga = 30000;
            String kategori = "komik";

            //assigment
            String namaProdi = "Teknik Informatika" ;
                    namaProdi = "Sistem Informasi" ;
            //konstanta
            final String NAMA_KAMPUS = "UM PONTIANAK";

            String merekBaju = "3Second";
            String warnaBaju = "hitam";
            String ukuranBju = "M";
            int hargaBuku = 100000;

            //operasi aritmatika
            byte two = 2;
            byte four = 4;
            System.out.println(two + four);
            byte six = (byte) (two + four);
            System.out.println(six);

            System.out.println(two + two);
            System.out.println(two + 45);
            System.out.println(3 + four);
            System.out.println(7 + 5);

            int jamTangan = 500000;
            int topi = 100000;

            System.out.println((jamTangan * 2) + (topi * 3));

            //operasi perbandingan
            byte usiaCici = 37;
            byte usiaDayang = 47;
            System.out.println(usiaCici < usiaDayang);
            System.out.println(usiaCici > usiaDayang);
            byte usiaRakita = 37;
            System.out.println(usiaCici == usiaDayang);
            System.out.println(usiaCici != usiaDayang);
            System.out.println(usiaCici >= usiaDayang);
            System.out.println(usiaCici <= usiaDayang);
            System.out.println((usiaCici + usiaDayang) == (usiaDayang + usiaRakita));

            //operasi logika
            boolean hariIniHujan = false;
            boolean hariIniadaPBO = true;
            System.out.println(hariIniHujan && hariIniadaPBO);
            System.out.println(hariIniHujan || hariIniadaPBO);
            System.out.println(!hariIniHujan);
            System.out.println((usiaCici > usiaDayang) && (usiaRakita != usiaCici));

            //penggabungan sreing
            String namaDepan = "Devi";
            String namaBelakang = "Ramadania";
            System.out.println(namaBelakang + " " + namaDepan);
            int usia = 56;
            String namaLengkap = namaBelakang + " " + namaDepan;
            System.out.println(namaLengkap + usia);

    }
}
