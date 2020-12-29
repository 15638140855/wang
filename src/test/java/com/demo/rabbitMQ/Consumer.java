package com.demo.rabbitMQ;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component//交给spring容器管理
@RabbitListener(queuesToDeclare = @Queue("hello"))//监听hello队列,在@Queue中还有很多的参数，就是原来申明时的那些参数
public class Consumer {
    @RabbitHandler//接收到消息时的回调方法
    public void getMessage(String message) {
        System.out.println(message);
    }
}