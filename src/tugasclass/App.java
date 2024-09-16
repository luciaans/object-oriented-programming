package tugasclass;

public class App {
    public static void main(String[] args) {

        System.out.println("===========================================================================");

        Rekening rekening1 = new Rekening(1100000, "Rina Fitri");
        System.out.println(rekening1);

        Rekening rekening2 = new Rekening(4100000, "Adi Pratama");
        System.out.println(rekening2);

        System.out.println("===========================================================================");

        Pinjaman pinjaman1 = new Pinjaman();
        pinjaman1.setCicilan(10);
        System.out.println(pinjaman1);

        Pinjaman pinjaman2 = new Pinjaman();
        pinjaman2.setCicilan(15);
        System.out.println(pinjaman2);

        Pinjaman pinjaman3 = new Pinjaman();
        pinjaman3.setCicilan(30);
        System.out.println(pinjaman3);

        Pinjaman pinjaman4 = new Pinjaman();
        pinjaman4.setCicilan(45);
        System.out.println(pinjaman4);

        Pinjaman pinjaman5 = new Pinjaman();
        pinjaman5.setCicilan(55);
        System.out.println(pinjaman5);

        System.out.println("===========================================================================");

        Mahasiswa mahasiswa1 = new Mahasiswa("Sayyid M Rizqi R Al Qadrie", 3.8, 2022, "221220049");
        mahasiswa1.tampilkanInformasi();
        mahasiswa1.tampilkanSisaMasaStudi();
        mahasiswa1.tampilkanPredikat();

        System.out.println("===========================================================================");

        Mahasiswa mahasiswa2 = new Mahasiswa("Andika Wibowo Pratama", 2.1, 2021, "211220011");
        mahasiswa2.tampilkanInformasi();
        mahasiswa2.tampilkanSisaMasaStudi();
        mahasiswa2.tampilkanPredikat();

        System.out.println("===========================================================================");

        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.tampilkanInformasi();
        mahasiswa3.tampilkanSisaMasaStudi();
        mahasiswa3.tampilkanPredikat();

        System.out.println("===========================================================================");
    }
}
