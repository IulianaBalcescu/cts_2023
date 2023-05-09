 abstract class SubscriptionDecorator implements Subscription{
    protected Subscription subscription;

    public SubscriptionDecorator(Subscription subscription){
        this.subscription=subscription;
    }
    public String getDescription(){
        return subscription.getDescription();
    }
    public double getPrice(){
        return subscription.getPrice();
    }
}
