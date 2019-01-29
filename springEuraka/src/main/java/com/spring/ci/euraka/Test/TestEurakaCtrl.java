package com.spring.ci.euraka.Test;

import com.spring.ci.euraka.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/1/25 14:23
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
@RestController
@RequestMapping(value = "/euraka")
public class TestEurakaCtrl {

    @Autowired
    KafkaProducer kafkaProducer;

    @GetMapping("/test")
    @Test
    public String test(Animal animal){
        kafkaProducer.send();
        return "hello,euraka";
    }
}
