package Encapsulation.geometry;

public class GeometryApp {
    public static void main(String[] args) {
        Torus myTorus = new Torus();
//        myTorus.R = 7; // R has private access
        myTorus.setR(7);
        byte valueOfR = myTorus.getR();
        System.out.println("nilai R : " + valueOfR);
        myTorus.r = 7;
        System.out.println("nilai r : "+ myTorus.r);


    }
}
