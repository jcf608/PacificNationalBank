package com.pnb.account;

import javax.enterprise.context.ApplicationScoped;

/**
 * AccountMapper027 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AccountMapper027 {

    public AccountDto027 toDto(AccountV027 entity) {
        if (entity == null) return null;
        AccountDto027 dto = new AccountDto027();
        // dto.setAccoField000(entity.getAccoField000());
        // dto.setAccoField001(entity.getAccoField001());
        // dto.setAccoField002(entity.getAccoField002());
        // dto.setAccoField003(entity.getAccoField003());
        // dto.setAccoField004(entity.getAccoField004());
        return dto;
    }

    public AccountV027 toEntity(AccountDto027 dto) {
        if (dto == null) return null;
        AccountV027 entity = new AccountV027();
        // entity.setAccoField000(dto.getAccoField000());
        // entity.setAccoField001(dto.getAccoField001());
        // entity.setAccoField002(dto.getAccoField002());
        // entity.setAccoField003(dto.getAccoField003());
        // entity.setAccoField004(dto.getAccoField004());
        return entity;
    }
}
