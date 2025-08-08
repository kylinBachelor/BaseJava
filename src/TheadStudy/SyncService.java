package TheadStudy;

public class SyncService {
    private String aString = new String();
    private String bString = new String();

    public void aMethod() {
        synchronized(this) {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread() + "-----aMethod:" + i);
            }
        }
    }

    synchronized public void bMethod() {
        synchronized(this) {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread() + "-----bMethod:" + i);
            }
        }
    }
}
