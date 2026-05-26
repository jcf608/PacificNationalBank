package com.pnb.branch;

import javax.enterprise.context.ApplicationScoped;

/**
 * BranchMapper048 — Maps between entity and DTO.
 */
@ApplicationScoped
public class BranchMapper048 {

    public BranchDto048 toDto(BranchV048 entity) {
        if (entity == null) return null;
        BranchDto048 dto = new BranchDto048();
        // dto.setBranField000(entity.getBranField000());
        // dto.setBranField001(entity.getBranField001());
        // dto.setBranField002(entity.getBranField002());
        // dto.setBranField003(entity.getBranField003());
        // dto.setBranField004(entity.getBranField004());
        return dto;
    }

    public BranchV048 toEntity(BranchDto048 dto) {
        if (dto == null) return null;
        BranchV048 entity = new BranchV048();
        // entity.setBranField000(dto.getBranField000());
        // entity.setBranField001(dto.getBranField001());
        // entity.setBranField002(dto.getBranField002());
        // entity.setBranField003(dto.getBranField003());
        // entity.setBranField004(dto.getBranField004());
        return entity;
    }
}
