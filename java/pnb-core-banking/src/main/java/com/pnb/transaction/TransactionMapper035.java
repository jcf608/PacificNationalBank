package com.pnb.transaction;

import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionMapper035 — Maps between entity and DTO.
 */
@ApplicationScoped
public class TransactionMapper035 {

    public TransactionDto035 toDto(TransactionV035 entity) {
        if (entity == null) return null;
        TransactionDto035 dto = new TransactionDto035();
        // dto.setTranField000(entity.getTranField000());
        // dto.setTranField001(entity.getTranField001());
        // dto.setTranField002(entity.getTranField002());
        // dto.setTranField003(entity.getTranField003());
        // dto.setTranField004(entity.getTranField004());
        return dto;
    }

    public TransactionV035 toEntity(TransactionDto035 dto) {
        if (dto == null) return null;
        TransactionV035 entity = new TransactionV035();
        // entity.setTranField000(dto.getTranField000());
        // entity.setTranField001(dto.getTranField001());
        // entity.setTranField002(dto.getTranField002());
        // entity.setTranField003(dto.getTranField003());
        // entity.setTranField004(dto.getTranField004());
        return entity;
    }
}
