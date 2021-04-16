package com.csl.observer.future;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author MaoLongLong
 * @date 2021-04-17 0:34
 */
@Slf4j
public class App {

    public static void main(String[] args) throws InterruptedException {

        // CompletableFuture 使用守护线程执行任务
        // 所以需要加同步控制让主线程等待任务线程结束
        final CountDownLatch countDownLatch = new CountDownLatch(1);

        // 被观察者
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 666;
        });

        // 相当于添加观察者，观察 future 的结果
        future.thenAccept(res -> {
            LOGGER.info("result: {}", res);
            countDownLatch.countDown();
        });

        countDownLatch.await();
    }
}
