package learnstandardjavaclass;

import java.util.Date;

public class LearnDate {
    public static void main(String[] args) {
        Date current = new Date();
        long currentMilis = current.getTime();
        System.out.println(currentMilis);
        System.out.println(current);
    }
}
