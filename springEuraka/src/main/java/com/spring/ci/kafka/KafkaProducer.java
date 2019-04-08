package com.spring.ci.kafka;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/1/29 16:27
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(){
        for (int i = 0 ;i < 10 ; i++){
            Message message = new Message(i);
            System.out.println("发送第" + i +"消息");
            kafkaTemplate.send("test",JSONObject.toJSONString(message));
        }
    }
}
