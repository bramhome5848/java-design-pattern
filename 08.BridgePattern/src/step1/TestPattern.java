package step1;

// 구현 추가는 계속 할 수 있다.
// RobotModel1, RobotModel2 ...
public class TestPattern {

    public static void main(String[] args) {

        IRobot robot1 = new RobotModel1();
        robot1.powerOn();
        robot1.powerOn();

        System.out.println("------------------");

        IRobot robot2 = new RobotModel2();
        robot2.powerOn();
        robot2.powerOff();
    }
}
