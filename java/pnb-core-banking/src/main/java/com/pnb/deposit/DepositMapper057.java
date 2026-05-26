package com.pnb.deposit;

import javax.enterprise.context.ApplicationScoped;

/**
 * DepositMapper057 — Maps between entity and DTO.
 */
@ApplicationScoped
public class DepositMapper057 {

    public DepositDto057 toDto(DepositV057 entity) {
        if (entity == null) return null;
        DepositDto057 dto = new DepositDto057();
        // dto.setDepoField000(entity.getDepoField000());
        // dto.setDepoField001(entity.getDepoField001());
        // dto.setDepoField002(entity.getDepoField002());
        // dto.setDepoField003(entity.getDepoField003());
        // dto.setDepoField004(entity.getDepoField004());
        return dto;
    }

    public DepositV057 toEntity(DepositDto057 dto) {
        if (dto == null) return null;
        DepositV057 entity = new DepositV057();
        // entity.setDepoField000(dto.getDepoField000());
        // entity.setDepoField001(dto.getDepoField001());
        // entity.setDepoField002(dto.getDepoField002());
        // entity.setDepoField003(dto.getDepoField003());
        // entity.setDepoField004(dto.getDepoField004());
        return entity;
    }
}
