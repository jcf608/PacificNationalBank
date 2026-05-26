package com.pnb.branch;

import javax.enterprise.context.ApplicationScoped;

/**
 * BranchMapper026 — Maps between entity and DTO.
 */
@ApplicationScoped
public class BranchMapper026 {

    public BranchDto026 toDto(BranchV026 entity) {
        if (entity == null) return null;
        BranchDto026 dto = new BranchDto026();
        // dto.setBranField000(entity.getBranField000());
        // dto.setBranField001(entity.getBranField001());
        // dto.setBranField002(entity.getBranField002());
        // dto.setBranField003(entity.getBranField003());
        // dto.setBranField004(entity.getBranField004());
        return dto;
    }

    public BranchV026 toEntity(BranchDto026 dto) {
        if (dto == null) return null;
        BranchV026 entity = new BranchV026();
        // entity.setBranField000(dto.getBranField000());
        // entity.setBranField001(dto.getBranField001());
        // entity.setBranField002(dto.getBranField002());
        // entity.setBranField003(dto.getBranField003());
        // entity.setBranField004(dto.getBranField004());
        return entity;
    }
}
