package case2;

public class Light {
    private boolean turnedOn = false;

    public void turnOn() {
        turnedOn = true;
        System.out.println("light를 켬.");
    }

    public void turnOff() {
        turnedOn = false;
        System.out.println("light를 끔.");
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}
