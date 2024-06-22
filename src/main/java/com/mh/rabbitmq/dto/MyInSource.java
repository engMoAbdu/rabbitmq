package com.mh.rabbitmq.dto;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface MyInSource {
    @Input("helloinchannel")
    MessageChannel myoutput();
}
