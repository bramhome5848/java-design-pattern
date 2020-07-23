package case1;

//기존의 클래스라고 가정
//각 글자를 입력하기 매우 불편한 상황
public class ComplexProduct {

    char[] namesChars = new char[10];

    public ComplexProduct() {
    }

    public void setFirstNameCharacter(char c) {
        namesChars[0] = c;
    }

    public void setSecondNameCharacter(char c) {
        namesChars[1] = c;
    }

    public void setThirdNameCharacter(char c) {
        namesChars[2] = c;
    }

    public void setFourthNameCharacter(char c) {
        namesChars[3] = c;
    }

    public void setFifthNameCharacter(char c) {
        namesChars[4] = c;
    }

    public void setSixthNameCharacter(char c) {
        namesChars[5] = c;
    }

    public void setSeventhNameCharacter(char c) {
        namesChars[6] = c;
    }

    public String getName() {
        return new String(namesChars);
    }

}
