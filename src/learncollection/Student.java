package learncollection;

public class Student {
    private String ID;
    private String name;
    private float grade;

    String getID() {return  ID;}
    String getNamr() {return  name;}
    float getGrade() {return grade;}

    public Student(String ID, String name, float grade){
        this.ID = ID;
        this.name = name;
        this.grade = grade;
    }

    String getName() {return name;}
}
