package case1.decorator;

import case1.base.IceCream;

// Strawberry 은 Decorator 이기 때문에 Decorator 를 상속한다.
public class Strawberry extends Decorator {

    // Wrapping 하고자 하는 음료를 저장하기 위한 Instance 변수
    IceCream iceCream;

    public Strawberry(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + 딸기";
    }

    @Override
    public int price() {
        return 500 + iceCream.price();
    }
}
