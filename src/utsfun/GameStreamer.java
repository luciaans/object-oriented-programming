package utsfun;

public class GameStreamer extends Streamer {
    private String favoriteGame;
    private double averageViewers;
    private short subscriberCount;

    public GameStreamer
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

    public void trackTotalViews(double views) {
        System.out.println(streamerName + " has received " + views + " views on Youtube!");
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
            System.out.println("Thank you to subscriber " + (i + 1) + " for supporting " + streamerName + "!");
        }
    }
}

