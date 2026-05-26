package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto050 — Data Transfer Object for card operations.
 * Variant 50 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto050 {

    @JsonProperty("cardField000")
    private Boolean cardField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField001")
    private BigDecimal cardField001;

    @JsonProperty("cardField002")
    private Integer cardField002;

    @JsonProperty("cardField003")
    private Boolean cardField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField004")
    private BigDecimal cardField004;

    @JsonProperty("cardField005")
    private Double cardField005;

    @JsonProperty("cardField006")
    private Long cardField006;

    @JsonProperty("cardField007")
    private Integer cardField007;

    @JsonProperty("cardField008")
    private Double cardField008;

    @JsonProperty("cardField009")
    private Integer cardField009;

    public CardDto050() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto050 instance = new CardDto050();

        public Builder cardField000(Boolean val) { instance.cardField000 = val; return this; }
        public Builder cardField001(BigDecimal val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Integer val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Boolean val) { instance.cardField003 = val; return this; }
        public Builder cardField004(BigDecimal val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Double val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Long val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Integer val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Double val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Integer val) { instance.cardField009 = val; return this; }
        public CardDto050 build() { return instance; }
    }

    public Boolean getCardField000() { return cardField000; }
    public void setCardField000(Boolean cardField000) { this.cardField000 = cardField000; }

    public BigDecimal getCardField001() { return cardField001; }
    public void setCardField001(BigDecimal cardField001) { this.cardField001 = cardField001; }

    public Integer getCardField002() { return cardField002; }
    public void setCardField002(Integer cardField002) { this.cardField002 = cardField002; }

    public Boolean getCardField003() { return cardField003; }
    public void setCardField003(Boolean cardField003) { this.cardField003 = cardField003; }

    public BigDecimal getCardField004() { return cardField004; }
    public void setCardField004(BigDecimal cardField004) { this.cardField004 = cardField004; }

    public Double getCardField005() { return cardField005; }
    public void setCardField005(Double cardField005) { this.cardField005 = cardField005; }

    public Long getCardField006() { return cardField006; }
    public void setCardField006(Long cardField006) { this.cardField006 = cardField006; }

    public Integer getCardField007() { return cardField007; }
    public void setCardField007(Integer cardField007) { this.cardField007 = cardField007; }

    public Double getCardField008() { return cardField008; }
    public void setCardField008(Double cardField008) { this.cardField008 = cardField008; }

    public Integer getCardField009() { return cardField009; }
    public void setCardField009(Integer cardField009) { this.cardField009 = cardField009; }

    @Override
    public String toString() {
        return "CardDto050{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
