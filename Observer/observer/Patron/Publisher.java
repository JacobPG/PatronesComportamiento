package observer.Patron;

import java.util.*;

public class Publisher {

    public Publisher() {
        subscribers = new ArrayList<Subscriber>();
    }

    private List<Subscriber> subscribers;

    public void subscribe(Subscriber sub) {
        subscribers.add(sub);
    }

    public void unsubscriber(Subscriber sub) {
        subscribers.remove(sub);
    }

    public void notifySybscribers(Object state) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(state);;
        }
    }

}