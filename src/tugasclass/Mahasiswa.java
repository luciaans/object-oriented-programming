package tugasclass;

import java.time.Year;

public class Mahasiswa {
    private String nama;
    private double IPK;
    private int angkatan;
    private String nim;

    public Mahasiswa(String nama, double IPK, int angkatan, String nim) {
        this.nama = nama;
        this.IPK = IPK;
        this.angkatan = angkatan;
        this.nim = nim;
    }

    public Mahasiswa() {
        this("Nia Ayu Lestari Wulandari", 0.0, 2019, "19122009");
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("IPK: " + IPK);
        System.out.println("Angkatan: " + angkatan);
    }

    public void tampilkanSisaMasaStudi() {
        int tahunSekarang = Year.now().getValue();
        int sisaMasaStudi = (angkatan + 4) - tahunSekarang;
        System.out.println("Sisa Masa Studi: " + (sisaMasaStudi > 0 ? sisaMasaStudi : 0) + " Tahun");
    }

    public void tampilkanPredikat() {
        if (IPK == 0.0) {
            System.out.println("Predikat: Gagal");
        } else if (IPK > 3.0) {
            System.out.println("Predikat: Dengan Pujian");
        } else if (IPK >= 2.75 && IPK <= 3.0) {
            System.out.println("Predikat: Memuaskan");
        } else if (IPK >= 2.0 && IPK < 2.75) {
            System.out.println("Predikat: Cukup");
        } else {
            System.out.println("Predikat: Tidak Memuaskan");
        }
    }

}