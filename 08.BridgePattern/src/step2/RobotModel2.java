package step2;

public class RobotModel2 implements IRobot{

    @Override
    public void powerOn() {
        System.out.println("type2 : power on");
    }

    @Override
    public void powerOff() {
        System.out.println("type2 : power off");
    }

    @Override
    public void doCook() {
        System.out.println("요리를 합니다");
    }
}
