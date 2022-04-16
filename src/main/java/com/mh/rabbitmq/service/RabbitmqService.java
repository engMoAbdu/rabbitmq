package com.mh.rabbitmq.service;

import com.mh.rabbitmq.common.infrastructure.response.SuccessResponse;

public interface RabbitmqService {

    SuccessResponse<String> send(String message);
}
