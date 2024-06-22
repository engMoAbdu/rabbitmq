package com.mh.rabbitmq.common.enums;

import lombok.Getter;

/**
 * @author moabdu
 */

@Getter
public enum ErrorCodes {

    // General errors
    INTERNAL_SERVER_ERROR("ERR-001", "Something went wrong");


    final String errorCode;
    final String message;

    ErrorCodes(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }
}
