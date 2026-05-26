package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto027 — Data Transfer Object for card operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto027 {

    @JsonProperty("cardField000")
    private Boolean cardField000;

    @Size(max = 100)
    @JsonProperty("cardField001")
    private String cardField001;

    @JsonProperty("cardField002")
    private LocalDate cardField002;

    @JsonProperty("cardField003")
    private Boolean cardField003;

    @JsonProperty("cardField004")
    private Integer cardField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField005")
    private BigDecimal cardField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField006")
    private BigDecimal cardField006;

    @JsonProperty("cardField007")
    private LocalDate cardField007;

    @JsonProperty("cardField008")
    private Boolean cardField008;

    @Size(max = 40)
    @JsonProperty("cardField009")
    private String cardField009;

    @JsonProperty("cardField010")
    private Double cardField010;

    public CardDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto027 instance = new CardDto027();

        public Builder cardField000(Boolean val) { instance.cardField000 = val; return this; }
        public Builder cardField001(String val) { instance.cardField001 = val; return this; }
        public Builder cardField002(LocalDate val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Boolean val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Integer val) { instance.cardField004 = val; return this; }
        public Builder cardField005(BigDecimal val) { instance.cardField005 = val; return this; }
        public Builder cardField006(BigDecimal val) { instance.cardField006 = val; return this; }
        public Builder cardField007(LocalDate val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Boolean val) { instance.cardField008 = val; return this; }
        public Builder cardField009(String val) { instance.cardField009 = val; return this; }
        public Builder cardField010(Double val) { instance.cardField010 = val; return this; }
        public CardDto027 build() { return instance; }
    }

    public Boolean getCardField000() { return cardField000; }
    public void setCardField000(Boolean cardField000) { this.cardField000 = cardField000; }

    public String getCardField001() { return cardField001; }
    public void setCardField001(String cardField001) { this.cardField001 = cardField001; }

    public LocalDate getCardField002() { return cardField002; }
    public void setCardField002(LocalDate cardField002) { this.cardField002 = cardField002; }

    public Boolean getCardField003() { return cardField003; }
    public void setCardField003(Boolean cardField003) { this.cardField003 = cardField003; }

    public Integer getCardField004() { return cardField004; }
    public void setCardField004(Integer cardField004) { this.cardField004 = cardField004; }

    public BigDecimal getCardField005() { return cardField005; }
    public void setCardField005(BigDecimal cardField005) { this.cardField005 = cardField005; }

    public BigDecimal getCardField006() { return cardField006; }
    public void setCardField006(BigDecimal cardField006) { this.cardField006 = cardField006; }

    public LocalDate getCardField007() { return cardField007; }
    public void setCardField007(LocalDate cardField007) { this.cardField007 = cardField007; }

    public Boolean getCardField008() { return cardField008; }
    public void setCardField008(Boolean cardField008) { this.cardField008 = cardField008; }

    public String getCardField009() { return cardField009; }
    public void setCardField009(String cardField009) { this.cardField009 = cardField009; }

    public Double getCardField010() { return cardField010; }
    public void setCardField010(Double cardField010) { this.cardField010 = cardField010; }

    @Override
    public String toString() {
        return "CardDto027{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
