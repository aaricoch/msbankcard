package com.nttd.msbankcard.repository;

import com.nttd.msbankcard.entity.BankCardEntity;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BankCardRepository  implements PanacheRepository<BankCardEntity> {
    
}
