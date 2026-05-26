package com.pnb.card;

import javax.enterprise.context.ApplicationScoped;

/**
 * CardMapper048 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CardMapper048 {

    public CardDto048 toDto(CardV048 entity) {
        if (entity == null) return null;
        CardDto048 dto = new CardDto048();
        // dto.setCardField000(entity.getCardField000());
        // dto.setCardField001(entity.getCardField001());
        // dto.setCardField002(entity.getCardField002());
        // dto.setCardField003(entity.getCardField003());
        // dto.setCardField004(entity.getCardField004());
        return dto;
    }

    public CardV048 toEntity(CardDto048 dto) {
        if (dto == null) return null;
        CardV048 entity = new CardV048();
        // entity.setCardField000(dto.getCardField000());
        // entity.setCardField001(dto.getCardField001());
        // entity.setCardField002(dto.getCardField002());
        // entity.setCardField003(dto.getCardField003());
        // entity.setCardField004(dto.getCardField004());
        return entity;
    }
}
