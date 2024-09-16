package polymorphism;

public class Triangle  extends Shape {

    Triangle() {
        super();
    }

    String getClassName() {
        return "Triangle";
    }

    String getParentClassName() {
        return super.getClassName();
    }

    double area() {
        return 0;
    }

    double area(int base, int height) {
        return base * height * 0.5;
    }
}
