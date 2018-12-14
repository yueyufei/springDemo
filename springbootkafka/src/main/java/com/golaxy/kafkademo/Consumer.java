package com.golaxy.kafkademo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

public class Consumer {

     @KafkaListener(topics = {"test-topic"})
        public void consumer(ConsumerRecord<String, String> message){
    	 
           System.out.println("消费者: {}"+message.offset()+message.value());
        }
}