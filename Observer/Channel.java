import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subscribers = 
            new ArrayList<Subscriber>();

    public Channel(String name) {
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void printSubscribers(){
        for (Subscriber sub : subscribers){
            System.out.println("subscriber: "+sub.name);
        }
        
    }

    public void notification(String message){
        for(Subscriber sub: subscribers){
            System.out.println("Hi "+sub.name +" "+message);
        }
    }
}
