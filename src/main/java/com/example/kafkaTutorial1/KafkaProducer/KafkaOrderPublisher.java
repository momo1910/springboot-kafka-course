package com.example.kafkaTutorial1.KafkaProducer;


import com.example.kafkaTutorial1.KafkaTopics.OrderTopic;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaOrderPublisher {

    KafkaTemplate<String, String> kafkaTemplate;


    public KafkaOrderPublisher(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendOrderMessage(String message){
        kafkaTemplate.send( "ORDER_PUBLISH",message);
    }
}
