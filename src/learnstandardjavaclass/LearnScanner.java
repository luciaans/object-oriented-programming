package learnstandardjavaclass;

import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        System.out.println("Tebak Usia Saya: ");
        Scanner scanner = new Scanner(System.in);
        String tebakUsia = scanner.next();

        String jawabanUsia = "22";
        if (tebakUsia.equals(jawabanUsia)){
            System.out.println("Tebakan Anda Benar !");
        } else {
            System.out.println("Tebakan Anda Salah !");
        }
        scanner.close();
    }
}
