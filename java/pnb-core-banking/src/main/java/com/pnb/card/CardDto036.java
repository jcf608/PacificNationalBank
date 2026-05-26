package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto036 — Data Transfer Object for card operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto036 {

    @Size(max = 20)
    @JsonProperty("cardField000")
    private String cardField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField001")
    private BigDecimal cardField001;

    @JsonProperty("cardField002")
    private Boolean cardField002;

    @Size(max = 200)
    @JsonProperty("cardField003")
    private String cardField003;

    @JsonProperty("cardField004")
    private Boolean cardField004;

    @JsonProperty("cardField005")
    private Integer cardField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField006")
    private BigDecimal cardField006;

    @JsonProperty("cardField007")
    private Double cardField007;

    public CardDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto036 instance = new CardDto036();

        public Builder cardField000(String val) { instance.cardField000 = val; return this; }
        public Builder cardField001(BigDecimal val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Boolean val) { instance.cardField002 = val; return this; }
        public Builder cardField003(String val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Boolean val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Integer val) { instance.cardField005 = val; return this; }
        public Builder cardField006(BigDecimal val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Double val) { instance.cardField007 = val; return this; }
        public CardDto036 build() { return instance; }
    }

    public String getCardField000() { return cardField000; }
    public void setCardField000(String cardField000) { this.cardField000 = cardField000; }

    public BigDecimal getCardField001() { return cardField001; }
    public void setCardField001(BigDecimal cardField001) { this.cardField001 = cardField001; }

    public Boolean getCardField002() { return cardField002; }
    public void setCardField002(Boolean cardField002) { this.cardField002 = cardField002; }

    public String getCardField003() { return cardField003; }
    public void setCardField003(String cardField003) { this.cardField003 = cardField003; }

    public Boolean getCardField004() { return cardField004; }
    public void setCardField004(Boolean cardField004) { this.cardField004 = cardField004; }

    public Integer getCardField005() { return cardField005; }
    public void setCardField005(Integer cardField005) { this.cardField005 = cardField005; }

    public BigDecimal getCardField006() { return cardField006; }
    public void setCardField006(BigDecimal cardField006) { this.cardField006 = cardField006; }

    public Double getCardField007() { return cardField007; }
    public void setCardField007(Double cardField007) { this.cardField007 = cardField007; }

    @Override
    public String toString() {
        return "CardDto036{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
