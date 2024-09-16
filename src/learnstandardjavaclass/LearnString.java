package learnstandardjavaclass;

public class LearnString {
    public static void main(String[] args) {
        String namaBelakang = new String("WIDODO");
        String namaDepan = "joko";

        System.out.println(namaDepan.toUpperCase());
        System.out.println(namaDepan.contains("j"));
        System.out.println(namaBelakang.toLowerCase());
        System.out.println(namaBelakang.charAt(1));
    }
}
