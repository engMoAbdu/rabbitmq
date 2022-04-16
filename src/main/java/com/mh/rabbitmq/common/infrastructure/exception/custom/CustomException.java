package com.mh.rabbitmq.common.infrastructure.exception.custom;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author moabdu
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomException extends RuntimeException{

    private static final long serialVersionUID = 6008437565530199228L;

    private final String errorCode;

    public CustomException (String errorCode){
        super(errorCode);
        this.errorCode = errorCode;
    }

    public CustomException (String message, String errorCode){
        super(message);
        this.errorCode = errorCode;
    }
}
