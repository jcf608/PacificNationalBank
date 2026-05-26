package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto057 — Data Transfer Object for card operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto057 {

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField000")
    private BigDecimal cardField000;

    @JsonProperty("cardField001")
    private Integer cardField001;

    @JsonProperty("cardField002")
    private Integer cardField002;

    @JsonProperty("cardField003")
    private Integer cardField003;

    @Size(max = 200)
    @JsonProperty("cardField004")
    private String cardField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField005")
    private BigDecimal cardField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField006")
    private BigDecimal cardField006;

    @JsonProperty("cardField007")
    private Double cardField007;

    @Size(max = 60)
    @JsonProperty("cardField008")
    private String cardField008;

    @JsonProperty("cardField009")
    private LocalDate cardField009;

    @JsonProperty("cardField010")
    private LocalDate cardField010;

    @JsonProperty("cardField011")
    private Boolean cardField011;

    @JsonProperty("cardField012")
    private LocalDate cardField012;

    @JsonProperty("cardField013")
    private Long cardField013;

    @JsonProperty("cardField014")
    private Double cardField014;

    @JsonProperty("cardField015")
    private Double cardField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField016")
    private BigDecimal cardField016;

    public CardDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto057 instance = new CardDto057();

        public Builder cardField000(BigDecimal val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Integer val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Integer val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Integer val) { instance.cardField003 = val; return this; }
        public Builder cardField004(String val) { instance.cardField004 = val; return this; }
        public Builder cardField005(BigDecimal val) { instance.cardField005 = val; return this; }
        public Builder cardField006(BigDecimal val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Double val) { instance.cardField007 = val; return this; }
        public Builder cardField008(String val) { instance.cardField008 = val; return this; }
        public Builder cardField009(LocalDate val) { instance.cardField009 = val; return this; }
        public Builder cardField010(LocalDate val) { instance.cardField010 = val; return this; }
        public Builder cardField011(Boolean val) { instance.cardField011 = val; return this; }
        public Builder cardField012(LocalDate val) { instance.cardField012 = val; return this; }
        public Builder cardField013(Long val) { instance.cardField013 = val; return this; }
        public Builder cardField014(Double val) { instance.cardField014 = val; return this; }
        public Builder cardField015(Double val) { instance.cardField015 = val; return this; }
        public Builder cardField016(BigDecimal val) { instance.cardField016 = val; return this; }
        public CardDto057 build() { return instance; }
    }

    public BigDecimal getCardField000() { return cardField000; }
    public void setCardField000(BigDecimal cardField000) { this.cardField000 = cardField000; }

    public Integer getCardField001() { return cardField001; }
    public void setCardField001(Integer cardField001) { this.cardField001 = cardField001; }

    public Integer getCardField002() { return cardField002; }
    public void setCardField002(Integer cardField002) { this.cardField002 = cardField002; }

    public Integer getCardField003() { return cardField003; }
    public void setCardField003(Integer cardField003) { this.cardField003 = cardField003; }

    public String getCardField004() { return cardField004; }
    public void setCardField004(String cardField004) { this.cardField004 = cardField004; }

    public BigDecimal getCardField005() { return cardField005; }
    public void setCardField005(BigDecimal cardField005) { this.cardField005 = cardField005; }

    public BigDecimal getCardField006() { return cardField006; }
    public void setCardField006(BigDecimal cardField006) { this.cardField006 = cardField006; }

    public Double getCardField007() { return cardField007; }
    public void setCardField007(Double cardField007) { this.cardField007 = cardField007; }

    public String getCardField008() { return cardField008; }
    public void setCardField008(String cardField008) { this.cardField008 = cardField008; }

    public LocalDate getCardField009() { return cardField009; }
    public void setCardField009(LocalDate cardField009) { this.cardField009 = cardField009; }

    public LocalDate getCardField010() { return cardField010; }
    public void setCardField010(LocalDate cardField010) { this.cardField010 = cardField010; }

    public Boolean getCardField011() { return cardField011; }
    public void setCardField011(Boolean cardField011) { this.cardField011 = cardField011; }

    public LocalDate getCardField012() { return cardField012; }
    public void setCardField012(LocalDate cardField012) { this.cardField012 = cardField012; }

    public Long getCardField013() { return cardField013; }
    public void setCardField013(Long cardField013) { this.cardField013 = cardField013; }

    public Double getCardField014() { return cardField014; }
    public void setCardField014(Double cardField014) { this.cardField014 = cardField014; }

    public Double getCardField015() { return cardField015; }
    public void setCardField015(Double cardField015) { this.cardField015 = cardField015; }

    public BigDecimal getCardField016() { return cardField016; }
    public void setCardField016(BigDecimal cardField016) { this.cardField016 = cardField016; }

    @Override
    public String toString() {
        return "CardDto057{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
