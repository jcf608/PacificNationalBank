package com.pnb.branch;

import javax.enterprise.context.ApplicationScoped;

/**
 * BranchMapper020 — Maps between entity and DTO.
 */
@ApplicationScoped
public class BranchMapper020 {

    public BranchDto020 toDto(BranchV020 entity) {
        if (entity == null) return null;
        BranchDto020 dto = new BranchDto020();
        // dto.setBranField000(entity.getBranField000());
        // dto.setBranField001(entity.getBranField001());
        // dto.setBranField002(entity.getBranField002());
        // dto.setBranField003(entity.getBranField003());
        // dto.setBranField004(entity.getBranField004());
        return dto;
    }

    public BranchV020 toEntity(BranchDto020 dto) {
        if (dto == null) return null;
        BranchV020 entity = new BranchV020();
        // entity.setBranField000(dto.getBranField000());
        // entity.setBranField001(dto.getBranField001());
        // entity.setBranField002(dto.getBranField002());
        // entity.setBranField003(dto.getBranField003());
        // entity.setBranField004(dto.getBranField004());
        return entity;
    }
}
