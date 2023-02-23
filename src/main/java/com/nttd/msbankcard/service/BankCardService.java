package com.nttd.msbankcard.service;



import com.nttd.msbankcard.dto.BankCardDto;
import com.nttd.msbankcard.dto.ResponseDto;



public interface BankCardService {
    
    public ResponseDto getAllBankCard(BankCardDto bankCardDto);

    public ResponseDto addBankCard(BankCardDto bankCardDto);

    public ResponseDto getBankCardById(long id);
}
