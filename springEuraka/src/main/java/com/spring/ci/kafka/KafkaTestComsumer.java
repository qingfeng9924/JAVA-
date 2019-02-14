package com.spring.ci.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/1/29 16:16
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
@Component
public class KafkaTestComsumer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @KafkaListener(topics = {"test"})
    public void listen(ConsumerRecord<?,?> consumerRecord){
        Optional<?> kafkaMessage = Optional.ofNullable(consumerRecord.value());
        if(kafkaMessage.isPresent()){
            //得到Optional实例中的值
            Object message = kafkaMessage.get();
            System.err.println("消费消息:"+message);
        }
    }
}
