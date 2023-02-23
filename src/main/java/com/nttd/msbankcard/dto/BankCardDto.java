package com.nttd.msbankcard.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BankCardDto {

    private String cardnumber;
    private int pin;
    private String duedate;
    private int validationcode;
    


    public BankCardDto() {
    }


}
