package juc;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Exmaple01 {


    public static Long getQuarter(LocalDateTime datetime, int quarterOffset) {
        if (datetime == null) return null;
        LocalDateTime offsetTime = datetime.plusMonths(quarterOffset * 3L);
        int year = offsetTime.getYear();
        int month = offsetTime.getMonthValue();
        int quarter = 0;
        if (month <= 3) {
            quarter = 1;
        } else if (month <= 6) {
            quarter = 2;
        } else if (month <= 9) {
            quarter = 3;
        } else {
            quarter = 4;
        }
        return year * 100L + quarter;
    }

    // 示例用法
    public static void main(String[] args) {

        StampedLock stampedLock = new StampedLock();
        long stamp = stampedLock.tryOptimisticRead();
        System.out.println(stampedLock.validate(stamp));




        ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = rwLock.readLock();
        ReentrantReadWriteLock.WriteLock writeLock = rwLock.writeLock();

        
        
        readLock.lock();
        System.out.println("读取锁已获取");

        writeLock.lock();
        System.out.println("写入锁已获取");
        
        readLock.unlock();
        writeLock.unlock();
        
    }
    
    public static <T> List<T> listCombineFuntrue(List<Supplier<List<T>>> suppliers) {
        List<CompletableFuture<List<T>>> futures = new ArrayList<>();
        for (Supplier<List<T>> s : suppliers) {
            CompletableFuture<List<T>> f = CompletableFuture.supplyAsync(() -> {
                try {
                    return s.get(); // 直接返回 Supplier 的结果
                } catch (Exception e) {
                    throw new RuntimeException(e); // 捕获异常并抛出运行时异常
                }
            });
            futures.add(f);
        }

        // 等待所有 CompletableFuture 完成
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));

        // 将所有结果收集到 List 中
        return allFutures.thenApply(v -> {
            List<T> results = new ArrayList<>();
            for (CompletableFuture<List<T>> future : futures) {
                try {
                    results.addAll(future.get()); // 获取每个 CompletableFuture 的结果并添加到结果列表中
                } catch (Exception e) {
                    throw new RuntimeException(e); // 捕获异常并抛出运行时异常
                }
            }
            return results;
        }).join(); // 阻塞等待所有任务完成并返回结果
    }

    
}
