package com.pnb.branch;

import javax.enterprise.context.ApplicationScoped;

/**
 * BranchMapper028 — Maps between entity and DTO.
 */
@ApplicationScoped
public class BranchMapper028 {

    public BranchDto028 toDto(BranchV028 entity) {
        if (entity == null) return null;
        BranchDto028 dto = new BranchDto028();
        // dto.setBranField000(entity.getBranField000());
        // dto.setBranField001(entity.getBranField001());
        // dto.setBranField002(entity.getBranField002());
        // dto.setBranField003(entity.getBranField003());
        // dto.setBranField004(entity.getBranField004());
        return dto;
    }

    public BranchV028 toEntity(BranchDto028 dto) {
        if (dto == null) return null;
        BranchV028 entity = new BranchV028();
        // entity.setBranField000(dto.getBranField000());
        // entity.setBranField001(dto.getBranField001());
        // entity.setBranField002(dto.getBranField002());
        // entity.setBranField003(dto.getBranField003());
        // entity.setBranField004(dto.getBranField004());
        return entity;
    }
}
