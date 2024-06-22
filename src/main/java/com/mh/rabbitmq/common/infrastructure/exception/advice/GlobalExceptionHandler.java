package com.mh.rabbitmq.common.infrastructure.exception.advice;

import com.mh.rabbitmq.common.enums.ErrorCodes;
import com.mh.rabbitmq.common.infrastructure.response.BaseResponse;
import com.mh.rabbitmq.common.infrastructure.response.ErrorResponse;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @author moabdu
 */
@Log4j2
@ControllerAdvice
@AllArgsConstructor
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public @ResponseBody
    BaseResponse handle(HttpServletRequest req, Exception ex) {
        log.debug(ex.toString(), ex);
    return createCustomResponse(ErrorCodes.INTERNAL_SERVER_ERROR.getMessage(), ErrorCodes.INTERNAL_SERVER_ERROR.getErrorCode());
    }

    private BaseResponse createCustomResponse(String errorMsg, String errorCode) {
        return ErrorResponse.builder().message(errorMsg).errorCode(errorCode).build();
    }
}