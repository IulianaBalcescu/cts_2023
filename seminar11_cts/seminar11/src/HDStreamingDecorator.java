class HDStreamingDecorator extends SubscriptionDecorator{
    public HDStreamingDecorator(Subscription subscription) {
        super(subscription);
    }

    public String getDescription(){
        return subscription.getDescription()+ ", vizionare in calitate HD";
    }
    public double getPrice(){
        return subscription.getPrice()+ 3.0;
    }
}
