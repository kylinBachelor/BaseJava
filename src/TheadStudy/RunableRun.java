package TheadStudy;

/**
 * Runable功能运行测试类
 */
public class RunableRun {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunable());
        myThread.start();
        System.out.println("Runable执行结束");
    }
}
