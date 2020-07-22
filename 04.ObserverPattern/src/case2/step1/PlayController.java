package case2.step1;

import java.util.ArrayList;
import java.util.List;


/**
 * 감시의 대상이 되는 클래스
 * Observable 클래스 상속
 */
public class PlayController implements Publisher {

    private List<Observer> observers = new ArrayList<>();
    private boolean play; //실행 여부

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(play);
        }
    }

    public void setFlag(boolean play) {
        this.play = play;
        notifyObservers();
    }

    public boolean getFlag() {
        return play;
    }
}
