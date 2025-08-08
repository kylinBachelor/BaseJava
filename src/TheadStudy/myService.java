package TheadStudy;

public class myService {

    synchronized public void service1(String msg){
        try {
            System.out.println("service1" + msg);
            Thread.sleep(3000);
            service2("servie1调用的");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void service2(String msg){
        try {
            System.out.println("service2" + msg);
            long start = System.currentTimeMillis();
            Thread.sleep(10000);
            System.out.println(System.currentTimeMillis() - start );
            service3();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void service3(){
        try {
            System.out.println("service3");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
