package com.mh.rabbitmq.common.infrastructure.response;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author moabdu
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode
@JsonInclude(Include.NON_NULL)
public abstract class BaseResponse{

    private Boolean success;
    private String message;
    private String msgCode ;

    /**
     * fetch data by rule id
     * @return Result<Boolean>
     */
    public abstract Boolean isSuccess();
}


