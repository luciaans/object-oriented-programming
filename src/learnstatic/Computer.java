package learnstatic;

public class Computer {

    static byte numberOfProcessor = 8;
    static byte fanSpeed = 1;
    static int increaseFanSpeed(){
        fanSpeed += 1;
        return fanSpeed;
    }
    static class Storage {
        int clock = 1000;

        boolean getNumberOfProcessor() {return numberOfProcessor == 8;}
        boolean fanSpeedOverheat(){
            return increaseFanSpeed() > 5;
        }
    }
}
