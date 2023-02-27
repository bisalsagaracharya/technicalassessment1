package com.rabbitmq.app.entity;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Message {

	private int id;
	private String name;


}
