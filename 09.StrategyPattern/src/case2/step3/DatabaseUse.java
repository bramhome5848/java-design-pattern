package case2.step3;

enum DBTYPE {MySQL, Informix, Oracle}

public class DatabaseUse {

    //접근점
    private Database db;

    // 데이터베이스 교환 가능하게
    public void setDatabase(Database db) {
        this.db = db;
    }

    //기능 사용
    public void connect() {
        if(db == null) {
            System.out.println("데이터베이스를 먼저 선택하세요.");
        } else{
            db.connectDatabase();
        }
    }

    public void select() {
        db.selectData();
    }
}
