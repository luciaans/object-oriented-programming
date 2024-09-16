package utsfun;

import utsfun.subclass.GameStreamerSub;
import utsfun.subclass.PremiumViewerSub;
import utsfun.superclass.StreamerSuper;
import utsfun.superclass.ViewerSuper;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        GameStreamerSub gameStreamer1 = new GameStreamerSub("Windah Basudara", 1000, (short) 3, "Pocong Hunter", 500, (short) 50);
        GameStreamerSub gameStreamer2 = new GameStreamerSub("Ninja", 2000, (short) 5, "Fortnite", 1000, (short) 100);
        PremiumViewerSub premiumViewer1 = new PremiumViewerSub("Member Garis Keras Windah", 0, (short) 2, "Gold", 10.99, (short) 27);

        System.out.println("===========================================================");
        System.out.println(gameStreamer1.performAction("Play Pocong Hunter"));
        System.out.println(gameStreamer1.getContentDetails("Pocong Hunter Stream"));
        System.out.println(gameStreamer1.executeCommand("Start Stream"));

        System.out.println("===========================================================");
        System.out.println(gameStreamer2.performAction("Play Fortnite"));
        System.out.println(gameStreamer2.getContentDetails("Fortnite Stream"));
        System.out.println(gameStreamer2.executeCommand("Start Stream"));

        System.out.println("===========================================================");
        System.out.println(premiumViewer1.performAction("Watch Pocong Hunter Stream"));
        System.out.println(premiumViewer1.getContentDetails("Pocong Hunter Stream"));
        System.out.println(premiumViewer1.executeCommand("Subscribe Gold"));

        System.out.println("===========================================================");
        List<ContentCreator> contentCreators = new ArrayList<>();
        contentCreators.add(gameStreamer1);
        contentCreators.add(gameStreamer2);
        contentCreators.add(new StreamerSuper("Windah Basudara", 500, (short) 2));

        System.out.println("===========================================================");
        for (ContentCreator creator : contentCreators) {
            System.out.println("Content Type: " + creator.getContentType());
        }

        System.out.println("===========================================================");
        StreamerSuper streamer1 = new StreamerSuper("Windah Basudara", 500, (short) 2);
        ViewerSuper viewer1 = new ViewerSuper("Yanto Ganteng123", 0, (short) 1);

        System.out.println("===========================================================");
        streamer1.startStreaming("Bakso Simulator");
        streamer1.gainFollowers(44);
        streamer1.checkLevelUp();

        System.out.println("===========================================================");
        gameStreamer1.trackTotalViews(10000);

        System.out.println("===========================================================");
        gameStreamer1.thankSubscribers();

        System.out.println("===========================================================");
        viewer1.watchStream(streamer1);
        viewer1.gainWatchTime(60);
        System.out.println("Is Viewer1 watching preferred streamer? " + viewer1.isWatchingPreferredStreamer("PreferredStreamer"));

        System.out.println("===========================================================");
        premiumViewer1.accessPremiumFeatures();
        premiumViewer1.subscribe("Platinum", 25000);
        premiumViewer1.redeemLoyaltyPoints();
        System.out.println("===========================================================");
    }
}