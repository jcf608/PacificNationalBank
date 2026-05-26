package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto038 — Data Transfer Object for card operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto038 {

    @JsonProperty("cardField000")
    private LocalDate cardField000;

    @JsonProperty("cardField001")
    private LocalDate cardField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField002")
    private BigDecimal cardField002;

    @JsonProperty("cardField003")
    private Boolean cardField003;

    @JsonProperty("cardField004")
    private Double cardField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField005")
    private BigDecimal cardField005;

    @JsonProperty("cardField006")
    private Long cardField006;

    @JsonProperty("cardField007")
    private Integer cardField007;

    @JsonProperty("cardField008")
    private Double cardField008;

    @JsonProperty("cardField009")
    private Boolean cardField009;

    public CardDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto038 instance = new CardDto038();

        public Builder cardField000(LocalDate val) { instance.cardField000 = val; return this; }
        public Builder cardField001(LocalDate val) { instance.cardField001 = val; return this; }
        public Builder cardField002(BigDecimal val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Boolean val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Double val) { instance.cardField004 = val; return this; }
        public Builder cardField005(BigDecimal val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Long val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Integer val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Double val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Boolean val) { instance.cardField009 = val; return this; }
        public CardDto038 build() { return instance; }
    }

    public LocalDate getCardField000() { return cardField000; }
    public void setCardField000(LocalDate cardField000) { this.cardField000 = cardField000; }

    public LocalDate getCardField001() { return cardField001; }
    public void setCardField001(LocalDate cardField001) { this.cardField001 = cardField001; }

    public BigDecimal getCardField002() { return cardField002; }
    public void setCardField002(BigDecimal cardField002) { this.cardField002 = cardField002; }

    public Boolean getCardField003() { return cardField003; }
    public void setCardField003(Boolean cardField003) { this.cardField003 = cardField003; }

    public Double getCardField004() { return cardField004; }
    public void setCardField004(Double cardField004) { this.cardField004 = cardField004; }

    public BigDecimal getCardField005() { return cardField005; }
    public void setCardField005(BigDecimal cardField005) { this.cardField005 = cardField005; }

    public Long getCardField006() { return cardField006; }
    public void setCardField006(Long cardField006) { this.cardField006 = cardField006; }

    public Integer getCardField007() { return cardField007; }
    public void setCardField007(Integer cardField007) { this.cardField007 = cardField007; }

    public Double getCardField008() { return cardField008; }
    public void setCardField008(Double cardField008) { this.cardField008 = cardField008; }

    public Boolean getCardField009() { return cardField009; }
    public void setCardField009(Boolean cardField009) { this.cardField009 = cardField009; }

    @Override
    public String toString() {
        return "CardDto038{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
