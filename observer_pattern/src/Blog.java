import java.util.HashSet;
import java.util.Set;

public class Blog implements Observable {
    String article;
    Set<Observer> observerSet = new HashSet<>();


    @Override
    public void addObserver(Observer observer) {
        observerSet.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerSet.remove(observer);
    }

    public void notifyObservers() {
        observerSet.forEach(Observer::upadate);
    }

    void publisNewArticle(String article) {
        this.article = article;
        notifyObservers();
    }

    public String getArticle() {
        return this.article;
    }
}
