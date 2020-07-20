package case1.step1;

public class TestPattern2 {

    static int nNum = 0;

    public static void main(String[] args) {

        Runnable task = () -> {
            nNum++;
            Database database = Database.getInstance(nNum + "번째 Database");
            System.out.println("This is the " + database.getName() + "!!");
        };

        /**
         * 생성된 Thread들이 거의 동시에 시작되어 Database의 getInstance를 수행
         * 모든 thread에게 Database의 singleton은 null
         * 각각의 thread는 new Database()를 실행
         * Thread를 사용한다면 만들어진 예제는 취약점을 가짐
         */
        for(int i=0 ; i<10 ; i++) {
            Thread t = new Thread(task);
            t.start();
        }
    }
}
