package case1.decorator;

import case1.base.IceCream;

// Melon 은 Decorator 이기 때문에 Decorator 를 상속한다.
public class Melon extends Decorator{

    // Wrapping 하고자 하는 음료를 저장하기 위한 Instance 변수
    IceCream iceCream;

    public Melon(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + 멜론";
    }

    @Override
    public int price() {
        return 300 + iceCream.price();
    }
}
