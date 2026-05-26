package com.pnb.deposit;

import javax.enterprise.context.ApplicationScoped;

/**
 * DepositMapper039 — Maps between entity and DTO.
 */
@ApplicationScoped
public class DepositMapper039 {

    public DepositDto039 toDto(DepositV039 entity) {
        if (entity == null) return null;
        DepositDto039 dto = new DepositDto039();
        // dto.setDepoField000(entity.getDepoField000());
        // dto.setDepoField001(entity.getDepoField001());
        // dto.setDepoField002(entity.getDepoField002());
        // dto.setDepoField003(entity.getDepoField003());
        // dto.setDepoField004(entity.getDepoField004());
        return dto;
    }

    public DepositV039 toEntity(DepositDto039 dto) {
        if (dto == null) return null;
        DepositV039 entity = new DepositV039();
        // entity.setDepoField000(dto.getDepoField000());
        // entity.setDepoField001(dto.getDepoField001());
        // entity.setDepoField002(dto.getDepoField002());
        // entity.setDepoField003(dto.getDepoField003());
        // entity.setDepoField004(dto.getDepoField004());
        return entity;
    }
}
