package learncollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        String[] IDs = {"211220052", "221220038", "211220043"};
        String[] names = {"hizrah", "Anisa", "Raihan"};
        float[] grades = {3.15f, 3.0f, 3.65f};

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("211220052", "Hirah", 3.15f));
        students.add(new Student("211220038", "Anisa", 3.0f));
        students.add(new Student("211220043", "Raihan", 3.65f));

        for (Student student:students) {
            System.out.println(students.getFirst().getID());
            System.out.println(students.getFirst().getName());
            System.out.println(students.getFirst().getGrade());
        }

        LinkedList<String> antrian = new LinkedList<>();
        antrian.push("Cahyo");
        antrian.push("Mustafa");
        antrian.push("Imam");
        antrian.push("Nurmelida");
        antrian.pop();
        antrian.pop();
        for (String orang: antrian) {System.out.println(orang);}

        HashMap<String, Integer> clasAges = new HashMap<>();
        clasAges.put("211220027", 23);
        clasAges.put("211220029", 30);
        clasAges.put("211220036", 21);
        for (String NiMs: clasAges.keySet()) {System.out.println(NiMs);}
        for (Integer age: clasAges.values()) {System.out.println(age);}

    }
}
