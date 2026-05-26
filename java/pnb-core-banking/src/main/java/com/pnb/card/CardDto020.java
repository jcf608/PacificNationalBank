package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto020 — Data Transfer Object for card operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto020 {

    @Size(max = 200)
    @JsonProperty("cardField000")
    private String cardField000;

    @JsonProperty("cardField001")
    private Boolean cardField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField002")
    private BigDecimal cardField002;

    @JsonProperty("cardField003")
    private Integer cardField003;

    @JsonProperty("cardField004")
    private Long cardField004;

    @JsonProperty("cardField005")
    private Double cardField005;

    @JsonProperty("cardField006")
    private Integer cardField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField007")
    private BigDecimal cardField007;

    @Size(max = 40)
    @JsonProperty("cardField008")
    private String cardField008;

    @JsonProperty("cardField009")
    private LocalDate cardField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField010")
    private BigDecimal cardField010;

    @JsonProperty("cardField011")
    private Boolean cardField011;

    @JsonProperty("cardField012")
    private Boolean cardField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField013")
    private BigDecimal cardField013;

    @JsonProperty("cardField014")
    private Integer cardField014;

    @JsonProperty("cardField015")
    private LocalDate cardField015;

    public CardDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto020 instance = new CardDto020();

        public Builder cardField000(String val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Boolean val) { instance.cardField001 = val; return this; }
        public Builder cardField002(BigDecimal val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Integer val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Long val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Double val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Integer val) { instance.cardField006 = val; return this; }
        public Builder cardField007(BigDecimal val) { instance.cardField007 = val; return this; }
        public Builder cardField008(String val) { instance.cardField008 = val; return this; }
        public Builder cardField009(LocalDate val) { instance.cardField009 = val; return this; }
        public Builder cardField010(BigDecimal val) { instance.cardField010 = val; return this; }
        public Builder cardField011(Boolean val) { instance.cardField011 = val; return this; }
        public Builder cardField012(Boolean val) { instance.cardField012 = val; return this; }
        public Builder cardField013(BigDecimal val) { instance.cardField013 = val; return this; }
        public Builder cardField014(Integer val) { instance.cardField014 = val; return this; }
        public Builder cardField015(LocalDate val) { instance.cardField015 = val; return this; }
        public CardDto020 build() { return instance; }
    }

    public String getCardField000() { return cardField000; }
    public void setCardField000(String cardField000) { this.cardField000 = cardField000; }

    public Boolean getCardField001() { return cardField001; }
    public void setCardField001(Boolean cardField001) { this.cardField001 = cardField001; }

    public BigDecimal getCardField002() { return cardField002; }
    public void setCardField002(BigDecimal cardField002) { this.cardField002 = cardField002; }

    public Integer getCardField003() { return cardField003; }
    public void setCardField003(Integer cardField003) { this.cardField003 = cardField003; }

    public Long getCardField004() { return cardField004; }
    public void setCardField004(Long cardField004) { this.cardField004 = cardField004; }

    public Double getCardField005() { return cardField005; }
    public void setCardField005(Double cardField005) { this.cardField005 = cardField005; }

    public Integer getCardField006() { return cardField006; }
    public void setCardField006(Integer cardField006) { this.cardField006 = cardField006; }

    public BigDecimal getCardField007() { return cardField007; }
    public void setCardField007(BigDecimal cardField007) { this.cardField007 = cardField007; }

    public String getCardField008() { return cardField008; }
    public void setCardField008(String cardField008) { this.cardField008 = cardField008; }

    public LocalDate getCardField009() { return cardField009; }
    public void setCardField009(LocalDate cardField009) { this.cardField009 = cardField009; }

    public BigDecimal getCardField010() { return cardField010; }
    public void setCardField010(BigDecimal cardField010) { this.cardField010 = cardField010; }

    public Boolean getCardField011() { return cardField011; }
    public void setCardField011(Boolean cardField011) { this.cardField011 = cardField011; }

    public Boolean getCardField012() { return cardField012; }
    public void setCardField012(Boolean cardField012) { this.cardField012 = cardField012; }

    public BigDecimal getCardField013() { return cardField013; }
    public void setCardField013(BigDecimal cardField013) { this.cardField013 = cardField013; }

    public Integer getCardField014() { return cardField014; }
    public void setCardField014(Integer cardField014) { this.cardField014 = cardField014; }

    public LocalDate getCardField015() { return cardField015; }
    public void setCardField015(LocalDate cardField015) { this.cardField015 = cardField015; }

    @Override
    public String toString() {
        return "CardDto020{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
