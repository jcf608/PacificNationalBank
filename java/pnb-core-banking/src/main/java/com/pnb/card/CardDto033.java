package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto033 — Data Transfer Object for card operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto033 {

    @JsonProperty("cardField000")
    private Integer cardField000;

    @Size(max = 60)
    @JsonProperty("cardField001")
    private String cardField001;

    @JsonProperty("cardField002")
    private LocalDate cardField002;

    @JsonProperty("cardField003")
    private Boolean cardField003;

    @JsonProperty("cardField004")
    private Long cardField004;

    @JsonProperty("cardField005")
    private Double cardField005;

    @JsonProperty("cardField006")
    private Integer cardField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField007")
    private BigDecimal cardField007;

    @JsonProperty("cardField008")
    private Boolean cardField008;

    @JsonProperty("cardField009")
    private Double cardField009;

    @JsonProperty("cardField010")
    private LocalDate cardField010;

    @Size(max = 100)
    @JsonProperty("cardField011")
    private String cardField011;

    @Size(max = 40)
    @JsonProperty("cardField012")
    private String cardField012;

    @JsonProperty("cardField013")
    private Integer cardField013;

    @JsonProperty("cardField014")
    private Boolean cardField014;

    @JsonProperty("cardField015")
    private Boolean cardField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField016")
    private BigDecimal cardField016;

    public CardDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto033 instance = new CardDto033();

        public Builder cardField000(Integer val) { instance.cardField000 = val; return this; }
        public Builder cardField001(String val) { instance.cardField001 = val; return this; }
        public Builder cardField002(LocalDate val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Boolean val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Long val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Double val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Integer val) { instance.cardField006 = val; return this; }
        public Builder cardField007(BigDecimal val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Boolean val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Double val) { instance.cardField009 = val; return this; }
        public Builder cardField010(LocalDate val) { instance.cardField010 = val; return this; }
        public Builder cardField011(String val) { instance.cardField011 = val; return this; }
        public Builder cardField012(String val) { instance.cardField012 = val; return this; }
        public Builder cardField013(Integer val) { instance.cardField013 = val; return this; }
        public Builder cardField014(Boolean val) { instance.cardField014 = val; return this; }
        public Builder cardField015(Boolean val) { instance.cardField015 = val; return this; }
        public Builder cardField016(BigDecimal val) { instance.cardField016 = val; return this; }
        public CardDto033 build() { return instance; }
    }

    public Integer getCardField000() { return cardField000; }
    public void setCardField000(Integer cardField000) { this.cardField000 = cardField000; }

    public String getCardField001() { return cardField001; }
    public void setCardField001(String cardField001) { this.cardField001 = cardField001; }

    public LocalDate getCardField002() { return cardField002; }
    public void setCardField002(LocalDate cardField002) { this.cardField002 = cardField002; }

    public Boolean getCardField003() { return cardField003; }
    public void setCardField003(Boolean cardField003) { this.cardField003 = cardField003; }

    public Long getCardField004() { return cardField004; }
    public void setCardField004(Long cardField004) { this.cardField004 = cardField004; }

    public Double getCardField005() { return cardField005; }
    public void setCardField005(Double cardField005) { this.cardField005 = cardField005; }

    public Integer getCardField006() { return cardField006; }
    public void setCardField006(Integer cardField006) { this.cardField006 = cardField006; }

    public BigDecimal getCardField007() { return cardField007; }
    public void setCardField007(BigDecimal cardField007) { this.cardField007 = cardField007; }

    public Boolean getCardField008() { return cardField008; }
    public void setCardField008(Boolean cardField008) { this.cardField008 = cardField008; }

    public Double getCardField009() { return cardField009; }
    public void setCardField009(Double cardField009) { this.cardField009 = cardField009; }

    public LocalDate getCardField010() { return cardField010; }
    public void setCardField010(LocalDate cardField010) { this.cardField010 = cardField010; }

    public String getCardField011() { return cardField011; }
    public void setCardField011(String cardField011) { this.cardField011 = cardField011; }

    public String getCardField012() { return cardField012; }
    public void setCardField012(String cardField012) { this.cardField012 = cardField012; }

    public Integer getCardField013() { return cardField013; }
    public void setCardField013(Integer cardField013) { this.cardField013 = cardField013; }

    public Boolean getCardField014() { return cardField014; }
    public void setCardField014(Boolean cardField014) { this.cardField014 = cardField014; }

    public Boolean getCardField015() { return cardField015; }
    public void setCardField015(Boolean cardField015) { this.cardField015 = cardField015; }

    public BigDecimal getCardField016() { return cardField016; }
    public void setCardField016(BigDecimal cardField016) { this.cardField016 = cardField016; }

    @Override
    public String toString() {
        return "CardDto033{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
