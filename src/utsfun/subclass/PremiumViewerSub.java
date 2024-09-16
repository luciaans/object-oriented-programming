package utsfun.subclass;

import utsfun.ContentActions;
import utsfun.superclass.ViewerSuper;

public class PremiumViewerSub extends ViewerSuper implements ContentActions {
    private String subscriptionType;
    private double subscriptionFee;
    private short loyaltyPoints;

    public PremiumViewerSub(String viewerName, double watchTime, short viewerLevel, String subscriptionType,
                            double subscriptionFee, short loyaltyPoints) {
        super(viewerName, watchTime, viewerLevel);
        this.subscriptionType = subscriptionType;
        this.subscriptionFee = subscriptionFee;
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public void gainWatchTime(double time) {
        watchTime += time * 2;
        System.out.println(viewerName + " gained " + (time * 2) + " minutes of watch time! Total watch time: " + watchTime);
    }

    public void gainWatchTime(double time, boolean isLiveStream) {
        double additionalTime = isLiveStream ? time * 1.5 : time;
        watchTime += additionalTime;
        System.out.println(viewerName + " gained " + additionalTime + " minutes of watch time! Total watch time: " + watchTime);
    }

    public void accessPremiumFeatures() {
        System.out.println(viewerName + " has access to premium features!");
    }

    public void subscribe(String subscriptionType, double fee) {
        this.subscriptionType = subscriptionType;
        subscriptionFee = fee;
        System.out.println(viewerName + " has subscribed to " + subscriptionType + " for a fee of RP" + fee);
    }

    public short getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void redeemLoyaltyPoints() {
        for (short i = 0; i < loyaltyPoints; i++) {
            System.out.println(viewerName + " redeemed loyalty point " + (i + 1) + "!");
        }
    }

    @Override
    public String performAction(String actionName) {
        return viewerName + " is performing action: " + actionName;
    }

    @Override
    public String getContentDetails(String contentName) {
        return viewerName + " is viewing content: " + contentName;
    }

    @Override
    public String executeCommand(String command) {
        return viewerName + " is executing command: " + command;
    }
}