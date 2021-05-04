package com.spring.producer.ampq.implementation;

import com.spring.producer.ampq.AmpqProducer;
import com.spring.producer.dto.Message;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProducerRabbitMQ implements AmpqProducer<Message> {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${spring.rabbitmq.request.routing-key.producer}")
    private String queue;

    @Value("${spring.rabbitmq.request.exchenge.producer}")
    private String exchange;

    @Override
    public void producer(Message message) {
        try {
            rabbitTemplate.convertAndSend(exchange, queue, message);
        }catch (Exception ex) {
            //Qualquer tipo de erro, envia para a fila deadletter
            throw new AmqpRejectAndDontRequeueException(ex);
        }
    }
}
