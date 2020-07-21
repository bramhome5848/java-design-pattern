package case2;

public class TestPattern {

    public static void main(String[] args) {

        FlyweightFactory flyweight = new FlyweightFactory();
        flyweight.getSubject("a");  //새로 생성
        flyweight.getSubject("a");  //재사용
        flyweight.getSubject("b");  //새로 생성
        flyweight.getSubject("b");  //재사용
    }
}
