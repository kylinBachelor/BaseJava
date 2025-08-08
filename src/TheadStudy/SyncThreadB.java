package TheadStudy;

public class SyncThreadB extends Thread{
    private SyncService syncService;

    public SyncThreadB(SyncService syncService) {
        this.syncService = syncService;
    }

    @Override
    public void run() {
        this.syncService.bMethod();
    }

    







}
