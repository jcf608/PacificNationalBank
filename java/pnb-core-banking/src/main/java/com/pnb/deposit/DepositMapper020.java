package com.pnb.deposit;

import javax.enterprise.context.ApplicationScoped;

/**
 * DepositMapper020 — Maps between entity and DTO.
 */
@ApplicationScoped
public class DepositMapper020 {

    public DepositDto020 toDto(DepositV020 entity) {
        if (entity == null) return null;
        DepositDto020 dto = new DepositDto020();
        // dto.setDepoField000(entity.getDepoField000());
        // dto.setDepoField001(entity.getDepoField001());
        // dto.setDepoField002(entity.getDepoField002());
        // dto.setDepoField003(entity.getDepoField003());
        // dto.setDepoField004(entity.getDepoField004());
        return dto;
    }

    public DepositV020 toEntity(DepositDto020 dto) {
        if (dto == null) return null;
        DepositV020 entity = new DepositV020();
        // entity.setDepoField000(dto.getDepoField000());
        // entity.setDepoField001(dto.getDepoField001());
        // entity.setDepoField002(dto.getDepoField002());
        // entity.setDepoField003(dto.getDepoField003());
        // entity.setDepoField004(dto.getDepoField004());
        return entity;
    }
}
