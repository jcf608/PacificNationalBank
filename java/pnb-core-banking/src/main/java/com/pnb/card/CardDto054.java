package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto054 — Data Transfer Object for card operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto054 {

    @JsonProperty("cardField000")
    private Boolean cardField000;

    @Size(max = 20)
    @JsonProperty("cardField001")
    private String cardField001;

    @Size(max = 60)
    @JsonProperty("cardField002")
    private String cardField002;

    @JsonProperty("cardField003")
    private LocalDate cardField003;

    @JsonProperty("cardField004")
    private Double cardField004;

    @JsonProperty("cardField005")
    private Double cardField005;

    @JsonProperty("cardField006")
    private Long cardField006;

    @JsonProperty("cardField007")
    private Integer cardField007;

    @JsonProperty("cardField008")
    private Long cardField008;

    @JsonProperty("cardField009")
    private Double cardField009;

    @JsonProperty("cardField010")
    private Integer cardField010;

    @Size(max = 60)
    @JsonProperty("cardField011")
    private String cardField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField012")
    private BigDecimal cardField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField013")
    private BigDecimal cardField013;

    public CardDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto054 instance = new CardDto054();

        public Builder cardField000(Boolean val) { instance.cardField000 = val; return this; }
        public Builder cardField001(String val) { instance.cardField001 = val; return this; }
        public Builder cardField002(String val) { instance.cardField002 = val; return this; }
        public Builder cardField003(LocalDate val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Double val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Double val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Long val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Integer val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Long val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Double val) { instance.cardField009 = val; return this; }
        public Builder cardField010(Integer val) { instance.cardField010 = val; return this; }
        public Builder cardField011(String val) { instance.cardField011 = val; return this; }
        public Builder cardField012(BigDecimal val) { instance.cardField012 = val; return this; }
        public Builder cardField013(BigDecimal val) { instance.cardField013 = val; return this; }
        public CardDto054 build() { return instance; }
    }

    public Boolean getCardField000() { return cardField000; }
    public void setCardField000(Boolean cardField000) { this.cardField000 = cardField000; }

    public String getCardField001() { return cardField001; }
    public void setCardField001(String cardField001) { this.cardField001 = cardField001; }

    public String getCardField002() { return cardField002; }
    public void setCardField002(String cardField002) { this.cardField002 = cardField002; }

    public LocalDate getCardField003() { return cardField003; }
    public void setCardField003(LocalDate cardField003) { this.cardField003 = cardField003; }

    public Double getCardField004() { return cardField004; }
    public void setCardField004(Double cardField004) { this.cardField004 = cardField004; }

    public Double getCardField005() { return cardField005; }
    public void setCardField005(Double cardField005) { this.cardField005 = cardField005; }

    public Long getCardField006() { return cardField006; }
    public void setCardField006(Long cardField006) { this.cardField006 = cardField006; }

    public Integer getCardField007() { return cardField007; }
    public void setCardField007(Integer cardField007) { this.cardField007 = cardField007; }

    public Long getCardField008() { return cardField008; }
    public void setCardField008(Long cardField008) { this.cardField008 = cardField008; }

    public Double getCardField009() { return cardField009; }
    public void setCardField009(Double cardField009) { this.cardField009 = cardField009; }

    public Integer getCardField010() { return cardField010; }
    public void setCardField010(Integer cardField010) { this.cardField010 = cardField010; }

    public String getCardField011() { return cardField011; }
    public void setCardField011(String cardField011) { this.cardField011 = cardField011; }

    public BigDecimal getCardField012() { return cardField012; }
    public void setCardField012(BigDecimal cardField012) { this.cardField012 = cardField012; }

    public BigDecimal getCardField013() { return cardField013; }
    public void setCardField013(BigDecimal cardField013) { this.cardField013 = cardField013; }

    @Override
    public String toString() {
        return "CardDto054{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
