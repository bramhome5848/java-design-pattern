package case1.step3;

public class TestPattern1 {

    public static void main(String[] args) {
        Database database;

        //처음 만들어진 1개의 객체만 return
        database = Database.getInstance("첫 번째 database");
        System.out.println("This is the " + database.getName() + "!!!");

        database = Database.getInstance("두 번째 database");
        System.out.println("This is the " + database.getName() + "!!!");

        //private 생성자 때문에 외부에서 객체를 만들 수가 없음
        //Database d1 = new Database();
    }
}
