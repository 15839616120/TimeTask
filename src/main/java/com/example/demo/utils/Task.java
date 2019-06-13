package com.example.demo.utils;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import static java.util.concurrent.Executors.newSingleThreadScheduledExecutor;

public class Task {

    public static void main(String[] args) throws InterruptedException {

            ScheduledExecutorService executorService = newSingleThreadScheduledExecutor();
            executorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    System.out.println("run "+ System.currentTimeMillis());
                }
            }, 0, 1000, TimeUnit.MILLISECONDS);
/*run 1560405193291
  run 1560405194291
  run 1560405195291
  run 1560405196290
  run 1560405197290
 */

        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        }, 100, 1000);

    }

}
