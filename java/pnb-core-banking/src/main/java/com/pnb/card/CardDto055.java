package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto055 — Data Transfer Object for card operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto055 {

    @JsonProperty("cardField000")
    private Double cardField000;

    @Size(max = 20)
    @JsonProperty("cardField001")
    private String cardField001;

    @JsonProperty("cardField002")
    private Integer cardField002;

    @JsonProperty("cardField003")
    private Double cardField003;

    @JsonProperty("cardField004")
    private Long cardField004;

    @JsonProperty("cardField005")
    private Integer cardField005;

    @JsonProperty("cardField006")
    private Double cardField006;

    @JsonProperty("cardField007")
    private Boolean cardField007;

    @JsonProperty("cardField008")
    private Long cardField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField009")
    private BigDecimal cardField009;

    @JsonProperty("cardField010")
    private Integer cardField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField011")
    private BigDecimal cardField011;

    @JsonProperty("cardField012")
    private Integer cardField012;

    @JsonProperty("cardField013")
    private Boolean cardField013;

    @JsonProperty("cardField014")
    private Double cardField014;

    public CardDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto055 instance = new CardDto055();

        public Builder cardField000(Double val) { instance.cardField000 = val; return this; }
        public Builder cardField001(String val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Integer val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Double val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Long val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Integer val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Double val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Boolean val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Long val) { instance.cardField008 = val; return this; }
        public Builder cardField009(BigDecimal val) { instance.cardField009 = val; return this; }
        public Builder cardField010(Integer val) { instance.cardField010 = val; return this; }
        public Builder cardField011(BigDecimal val) { instance.cardField011 = val; return this; }
        public Builder cardField012(Integer val) { instance.cardField012 = val; return this; }
        public Builder cardField013(Boolean val) { instance.cardField013 = val; return this; }
        public Builder cardField014(Double val) { instance.cardField014 = val; return this; }
        public CardDto055 build() { return instance; }
    }

    public Double getCardField000() { return cardField000; }
    public void setCardField000(Double cardField000) { this.cardField000 = cardField000; }

    public String getCardField001() { return cardField001; }
    public void setCardField001(String cardField001) { this.cardField001 = cardField001; }

    public Integer getCardField002() { return cardField002; }
    public void setCardField002(Integer cardField002) { this.cardField002 = cardField002; }

    public Double getCardField003() { return cardField003; }
    public void setCardField003(Double cardField003) { this.cardField003 = cardField003; }

    public Long getCardField004() { return cardField004; }
    public void setCardField004(Long cardField004) { this.cardField004 = cardField004; }

    public Integer getCardField005() { return cardField005; }
    public void setCardField005(Integer cardField005) { this.cardField005 = cardField005; }

    public Double getCardField006() { return cardField006; }
    public void setCardField006(Double cardField006) { this.cardField006 = cardField006; }

    public Boolean getCardField007() { return cardField007; }
    public void setCardField007(Boolean cardField007) { this.cardField007 = cardField007; }

    public Long getCardField008() { return cardField008; }
    public void setCardField008(Long cardField008) { this.cardField008 = cardField008; }

    public BigDecimal getCardField009() { return cardField009; }
    public void setCardField009(BigDecimal cardField009) { this.cardField009 = cardField009; }

    public Integer getCardField010() { return cardField010; }
    public void setCardField010(Integer cardField010) { this.cardField010 = cardField010; }

    public BigDecimal getCardField011() { return cardField011; }
    public void setCardField011(BigDecimal cardField011) { this.cardField011 = cardField011; }

    public Integer getCardField012() { return cardField012; }
    public void setCardField012(Integer cardField012) { this.cardField012 = cardField012; }

    public Boolean getCardField013() { return cardField013; }
    public void setCardField013(Boolean cardField013) { this.cardField013 = cardField013; }

    public Double getCardField014() { return cardField014; }
    public void setCardField014(Double cardField014) { this.cardField014 = cardField014; }

    @Override
    public String toString() {
        return "CardDto055{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
