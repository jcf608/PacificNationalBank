package com.pnb.transaction;

import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionMapper029 — Maps between entity and DTO.
 */
@ApplicationScoped
public class TransactionMapper029 {

    public TransactionDto029 toDto(TransactionV029 entity) {
        if (entity == null) return null;
        TransactionDto029 dto = new TransactionDto029();
        // dto.setTranField000(entity.getTranField000());
        // dto.setTranField001(entity.getTranField001());
        // dto.setTranField002(entity.getTranField002());
        // dto.setTranField003(entity.getTranField003());
        // dto.setTranField004(entity.getTranField004());
        return dto;
    }

    public TransactionV029 toEntity(TransactionDto029 dto) {
        if (dto == null) return null;
        TransactionV029 entity = new TransactionV029();
        // entity.setTranField000(dto.getTranField000());
        // entity.setTranField001(dto.getTranField001());
        // entity.setTranField002(dto.getTranField002());
        // entity.setTranField003(dto.getTranField003());
        // entity.setTranField004(dto.getTranField004());
        return entity;
    }
}
