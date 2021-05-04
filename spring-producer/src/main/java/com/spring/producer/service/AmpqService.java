package com.spring.producer.service;

import com.spring.producer.dto.Message;

public interface AmpqService {
    void sendToConsumer(Message message);
}
