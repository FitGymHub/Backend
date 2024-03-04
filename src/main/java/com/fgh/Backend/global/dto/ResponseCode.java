package com.fgh.Backend.global.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ResponseCode {

    // 200 OK
    OK(HttpStatus.OK.value(), "OK"),

    // Sample
    SAMPLE_EXCEPTION(9999, "샘플예외 입니다.");

    /*
     * 이 부분에 처리할 예외를 하나씩 추가하기
     * 도메인 별로 묶어서 코드 작성!!
     */




    private final int code;
    private final String message;
}