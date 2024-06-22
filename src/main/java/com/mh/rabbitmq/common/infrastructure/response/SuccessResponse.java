package com.mh.rabbitmq.common.infrastructure.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

/**
 * @author moabdu
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper=true)
public class SuccessResponse<T> extends BaseResponse{

    private T data;

    @Override
    public Boolean isSuccess() {
        return Boolean.TRUE;
    }
}

