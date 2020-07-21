package case1.step1;

public class TestPattern {

    public static void main(String[] args) {
        String str1 = new String("홍길동");
        String str2 = new String("홍길동");

        //str3, str4의 홍길동은 String Pool 에는 1개만 존재
        String str3 = "홍길동";
        String str4 = "홍길동";

        System.out.println("FlyWeight Pattern");

        //중복 생성을 위해 FlyWeight Pattern 이 적용되어 있음
        //기본형의 Wrapper Type 의 객체들이 불가변성인 이유가 이러한 방식으로 처리되기 때문
        //Integer, Byte, Boolean, String, Character
    }
}
