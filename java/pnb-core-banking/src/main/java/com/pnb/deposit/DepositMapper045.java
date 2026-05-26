package com.pnb.deposit;

import javax.enterprise.context.ApplicationScoped;

/**
 * DepositMapper045 — Maps between entity and DTO.
 */
@ApplicationScoped
public class DepositMapper045 {

    public DepositDto045 toDto(DepositV045 entity) {
        if (entity == null) return null;
        DepositDto045 dto = new DepositDto045();
        // dto.setDepoField000(entity.getDepoField000());
        // dto.setDepoField001(entity.getDepoField001());
        // dto.setDepoField002(entity.getDepoField002());
        // dto.setDepoField003(entity.getDepoField003());
        // dto.setDepoField004(entity.getDepoField004());
        return dto;
    }

    public DepositV045 toEntity(DepositDto045 dto) {
        if (dto == null) return null;
        DepositV045 entity = new DepositV045();
        // entity.setDepoField000(dto.getDepoField000());
        // entity.setDepoField001(dto.getDepoField001());
        // entity.setDepoField002(dto.getDepoField002());
        // entity.setDepoField003(dto.getDepoField003());
        // entity.setDepoField004(dto.getDepoField004());
        return entity;
    }
}
