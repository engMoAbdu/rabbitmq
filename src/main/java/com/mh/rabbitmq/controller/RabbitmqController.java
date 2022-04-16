package com.mh.rabbitmq.controller;

import com.mh.rabbitmq.common.infrastructure.response.SuccessResponse;
import com.mh.rabbitmq.service.RabbitmqService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/queue")
public class RabbitmqController {

    private final RabbitmqService rabbitmqService;

    @RequestMapping
    public SuccessResponse<String> send() {
        return rabbitmqService.send("Hello RabbitMQ");
    }
}
