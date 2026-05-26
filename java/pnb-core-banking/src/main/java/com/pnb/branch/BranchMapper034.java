package com.pnb.branch;

import javax.enterprise.context.ApplicationScoped;

/**
 * BranchMapper034 — Maps between entity and DTO.
 */
@ApplicationScoped
public class BranchMapper034 {

    public BranchDto034 toDto(BranchV034 entity) {
        if (entity == null) return null;
        BranchDto034 dto = new BranchDto034();
        // dto.setBranField000(entity.getBranField000());
        // dto.setBranField001(entity.getBranField001());
        // dto.setBranField002(entity.getBranField002());
        // dto.setBranField003(entity.getBranField003());
        // dto.setBranField004(entity.getBranField004());
        return dto;
    }

    public BranchV034 toEntity(BranchDto034 dto) {
        if (dto == null) return null;
        BranchV034 entity = new BranchV034();
        // entity.setBranField000(dto.getBranField000());
        // entity.setBranField001(dto.getBranField001());
        // entity.setBranField002(dto.getBranField002());
        // entity.setBranField003(dto.getBranField003());
        // entity.setBranField004(dto.getBranField004());
        return entity;
    }
}
