package com.spring.consumer.service;

import com.spring.consumer.dto.Message;

public interface ConsumerService {

    void action(Message message) throws Exception;
}
