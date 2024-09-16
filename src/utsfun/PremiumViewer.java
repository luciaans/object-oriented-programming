package utsfun;

public class PremiumViewer extends Viewer {
    private String subscriptionType;
    private double subscriptionFee;
    private short loyaltyPoints;

    public PremiumViewer(String viewerName, double watchTime, short viewerLevel, String subscriptionType,
                         double subscriptionFee, short loyaltyPoints) {
        super(viewerName, watchTime, viewerLevel);
        this.subscriptionType = subscriptionType;
        this.subscriptionFee = subscriptionFee;
        this.loyaltyPoints = loyaltyPoints;
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
}