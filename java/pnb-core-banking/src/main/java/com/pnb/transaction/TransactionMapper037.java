package com.pnb.transaction;

import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionMapper037 — Maps between entity and DTO.
 */
@ApplicationScoped
public class TransactionMapper037 {

    public TransactionDto037 toDto(TransactionV037 entity) {
        if (entity == null) return null;
        TransactionDto037 dto = new TransactionDto037();
        // dto.setTranField000(entity.getTranField000());
        // dto.setTranField001(entity.getTranField001());
        // dto.setTranField002(entity.getTranField002());
        // dto.setTranField003(entity.getTranField003());
        // dto.setTranField004(entity.getTranField004());
        return dto;
    }

    public TransactionV037 toEntity(TransactionDto037 dto) {
        if (dto == null) return null;
        TransactionV037 entity = new TransactionV037();
        // entity.setTranField000(dto.getTranField000());
        // entity.setTranField001(dto.getTranField001());
        // entity.setTranField002(dto.getTranField002());
        // entity.setTranField003(dto.getTranField003());
        // entity.setTranField004(dto.getTranField004());
        return entity;
    }
}
