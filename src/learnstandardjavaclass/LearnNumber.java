package learnstandardjavaclass;

public class LearnNumber {
    public static void main(String[] args) {
        int usiaSaya = 45;
        float IPsaya = 3.2f;

        Integer usiaDIa = 26;
        System.out.println(usiaDIa.compareTo(usiaSaya));
        Float IPDia = 3.2f;
        System.out.println(IPDia.equals(IPsaya));

        Number angka = 9.5;
        System.out.println(angka.intValue());
    }
}
