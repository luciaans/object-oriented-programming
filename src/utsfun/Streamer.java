package utsfun;

public class Streamer {
     String streamerName;
     double followersCount;
     short streamerLevel;

    public Streamer() {
        this.streamerName = "Windah Basudara";
        this.followersCount = 0;
        this.streamerLevel = 1;
    }

    public Streamer(String streamerName, double followersCount, short streamerLevel) {
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
}


