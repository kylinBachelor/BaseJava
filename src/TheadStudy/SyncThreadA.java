package TheadStudy;

public class SyncThreadA extends Thread{
    private SyncService syncService;

    public SyncThreadA(SyncService syncService) {
        this.syncService = syncService;
    }

    @Override
    public void run() {
        this.syncService.aMethod();
    }

    







}
