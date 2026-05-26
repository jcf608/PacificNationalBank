package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto034 — Data Transfer Object for card operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto034 {

    @JsonProperty("cardField000")
    private Double cardField000;

    @Size(max = 40)
    @JsonProperty("cardField001")
    private String cardField001;

    @JsonProperty("cardField002")
    private Double cardField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField003")
    private BigDecimal cardField003;

    @Size(max = 60)
    @JsonProperty("cardField004")
    private String cardField004;

    @JsonProperty("cardField005")
    private Long cardField005;

    @JsonProperty("cardField006")
    private Boolean cardField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField007")
    private BigDecimal cardField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField008")
    private BigDecimal cardField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField009")
    private BigDecimal cardField009;

    @JsonProperty("cardField010")
    private Integer cardField010;

    @JsonProperty("cardField011")
    private Double cardField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField012")
    private BigDecimal cardField012;

    @JsonProperty("cardField013")
    private LocalDate cardField013;

    @JsonProperty("cardField014")
    private LocalDate cardField014;

    @JsonProperty("cardField015")
    private Boolean cardField015;

    @JsonProperty("cardField016")
    private Integer cardField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField017")
    private BigDecimal cardField017;

    public CardDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto034 instance = new CardDto034();

        public Builder cardField000(Double val) { instance.cardField000 = val; return this; }
        public Builder cardField001(String val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Double val) { instance.cardField002 = val; return this; }
        public Builder cardField003(BigDecimal val) { instance.cardField003 = val; return this; }
        public Builder cardField004(String val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Long val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Boolean val) { instance.cardField006 = val; return this; }
        public Builder cardField007(BigDecimal val) { instance.cardField007 = val; return this; }
        public Builder cardField008(BigDecimal val) { instance.cardField008 = val; return this; }
        public Builder cardField009(BigDecimal val) { instance.cardField009 = val; return this; }
        public Builder cardField010(Integer val) { instance.cardField010 = val; return this; }
        public Builder cardField011(Double val) { instance.cardField011 = val; return this; }
        public Builder cardField012(BigDecimal val) { instance.cardField012 = val; return this; }
        public Builder cardField013(LocalDate val) { instance.cardField013 = val; return this; }
        public Builder cardField014(LocalDate val) { instance.cardField014 = val; return this; }
        public Builder cardField015(Boolean val) { instance.cardField015 = val; return this; }
        public Builder cardField016(Integer val) { instance.cardField016 = val; return this; }
        public Builder cardField017(BigDecimal val) { instance.cardField017 = val; return this; }
        public CardDto034 build() { return instance; }
    }

    public Double getCardField000() { return cardField000; }
    public void setCardField000(Double cardField000) { this.cardField000 = cardField000; }

    public String getCardField001() { return cardField001; }
    public void setCardField001(String cardField001) { this.cardField001 = cardField001; }

    public Double getCardField002() { return cardField002; }
    public void setCardField002(Double cardField002) { this.cardField002 = cardField002; }

    public BigDecimal getCardField003() { return cardField003; }
    public void setCardField003(BigDecimal cardField003) { this.cardField003 = cardField003; }

    public String getCardField004() { return cardField004; }
    public void setCardField004(String cardField004) { this.cardField004 = cardField004; }

    public Long getCardField005() { return cardField005; }
    public void setCardField005(Long cardField005) { this.cardField005 = cardField005; }

    public Boolean getCardField006() { return cardField006; }
    public void setCardField006(Boolean cardField006) { this.cardField006 = cardField006; }

    public BigDecimal getCardField007() { return cardField007; }
    public void setCardField007(BigDecimal cardField007) { this.cardField007 = cardField007; }

    public BigDecimal getCardField008() { return cardField008; }
    public void setCardField008(BigDecimal cardField008) { this.cardField008 = cardField008; }

    public BigDecimal getCardField009() { return cardField009; }
    public void setCardField009(BigDecimal cardField009) { this.cardField009 = cardField009; }

    public Integer getCardField010() { return cardField010; }
    public void setCardField010(Integer cardField010) { this.cardField010 = cardField010; }

    public Double getCardField011() { return cardField011; }
    public void setCardField011(Double cardField011) { this.cardField011 = cardField011; }

    public BigDecimal getCardField012() { return cardField012; }
    public void setCardField012(BigDecimal cardField012) { this.cardField012 = cardField012; }

    public LocalDate getCardField013() { return cardField013; }
    public void setCardField013(LocalDate cardField013) { this.cardField013 = cardField013; }

    public LocalDate getCardField014() { return cardField014; }
    public void setCardField014(LocalDate cardField014) { this.cardField014 = cardField014; }

    public Boolean getCardField015() { return cardField015; }
    public void setCardField015(Boolean cardField015) { this.cardField015 = cardField015; }

    public Integer getCardField016() { return cardField016; }
    public void setCardField016(Integer cardField016) { this.cardField016 = cardField016; }

    public BigDecimal getCardField017() { return cardField017; }
    public void setCardField017(BigDecimal cardField017) { this.cardField017 = cardField017; }

    @Override
    public String toString() {
        return "CardDto034{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
