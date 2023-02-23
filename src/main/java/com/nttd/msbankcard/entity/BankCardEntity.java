package com.nttd.msbankcard.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "BQMBANKCARD")
public class BankCardEntity  {

    @Id
    @SequenceGenerator(
            name = "bankcardSequence",
            sequenceName = "bankcard_id_seq",
            allocationSize = 1,
            initialValue = 8)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bankcardSequence")    
    private long IdBANKCARD;   

    @Column(length = 16)
    private String cardnumber;
    
    @Column(length = 4)
    private int pin;
    
    @Column
    private String duedate;

    @Column(length = 3)
    private int validationcode;
    
}
