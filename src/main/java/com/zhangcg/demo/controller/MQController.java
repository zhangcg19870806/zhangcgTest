package com.zhangcg.demo.controller;

import com.zhangcg.demo.entity.MyModel;
import com.zhangcg.demo.service.impl.MyProducerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

/**
 * Created by zhangcg.
 */
@RestController
public class MQController {
    @Autowired
    private MyProducerImpl myProducers;

    @GetMapping("/mq/producer")
    public String myProducer(String content){
        MyModel model = new MyModel();
        model.setId(UUID.randomUUID());
        model.setInfo(content);
        myProducers.sendMsg(model);
        return "已发送：" + content;
    }
}
