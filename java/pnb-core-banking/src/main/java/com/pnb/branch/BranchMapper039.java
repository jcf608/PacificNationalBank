package com.pnb.branch;

import javax.enterprise.context.ApplicationScoped;

/**
 * BranchMapper039 — Maps between entity and DTO.
 */
@ApplicationScoped
public class BranchMapper039 {

    public BranchDto039 toDto(BranchV039 entity) {
        if (entity == null) return null;
        BranchDto039 dto = new BranchDto039();
        // dto.setBranField000(entity.getBranField000());
        // dto.setBranField001(entity.getBranField001());
        // dto.setBranField002(entity.getBranField002());
        // dto.setBranField003(entity.getBranField003());
        // dto.setBranField004(entity.getBranField004());
        return dto;
    }

    public BranchV039 toEntity(BranchDto039 dto) {
        if (dto == null) return null;
        BranchV039 entity = new BranchV039();
        // entity.setBranField000(dto.getBranField000());
        // entity.setBranField001(dto.getBranField001());
        // entity.setBranField002(dto.getBranField002());
        // entity.setBranField003(dto.getBranField003());
        // entity.setBranField004(dto.getBranField004());
        return entity;
    }
}
