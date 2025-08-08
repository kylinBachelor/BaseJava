package TheadStudy;

/**
 * 实际运行调用类
 */
public class SyncThreadRun {
    public static void main(String[] args) {
        SyncService syncService = new SyncService();
        SyncThreadA syncThreadA = new SyncThreadA(syncService);
        syncThreadA.start();
        SyncThreadB syncThreadB = new SyncThreadB(syncService);
        syncThreadB.start();
    
    }
}
