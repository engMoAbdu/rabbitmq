package com.mh.rabbitmq;

import com.mh.rabbitmq.dto.MyInSource;
import com.mh.rabbitmq.dto.MyOutSource;
import com.mh.rabbitmq.dto.RequestDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@Log4j2
@EnableBinding({MyOutSource.class, MyInSource.class})
@SpringBootApplication
public class RabbitMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqApplication.class, args);
    }

    @StreamListener("helloinchannel")
    public void processGreeting(RequestDto requestDto) {
        log.info("Received message ==== " + requestDto.getMessage());
    }
}

