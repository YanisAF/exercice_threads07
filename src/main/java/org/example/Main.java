package org.example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        AtomicInteger counter = new AtomicInteger(0);

        executor.scheduleAtFixedRate(() -> {
            int i = counter.incrementAndGet();
            System.out.println("Message périodique "+i);

            if (i == 5){
                executor.shutdown();
                System.out.println("Programme terminé");
            }
        }, 1, 2, TimeUnit.SECONDS);

    }
}