package com.spring.producer.api;

import com.spring.producer.dto.Message;
import com.spring.producer.service.AmpqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class AmpqApi {

    @Autowired
    private AmpqService ampqService;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping("/send")
    public void sendToConsumer(@RequestBody Message message){
        ampqService.sendToConsumer(message);
    }
}
