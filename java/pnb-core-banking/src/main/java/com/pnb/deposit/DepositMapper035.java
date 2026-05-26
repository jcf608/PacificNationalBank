package com.pnb.deposit;

import javax.enterprise.context.ApplicationScoped;

/**
 * DepositMapper035 — Maps between entity and DTO.
 */
@ApplicationScoped
public class DepositMapper035 {

    public DepositDto035 toDto(DepositV035 entity) {
        if (entity == null) return null;
        DepositDto035 dto = new DepositDto035();
        // dto.setDepoField000(entity.getDepoField000());
        // dto.setDepoField001(entity.getDepoField001());
        // dto.setDepoField002(entity.getDepoField002());
        // dto.setDepoField003(entity.getDepoField003());
        // dto.setDepoField004(entity.getDepoField004());
        return dto;
    }

    public DepositV035 toEntity(DepositDto035 dto) {
        if (dto == null) return null;
        DepositV035 entity = new DepositV035();
        // entity.setDepoField000(dto.getDepoField000());
        // entity.setDepoField001(dto.getDepoField001());
        // entity.setDepoField002(dto.getDepoField002());
        // entity.setDepoField003(dto.getDepoField003());
        // entity.setDepoField004(dto.getDepoField004());
        return entity;
    }
}
