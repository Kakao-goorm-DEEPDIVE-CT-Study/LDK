package Java_middle;

public class MultiThreadTest {
    public static void main(String[] args) {
        // 두 개의 스레드 생성
        Thread numberThread = new NumberThread();
        Thread characterThread = new CharacterThread();

        // 스레드 실행
        numberThread.start();
        characterThread.start();

        // 메인 스레드 작업
        System.out.println("Main thread: Both threads started!");
    }
}