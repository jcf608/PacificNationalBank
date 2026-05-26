package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto059 — Data Transfer Object for card operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto059 {

    @Size(max = 40)
    @JsonProperty("cardField000")
    private String cardField000;

    @JsonProperty("cardField001")
    private Double cardField001;

    @JsonProperty("cardField002")
    private Integer cardField002;

    @JsonProperty("cardField003")
    private LocalDate cardField003;

    @JsonProperty("cardField004")
    private Long cardField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField005")
    private BigDecimal cardField005;

    @JsonProperty("cardField006")
    private Double cardField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField007")
    private BigDecimal cardField007;

    @JsonProperty("cardField008")
    private Boolean cardField008;

    @JsonProperty("cardField009")
    private LocalDate cardField009;

    @JsonProperty("cardField010")
    private Boolean cardField010;

    @JsonProperty("cardField011")
    private LocalDate cardField011;

    @Size(max = 100)
    @JsonProperty("cardField012")
    private String cardField012;

    @JsonProperty("cardField013")
    private Double cardField013;

    @JsonProperty("cardField014")
    private LocalDate cardField014;

    @JsonProperty("cardField015")
    private LocalDate cardField015;

    @JsonProperty("cardField016")
    private Integer cardField016;

    @Size(max = 60)
    @JsonProperty("cardField017")
    private String cardField017;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField018")
    private BigDecimal cardField018;

    public CardDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto059 instance = new CardDto059();

        public Builder cardField000(String val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Double val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Integer val) { instance.cardField002 = val; return this; }
        public Builder cardField003(LocalDate val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Long val) { instance.cardField004 = val; return this; }
        public Builder cardField005(BigDecimal val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Double val) { instance.cardField006 = val; return this; }
        public Builder cardField007(BigDecimal val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Boolean val) { instance.cardField008 = val; return this; }
        public Builder cardField009(LocalDate val) { instance.cardField009 = val; return this; }
        public Builder cardField010(Boolean val) { instance.cardField010 = val; return this; }
        public Builder cardField011(LocalDate val) { instance.cardField011 = val; return this; }
        public Builder cardField012(String val) { instance.cardField012 = val; return this; }
        public Builder cardField013(Double val) { instance.cardField013 = val; return this; }
        public Builder cardField014(LocalDate val) { instance.cardField014 = val; return this; }
        public Builder cardField015(LocalDate val) { instance.cardField015 = val; return this; }
        public Builder cardField016(Integer val) { instance.cardField016 = val; return this; }
        public Builder cardField017(String val) { instance.cardField017 = val; return this; }
        public Builder cardField018(BigDecimal val) { instance.cardField018 = val; return this; }
        public CardDto059 build() { return instance; }
    }

    public String getCardField000() { return cardField000; }
    public void setCardField000(String cardField000) { this.cardField000 = cardField000; }

    public Double getCardField001() { return cardField001; }
    public void setCardField001(Double cardField001) { this.cardField001 = cardField001; }

    public Integer getCardField002() { return cardField002; }
    public void setCardField002(Integer cardField002) { this.cardField002 = cardField002; }

    public LocalDate getCardField003() { return cardField003; }
    public void setCardField003(LocalDate cardField003) { this.cardField003 = cardField003; }

    public Long getCardField004() { return cardField004; }
    public void setCardField004(Long cardField004) { this.cardField004 = cardField004; }

    public BigDecimal getCardField005() { return cardField005; }
    public void setCardField005(BigDecimal cardField005) { this.cardField005 = cardField005; }

    public Double getCardField006() { return cardField006; }
    public void setCardField006(Double cardField006) { this.cardField006 = cardField006; }

    public BigDecimal getCardField007() { return cardField007; }
    public void setCardField007(BigDecimal cardField007) { this.cardField007 = cardField007; }

    public Boolean getCardField008() { return cardField008; }
    public void setCardField008(Boolean cardField008) { this.cardField008 = cardField008; }

    public LocalDate getCardField009() { return cardField009; }
    public void setCardField009(LocalDate cardField009) { this.cardField009 = cardField009; }

    public Boolean getCardField010() { return cardField010; }
    public void setCardField010(Boolean cardField010) { this.cardField010 = cardField010; }

    public LocalDate getCardField011() { return cardField011; }
    public void setCardField011(LocalDate cardField011) { this.cardField011 = cardField011; }

    public String getCardField012() { return cardField012; }
    public void setCardField012(String cardField012) { this.cardField012 = cardField012; }

    public Double getCardField013() { return cardField013; }
    public void setCardField013(Double cardField013) { this.cardField013 = cardField013; }

    public LocalDate getCardField014() { return cardField014; }
    public void setCardField014(LocalDate cardField014) { this.cardField014 = cardField014; }

    public LocalDate getCardField015() { return cardField015; }
    public void setCardField015(LocalDate cardField015) { this.cardField015 = cardField015; }

    public Integer getCardField016() { return cardField016; }
    public void setCardField016(Integer cardField016) { this.cardField016 = cardField016; }

    public String getCardField017() { return cardField017; }
    public void setCardField017(String cardField017) { this.cardField017 = cardField017; }

    public BigDecimal getCardField018() { return cardField018; }
    public void setCardField018(BigDecimal cardField018) { this.cardField018 = cardField018; }

    @Override
    public String toString() {
        return "CardDto059{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
