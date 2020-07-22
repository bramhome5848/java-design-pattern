package case2.step2;

/**
 * 감시를 수행하는 클래스
 * Observer 인터페이스 구현
 */
public class MyClassB implements Observer {

    Publisher observable;   //등록될 Observable
    private boolean bPlay;  //실행여부

    //생성될 때 직접 자기 자신을 옵저버에 등록
    public MyClassB(Publisher o) {
        this.observable = o;
        observable.addObserver(this);
    }

    @Override
    public void update(boolean play) {
        this.bPlay = play;
        myActControl();
    }

    private void myActControl() {
        if(bPlay) {
            System.out.println("MyClassB : 동작을 시작합니다");
        } else {
            System.out.println("MyClassB : 동작을 정지합니다");
            //구독 해지
            observable.deleteObserver(this);
        }
    }
}
