package step2;

public interface IRobot {
    void powerOn();
    void powerOff();
    //기능 추가 -> 인터페이스 추가시 구현 클래스들이 모두 구현해야하는 단점이 있음
    void doCook();
}
