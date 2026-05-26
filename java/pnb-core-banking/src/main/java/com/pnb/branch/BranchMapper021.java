package com.pnb.branch;

import javax.enterprise.context.ApplicationScoped;

/**
 * BranchMapper021 — Maps between entity and DTO.
 */
@ApplicationScoped
public class BranchMapper021 {

    public BranchDto021 toDto(BranchV021 entity) {
        if (entity == null) return null;
        BranchDto021 dto = new BranchDto021();
        // dto.setBranField000(entity.getBranField000());
        // dto.setBranField001(entity.getBranField001());
        // dto.setBranField002(entity.getBranField002());
        // dto.setBranField003(entity.getBranField003());
        // dto.setBranField004(entity.getBranField004());
        return dto;
    }

    public BranchV021 toEntity(BranchDto021 dto) {
        if (dto == null) return null;
        BranchV021 entity = new BranchV021();
        // entity.setBranField000(dto.getBranField000());
        // entity.setBranField001(dto.getBranField001());
        // entity.setBranField002(dto.getBranField002());
        // entity.setBranField003(dto.getBranField003());
        // entity.setBranField004(dto.getBranField004());
        return entity;
    }
}
