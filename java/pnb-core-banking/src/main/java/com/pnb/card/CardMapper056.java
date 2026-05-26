package com.pnb.card;

import javax.enterprise.context.ApplicationScoped;

/**
 * CardMapper056 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CardMapper056 {

    public CardDto056 toDto(CardV056 entity) {
        if (entity == null) return null;
        CardDto056 dto = new CardDto056();
        // dto.setCardField000(entity.getCardField000());
        // dto.setCardField001(entity.getCardField001());
        // dto.setCardField002(entity.getCardField002());
        // dto.setCardField003(entity.getCardField003());
        // dto.setCardField004(entity.getCardField004());
        return dto;
    }

    public CardV056 toEntity(CardDto056 dto) {
        if (dto == null) return null;
        CardV056 entity = new CardV056();
        // entity.setCardField000(dto.getCardField000());
        // entity.setCardField001(dto.getCardField001());
        // entity.setCardField002(dto.getCardField002());
        // entity.setCardField003(dto.getCardField003());
        // entity.setCardField004(dto.getCardField004());
        return entity;
    }
}
