package com.spring.consumer.service.implementation;

import com.spring.consumer.dto.Message;
import com.spring.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public void action(Message message) throws Exception{

        //throw new Exception("Erro ao consumir mensagem");
        System.out.println("Mensagem consumida: " + message.toString());
    }
}
