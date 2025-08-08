package juc;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.FutureTask;

public class CompletableFutureExample {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();

        FutureTask<String> task1 = new FutureTask<String>(() -> {
            Thread.sleep(5000);
            return "task1";
        });
        new Thread(task1, "task1").start();

        System.out.println(task1.get());
        

        FutureTask<String> task2 = new FutureTask<String>(() -> {
            Thread.sleep(5000);
            return "task2";
        });

        new Thread(task2, "task2").start();
        System.out.println(task2.get());


        long end = System.currentTimeMillis();
        System.out.println("end currentTimeMillis" +  (end - start));
    }
}
