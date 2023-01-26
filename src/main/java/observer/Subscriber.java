package observer;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.printf("%s subscribed for %s \n", name, news);
    }
}
