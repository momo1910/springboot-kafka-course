package com.example.kafkaTutorial1.KafkaConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaOrderConsumer {

    @KafkaListener(topics = "ORDER_PUBLISH", groupId = "MyGroup")
    public void consumeOrderMessage(String Message){
        System.out.println("Message recieved from KafkaOrderPublisher "+ Message );
    }
}
