package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto024 — Data Transfer Object for card operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto024 {

    @JsonProperty("cardField000")
    private Integer cardField000;

    @JsonProperty("cardField001")
    private Integer cardField001;

    @JsonProperty("cardField002")
    private Integer cardField002;

    @JsonProperty("cardField003")
    private Integer cardField003;

    @JsonProperty("cardField004")
    private Integer cardField004;

    @JsonProperty("cardField005")
    private Long cardField005;

    @Size(max = 40)
    @JsonProperty("cardField006")
    private String cardField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField007")
    private BigDecimal cardField007;

    public CardDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto024 instance = new CardDto024();

        public Builder cardField000(Integer val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Integer val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Integer val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Integer val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Integer val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Long val) { instance.cardField005 = val; return this; }
        public Builder cardField006(String val) { instance.cardField006 = val; return this; }
        public Builder cardField007(BigDecimal val) { instance.cardField007 = val; return this; }
        public CardDto024 build() { return instance; }
    }

    public Integer getCardField000() { return cardField000; }
    public void setCardField000(Integer cardField000) { this.cardField000 = cardField000; }

    public Integer getCardField001() { return cardField001; }
    public void setCardField001(Integer cardField001) { this.cardField001 = cardField001; }

    public Integer getCardField002() { return cardField002; }
    public void setCardField002(Integer cardField002) { this.cardField002 = cardField002; }

    public Integer getCardField003() { return cardField003; }
    public void setCardField003(Integer cardField003) { this.cardField003 = cardField003; }

    public Integer getCardField004() { return cardField004; }
    public void setCardField004(Integer cardField004) { this.cardField004 = cardField004; }

    public Long getCardField005() { return cardField005; }
    public void setCardField005(Long cardField005) { this.cardField005 = cardField005; }

    public String getCardField006() { return cardField006; }
    public void setCardField006(String cardField006) { this.cardField006 = cardField006; }

    public BigDecimal getCardField007() { return cardField007; }
    public void setCardField007(BigDecimal cardField007) { this.cardField007 = cardField007; }

    @Override
    public String toString() {
        return "CardDto024{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
