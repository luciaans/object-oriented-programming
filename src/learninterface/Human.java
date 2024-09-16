package learninterface;

public class Human implements Behaviour {
    @Override
    public void breathing() {
        System.out.println("huff");
        System.out.println("hahhh");

    }

    @Override
    public void walking(int steps) {
        System.out.println(" i walked " + steps + "steps");

    }

    @Override
    public void jumping(int times) {
        System.out.println("i jumped" + times + "jumped");

    }
}
