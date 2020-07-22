package case2.step2;

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
        //ConcurrentModificationException
        //삭제를 해버리면 내부적으로 루핑을 돌기 위해 사용하는 list의 크기와 처리해야할 항목을 가리키는 인덱스의
        //불일치 때문에 에러 또는 논리적인 오류가 발생

//        for(Observer observer : observers) {
//            observer.update(play);
//        }

        for (int i=0 ; i<observers.size() ; i++) {
            observers.get(i).update(play);
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
