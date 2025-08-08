package TheadStudy;

public class PrintStringRun {
    // 线程Local
    public static ThreadLocal t1 = new ThreadLocal<>();

    public static void main(String[] args) {
        // PrintString printString = new PrintString();
        // printString.printStringMethod();   
        // System.out.println("停止循环");
        // printString.setPrintString(false);


        // PrintString printString = new PrintString();
        // Thread thread = new Thread(printString);
        // thread.start();
        // System.out.println("停止循环");
        // printString.setPrintString(false);

        if (t1.get() == null) {
            System.out.println("从未放过值");
            t1.set("我的值1");
            t1.set("我的值2");
            t1.set("我的值3");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());



    }
    
}
