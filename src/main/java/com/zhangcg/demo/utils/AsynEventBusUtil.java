package com.zhangcg.demo.utils;

import com.google.common.eventbus.AsyncEventBus;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * Created by zhangcg
 */
public class AsynEventBusUtil {

    private static final int invokerPoolSize = 50;
    private static final int load_factor = 10;
    private static BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(invokerPoolSize
            * load_factor);
    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(
            invokerPoolSize,
            invokerPoolSize,
            60L,
            TimeUnit.SECONDS,
            queue,
            new ThreadPoolExecutor.CallerRunsPolicy());

    private static AsyncEventBus asyncEventBus   = new AsyncEventBus(executor);



    /**
     * 发布异步处理事件
     */
    public static void asyncPost(Object event) {
        asyncEventBus.post(event);
    }

    /**
     * 注册处理器
     *
     * @param handler
     */
    public static void register(Object handler) {
        asyncEventBus.register(handler);
    }

    /**
     * 注销处理器
     *
     * @param handler
     */
    public static void unregister(Object handler) {
        asyncEventBus.unregister(handler);
    }

}

