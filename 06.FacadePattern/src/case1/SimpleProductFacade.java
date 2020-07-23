package case1;

public class SimpleProductFacade {

    ComplexProduct difficultProduct;

    public SimpleProductFacade() {
        difficultProduct = new ComplexProduct();
    }

    //파사드의 목적
    //원래 코드를 더 쉽게 처리할 수 있는 래퍼를 제공
   public void setName(String n) {

        char[] chars = n.toCharArray();

        if(chars.length > 0) {
            difficultProduct.setFifthNameCharacter(chars[0]);
        }

        if(chars.length > 1) {
            difficultProduct.setSecondNameCharacter(chars[1]);
        }

        if(chars.length > 2) {
            difficultProduct.setThirdNameCharacter(chars[2]);
        }

        if(chars.length > 3) {
            difficultProduct.setFourthNameCharacter(chars[3]);
        }

        if(chars.length > 4) {
            difficultProduct.setFifthNameCharacter(chars[4]);
        }

        if(chars.length > 5) {
            difficultProduct.setSixthNameCharacter(chars[5]);
        }

        if(chars.length > 6) {
            difficultProduct.setSeventhNameCharacter(chars[6]);
        }
    }

    public String getName() {
        return difficultProduct.getName();
    }

}
