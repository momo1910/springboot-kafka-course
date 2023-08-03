package com.example.kafkaTutorial1.RestController;

import com.example.kafkaTutorial1.KafkaProducer.KafkaOrderPublisher;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/send/OrderDetails")
public class StringController {


    @Autowired
    KafkaOrderPublisher kafkaOrderPublisher;

    @PostMapping
    public void sendOrderMessage(@RequestBody String orderMessage){
        kafkaOrderPublisher.sendOrderMessage(orderMessage);
        System.out.println("Order Message sent sucessfully");
    }
}
