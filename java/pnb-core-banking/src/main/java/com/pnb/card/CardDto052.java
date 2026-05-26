package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto052 — Data Transfer Object for card operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto052 {

    @JsonProperty("cardField000")
    private Integer cardField000;

    @JsonProperty("cardField001")
    private Double cardField001;

    @JsonProperty("cardField002")
    private Long cardField002;

    @JsonProperty("cardField003")
    private LocalDate cardField003;

    @JsonProperty("cardField004")
    private Double cardField004;

    @Size(max = 100)
    @JsonProperty("cardField005")
    private String cardField005;

    @JsonProperty("cardField006")
    private Double cardField006;

    @JsonProperty("cardField007")
    private LocalDate cardField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField008")
    private BigDecimal cardField008;

    @JsonProperty("cardField009")
    private Integer cardField009;

    @JsonProperty("cardField010")
    private Long cardField010;

    @JsonProperty("cardField011")
    private Double cardField011;

    public CardDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto052 instance = new CardDto052();

        public Builder cardField000(Integer val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Double val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Long val) { instance.cardField002 = val; return this; }
        public Builder cardField003(LocalDate val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Double val) { instance.cardField004 = val; return this; }
        public Builder cardField005(String val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Double val) { instance.cardField006 = val; return this; }
        public Builder cardField007(LocalDate val) { instance.cardField007 = val; return this; }
        public Builder cardField008(BigDecimal val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Integer val) { instance.cardField009 = val; return this; }
        public Builder cardField010(Long val) { instance.cardField010 = val; return this; }
        public Builder cardField011(Double val) { instance.cardField011 = val; return this; }
        public CardDto052 build() { return instance; }
    }

    public Integer getCardField000() { return cardField000; }
    public void setCardField000(Integer cardField000) { this.cardField000 = cardField000; }

    public Double getCardField001() { return cardField001; }
    public void setCardField001(Double cardField001) { this.cardField001 = cardField001; }

    public Long getCardField002() { return cardField002; }
    public void setCardField002(Long cardField002) { this.cardField002 = cardField002; }

    public LocalDate getCardField003() { return cardField003; }
    public void setCardField003(LocalDate cardField003) { this.cardField003 = cardField003; }

    public Double getCardField004() { return cardField004; }
    public void setCardField004(Double cardField004) { this.cardField004 = cardField004; }

    public String getCardField005() { return cardField005; }
    public void setCardField005(String cardField005) { this.cardField005 = cardField005; }

    public Double getCardField006() { return cardField006; }
    public void setCardField006(Double cardField006) { this.cardField006 = cardField006; }

    public LocalDate getCardField007() { return cardField007; }
    public void setCardField007(LocalDate cardField007) { this.cardField007 = cardField007; }

    public BigDecimal getCardField008() { return cardField008; }
    public void setCardField008(BigDecimal cardField008) { this.cardField008 = cardField008; }

    public Integer getCardField009() { return cardField009; }
    public void setCardField009(Integer cardField009) { this.cardField009 = cardField009; }

    public Long getCardField010() { return cardField010; }
    public void setCardField010(Long cardField010) { this.cardField010 = cardField010; }

    public Double getCardField011() { return cardField011; }
    public void setCardField011(Double cardField011) { this.cardField011 = cardField011; }

    @Override
    public String toString() {
        return "CardDto052{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
