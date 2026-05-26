package com.pnb.account;

import javax.enterprise.context.ApplicationScoped;

/**
 * AccountMapper030 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AccountMapper030 {

    public AccountDto030 toDto(AccountV030 entity) {
        if (entity == null) return null;
        AccountDto030 dto = new AccountDto030();
        // dto.setAccoField000(entity.getAccoField000());
        // dto.setAccoField001(entity.getAccoField001());
        // dto.setAccoField002(entity.getAccoField002());
        // dto.setAccoField003(entity.getAccoField003());
        // dto.setAccoField004(entity.getAccoField004());
        return dto;
    }

    public AccountV030 toEntity(AccountDto030 dto) {
        if (dto == null) return null;
        AccountV030 entity = new AccountV030();
        // entity.setAccoField000(dto.getAccoField000());
        // entity.setAccoField001(dto.getAccoField001());
        // entity.setAccoField002(dto.getAccoField002());
        // entity.setAccoField003(dto.getAccoField003());
        // entity.setAccoField004(dto.getAccoField004());
        return entity;
    }
}
