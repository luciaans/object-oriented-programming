package utsfun.superclass;

import utsfun.ContentCreator;

public class ViewerSuper extends ContentCreator {
    protected String viewerName;
    protected double watchTime;
    protected short viewerLevel;

    public ViewerSuper() {
        super("Viewing");
        this.viewerName = "Random";
        this.watchTime = 0;
        this.viewerLevel = 1;
    }

    public ViewerSuper(String viewerName, double watchTime, short viewerLevel) {
        super("Viewing");
        this.viewerName = viewerName;
        this.watchTime = watchTime;
        this.viewerLevel = viewerLevel;
    }

    public void watchStream(StreamerSuper streamer) {
        System.out.println(viewerName + " is watching " + streamer.getStreamerName() + "'s stream!");
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

    @Override
    public String generateContentSummary(String contentName) {
        return "Viewer " + viewerName + " has watched " + contentName + " for " + watchTime + " minutes.";
    }
}
