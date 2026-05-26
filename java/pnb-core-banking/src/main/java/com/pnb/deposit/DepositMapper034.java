package com.pnb.deposit;

import javax.enterprise.context.ApplicationScoped;

/**
 * DepositMapper034 — Maps between entity and DTO.
 */
@ApplicationScoped
public class DepositMapper034 {

    public DepositDto034 toDto(DepositV034 entity) {
        if (entity == null) return null;
        DepositDto034 dto = new DepositDto034();
        // dto.setDepoField000(entity.getDepoField000());
        // dto.setDepoField001(entity.getDepoField001());
        // dto.setDepoField002(entity.getDepoField002());
        // dto.setDepoField003(entity.getDepoField003());
        // dto.setDepoField004(entity.getDepoField004());
        return dto;
    }

    public DepositV034 toEntity(DepositDto034 dto) {
        if (dto == null) return null;
        DepositV034 entity = new DepositV034();
        // entity.setDepoField000(dto.getDepoField000());
        // entity.setDepoField001(dto.getDepoField001());
        // entity.setDepoField002(dto.getDepoField002());
        // entity.setDepoField003(dto.getDepoField003());
        // entity.setDepoField004(dto.getDepoField004());
        return entity;
    }
}
