package learnstandardjavaclass;

import java.util.Calendar;

public class LearnSetCalendar {
    public static void main(String[] args) {
        int day = 27;
        int month = 11;
        int year = 2002;

        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.DATE,day);
        dateOfBirth.set(Calendar.MONTH,month);
        dateOfBirth.set(Calendar.YEAR,year);
        System.out.println(dateOfBirth);

    }
}
