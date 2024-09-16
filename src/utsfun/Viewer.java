package utsfun;

public class Viewer {
    String viewerName;
    double watchTime;
    short viewerLevel;

    public Viewer() {
        this.viewerName = "Random";
        this.watchTime = 0;
        this.viewerLevel = 1;
    }

    public Viewer(String viewerName, double watchTime, short viewerLevel) {
        this.viewerName = viewerName;
        this.watchTime = watchTime;
        this.viewerLevel = viewerLevel;
    }

    public void watchStream(Streamer streamer) {
        System.out.println(viewerName + " is watching " + streamer.streamerName + "'s stream!");
    }

    public void gainWatchTime(double time) {
        watchTime += time;
        System.out.println(viewerName + " gained " + time + " minutes of watch time! Total watch time: " + watchTime);
    }

    public short getViewerLevel() {
        return viewerLevel;
    }

    public boolean isWatchingPreferredStreamer(String preferredStreamer) {
        return preferredStreamer.equals(viewerName);
    }
}