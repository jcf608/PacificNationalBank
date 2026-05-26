package com.pnb.branch;

import javax.enterprise.context.ApplicationScoped;

/**
 * BranchMapper058 — Maps between entity and DTO.
 */
@ApplicationScoped
public class BranchMapper058 {

    public BranchDto058 toDto(BranchV058 entity) {
        if (entity == null) return null;
        BranchDto058 dto = new BranchDto058();
        // dto.setBranField000(entity.getBranField000());
        // dto.setBranField001(entity.getBranField001());
        // dto.setBranField002(entity.getBranField002());
        // dto.setBranField003(entity.getBranField003());
        // dto.setBranField004(entity.getBranField004());
        return dto;
    }

    public BranchV058 toEntity(BranchDto058 dto) {
        if (dto == null) return null;
        BranchV058 entity = new BranchV058();
        // entity.setBranField000(dto.getBranField000());
        // entity.setBranField001(dto.getBranField001());
        // entity.setBranField002(dto.getBranField002());
        // entity.setBranField003(dto.getBranField003());
        // entity.setBranField004(dto.getBranField004());
        return entity;
    }
}
