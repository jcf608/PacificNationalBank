package com.pnb.deposit;

import javax.enterprise.context.ApplicationScoped;

/**
 * DepositMapper026 — Maps between entity and DTO.
 */
@ApplicationScoped
public class DepositMapper026 {

    public DepositDto026 toDto(DepositV026 entity) {
        if (entity == null) return null;
        DepositDto026 dto = new DepositDto026();
        // dto.setDepoField000(entity.getDepoField000());
        // dto.setDepoField001(entity.getDepoField001());
        // dto.setDepoField002(entity.getDepoField002());
        // dto.setDepoField003(entity.getDepoField003());
        // dto.setDepoField004(entity.getDepoField004());
        return dto;
    }

    public DepositV026 toEntity(DepositDto026 dto) {
        if (dto == null) return null;
        DepositV026 entity = new DepositV026();
        // entity.setDepoField000(dto.getDepoField000());
        // entity.setDepoField001(dto.getDepoField001());
        // entity.setDepoField002(dto.getDepoField002());
        // entity.setDepoField003(dto.getDepoField003());
        // entity.setDepoField004(dto.getDepoField004());
        return entity;
    }
}
