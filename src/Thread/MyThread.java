package Thread;

class MyThread implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("MyThread()类中的run()方法正在执行");
        }
    }
}
