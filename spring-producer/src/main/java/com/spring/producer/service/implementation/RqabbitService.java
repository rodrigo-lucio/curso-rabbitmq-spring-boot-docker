package com.spring.producer.service.implementation;

import com.spring.producer.ampq.AmpqProducer;
import com.spring.producer.dto.Message;
import com.spring.producer.service.AmpqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RqabbitService implements AmpqService {

    @Autowired
    private AmpqProducer<Message> ampqProducer;

    @Override
    public void sendToConsumer(Message message) {
        ampqProducer.producer(message);
    }

}
