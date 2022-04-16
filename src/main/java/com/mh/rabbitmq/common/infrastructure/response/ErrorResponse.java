package com.mh.rabbitmq.common.infrastructure.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

/**
 * @author moabdu
 */
@Data
@SuperBuilder
@JsonInclude(Include.NON_NULL)
@EqualsAndHashCode(callSuper=true)
public final class ErrorResponse extends BaseResponse {

    private final String errorCode;

    @Override
    public Boolean isSuccess() {
        return Boolean.FALSE;
    }
}
