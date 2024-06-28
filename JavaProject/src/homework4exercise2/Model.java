package homework4exercise2;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private List<Subscriber> subscribers;
    private int mainState;

    public Model() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(mainState);
        }
    }
    public int getMainState() {
        return mainState;
    }

    public void setMainState(int mainState) {
        this.mainState = mainState;
        notifySubscribers();
    }
}

