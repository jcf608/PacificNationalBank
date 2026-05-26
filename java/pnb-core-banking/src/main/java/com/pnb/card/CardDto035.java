package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto035 — Data Transfer Object for card operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto035 {

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField000")
    private BigDecimal cardField000;

    @JsonProperty("cardField001")
    private LocalDate cardField001;

    @Size(max = 20)
    @JsonProperty("cardField002")
    private String cardField002;

    @JsonProperty("cardField003")
    private Integer cardField003;

    @JsonProperty("cardField004")
    private LocalDate cardField004;

    @JsonProperty("cardField005")
    private Boolean cardField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField006")
    private BigDecimal cardField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField007")
    private BigDecimal cardField007;

    @JsonProperty("cardField008")
    private Boolean cardField008;

    @JsonProperty("cardField009")
    private Integer cardField009;

    @Size(max = 20)
    @JsonProperty("cardField010")
    private String cardField010;

    @JsonProperty("cardField011")
    private Integer cardField011;

    @JsonProperty("cardField012")
    private Double cardField012;

    @JsonProperty("cardField013")
    private Long cardField013;

    @JsonProperty("cardField014")
    private Double cardField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField015")
    private BigDecimal cardField015;

    @JsonProperty("cardField016")
    private Integer cardField016;

    @Size(max = 60)
    @JsonProperty("cardField017")
    private String cardField017;

    @JsonProperty("cardField018")
    private Long cardField018;

    public CardDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto035 instance = new CardDto035();

        public Builder cardField000(BigDecimal val) { instance.cardField000 = val; return this; }
        public Builder cardField001(LocalDate val) { instance.cardField001 = val; return this; }
        public Builder cardField002(String val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Integer val) { instance.cardField003 = val; return this; }
        public Builder cardField004(LocalDate val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Boolean val) { instance.cardField005 = val; return this; }
        public Builder cardField006(BigDecimal val) { instance.cardField006 = val; return this; }
        public Builder cardField007(BigDecimal val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Boolean val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Integer val) { instance.cardField009 = val; return this; }
        public Builder cardField010(String val) { instance.cardField010 = val; return this; }
        public Builder cardField011(Integer val) { instance.cardField011 = val; return this; }
        public Builder cardField012(Double val) { instance.cardField012 = val; return this; }
        public Builder cardField013(Long val) { instance.cardField013 = val; return this; }
        public Builder cardField014(Double val) { instance.cardField014 = val; return this; }
        public Builder cardField015(BigDecimal val) { instance.cardField015 = val; return this; }
        public Builder cardField016(Integer val) { instance.cardField016 = val; return this; }
        public Builder cardField017(String val) { instance.cardField017 = val; return this; }
        public Builder cardField018(Long val) { instance.cardField018 = val; return this; }
        public CardDto035 build() { return instance; }
    }

    public BigDecimal getCardField000() { return cardField000; }
    public void setCardField000(BigDecimal cardField000) { this.cardField000 = cardField000; }

    public LocalDate getCardField001() { return cardField001; }
    public void setCardField001(LocalDate cardField001) { this.cardField001 = cardField001; }

    public String getCardField002() { return cardField002; }
    public void setCardField002(String cardField002) { this.cardField002 = cardField002; }

    public Integer getCardField003() { return cardField003; }
    public void setCardField003(Integer cardField003) { this.cardField003 = cardField003; }

    public LocalDate getCardField004() { return cardField004; }
    public void setCardField004(LocalDate cardField004) { this.cardField004 = cardField004; }

    public Boolean getCardField005() { return cardField005; }
    public void setCardField005(Boolean cardField005) { this.cardField005 = cardField005; }

    public BigDecimal getCardField006() { return cardField006; }
    public void setCardField006(BigDecimal cardField006) { this.cardField006 = cardField006; }

    public BigDecimal getCardField007() { return cardField007; }
    public void setCardField007(BigDecimal cardField007) { this.cardField007 = cardField007; }

    public Boolean getCardField008() { return cardField008; }
    public void setCardField008(Boolean cardField008) { this.cardField008 = cardField008; }

    public Integer getCardField009() { return cardField009; }
    public void setCardField009(Integer cardField009) { this.cardField009 = cardField009; }

    public String getCardField010() { return cardField010; }
    public void setCardField010(String cardField010) { this.cardField010 = cardField010; }

    public Integer getCardField011() { return cardField011; }
    public void setCardField011(Integer cardField011) { this.cardField011 = cardField011; }

    public Double getCardField012() { return cardField012; }
    public void setCardField012(Double cardField012) { this.cardField012 = cardField012; }

    public Long getCardField013() { return cardField013; }
    public void setCardField013(Long cardField013) { this.cardField013 = cardField013; }

    public Double getCardField014() { return cardField014; }
    public void setCardField014(Double cardField014) { this.cardField014 = cardField014; }

    public BigDecimal getCardField015() { return cardField015; }
    public void setCardField015(BigDecimal cardField015) { this.cardField015 = cardField015; }

    public Integer getCardField016() { return cardField016; }
    public void setCardField016(Integer cardField016) { this.cardField016 = cardField016; }

    public String getCardField017() { return cardField017; }
    public void setCardField017(String cardField017) { this.cardField017 = cardField017; }

    public Long getCardField018() { return cardField018; }
    public void setCardField018(Long cardField018) { this.cardField018 = cardField018; }

    @Override
    public String toString() {
        return "CardDto035{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
