package com.spring.ci.kafka;

import lombok.Data;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/1/29 16:10
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
@Data
public class Message {

    private Integer messageId;

    private Object data;

    public Message(Integer i){
        this.messageId = i;
        this.data = "message";
    }
}
