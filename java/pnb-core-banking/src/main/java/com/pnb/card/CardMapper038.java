package com.pnb.card;

import javax.enterprise.context.ApplicationScoped;

/**
 * CardMapper038 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CardMapper038 {

    public CardDto038 toDto(CardV038 entity) {
        if (entity == null) return null;
        CardDto038 dto = new CardDto038();
        // dto.setCardField000(entity.getCardField000());
        // dto.setCardField001(entity.getCardField001());
        // dto.setCardField002(entity.getCardField002());
        // dto.setCardField003(entity.getCardField003());
        // dto.setCardField004(entity.getCardField004());
        return dto;
    }

    public CardV038 toEntity(CardDto038 dto) {
        if (dto == null) return null;
        CardV038 entity = new CardV038();
        // entity.setCardField000(dto.getCardField000());
        // entity.setCardField001(dto.getCardField001());
        // entity.setCardField002(dto.getCardField002());
        // entity.setCardField003(dto.getCardField003());
        // entity.setCardField004(dto.getCardField004());
        return entity;
    }
}
