package LearnInheritance;

public class App {
    public static void main(String[] args) {
        Dad dad1 = new Dad();
        System.out.println("Marga Dad :" + dad1.marga);
        System.out.println("Dad money in bank " + dad1.getMoneyInBank());

        System.out.println("====================");

        Me me1 = new Me();
        System.out.println("Marga Me :" + me1.marga);
        System.out.println("However, My Money In Bank Is  " + me1.getMoneyInBank());
        System.out.println("I Live In " + me1.getAddres());
        System.out.println("Now, My Marga Is " + me1.getMarga());

        System.out.println("====================");

        Sis sister1 = new Sis();
        System.out.println("Marga Sister :" + sister1.marga);
        System.out.println("However, My Sister In Bank Is  " + sister1.getMoneyInBank());
    }
}
