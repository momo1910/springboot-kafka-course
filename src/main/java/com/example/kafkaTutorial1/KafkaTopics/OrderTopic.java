package com.example.kafkaTutorial1.KafkaTopics;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class OrderTopic {
    @Bean
    public NewTopic orderPublishTopic()
    {
        return TopicBuilder.name("ORDER_PUBLISH").build();
    }
}
