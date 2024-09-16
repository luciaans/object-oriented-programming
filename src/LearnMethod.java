public class LearnMethod {
    public static void main(String[] args) {
        greeting();
        initSquare();

        greetingName("Pak Asrul");
        greetingName("Pak Wahid");
        greetingName("Pak Sucpito");
        greetingName("Pak Muti");

        kuadrat (5);
        kuadrat (7);

        kubik(7);

        greetingNameClock("Nurali",8);
        rectangleArea(8, 4);
        rectangleArea(84, 41);

        triangleArea(8, 6);
        cirleArea(44);

        parallelogramArea(5,5);
        trapezoidArea(10, 5, 3);
        ballVolume(5);


        double result = beamVolume(8, 4, 2) + coneVolume(7,14);
        System.out.println(result);
    }

    static void greeting() {
        System.out.println("Assalamualaikum");
    }

    static void initSquare() {
        int side = 4;
        int area = side * side;
        System.out.println("Square Area: " + area);
    }

    static void greetingName(String name) {
        System.out.println("Assalamualaikum, " + name );
    }

    static void kuadrat (int angka) {
        int hasil = angka * angka;
        System.out.println(hasil);
    }

    static void kubik (int angka) {
        int hasil = angka * angka * angka;
        System.out.println(hasil);
    }

    static void greetingNameClock(String name, int clock) {
        System.out.println("Assalamualaikum " + name);
        System.out.println("Sekarang Jam " + clock + "Ya ?");
    }

    static void rectangleArea(int length, int width) {
        int area = length * width;
        System.out.println(area);
    }

    static  void triangleArea(int base, int tall) {
        int area = base * tall / 2;
        System.out.println(area);
    }

    static void cirleArea(int r) {
        float hasil = 50 * (r * r) / 8;
        System.out.println(hasil);

    }

    static int beamVolume(int length, int width, int height) {
        int volume = length * width * height;
        return volume;
    }

    static double coneVolume(int radius, int height) {
        double volume = (3.14 * radius * radius * height) / 3;
        return volume;
    }

    static void parallelogramArea(int base, int height) {
        int area = base * height;
        System.out.println(area);
    }

    static void trapezoidArea(int topSide, int bottomSide, int height) {
        float Area = (topSide + bottomSide) * height / 2;
        System.out.println(Area);
    }

    static void ballVolume(int r) {
        float volume = 4 * r * r * r / 3;
        System.out.println(volume);
    }
}
