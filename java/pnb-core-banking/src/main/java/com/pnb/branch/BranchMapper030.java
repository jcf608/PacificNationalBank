package com.pnb.branch;

import javax.enterprise.context.ApplicationScoped;

/**
 * BranchMapper030 — Maps between entity and DTO.
 */
@ApplicationScoped
public class BranchMapper030 {

    public BranchDto030 toDto(BranchV030 entity) {
        if (entity == null) return null;
        BranchDto030 dto = new BranchDto030();
        // dto.setBranField000(entity.getBranField000());
        // dto.setBranField001(entity.getBranField001());
        // dto.setBranField002(entity.getBranField002());
        // dto.setBranField003(entity.getBranField003());
        // dto.setBranField004(entity.getBranField004());
        return dto;
    }

    public BranchV030 toEntity(BranchDto030 dto) {
        if (dto == null) return null;
        BranchV030 entity = new BranchV030();
        // entity.setBranField000(dto.getBranField000());
        // entity.setBranField001(dto.getBranField001());
        // entity.setBranField002(dto.getBranField002());
        // entity.setBranField003(dto.getBranField003());
        // entity.setBranField004(dto.getBranField004());
        return entity;
    }
}
