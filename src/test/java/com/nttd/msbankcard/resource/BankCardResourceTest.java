package com.nttd.msbankcard.resource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.eclipse.microprofile.config.inject.ConfigProperty;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.nttd.msbankcard.dto.BankCardDto;
import com.nttd.msbankcard.dto.ResponseDto;
import com.nttd.msbankcard.entity.BankCardEntity;
import com.nttd.msbankcard.service.BankCardService;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

@QuarkusTest
public class BankCardResourceTest {
    
    @Inject
    BankCardResource bankCardResource;

    @InjectMock
    BankCardService bankCardService;



    @ConfigProperty(name = "valor.code.creacion")
    int code_creado;

    @ConfigProperty(name = "mensaje.general")
    String mensaje_correcto;

   /* Testing para el registro de tarjeta de debito o Credito */

    @Test
    public void addBankCardResponseGeneral(){

        BankCardDto obj  = new BankCardDto("4151415141511542",1221,"",12);
        Mockito.when(bankCardService.addBankCard(obj))
               .thenReturn(new ResponseDto(code_creado, mensaje_correcto,new BankCardEntity()));

        Response response = bankCardResource.addBankCard(obj);
        assertNotNull(response);
        assertEquals(Response.Status.CREATED.getStatusCode(), response.getStatus());
    }




}
