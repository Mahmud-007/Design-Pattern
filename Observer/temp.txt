public class Subscriber {
    String name;

    public Subscriber(String name) {
        this.name=name;
    }

    public void subscribe(Channel channel) {
        channel.addSubscriber(this);
    }

    public void unsubscribe(Channel channel) {
        channel.removeSubscriber(this);
        System.out.println(this.name+" unsubscribed");
    }
}
