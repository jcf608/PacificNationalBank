package com.pnb.transaction;

import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionMapper023 — Maps between entity and DTO.
 */
@ApplicationScoped
public class TransactionMapper023 {

    public TransactionDto023 toDto(TransactionV023 entity) {
        if (entity == null) return null;
        TransactionDto023 dto = new TransactionDto023();
        // dto.setTranField000(entity.getTranField000());
        // dto.setTranField001(entity.getTranField001());
        // dto.setTranField002(entity.getTranField002());
        // dto.setTranField003(entity.getTranField003());
        // dto.setTranField004(entity.getTranField004());
        return dto;
    }

    public TransactionV023 toEntity(TransactionDto023 dto) {
        if (dto == null) return null;
        TransactionV023 entity = new TransactionV023();
        // entity.setTranField000(dto.getTranField000());
        // entity.setTranField001(dto.getTranField001());
        // entity.setTranField002(dto.getTranField002());
        // entity.setTranField003(dto.getTranField003());
        // entity.setTranField004(dto.getTranField004());
        return entity;
    }
}
