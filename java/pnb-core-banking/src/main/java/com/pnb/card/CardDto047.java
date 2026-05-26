package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto047 — Data Transfer Object for card operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto047 {

    @JsonProperty("cardField000")
    private Long cardField000;

    @JsonProperty("cardField001")
    private Integer cardField001;

    @JsonProperty("cardField002")
    private Double cardField002;

    @JsonProperty("cardField003")
    private LocalDate cardField003;

    @JsonProperty("cardField004")
    private Boolean cardField004;

    @JsonProperty("cardField005")
    private Boolean cardField005;

    @JsonProperty("cardField006")
    private Double cardField006;

    @JsonProperty("cardField007")
    private LocalDate cardField007;

    @JsonProperty("cardField008")
    private Boolean cardField008;

    @JsonProperty("cardField009")
    private Long cardField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField010")
    private BigDecimal cardField010;

    @JsonProperty("cardField011")
    private Double cardField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField012")
    private BigDecimal cardField012;

    @JsonProperty("cardField013")
    private Long cardField013;

    @JsonProperty("cardField014")
    private Boolean cardField014;

    @JsonProperty("cardField015")
    private Boolean cardField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField016")
    private BigDecimal cardField016;

    @JsonProperty("cardField017")
    private Long cardField017;

    @JsonProperty("cardField018")
    private LocalDate cardField018;

    public CardDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto047 instance = new CardDto047();

        public Builder cardField000(Long val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Integer val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Double val) { instance.cardField002 = val; return this; }
        public Builder cardField003(LocalDate val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Boolean val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Boolean val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Double val) { instance.cardField006 = val; return this; }
        public Builder cardField007(LocalDate val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Boolean val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Long val) { instance.cardField009 = val; return this; }
        public Builder cardField010(BigDecimal val) { instance.cardField010 = val; return this; }
        public Builder cardField011(Double val) { instance.cardField011 = val; return this; }
        public Builder cardField012(BigDecimal val) { instance.cardField012 = val; return this; }
        public Builder cardField013(Long val) { instance.cardField013 = val; return this; }
        public Builder cardField014(Boolean val) { instance.cardField014 = val; return this; }
        public Builder cardField015(Boolean val) { instance.cardField015 = val; return this; }
        public Builder cardField016(BigDecimal val) { instance.cardField016 = val; return this; }
        public Builder cardField017(Long val) { instance.cardField017 = val; return this; }
        public Builder cardField018(LocalDate val) { instance.cardField018 = val; return this; }
        public CardDto047 build() { return instance; }
    }

    public Long getCardField000() { return cardField000; }
    public void setCardField000(Long cardField000) { this.cardField000 = cardField000; }

    public Integer getCardField001() { return cardField001; }
    public void setCardField001(Integer cardField001) { this.cardField001 = cardField001; }

    public Double getCardField002() { return cardField002; }
    public void setCardField002(Double cardField002) { this.cardField002 = cardField002; }

    public LocalDate getCardField003() { return cardField003; }
    public void setCardField003(LocalDate cardField003) { this.cardField003 = cardField003; }

    public Boolean getCardField004() { return cardField004; }
    public void setCardField004(Boolean cardField004) { this.cardField004 = cardField004; }

    public Boolean getCardField005() { return cardField005; }
    public void setCardField005(Boolean cardField005) { this.cardField005 = cardField005; }

    public Double getCardField006() { return cardField006; }
    public void setCardField006(Double cardField006) { this.cardField006 = cardField006; }

    public LocalDate getCardField007() { return cardField007; }
    public void setCardField007(LocalDate cardField007) { this.cardField007 = cardField007; }

    public Boolean getCardField008() { return cardField008; }
    public void setCardField008(Boolean cardField008) { this.cardField008 = cardField008; }

    public Long getCardField009() { return cardField009; }
    public void setCardField009(Long cardField009) { this.cardField009 = cardField009; }

    public BigDecimal getCardField010() { return cardField010; }
    public void setCardField010(BigDecimal cardField010) { this.cardField010 = cardField010; }

    public Double getCardField011() { return cardField011; }
    public void setCardField011(Double cardField011) { this.cardField011 = cardField011; }

    public BigDecimal getCardField012() { return cardField012; }
    public void setCardField012(BigDecimal cardField012) { this.cardField012 = cardField012; }

    public Long getCardField013() { return cardField013; }
    public void setCardField013(Long cardField013) { this.cardField013 = cardField013; }

    public Boolean getCardField014() { return cardField014; }
    public void setCardField014(Boolean cardField014) { this.cardField014 = cardField014; }

    public Boolean getCardField015() { return cardField015; }
    public void setCardField015(Boolean cardField015) { this.cardField015 = cardField015; }

    public BigDecimal getCardField016() { return cardField016; }
    public void setCardField016(BigDecimal cardField016) { this.cardField016 = cardField016; }

    public Long getCardField017() { return cardField017; }
    public void setCardField017(Long cardField017) { this.cardField017 = cardField017; }

    public LocalDate getCardField018() { return cardField018; }
    public void setCardField018(LocalDate cardField018) { this.cardField018 = cardField018; }

    @Override
    public String toString() {
        return "CardDto047{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
