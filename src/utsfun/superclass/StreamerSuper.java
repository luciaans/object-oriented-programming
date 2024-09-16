package utsfun.superclass;

import utsfun.ContentCreator;

public class StreamerSuper extends ContentCreator {
    private String streamerName;
    protected double followersCount;
    protected short streamerLevel;

    public StreamerSuper() {
        super("Streaming");
        this.streamerName = "Windah Basudara";
        this.followersCount = 0;
        this.streamerLevel = 1;
    }

    public StreamerSuper(String streamerName, double followersCount, short streamerLevel) {
        super("Streaming");
        this.streamerName = streamerName;
        this.followersCount = followersCount;
        this.streamerLevel = streamerLevel;
    }

    public void startStreaming(String game) {
        System.out.println(streamerName + " has started streaming " + game + "!");
    }

    public void gainFollowers(double amount) {
        followersCount += amount;
        System.out.println(streamerName + " gained " + amount + " followers! Total followers: " + followersCount);
    }

    public short getStreamerLevel() {
        return streamerLevel;
    }

    public void checkLevelUp() {
        if (followersCount >= 1000) {
            streamerLevel++;
            System.out.println(streamerName + " leveled up! New level: " + streamerLevel);
        } else {
            System.out.println(streamerName + " needs more followers to level up.");
        }
    }

    public String getStreamerName() {
        return streamerName;
    }

    protected void setStreamerName(String streamerName) {
        this.streamerName = streamerName;
    }

    @Override
    public String generateContentSummary(String contentName) {
        return "Streamer " + streamerName + " is known for streaming " + contentName + " with " + followersCount + " followers.";
    }
}
