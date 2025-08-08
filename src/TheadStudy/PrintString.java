package TheadStudy;

public class PrintString implements Runnable{
    private boolean isContinuePrint = true;
    public boolean isContinuePrint() {
        return this.isContinuePrint;
    }
    public void setPrintString(boolean isContinuePrint) {
        this.isContinuePrint = isContinuePrint;

    }
    public void printStringMethod() {
        try {
            while (isContinuePrint) {
                System.out.println("run printStringMethod threadName=" + Thread.currentThread().getName());
                
            }
            System.out.println("线程被停止了");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @Override
    public void run() {
        this.printStringMethod();
    }
}
