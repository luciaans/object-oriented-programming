package polymorphism;

public class App {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle();
        System.out.println(myTriangle.getClassName());
        System.out.println(myTriangle.getParentClassName());
        System.out.println(myTriangle.area());
        System.out.println(myTriangle.area(4,2));
    }
}
