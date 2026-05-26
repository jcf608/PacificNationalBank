package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto042 — Data Transfer Object for card operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto042 {

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField000")
    private BigDecimal cardField000;

    @JsonProperty("cardField001")
    private Long cardField001;

    @JsonProperty("cardField002")
    private Integer cardField002;

    @JsonProperty("cardField003")
    private Double cardField003;

    @JsonProperty("cardField004")
    private LocalDate cardField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField005")
    private BigDecimal cardField005;

    @JsonProperty("cardField006")
    private Long cardField006;

    @JsonProperty("cardField007")
    private Double cardField007;

    @JsonProperty("cardField008")
    private Double cardField008;

    @JsonProperty("cardField009")
    private Double cardField009;

    @Size(max = 100)
    @JsonProperty("cardField010")
    private String cardField010;

    @JsonProperty("cardField011")
    private LocalDate cardField011;

    @Size(max = 100)
    @JsonProperty("cardField012")
    private String cardField012;

    @JsonProperty("cardField013")
    private Long cardField013;

    public CardDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto042 instance = new CardDto042();

        public Builder cardField000(BigDecimal val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Long val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Integer val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Double val) { instance.cardField003 = val; return this; }
        public Builder cardField004(LocalDate val) { instance.cardField004 = val; return this; }
        public Builder cardField005(BigDecimal val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Long val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Double val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Double val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Double val) { instance.cardField009 = val; return this; }
        public Builder cardField010(String val) { instance.cardField010 = val; return this; }
        public Builder cardField011(LocalDate val) { instance.cardField011 = val; return this; }
        public Builder cardField012(String val) { instance.cardField012 = val; return this; }
        public Builder cardField013(Long val) { instance.cardField013 = val; return this; }
        public CardDto042 build() { return instance; }
    }

    public BigDecimal getCardField000() { return cardField000; }
    public void setCardField000(BigDecimal cardField000) { this.cardField000 = cardField000; }

    public Long getCardField001() { return cardField001; }
    public void setCardField001(Long cardField001) { this.cardField001 = cardField001; }

    public Integer getCardField002() { return cardField002; }
    public void setCardField002(Integer cardField002) { this.cardField002 = cardField002; }

    public Double getCardField003() { return cardField003; }
    public void setCardField003(Double cardField003) { this.cardField003 = cardField003; }

    public LocalDate getCardField004() { return cardField004; }
    public void setCardField004(LocalDate cardField004) { this.cardField004 = cardField004; }

    public BigDecimal getCardField005() { return cardField005; }
    public void setCardField005(BigDecimal cardField005) { this.cardField005 = cardField005; }

    public Long getCardField006() { return cardField006; }
    public void setCardField006(Long cardField006) { this.cardField006 = cardField006; }

    public Double getCardField007() { return cardField007; }
    public void setCardField007(Double cardField007) { this.cardField007 = cardField007; }

    public Double getCardField008() { return cardField008; }
    public void setCardField008(Double cardField008) { this.cardField008 = cardField008; }

    public Double getCardField009() { return cardField009; }
    public void setCardField009(Double cardField009) { this.cardField009 = cardField009; }

    public String getCardField010() { return cardField010; }
    public void setCardField010(String cardField010) { this.cardField010 = cardField010; }

    public LocalDate getCardField011() { return cardField011; }
    public void setCardField011(LocalDate cardField011) { this.cardField011 = cardField011; }

    public String getCardField012() { return cardField012; }
    public void setCardField012(String cardField012) { this.cardField012 = cardField012; }

    public Long getCardField013() { return cardField013; }
    public void setCardField013(Long cardField013) { this.cardField013 = cardField013; }

    @Override
    public String toString() {
        return "CardDto042{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
