package Encapsulation;

import Encapsulation.geometry.Sphere;
import Encapsulation.geometry.Torus;

public class EncapsulationApp {
    public static void main(String[] args) {
        User admin = new User();
        admin.setUsername("Administrator");
        String adminUsername = admin.getUsername();
        System.out.println("username : "+adminUsername);

        Person him = new Person();
        him.setName("John");
        System.out.println(him.getName());

        Sphere mySphere = new Sphere();
        System.out.println(mySphere.dimensions);
        Torus myTorus = new Torus();
//        myTorus.PI; PI has protected access

        Encapsulation.geometry.Sphere mySphere1 = new Encapsulation.geometry.Sphere();
        Encapsulation.geometry.Torus myTorus1 = new Encapsulation.geometry.Torus();
    }
}

