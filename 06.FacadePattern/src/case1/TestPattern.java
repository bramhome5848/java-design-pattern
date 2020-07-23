package case1;

public class TestPattern {

    public static void main(String[] args) {
        SimpleProductFacade simpleProductFacade = new SimpleProductFacade();

        //기존 set 함수 7번 보다 심플하게
        simpleProductFacade.setName("printer");
        System.out.println("The product is a " + simpleProductFacade.getName());
    }
}
