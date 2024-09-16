public class Percabangan {
    public static void main(String[] args) {
        boolean adaMakul = true;
        if (adaMakul) {
            System.out.println("Saya Ke Kampus");
        }

        byte usiaSaya = 18;
        byte usiaDia = 17;
        if (usiaSaya != usiaDia) {
            System.out.println("Kami Tidak Sebaya");
        }

        boolean hariIniHujan = true;
        boolean sayaBawaPayung = false;
        if (hariIniHujan && !sayaBawaPayung) {
            System.out.println("Saya Pulang Kehujanan");
        }

        int hargaIndomie = 2500;
        int hargaSupermie = 2750;
        boolean adaTelur = true;
        if ((hargaIndomie < hargaSupermie) && adaTelur) {
            System.out.println("Masak Indomie Pake Telur");
        }

        int hargaMotor = 30000000;
        boolean beliCash = true;
        int diskon;
        if (beliCash) {
            diskon = 700000;
            int bayar = hargaMotor - diskon;
            System.out.println("Harga Yang Harus Saya Bayar Adalah" + bayar);
        }

        int beliKrudung = 20000;
        boolean mauBeli = true;
        int diskonKalauBeli5 = 2;
        if (mauBeli) {
            System.out.println("Total Harga" + beliKrudung * 6);
        }

        byte jamSekarang = 19;
        if (jamSekarang >= 6 && jamSekarang <= 8) {
            System.out.println("Makan bubur ayam");
        } else if (jamSekarang >= 11 && jamSekarang <= 13) {
            System.out.println("Makan che hun tiaw");
        } else if (jamSekarang >= 17 && jamSekarang <= 19) {
            System.out.println("Makan nasi goreng telur dadar");
        } else if (jamSekarang >= 22 && jamSekarang <= 23) {
            System.out.println("Makan indomie telur");
        } else {
            System.out.println("Belum waktunya makan");
        }


        byte nilaiMahasiswa = 98;
        if (nilaiMahasiswa >=80 && nilaiMahasiswa <=100) {
            System.out.println("Nilai Mahasiswa A");
        }
        if (nilaiMahasiswa >=70 && nilaiMahasiswa <=79) {
            System.out.println("Nilai Mahasiswa B");
        }
        if (nilaiMahasiswa >=60 && nilaiMahasiswa <=69) {
            System.out.println("Nilai Mahasiswa C");
        }
        if (nilaiMahasiswa >=50 && nilaiMahasiswa <=59) {
            System.out.println("Nilai Mahasiswa D");
        }
        if (nilaiMahasiswa >=0 && nilaiMahasiswa <=49) {
            System.out.println("Nilai Mahasiswa E");
        }
        else if (nilaiMahasiswa >=0 && nilaiMahasiswa <=49) {
            System.out.println("Nilai Mahasiswa Adalah E");
        }

        byte nilaiAngkaPBO = 78;
        char nilaiHurufPBO;
        if (nilaiAngkaPBO >= 80 && nilaiAngkaPBO <= 100 ) { nilaiHurufPBO = 'A';}
        else if (nilaiAngkaPBO >= 70) {nilaiHurufPBO = 'B';}
        else if (nilaiAngkaPBO >= 60) {nilaiHurufPBO = 'C';}
        else if (nilaiAngkaPBO >= 50) {nilaiHurufPBO = 'D';}
        else { nilaiHurufPBO = 'E';}
        System.out.println("Nilai PBO : " + nilaiAngkaPBO + "atau" +nilaiAngkaPBO);

        byte jamSaatini = 6;
        boolean tokoBuka = (jamSaatini >= 9) ? true : false;
        System.out.println(tokoBuka);

        int uangSaya = 100000000;
        String keputusanSaya = (uangSaya >= 20000000) ? "Beli iPhone" : "Tidak jadi beli";
        System.out.println(keputusanSaya);

        byte banyakBeliBaju = 7;
        float diskonBaju = (banyakBeliBaju > 5) ? .2f : 0;
        System.out.println("Anda mendapat diskon: " + (diskonBaju * 100) + "%");


        char nilaiHurufPWL = 'A';
        switch (nilaiHurufPWL) {
            case 'A' :
                System.out.println("A : Baik Sekali");
                break;
            case 'B' :
                System.out.println("B : Baik");
                break;
            case 'C' :
                System.out.println("C : Cukup");
            case 'D' :
                System.out.println("D : Kurang Cukup");
                break;
            case 'E' :
                System.out.println("E : Buruk Sekali");
                break;
            default:
                System.out.println("Huruf Salah!");
        }

        for (byte i = 1;i <= 5;i++) {
            System.out.println("Loncatan Ke-" + i);
        }

        System.out.println("============");

        for (byte i = 10;i >= 5;i--) {
            System.out.println("Loncatan Ke-" + i);
        }

        System.out.println("============");

        for (byte i = 2;i <= 7;i++) {
            if (i == 4) {
                continue;
            }
            System.out.println("Loncatan Ke-" + i);
        }

        System.out.println("============");

        for (byte i = 15; i >= 5; i--) {
            if (i % 2 == 1) {
                System.out.println("Loncatan Ke-" + i);
            }
        }

        System.out.println("============");

        for (byte i = 3; i <= 27; i *=3) {
            System.out.println("Loncatan Ke-" + i);
            }

        System.out.println("============");

        for (int i = 1; i <= 7; i++) {
            System.out.println("Loncatan Ke-" + (i * i));
        }

        System.out.println("============");

        byte angkaWhile = 1;
        while (angkaWhile <= 5) {
            System.out.println("WHILE Ke " + angkaWhile);
            angkaWhile++;
        }

        byte angkaDoWhile = 1;
        do {
            System.out.println("Do WHILE Ke " + angkaDoWhile);
            angkaDoWhile++;
        } while (angkaDoWhile <= 0);

        System.out.println("============");

        //Array
        String[] students = {"Cici","Qalwani","Nurali"};
        int[] ages = {17,23,22};
        float[] grades = {3.7f,4.0f,3.25f};

        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[0]);
        System.out.println(ages[2]);

        for (String student: students) {
            System.out.println(student);
        }

        for (int age:ages) {
            System.out.println(age + 2);
        }

    }
}

