package com.pnb.card;

import javax.enterprise.context.ApplicationScoped;

/**
 * CardMapper039 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CardMapper039 {

    public CardDto039 toDto(CardV039 entity) {
        if (entity == null) return null;
        CardDto039 dto = new CardDto039();
        // dto.setCardField000(entity.getCardField000());
        // dto.setCardField001(entity.getCardField001());
        // dto.setCardField002(entity.getCardField002());
        // dto.setCardField003(entity.getCardField003());
        // dto.setCardField004(entity.getCardField004());
        return dto;
    }

    public CardV039 toEntity(CardDto039 dto) {
        if (dto == null) return null;
        CardV039 entity = new CardV039();
        // entity.setCardField000(dto.getCardField000());
        // entity.setCardField001(dto.getCardField001());
        // entity.setCardField002(dto.getCardField002());
        // entity.setCardField003(dto.getCardField003());
        // entity.setCardField004(dto.getCardField004());
        return entity;
    }
}
