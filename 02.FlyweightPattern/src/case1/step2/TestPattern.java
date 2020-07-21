package case1.step2;

public class TestPattern {

    public static void main(String[] args) {
        MyData md1 = new MyData();
        md1.xPos = 10;
        md1.yPos = 11;
        md1.name = "홍길동";

        MyData md2 = new MyData();
        md2 = md1;

        MyData md3 = new MyData();
        md3.xPos = 20;
        md3.yPos = 21;
        md3.name = "손오공";

        md2.name = "전우치";
        md2.xPos = 5;

        //객체를 만들 때 할당할 때에도 Flyweight 패턴을 적용하고 있음
        //객체 복사에서 얕은 복사의 경우도 Flyweight 패턴이 사용되고 있음
    }
}

class MyData {
    int xPos;
    int yPos;
    String name;
}
