package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto037 — Data Transfer Object for card operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto037 {

    @JsonProperty("cardField000")
    private Long cardField000;

    @JsonProperty("cardField001")
    private Boolean cardField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField002")
    private BigDecimal cardField002;

    @Size(max = 20)
    @JsonProperty("cardField003")
    private String cardField003;

    @JsonProperty("cardField004")
    private Double cardField004;

    @JsonProperty("cardField005")
    private LocalDate cardField005;

    @JsonProperty("cardField006")
    private Long cardField006;

    @JsonProperty("cardField007")
    private Boolean cardField007;

    @Size(max = 60)
    @JsonProperty("cardField008")
    private String cardField008;

    public CardDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto037 instance = new CardDto037();

        public Builder cardField000(Long val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Boolean val) { instance.cardField001 = val; return this; }
        public Builder cardField002(BigDecimal val) { instance.cardField002 = val; return this; }
        public Builder cardField003(String val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Double val) { instance.cardField004 = val; return this; }
        public Builder cardField005(LocalDate val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Long val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Boolean val) { instance.cardField007 = val; return this; }
        public Builder cardField008(String val) { instance.cardField008 = val; return this; }
        public CardDto037 build() { return instance; }
    }

    public Long getCardField000() { return cardField000; }
    public void setCardField000(Long cardField000) { this.cardField000 = cardField000; }

    public Boolean getCardField001() { return cardField001; }
    public void setCardField001(Boolean cardField001) { this.cardField001 = cardField001; }

    public BigDecimal getCardField002() { return cardField002; }
    public void setCardField002(BigDecimal cardField002) { this.cardField002 = cardField002; }

    public String getCardField003() { return cardField003; }
    public void setCardField003(String cardField003) { this.cardField003 = cardField003; }

    public Double getCardField004() { return cardField004; }
    public void setCardField004(Double cardField004) { this.cardField004 = cardField004; }

    public LocalDate getCardField005() { return cardField005; }
    public void setCardField005(LocalDate cardField005) { this.cardField005 = cardField005; }

    public Long getCardField006() { return cardField006; }
    public void setCardField006(Long cardField006) { this.cardField006 = cardField006; }

    public Boolean getCardField007() { return cardField007; }
    public void setCardField007(Boolean cardField007) { this.cardField007 = cardField007; }

    public String getCardField008() { return cardField008; }
    public void setCardField008(String cardField008) { this.cardField008 = cardField008; }

    @Override
    public String toString() {
        return "CardDto037{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
