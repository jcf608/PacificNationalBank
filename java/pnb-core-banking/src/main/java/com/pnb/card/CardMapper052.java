package com.pnb.card;

import javax.enterprise.context.ApplicationScoped;

/**
 * CardMapper052 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CardMapper052 {

    public CardDto052 toDto(CardV052 entity) {
        if (entity == null) return null;
        CardDto052 dto = new CardDto052();
        // dto.setCardField000(entity.getCardField000());
        // dto.setCardField001(entity.getCardField001());
        // dto.setCardField002(entity.getCardField002());
        // dto.setCardField003(entity.getCardField003());
        // dto.setCardField004(entity.getCardField004());
        return dto;
    }

    public CardV052 toEntity(CardDto052 dto) {
        if (dto == null) return null;
        CardV052 entity = new CardV052();
        // entity.setCardField000(dto.getCardField000());
        // entity.setCardField001(dto.getCardField001());
        // entity.setCardField002(dto.getCardField002());
        // entity.setCardField003(dto.getCardField003());
        // entity.setCardField004(dto.getCardField004());
        return entity;
    }
}
