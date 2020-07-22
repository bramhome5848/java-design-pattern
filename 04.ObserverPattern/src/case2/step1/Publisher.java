package case2.step1;

public interface Publisher {

    void addObserver(Observer o);
    void deleteObserver(Observer o);
    void notifyObservers();
}
