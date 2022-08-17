package MyThread;

public class thread2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("thrad1执行中");   
            }
        });
        thread1.start();
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("thread2执行中");
            }
        });
        thread2.start();
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("thread3执行中");
            }
        });
        thread3.start();
    }
}
