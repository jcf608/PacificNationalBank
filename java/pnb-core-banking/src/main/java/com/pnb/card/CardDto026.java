package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto026 — Data Transfer Object for card operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto026 {

    @JsonProperty("cardField000")
    private Double cardField000;

    @Size(max = 60)
    @JsonProperty("cardField001")
    private String cardField001;

    @JsonProperty("cardField002")
    private Long cardField002;

    @Size(max = 200)
    @JsonProperty("cardField003")
    private String cardField003;

    @JsonProperty("cardField004")
    private Integer cardField004;

    @JsonProperty("cardField005")
    private Integer cardField005;

    @Size(max = 200)
    @JsonProperty("cardField006")
    private String cardField006;

    @JsonProperty("cardField007")
    private LocalDate cardField007;

    @JsonProperty("cardField008")
    private Long cardField008;

    @JsonProperty("cardField009")
    private Double cardField009;

    public CardDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto026 instance = new CardDto026();

        public Builder cardField000(Double val) { instance.cardField000 = val; return this; }
        public Builder cardField001(String val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Long val) { instance.cardField002 = val; return this; }
        public Builder cardField003(String val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Integer val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Integer val) { instance.cardField005 = val; return this; }
        public Builder cardField006(String val) { instance.cardField006 = val; return this; }
        public Builder cardField007(LocalDate val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Long val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Double val) { instance.cardField009 = val; return this; }
        public CardDto026 build() { return instance; }
    }

    public Double getCardField000() { return cardField000; }
    public void setCardField000(Double cardField000) { this.cardField000 = cardField000; }

    public String getCardField001() { return cardField001; }
    public void setCardField001(String cardField001) { this.cardField001 = cardField001; }

    public Long getCardField002() { return cardField002; }
    public void setCardField002(Long cardField002) { this.cardField002 = cardField002; }

    public String getCardField003() { return cardField003; }
    public void setCardField003(String cardField003) { this.cardField003 = cardField003; }

    public Integer getCardField004() { return cardField004; }
    public void setCardField004(Integer cardField004) { this.cardField004 = cardField004; }

    public Integer getCardField005() { return cardField005; }
    public void setCardField005(Integer cardField005) { this.cardField005 = cardField005; }

    public String getCardField006() { return cardField006; }
    public void setCardField006(String cardField006) { this.cardField006 = cardField006; }

    public LocalDate getCardField007() { return cardField007; }
    public void setCardField007(LocalDate cardField007) { this.cardField007 = cardField007; }

    public Long getCardField008() { return cardField008; }
    public void setCardField008(Long cardField008) { this.cardField008 = cardField008; }

    public Double getCardField009() { return cardField009; }
    public void setCardField009(Double cardField009) { this.cardField009 = cardField009; }

    @Override
    public String toString() {
        return "CardDto026{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
