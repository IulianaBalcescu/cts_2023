 class OfflineViewingDecorator extends SubscriptionDecorator{
    public OfflineViewingDecorator(Subscription subscription) {
        super(subscription);
    }
    public String getDescription(){
        return subscription.getDescription() + " vizionare offline";
    }
    public double getPrice(){
        return subscription.getPrice()+ 5.0;
    }
}
