package case1;

import java.util.Observable;

/**
 * 감시의 대상이 되는 클래스
 * Observable 클래스 상속
 */
public class PlayController extends Observable {

    private boolean bPlay; //실행 여부

    public PlayController() {
    }

    //데이터를 전달 받아 플래그 값을 변경하고,
    //새로운 데이터가 들어왔음을 알린다.
    public void setFlag(boolean bPlay) {
        this.bPlay = bPlay;
        setChanged();   // 해당 객체가 변경되었다는 것을 표시

        // hasChanged 메소드를 통해 해당 객체가 변경된 것을 감지하여 모든 Observer 객체에 이것을 알림
        // 이후 객체가 더 이상 변경이 일어나지 않는 다는 것을 알리기 위해 clearChagned 메소드를 호출
        notifyObservers();  //값의 변경을 Observer 객체들에게 알림
    }

    public boolean getFlag() {
        return bPlay;
    }
}
