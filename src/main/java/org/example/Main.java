package org.example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

//        Thread[] threads = createAtomicThreads();
//        for (Thread thread : threads) thread.start();
//        for (Thread thread : threads) thread.join();
//        System.out.println("Programme terminé");
    }

    public static void showScheduledExecution() throws InterruptedException {
        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(5);

        scheduled.schedule(() -> System.out.println("Message périodique 1 !!! "), 1, TimeUnit.SECONDS);

        scheduled.schedule(() -> System.out.println("Message périodique 2 !!! "), 3, TimeUnit.SECONDS);

        scheduled.schedule(() -> System.out.println("Message périodique 3 !!! "), 5, TimeUnit.SECONDS);

        scheduled.schedule(() -> System.out.println("Message périodique 4 !!! "), 7, TimeUnit.SECONDS);

        scheduled.schedule(() -> System.out.println("Message périodique 5 !!! "), 9, TimeUnit.SECONDS);

        scheduled.shutdown();

    }

//    private static Thread[] createAtomicThreads() throws InterruptedException {
//        Thread[] threads = new Thread[1];
//        for (int i = 0; i < 5; i++) {
//            threads[i] = new Thread(() -> {
//                for (int j = 0; j < 5; j++) {
//                    try {
//                        showScheduledExecution();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            });
//        } return threads;
    }
}