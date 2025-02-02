package com.example.kafkaconsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener {

    @KafkaListener(topics = "sms-topic")
    public void listen(ConsumerRecord<String, Sms> sms) {
        System.out.println("Received sms: " + sms.value());
    }

}
