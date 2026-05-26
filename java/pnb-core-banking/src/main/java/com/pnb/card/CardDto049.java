package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto049 — Data Transfer Object for card operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto049 {

    @Size(max = 40)
    @JsonProperty("cardField000")
    private String cardField000;

    @JsonProperty("cardField001")
    private Long cardField001;

    @JsonProperty("cardField002")
    private Integer cardField002;

    @JsonProperty("cardField003")
    private Double cardField003;

    @JsonProperty("cardField004")
    private LocalDate cardField004;

    @JsonProperty("cardField005")
    private Double cardField005;

    @JsonProperty("cardField006")
    private Long cardField006;

    @JsonProperty("cardField007")
    private Integer cardField007;

    @JsonProperty("cardField008")
    private Integer cardField008;

    public CardDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto049 instance = new CardDto049();

        public Builder cardField000(String val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Long val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Integer val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Double val) { instance.cardField003 = val; return this; }
        public Builder cardField004(LocalDate val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Double val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Long val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Integer val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Integer val) { instance.cardField008 = val; return this; }
        public CardDto049 build() { return instance; }
    }

    public String getCardField000() { return cardField000; }
    public void setCardField000(String cardField000) { this.cardField000 = cardField000; }

    public Long getCardField001() { return cardField001; }
    public void setCardField001(Long cardField001) { this.cardField001 = cardField001; }

    public Integer getCardField002() { return cardField002; }
    public void setCardField002(Integer cardField002) { this.cardField002 = cardField002; }

    public Double getCardField003() { return cardField003; }
    public void setCardField003(Double cardField003) { this.cardField003 = cardField003; }

    public LocalDate getCardField004() { return cardField004; }
    public void setCardField004(LocalDate cardField004) { this.cardField004 = cardField004; }

    public Double getCardField005() { return cardField005; }
    public void setCardField005(Double cardField005) { this.cardField005 = cardField005; }

    public Long getCardField006() { return cardField006; }
    public void setCardField006(Long cardField006) { this.cardField006 = cardField006; }

    public Integer getCardField007() { return cardField007; }
    public void setCardField007(Integer cardField007) { this.cardField007 = cardField007; }

    public Integer getCardField008() { return cardField008; }
    public void setCardField008(Integer cardField008) { this.cardField008 = cardField008; }

    @Override
    public String toString() {
        return "CardDto049{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
