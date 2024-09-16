package learnstandardjavaclass;

public class LearnMath {
    public static void main(String[] args) {
        int angka1 = 5;
        int angka2 = 7;
        int angka3 = 9;

        System.out.println(angka1 * angka2);
        System.out.println(angka1 * angka2 * angka3);
        System.out.println(angka1 * angka1 * angka1);

        double limaPangkatTiga = Math.pow(5,3);
        System.out.println(limaPangkatTiga);

        int maxResult = Math.max(angka1,angka2);
        System.out.println(maxResult);

        double logTen = Math.log(100);
        System.out.println(logTen);

        double rootResult = Math.sqrt(255);
        System.out.println(rootResult);
    }
}
