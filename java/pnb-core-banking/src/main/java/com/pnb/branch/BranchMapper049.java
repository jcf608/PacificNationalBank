package com.pnb.branch;

import javax.enterprise.context.ApplicationScoped;

/**
 * BranchMapper049 — Maps between entity and DTO.
 */
@ApplicationScoped
public class BranchMapper049 {

    public BranchDto049 toDto(BranchV049 entity) {
        if (entity == null) return null;
        BranchDto049 dto = new BranchDto049();
        // dto.setBranField000(entity.getBranField000());
        // dto.setBranField001(entity.getBranField001());
        // dto.setBranField002(entity.getBranField002());
        // dto.setBranField003(entity.getBranField003());
        // dto.setBranField004(entity.getBranField004());
        return dto;
    }

    public BranchV049 toEntity(BranchDto049 dto) {
        if (dto == null) return null;
        BranchV049 entity = new BranchV049();
        // entity.setBranField000(dto.getBranField000());
        // entity.setBranField001(dto.getBranField001());
        // entity.setBranField002(dto.getBranField002());
        // entity.setBranField003(dto.getBranField003());
        // entity.setBranField004(dto.getBranField004());
        return entity;
    }
}
