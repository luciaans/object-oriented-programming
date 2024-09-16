package utsfun.subclass;

import utsfun.ContentActions;
import utsfun.superclass.StreamerSuper;

public class GameStreamerSub extends StreamerSuper implements ContentActions {
    private String favoriteGame;
    private double averageViewers;
    private short subscriberCount;

    public GameStreamerSub
            (String streamerName,
             double followersCount,
             short streamerLevel,
             String favoriteGame,
             double averageViewers,
             short subscriberCount) {
        super(streamerName, followersCount, streamerLevel);
        this.favoriteGame = favoriteGame;
        this.averageViewers = averageViewers;
        this.subscriberCount = subscriberCount;
    }

    @Override
    public void startStreaming(String game) {
        System.out.println(getStreamerName() + " has started streaming the game " + game + "!");
    }

    public void startStreaming(String game, int duration) {
        System.out.println(getStreamerName() + " has started streaming the game " + game + " for " + duration + " hours!");
    }

    public void trackTotalViews(double views) {
        System.out.println(getStreamerName() + " has received " + views + " views on Youtube!");
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public double calculateAverageViewers(double totalViews) {
        averageViewers = totalViews / followersCount;
        return averageViewers;
    }

    public void thankSubscribers() {
        for (int i = 0; i < subscriberCount; i++) {
            System.out.println("Thank you to subscriber " + (i + 1) + " for supporting " + getStreamerName() + "!");
        }
    }

    @Override
    public String performAction(String actionName) {
        return getStreamerName() + " is performing action: " + actionName;
    }

    @Override
    public String getContentDetails(String contentName) {
        return getStreamerName() + " is streaming content: " + contentName;
    }

    @Override
    public String executeCommand(String command) {
        return getStreamerName() + " is executing command: " + command;
    }
}
