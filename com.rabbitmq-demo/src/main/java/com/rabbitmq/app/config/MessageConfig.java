package com.rabbitmq.app.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class MessageConfig {
	
	 @Bean
	 public Queue queueA() {
		return new Queue("queue.A",false);
	 }
	@Bean
	 public Queue queueB() {
		return new Queue("queue.B",false);
	}
	 @Bean
	 public DirectExchange exchange() {
		 return new DirectExchange("exchange.direct");
	 }
	 @Bean
	 public Binding bindingA(Queue queueA,DirectExchange exchange) {
		 return BindingBuilder.bind(queueA).to(exchange).with("routing.A");
	 }

	@Bean
	public Binding bindingB(Queue queueB,DirectExchange exchange) {
		return BindingBuilder.bind(queueB).to(exchange).with("routing.B");
	}
	 
	 @Bean
	 public MessageConverter converter() {
		 return new Jackson2JsonMessageConverter();
	 }
	 
	 @Bean
	 public RabbitTemplate template(ConnectionFactory connectionFactory) {
		 RabbitTemplate rabbitTemplate=new RabbitTemplate(connectionFactory);
		 rabbitTemplate.setMessageConverter(converter());
		 return rabbitTemplate;
	 }
	 
	
}


