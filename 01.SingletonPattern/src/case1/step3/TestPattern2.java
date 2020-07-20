package case1.step3;

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
         * Thread의 동시 접근을 막기 위해 synchronized사용
         * synchronized 는 병목현상의 원인이 됨
         * if문의 경우 첫 객체만 유효하고 나머지는 유효하지 않아 비효율적
         * static 변수의 특성을 이용하여 해결
         * 하지만 singleton의 경우도 특정 상태를 가지게 되면 thread-safe하지 않음
         */
        for(int i=0 ; i<10 ; i++) {
            Thread t = new Thread(task);
            t.start();
        }
    }
}
