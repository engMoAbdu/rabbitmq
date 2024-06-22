package com.mh.rabbitmq.common.infrastructure.exception.custom;

/**
 * @author moabdu
 */
public class CustomServiceException extends CustomException {

    private static final long serialVersionUID = 7168555867098356326L;

    public CustomServiceException (String errorCode){
        super(errorCode);
    }

    public CustomServiceException (String message, String errorCode){
        super(message, errorCode);
    }
}

