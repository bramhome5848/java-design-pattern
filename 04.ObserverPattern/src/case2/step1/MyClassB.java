package case2.step1;

/**
 * 감시를 수행하는 클래스
 * Observer 인터페이스 구현
 */
public class MyClassB implements Observer {

    private boolean bPlay;  //실행여부

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
        }
    }
}
