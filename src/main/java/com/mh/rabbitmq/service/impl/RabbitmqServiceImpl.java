package com.mh.rabbitmq.service.impl;

import com.mh.rabbitmq.common.infrastructure.response.SuccessResponse;
import com.mh.rabbitmq.dto.MyOutSource;
import com.mh.rabbitmq.dto.RequestDto;
import com.mh.rabbitmq.service.RabbitmqService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class RabbitmqServiceImpl implements RabbitmqService {

    private final MyOutSource source;

    public SuccessResponse<String> send(String message) {
        log.info("Sending !! ");
        source.myoutput().send(MessageBuilder.withPayload(new RequestDto(message)).build());
        return SuccessResponse.<String>builder().message("ok. done").build();
    }
}
