package com.pnb.transaction;

import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionMapper050 — Maps between entity and DTO.
 */
@ApplicationScoped
public class TransactionMapper050 {

    public TransactionDto050 toDto(TransactionV050 entity) {
        if (entity == null) return null;
        TransactionDto050 dto = new TransactionDto050();
        // dto.setTranField000(entity.getTranField000());
        // dto.setTranField001(entity.getTranField001());
        // dto.setTranField002(entity.getTranField002());
        // dto.setTranField003(entity.getTranField003());
        // dto.setTranField004(entity.getTranField004());
        return dto;
    }

    public TransactionV050 toEntity(TransactionDto050 dto) {
        if (dto == null) return null;
        TransactionV050 entity = new TransactionV050();
        // entity.setTranField000(dto.getTranField000());
        // entity.setTranField001(dto.getTranField001());
        // entity.setTranField002(dto.getTranField002());
        // entity.setTranField003(dto.getTranField003());
        // entity.setTranField004(dto.getTranField004());
        return entity;
    }
}
