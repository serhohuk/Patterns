package observer;

import java.util.ArrayList;
import java.util.List;

public class GameNewsAgency implements Observable {
    private List<Observer> subscribers = new ArrayList<>();
    private String newsAgency;

    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    public void setNewsAgency(String news) {
        newsAgency = news;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer o: subscribers) {
            o.update(newsAgency);
        }
    }
}
