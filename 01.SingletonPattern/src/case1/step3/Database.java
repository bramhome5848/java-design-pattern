package case1.step3;

public class Database {
    //프로그램이 시작할 때 static은 먼저 생성
    //비싼 비용이 드는 synchronized를 이용할 필요 없음
    private static Database singleton = new Database("products");
    private String name;

    //객체가 중복 생성 되는 것을 막기 위해 private으로 설정
    //클래스 내부에서만 객체를 생성할 수 있음
    private Database(String name) {
        try {
            Thread.sleep(100);  //실제 DB 연결시 시간이 걸리기 때문에 재현하기 위함
        } catch (InterruptedException e) {
        }
        this.name =  name;
    }

    public synchronized static Database getInstance(String name) {
        return singleton;
    }

    public String getName(){
        return name;
    }
}
