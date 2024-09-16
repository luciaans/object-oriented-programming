public class TugasMethod {
    static void cekPrima(int angkaMasukan) {
        byte cekAwal = 2;
        boolean apakahPrima = (angkaMasukan > 1);

        while (apakahPrima && (cekAwal < angkaMasukan)) {
            apakahPrima = (angkaMasukan % cekAwal++ != 0);
            if (cekAwal == angkaMasukan) {
                break;
            }
        }

        if (apakahPrima) {
            System.out.println(angkaMasukan + " Merupakan Bilangan Prima");
        } else {
            System.out.println(angkaMasukan + " Bukan Bilangan Prima");
        }

        System.out.println("==================================");
    }

    static void jumlahDigit(byte angkaInput) {
        int digitPertama = angkaInput % 10;
        int digitKedua = angkaInput / 10;
        byte total = (byte) (digitPertama + digitKedua);

        if (angkaInput < 100) {
            System.out.println("Total Dari Inputan " + angkaInput + " = " + total);
        } else {
            System.out.println("Inputannya hanya menerima dua digit saja! = " + angkaInput);
        }
        System.out.println("==================================");
    }

    static void statistikDataTunggal(byte inputPertama, byte inputKedua, byte inputKetiga) {
        int[] data = {inputPertama, inputKedua, inputKetiga};
        byte total = 0, minimal = inputPertama, maksimal = inputKedua;

        for (int i = 0; i < data.length; i++) {
            total += data[i];

            if (data[i] < minimal) {
                minimal = (byte) data[i];
            }

            if (data[i] > maksimal) {
                maksimal = (byte) data[i];
            }
        }

        float rataRata = (float) total / data.length;

        System.out.print("Data Yang Di Input = ");
        for (int array : data) {
            System.out.print(array + " ");
        }

        System.out.print("\nJadi ");
        System.out.println("Mean = " + rataRata + "\t Total = " + total + "\t Min = " + minimal + "\t Max = " + maksimal);

        System.out.println("==================================");
    }

    static void hariBerdasarkanAngka(char angkaHari) {
        switch (angkaHari) {
            case '1':
                System.out.println("1  Berarti Hari Senin");
                break;
            case '2':
                System.out.println("2  Berarti Hari Selasa");
                break;
            case '3':
                System.out.println("3  Berarti Hari Rabu");
                break;
            case '4':
                System.out.println("4 Berarti Hari Kamis");
                break;
            case '5':
                System.out.println("5  Berarti Hari Jum'at");
                break;
            case '6':
                System.out.println("6  Berarti Hari Sabtu");
                break;
            case '7':
                System.out.println("7  Berarti Hari Minggu");
                break;
            default:
                System.out.println("Input yang dimasukkan salah, SILAHKAN MASUKKAN ANGKA 1 - 7");
        }

        System.out.println("==================================");
    }

    static void kebalikanAngka(int angkaInput) {
        int balikAngka = 0;
        int sementara = angkaInput;

        while (sementara != 0) {
            int sisaBagi = sementara % 10;
            balikAngka = balikAngka * 10 + sisaBagi;
            sementara /= 10;
        }

        System.out.println(angkaInput + " Hasil Angka Di Balik = " + balikAngka);
    }

    public static void main(String[] args) {
        cekPrima(8);

        byte digit = 44, inputPertama = 5, inputKedua = 8, inputKetiga = 9;

        jumlahDigit(digit);

        statistikDataTunggal(inputPertama, inputKedua, inputKetiga);

        hariBerdasarkanAngka('5');

        kebalikanAngka(12345);
    }
}
