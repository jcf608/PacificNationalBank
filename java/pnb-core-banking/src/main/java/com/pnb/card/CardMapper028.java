package com.pnb.card;

import javax.enterprise.context.ApplicationScoped;

/**
 * CardMapper028 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CardMapper028 {

    public CardDto028 toDto(CardV028 entity) {
        if (entity == null) return null;
        CardDto028 dto = new CardDto028();
        // dto.setCardField000(entity.getCardField000());
        // dto.setCardField001(entity.getCardField001());
        // dto.setCardField002(entity.getCardField002());
        // dto.setCardField003(entity.getCardField003());
        // dto.setCardField004(entity.getCardField004());
        return dto;
    }

    public CardV028 toEntity(CardDto028 dto) {
        if (dto == null) return null;
        CardV028 entity = new CardV028();
        // entity.setCardField000(dto.getCardField000());
        // entity.setCardField001(dto.getCardField001());
        // entity.setCardField002(dto.getCardField002());
        // entity.setCardField003(dto.getCardField003());
        // entity.setCardField004(dto.getCardField004());
        return entity;
    }
}
