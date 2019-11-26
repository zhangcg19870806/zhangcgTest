package com.zhangcg.demo.service.impl;

import com.zhangcg.demo.config.RabbitConfig;
import com.zhangcg.demo.entity.MyModel;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhangcg.
 */
@Component
@RabbitListener(queues = RabbitConfig.QUEUE_A)
public class MyReceiverImpl {
    @RabbitHandler
    public void process(MyModel model) {
        System.out.println("接收处理队列A当中的消息： " + model.getInfo());
    }
}
