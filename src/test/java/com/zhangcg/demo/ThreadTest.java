package com.zhangcg.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

        public static void main(String args[]) throws InterruptedException {
            System.out.println("==========main方法开始");
            ThreadTest TestThreadPool = new ThreadTest();

            List<String> list = new ArrayList<>(10);
            list.add("0");
            list.add("1");
            list.add("2");
            list.add("3");
            list.add("4");
            list.add("5");
            list.add("6");
            list.add("7");
            list.add("8");
            list.add("9");


            long returnTime1 = TestThreadPool.test1(list);
            System.out.println("[test1]耗时:"+returnTime1+ "ms");
            long returnTime2 = TestThreadPool.test2(list);
            System.out.println("[test2]耗时:"+returnTime2+ "ms");

            System.out.println("==========main方法结束");

        }

        //加入多线程
        public long test1( List<String> list) throws InterruptedException {
            long time5 = System.currentTimeMillis();

            //创建线程池
            ExecutorService pool = Executors.newFixedThreadPool(20);

            //添加计数器
            CountDownLatch countDownLatch = new CountDownLatch(list.size());
            for (int i = 0; i < list.size(); i++) {
               Runnable run = () -> {
                    try {
                        new Thread().sleep(2000);//模拟耗时操作
                        System.out.println("[test1]" + Thread.currentThread().getName());

                        //计数器减1
                        countDownLatch.countDown();
                        } catch (Exception e) {
                    }
                };
                pool.execute(run);
            }

            //主线程等待子线程
            countDownLatch.await();

            pool.shutdown();//关闭线程池
            long time6 = System.currentTimeMillis();
            System.out.println("[test1] done!");
            return time6 - time5;
        }


        //没有加多线程
        public long test2(List<String> list) {
            long time3 = System.currentTimeMillis();
            for (int i = 0; i < list.size(); i++) {
                try {
                    new Thread().sleep(2000);//模拟耗时操作
                    System.out.println("[test2]" + Thread.currentThread().getName());

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            long time4 = System.currentTimeMillis();
            System.out.println("[test2] done!");
            return time4 - time3;
        }
    }

