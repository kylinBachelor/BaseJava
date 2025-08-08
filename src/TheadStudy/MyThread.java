package TheadStudy;
public class MyThread extends Thread {
    @Override
    synchronized public void run() {
        try {
            Thread.sleep(2000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}