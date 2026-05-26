package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto043 — Data Transfer Object for card operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto043 {

    @JsonProperty("cardField000")
    private Boolean cardField000;

    @JsonProperty("cardField001")
    private Integer cardField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField002")
    private BigDecimal cardField002;

    @Size(max = 20)
    @JsonProperty("cardField003")
    private String cardField003;

    @Size(max = 200)
    @JsonProperty("cardField004")
    private String cardField004;

    @JsonProperty("cardField005")
    private Double cardField005;

    @JsonProperty("cardField006")
    private Integer cardField006;

    @JsonProperty("cardField007")
    private Long cardField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField008")
    private BigDecimal cardField008;

    @JsonProperty("cardField009")
    private Integer cardField009;

    @JsonProperty("cardField010")
    private Long cardField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField011")
    private BigDecimal cardField011;

    @JsonProperty("cardField012")
    private Long cardField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField013")
    private BigDecimal cardField013;

    @JsonProperty("cardField014")
    private Integer cardField014;

    public CardDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto043 instance = new CardDto043();

        public Builder cardField000(Boolean val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Integer val) { instance.cardField001 = val; return this; }
        public Builder cardField002(BigDecimal val) { instance.cardField002 = val; return this; }
        public Builder cardField003(String val) { instance.cardField003 = val; return this; }
        public Builder cardField004(String val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Double val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Integer val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Long val) { instance.cardField007 = val; return this; }
        public Builder cardField008(BigDecimal val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Integer val) { instance.cardField009 = val; return this; }
        public Builder cardField010(Long val) { instance.cardField010 = val; return this; }
        public Builder cardField011(BigDecimal val) { instance.cardField011 = val; return this; }
        public Builder cardField012(Long val) { instance.cardField012 = val; return this; }
        public Builder cardField013(BigDecimal val) { instance.cardField013 = val; return this; }
        public Builder cardField014(Integer val) { instance.cardField014 = val; return this; }
        public CardDto043 build() { return instance; }
    }

    public Boolean getCardField000() { return cardField000; }
    public void setCardField000(Boolean cardField000) { this.cardField000 = cardField000; }

    public Integer getCardField001() { return cardField001; }
    public void setCardField001(Integer cardField001) { this.cardField001 = cardField001; }

    public BigDecimal getCardField002() { return cardField002; }
    public void setCardField002(BigDecimal cardField002) { this.cardField002 = cardField002; }

    public String getCardField003() { return cardField003; }
    public void setCardField003(String cardField003) { this.cardField003 = cardField003; }

    public String getCardField004() { return cardField004; }
    public void setCardField004(String cardField004) { this.cardField004 = cardField004; }

    public Double getCardField005() { return cardField005; }
    public void setCardField005(Double cardField005) { this.cardField005 = cardField005; }

    public Integer getCardField006() { return cardField006; }
    public void setCardField006(Integer cardField006) { this.cardField006 = cardField006; }

    public Long getCardField007() { return cardField007; }
    public void setCardField007(Long cardField007) { this.cardField007 = cardField007; }

    public BigDecimal getCardField008() { return cardField008; }
    public void setCardField008(BigDecimal cardField008) { this.cardField008 = cardField008; }

    public Integer getCardField009() { return cardField009; }
    public void setCardField009(Integer cardField009) { this.cardField009 = cardField009; }

    public Long getCardField010() { return cardField010; }
    public void setCardField010(Long cardField010) { this.cardField010 = cardField010; }

    public BigDecimal getCardField011() { return cardField011; }
    public void setCardField011(BigDecimal cardField011) { this.cardField011 = cardField011; }

    public Long getCardField012() { return cardField012; }
    public void setCardField012(Long cardField012) { this.cardField012 = cardField012; }

    public BigDecimal getCardField013() { return cardField013; }
    public void setCardField013(BigDecimal cardField013) { this.cardField013 = cardField013; }

    public Integer getCardField014() { return cardField014; }
    public void setCardField014(Integer cardField014) { this.cardField014 = cardField014; }

    @Override
    public String toString() {
        return "CardDto043{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
