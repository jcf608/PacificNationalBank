package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto039 — Data Transfer Object for card operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto039 {

    @JsonProperty("cardField000")
    private LocalDate cardField000;

    @JsonProperty("cardField001")
    private LocalDate cardField001;

    @JsonProperty("cardField002")
    private Boolean cardField002;

    @JsonProperty("cardField003")
    private Integer cardField003;

    @JsonProperty("cardField004")
    private Integer cardField004;

    @JsonProperty("cardField005")
    private Double cardField005;

    @JsonProperty("cardField006")
    private Boolean cardField006;

    @JsonProperty("cardField007")
    private LocalDate cardField007;

    @JsonProperty("cardField008")
    private Boolean cardField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField009")
    private BigDecimal cardField009;

    @JsonProperty("cardField010")
    private Integer cardField010;

    public CardDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto039 instance = new CardDto039();

        public Builder cardField000(LocalDate val) { instance.cardField000 = val; return this; }
        public Builder cardField001(LocalDate val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Boolean val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Integer val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Integer val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Double val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Boolean val) { instance.cardField006 = val; return this; }
        public Builder cardField007(LocalDate val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Boolean val) { instance.cardField008 = val; return this; }
        public Builder cardField009(BigDecimal val) { instance.cardField009 = val; return this; }
        public Builder cardField010(Integer val) { instance.cardField010 = val; return this; }
        public CardDto039 build() { return instance; }
    }

    public LocalDate getCardField000() { return cardField000; }
    public void setCardField000(LocalDate cardField000) { this.cardField000 = cardField000; }

    public LocalDate getCardField001() { return cardField001; }
    public void setCardField001(LocalDate cardField001) { this.cardField001 = cardField001; }

    public Boolean getCardField002() { return cardField002; }
    public void setCardField002(Boolean cardField002) { this.cardField002 = cardField002; }

    public Integer getCardField003() { return cardField003; }
    public void setCardField003(Integer cardField003) { this.cardField003 = cardField003; }

    public Integer getCardField004() { return cardField004; }
    public void setCardField004(Integer cardField004) { this.cardField004 = cardField004; }

    public Double getCardField005() { return cardField005; }
    public void setCardField005(Double cardField005) { this.cardField005 = cardField005; }

    public Boolean getCardField006() { return cardField006; }
    public void setCardField006(Boolean cardField006) { this.cardField006 = cardField006; }

    public LocalDate getCardField007() { return cardField007; }
    public void setCardField007(LocalDate cardField007) { this.cardField007 = cardField007; }

    public Boolean getCardField008() { return cardField008; }
    public void setCardField008(Boolean cardField008) { this.cardField008 = cardField008; }

    public BigDecimal getCardField009() { return cardField009; }
    public void setCardField009(BigDecimal cardField009) { this.cardField009 = cardField009; }

    public Integer getCardField010() { return cardField010; }
    public void setCardField010(Integer cardField010) { this.cardField010 = cardField010; }

    @Override
    public String toString() {
        return "CardDto039{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
