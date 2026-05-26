package com.pnb.branch;

import javax.enterprise.context.ApplicationScoped;

/**
 * BranchMapper041 — Maps between entity and DTO.
 */
@ApplicationScoped
public class BranchMapper041 {

    public BranchDto041 toDto(BranchV041 entity) {
        if (entity == null) return null;
        BranchDto041 dto = new BranchDto041();
        // dto.setBranField000(entity.getBranField000());
        // dto.setBranField001(entity.getBranField001());
        // dto.setBranField002(entity.getBranField002());
        // dto.setBranField003(entity.getBranField003());
        // dto.setBranField004(entity.getBranField004());
        return dto;
    }

    public BranchV041 toEntity(BranchDto041 dto) {
        if (dto == null) return null;
        BranchV041 entity = new BranchV041();
        // entity.setBranField000(dto.getBranField000());
        // entity.setBranField001(dto.getBranField001());
        // entity.setBranField002(dto.getBranField002());
        // entity.setBranField003(dto.getBranField003());
        // entity.setBranField004(dto.getBranField004());
        return entity;
    }
}
