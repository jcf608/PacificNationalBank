package com.pnb.transaction;

import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionMapper028 — Maps between entity and DTO.
 */
@ApplicationScoped
public class TransactionMapper028 {

    public TransactionDto028 toDto(TransactionV028 entity) {
        if (entity == null) return null;
        TransactionDto028 dto = new TransactionDto028();
        // dto.setTranField000(entity.getTranField000());
        // dto.setTranField001(entity.getTranField001());
        // dto.setTranField002(entity.getTranField002());
        // dto.setTranField003(entity.getTranField003());
        // dto.setTranField004(entity.getTranField004());
        return dto;
    }

    public TransactionV028 toEntity(TransactionDto028 dto) {
        if (dto == null) return null;
        TransactionV028 entity = new TransactionV028();
        // entity.setTranField000(dto.getTranField000());
        // entity.setTranField001(dto.getTranField001());
        // entity.setTranField002(dto.getTranField002());
        // entity.setTranField003(dto.getTranField003());
        // entity.setTranField004(dto.getTranField004());
        return entity;
    }
}
