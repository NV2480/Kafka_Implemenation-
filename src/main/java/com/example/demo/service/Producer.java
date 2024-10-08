package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

//    <Topic name , message>
    @Autowired
    KafkaTemplate<String, String > kafkaTemplate;

    public void sendMsgToTopic(String message){
        kafkaTemplate.send("messageEvent_Topic", message);
    }

}
