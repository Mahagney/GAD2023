package patterns.observable;

import java.util.ArrayList;
import java.util.List;

public class Support {
    List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void notify(String article) {
        subscribers.forEach(sub -> sub.getNews(article));
    }
}
