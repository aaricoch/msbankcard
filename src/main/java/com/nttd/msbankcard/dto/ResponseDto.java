package com.nttd.msbankcard.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.nttd.msbankcard.entity.BankCardEntity;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class ResponseDto {
    
    private int code;
    private String message;
    private String errorMessage;
    private String description;
    private BankCardEntity bankCardEntity;


    
    public ResponseDto() {
    }



    public ResponseDto(int code,String message,BankCardEntity bankCardEntity) {
        this.code = code;
        this.message = message;
        this.bankCardEntity = bankCardEntity;
    }



    public ResponseDto(int code, String errorMessage, String description) {
        this.code = code;
        this.errorMessage = errorMessage;
        this.description = description;
    }


    

}
