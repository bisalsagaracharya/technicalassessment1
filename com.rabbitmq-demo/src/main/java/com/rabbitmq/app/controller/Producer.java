package com.rabbitmq.app.controller;


import com.rabbitmq.app.entity.Message;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Producer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private DirectExchange directExchange;

  @PostMapping("/post")
   public String send(@RequestBody Message message){
       rabbitTemplate.convertAndSend(directExchange.getName(),"routing.A",message);
       return "Message sent successfully";

    }
	
	

}
