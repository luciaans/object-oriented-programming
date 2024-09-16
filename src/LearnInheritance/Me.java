package LearnInheritance;

public class Me extends Dad {
    int moneyInBank = 50;

    String addres = "Pontianak Utara";

    Me() {
        super();
        System.out.println("I Live In United State");
    }

    String getMarga() {
        super.marga = "Syarif";
        return super.marga;
    }

    String getAddres() {
        return addres;
    }

    int getMoneyInBank() {
        int total = moneyInBank + super.moneyInBank;
        return total;
    }
}
