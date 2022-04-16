package com.mh.rabbitmq.common.infrastructure.response;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

/**
 * @author moabdu
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper=true)
public class PaginationResponse<T> extends BaseResponse{

    private Long totalElements;
    private List<T> data ;
    private int numberOfPages;

    @Override
    public Boolean isSuccess() {
        return Boolean.TRUE;
    }
}

