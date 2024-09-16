package LearnInheritance;

public class Dad extends Granpa {
    String marga = "Uray";
    int moneyInBank =100;

    Dad() {
        System.out.println("I Live In Indonesia");
    }

    int getMoneyInBank() {
        int total = super.moneyInBank + moneyInBank;
        return total;
    }
}
