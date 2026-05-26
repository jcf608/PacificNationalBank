package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto058 — Data Transfer Object for card operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto058 {

    @JsonProperty("cardField000")
    private Integer cardField000;

    @JsonProperty("cardField001")
    private Double cardField001;

    @JsonProperty("cardField002")
    private Integer cardField002;

    @Size(max = 100)
    @JsonProperty("cardField003")
    private String cardField003;

    @Size(max = 60)
    @JsonProperty("cardField004")
    private String cardField004;

    @JsonProperty("cardField005")
    private Integer cardField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField006")
    private BigDecimal cardField006;

    @JsonProperty("cardField007")
    private Double cardField007;

    @JsonProperty("cardField008")
    private Double cardField008;

    @JsonProperty("cardField009")
    private Long cardField009;

    @JsonProperty("cardField010")
    private Integer cardField010;

    @JsonProperty("cardField011")
    private LocalDate cardField011;

    @JsonProperty("cardField012")
    private Integer cardField012;

    @JsonProperty("cardField013")
    private Double cardField013;

    @Size(max = 40)
    @JsonProperty("cardField014")
    private String cardField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField015")
    private BigDecimal cardField015;

    @JsonProperty("cardField016")
    private LocalDate cardField016;

    @Size(max = 100)
    @JsonProperty("cardField017")
    private String cardField017;

    public CardDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto058 instance = new CardDto058();

        public Builder cardField000(Integer val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Double val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Integer val) { instance.cardField002 = val; return this; }
        public Builder cardField003(String val) { instance.cardField003 = val; return this; }
        public Builder cardField004(String val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Integer val) { instance.cardField005 = val; return this; }
        public Builder cardField006(BigDecimal val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Double val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Double val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Long val) { instance.cardField009 = val; return this; }
        public Builder cardField010(Integer val) { instance.cardField010 = val; return this; }
        public Builder cardField011(LocalDate val) { instance.cardField011 = val; return this; }
        public Builder cardField012(Integer val) { instance.cardField012 = val; return this; }
        public Builder cardField013(Double val) { instance.cardField013 = val; return this; }
        public Builder cardField014(String val) { instance.cardField014 = val; return this; }
        public Builder cardField015(BigDecimal val) { instance.cardField015 = val; return this; }
        public Builder cardField016(LocalDate val) { instance.cardField016 = val; return this; }
        public Builder cardField017(String val) { instance.cardField017 = val; return this; }
        public CardDto058 build() { return instance; }
    }

    public Integer getCardField000() { return cardField000; }
    public void setCardField000(Integer cardField000) { this.cardField000 = cardField000; }

    public Double getCardField001() { return cardField001; }
    public void setCardField001(Double cardField001) { this.cardField001 = cardField001; }

    public Integer getCardField002() { return cardField002; }
    public void setCardField002(Integer cardField002) { this.cardField002 = cardField002; }

    public String getCardField003() { return cardField003; }
    public void setCardField003(String cardField003) { this.cardField003 = cardField003; }

    public String getCardField004() { return cardField004; }
    public void setCardField004(String cardField004) { this.cardField004 = cardField004; }

    public Integer getCardField005() { return cardField005; }
    public void setCardField005(Integer cardField005) { this.cardField005 = cardField005; }

    public BigDecimal getCardField006() { return cardField006; }
    public void setCardField006(BigDecimal cardField006) { this.cardField006 = cardField006; }

    public Double getCardField007() { return cardField007; }
    public void setCardField007(Double cardField007) { this.cardField007 = cardField007; }

    public Double getCardField008() { return cardField008; }
    public void setCardField008(Double cardField008) { this.cardField008 = cardField008; }

    public Long getCardField009() { return cardField009; }
    public void setCardField009(Long cardField009) { this.cardField009 = cardField009; }

    public Integer getCardField010() { return cardField010; }
    public void setCardField010(Integer cardField010) { this.cardField010 = cardField010; }

    public LocalDate getCardField011() { return cardField011; }
    public void setCardField011(LocalDate cardField011) { this.cardField011 = cardField011; }

    public Integer getCardField012() { return cardField012; }
    public void setCardField012(Integer cardField012) { this.cardField012 = cardField012; }

    public Double getCardField013() { return cardField013; }
    public void setCardField013(Double cardField013) { this.cardField013 = cardField013; }

    public String getCardField014() { return cardField014; }
    public void setCardField014(String cardField014) { this.cardField014 = cardField014; }

    public BigDecimal getCardField015() { return cardField015; }
    public void setCardField015(BigDecimal cardField015) { this.cardField015 = cardField015; }

    public LocalDate getCardField016() { return cardField016; }
    public void setCardField016(LocalDate cardField016) { this.cardField016 = cardField016; }

    public String getCardField017() { return cardField017; }
    public void setCardField017(String cardField017) { this.cardField017 = cardField017; }

    @Override
    public String toString() {
        return "CardDto058{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
