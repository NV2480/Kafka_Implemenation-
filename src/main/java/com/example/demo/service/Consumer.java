package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "messageEvent_Topic", groupId = "messageEvent_group")
    public void listenToTopic(String recievedMessage){
        System.out.println("The message recieved is :" + recievedMessage);

    }
}
