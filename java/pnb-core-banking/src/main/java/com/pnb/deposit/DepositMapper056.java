package com.pnb.deposit;

import javax.enterprise.context.ApplicationScoped;

/**
 * DepositMapper056 — Maps between entity and DTO.
 */
@ApplicationScoped
public class DepositMapper056 {

    public DepositDto056 toDto(DepositV056 entity) {
        if (entity == null) return null;
        DepositDto056 dto = new DepositDto056();
        // dto.setDepoField000(entity.getDepoField000());
        // dto.setDepoField001(entity.getDepoField001());
        // dto.setDepoField002(entity.getDepoField002());
        // dto.setDepoField003(entity.getDepoField003());
        // dto.setDepoField004(entity.getDepoField004());
        return dto;
    }

    public DepositV056 toEntity(DepositDto056 dto) {
        if (dto == null) return null;
        DepositV056 entity = new DepositV056();
        // entity.setDepoField000(dto.getDepoField000());
        // entity.setDepoField001(dto.getDepoField001());
        // entity.setDepoField002(dto.getDepoField002());
        // entity.setDepoField003(dto.getDepoField003());
        // entity.setDepoField004(dto.getDepoField004());
        return entity;
    }
}
