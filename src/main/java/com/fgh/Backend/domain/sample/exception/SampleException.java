package com.fgh.Backend.domain.sample.exception;

import com.fgh.Backend.global.dto.ResponseCode;
import com.fgh.Backend.global.exception.BaseException;

public class SampleException extends BaseException {

    public SampleException(ResponseCode responseCode) {
        super(responseCode);
    }

}
