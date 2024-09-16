package learnstandardjavaclass;

import java.util.Scanner;
import java.util.Calendar;
public class LatihanScanner {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.print("Masukan Tahun Lahir : ");
        Scanner scanner = new Scanner(System.in);

        int tahunLahir = scanner.nextInt();

        int hasil = calendar.get(Calendar.YEAR) - tahunLahir;
        System.out.print("Umur Anda Saat Ini : " + hasil + " Tahun");
        scanner.close();




    }
}
