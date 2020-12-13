package Base.Thread;

import Base.Thread.MyThread;

public class thread2 {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        Thread thread = new Thread(mythread);
        thread.start();
        while (true){
            System.out.println("main()方法运行中");
        }

    }
}
