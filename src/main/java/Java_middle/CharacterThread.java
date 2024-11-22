package Java_middle;

class CharacterThread extends Thread {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'J'; c++) {
            System.out.println("CharacterThread: " + c);
            try {
                Thread.sleep(500); // 0.5초 대기
            } catch (InterruptedException e) {
                System.out.println("CharacterThread interrupted!");
            }
        }
    }
}