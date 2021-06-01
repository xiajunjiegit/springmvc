package com.kuang.controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestExecutors {

    public static void main(String[] args) {
        //Runtime.getRuntime().availableProcessors()
        //定长线程池的大小最好根据系统资源进行设置
        /*ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (int i=0;i<10;i++){
            final int index = i;
            executorService.execute(new Runnable() {
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName()
                                + "正在被执行");
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();*/

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        /*for (int i=0;i<10;i++){
            scheduledExecutorService.schedule(new Runnable() {
                public void run() {
                    System.out.println("day 3 seconds");
                }
            },3,TimeUnit.SECONDS);
        }

        //延迟1秒后每3秒执行一次
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("延迟1秒后每3秒执行一次");
            }
        },1,3,TimeUnit.SECONDS);*/


        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i=0;i<10;i++){
            final int index = i ;
            executorService.execute(new Runnable() {
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName()+"正在被执行,打印的值是:"+index);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();

        /*ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i=0;i< 10 ;i++){
            final int index = i;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"正在执行"+index);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }
        cachedThreadPool.shutdown();*/


    }
}
