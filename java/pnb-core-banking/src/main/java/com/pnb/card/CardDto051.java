package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto051 — Data Transfer Object for card operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto051 {

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField000")
    private BigDecimal cardField000;

    @JsonProperty("cardField001")
    private Double cardField001;

    @JsonProperty("cardField002")
    private LocalDate cardField002;

    @JsonProperty("cardField003")
    private LocalDate cardField003;

    @Size(max = 100)
    @JsonProperty("cardField004")
    private String cardField004;

    @Size(max = 60)
    @JsonProperty("cardField005")
    private String cardField005;

    @JsonProperty("cardField006")
    private Integer cardField006;

    @JsonProperty("cardField007")
    private Long cardField007;

    @JsonProperty("cardField008")
    private Boolean cardField008;

    @JsonProperty("cardField009")
    private Double cardField009;

    @JsonProperty("cardField010")
    private Double cardField010;

    public CardDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto051 instance = new CardDto051();

        public Builder cardField000(BigDecimal val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Double val) { instance.cardField001 = val; return this; }
        public Builder cardField002(LocalDate val) { instance.cardField002 = val; return this; }
        public Builder cardField003(LocalDate val) { instance.cardField003 = val; return this; }
        public Builder cardField004(String val) { instance.cardField004 = val; return this; }
        public Builder cardField005(String val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Integer val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Long val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Boolean val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Double val) { instance.cardField009 = val; return this; }
        public Builder cardField010(Double val) { instance.cardField010 = val; return this; }
        public CardDto051 build() { return instance; }
    }

    public BigDecimal getCardField000() { return cardField000; }
    public void setCardField000(BigDecimal cardField000) { this.cardField000 = cardField000; }

    public Double getCardField001() { return cardField001; }
    public void setCardField001(Double cardField001) { this.cardField001 = cardField001; }

    public LocalDate getCardField002() { return cardField002; }
    public void setCardField002(LocalDate cardField002) { this.cardField002 = cardField002; }

    public LocalDate getCardField003() { return cardField003; }
    public void setCardField003(LocalDate cardField003) { this.cardField003 = cardField003; }

    public String getCardField004() { return cardField004; }
    public void setCardField004(String cardField004) { this.cardField004 = cardField004; }

    public String getCardField005() { return cardField005; }
    public void setCardField005(String cardField005) { this.cardField005 = cardField005; }

    public Integer getCardField006() { return cardField006; }
    public void setCardField006(Integer cardField006) { this.cardField006 = cardField006; }

    public Long getCardField007() { return cardField007; }
    public void setCardField007(Long cardField007) { this.cardField007 = cardField007; }

    public Boolean getCardField008() { return cardField008; }
    public void setCardField008(Boolean cardField008) { this.cardField008 = cardField008; }

    public Double getCardField009() { return cardField009; }
    public void setCardField009(Double cardField009) { this.cardField009 = cardField009; }

    public Double getCardField010() { return cardField010; }
    public void setCardField010(Double cardField010) { this.cardField010 = cardField010; }

    @Override
    public String toString() {
        return "CardDto051{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
