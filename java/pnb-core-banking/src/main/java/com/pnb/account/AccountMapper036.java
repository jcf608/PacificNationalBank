package com.pnb.account;

import javax.enterprise.context.ApplicationScoped;

/**
 * AccountMapper036 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AccountMapper036 {

    public AccountDto036 toDto(AccountV036 entity) {
        if (entity == null) return null;
        AccountDto036 dto = new AccountDto036();
        // dto.setAccoField000(entity.getAccoField000());
        // dto.setAccoField001(entity.getAccoField001());
        // dto.setAccoField002(entity.getAccoField002());
        // dto.setAccoField003(entity.getAccoField003());
        // dto.setAccoField004(entity.getAccoField004());
        return dto;
    }

    public AccountV036 toEntity(AccountDto036 dto) {
        if (dto == null) return null;
        AccountV036 entity = new AccountV036();
        // entity.setAccoField000(dto.getAccoField000());
        // entity.setAccoField001(dto.getAccoField001());
        // entity.setAccoField002(dto.getAccoField002());
        // entity.setAccoField003(dto.getAccoField003());
        // entity.setAccoField004(dto.getAccoField004());
        return entity;
    }
}
