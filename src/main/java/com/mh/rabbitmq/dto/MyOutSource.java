package com.mh.rabbitmq.dto;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MyOutSource {
    @Output("hellooutchannel")
    MessageChannel myoutput();
}
