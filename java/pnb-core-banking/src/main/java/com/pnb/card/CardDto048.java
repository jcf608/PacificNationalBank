package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto048 — Data Transfer Object for card operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto048 {

    @JsonProperty("cardField000")
    private Boolean cardField000;

    @JsonProperty("cardField001")
    private Long cardField001;

    @JsonProperty("cardField002")
    private LocalDate cardField002;

    @JsonProperty("cardField003")
    private LocalDate cardField003;

    @JsonProperty("cardField004")
    private Double cardField004;

    @Size(max = 60)
    @JsonProperty("cardField005")
    private String cardField005;

    @JsonProperty("cardField006")
    private LocalDate cardField006;

    @JsonProperty("cardField007")
    private Integer cardField007;

    public CardDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto048 instance = new CardDto048();

        public Builder cardField000(Boolean val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Long val) { instance.cardField001 = val; return this; }
        public Builder cardField002(LocalDate val) { instance.cardField002 = val; return this; }
        public Builder cardField003(LocalDate val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Double val) { instance.cardField004 = val; return this; }
        public Builder cardField005(String val) { instance.cardField005 = val; return this; }
        public Builder cardField006(LocalDate val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Integer val) { instance.cardField007 = val; return this; }
        public CardDto048 build() { return instance; }
    }

    public Boolean getCardField000() { return cardField000; }
    public void setCardField000(Boolean cardField000) { this.cardField000 = cardField000; }

    public Long getCardField001() { return cardField001; }
    public void setCardField001(Long cardField001) { this.cardField001 = cardField001; }

    public LocalDate getCardField002() { return cardField002; }
    public void setCardField002(LocalDate cardField002) { this.cardField002 = cardField002; }

    public LocalDate getCardField003() { return cardField003; }
    public void setCardField003(LocalDate cardField003) { this.cardField003 = cardField003; }

    public Double getCardField004() { return cardField004; }
    public void setCardField004(Double cardField004) { this.cardField004 = cardField004; }

    public String getCardField005() { return cardField005; }
    public void setCardField005(String cardField005) { this.cardField005 = cardField005; }

    public LocalDate getCardField006() { return cardField006; }
    public void setCardField006(LocalDate cardField006) { this.cardField006 = cardField006; }

    public Integer getCardField007() { return cardField007; }
    public void setCardField007(Integer cardField007) { this.cardField007 = cardField007; }

    @Override
    public String toString() {
        return "CardDto048{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
