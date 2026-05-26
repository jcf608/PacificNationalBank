package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto029 — Data Transfer Object for card operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto029 {

    @Size(max = 60)
    @JsonProperty("cardField000")
    private String cardField000;

    @JsonProperty("cardField001")
    private LocalDate cardField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField002")
    private BigDecimal cardField002;

    @JsonProperty("cardField003")
    private Boolean cardField003;

    @JsonProperty("cardField004")
    private LocalDate cardField004;

    @JsonProperty("cardField005")
    private Integer cardField005;

    @JsonProperty("cardField006")
    private Boolean cardField006;

    @Size(max = 200)
    @JsonProperty("cardField007")
    private String cardField007;

    @JsonProperty("cardField008")
    private Integer cardField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField009")
    private BigDecimal cardField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField010")
    private BigDecimal cardField010;

    @JsonProperty("cardField011")
    private Double cardField011;

    @JsonProperty("cardField012")
    private Integer cardField012;

    public CardDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto029 instance = new CardDto029();

        public Builder cardField000(String val) { instance.cardField000 = val; return this; }
        public Builder cardField001(LocalDate val) { instance.cardField001 = val; return this; }
        public Builder cardField002(BigDecimal val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Boolean val) { instance.cardField003 = val; return this; }
        public Builder cardField004(LocalDate val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Integer val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Boolean val) { instance.cardField006 = val; return this; }
        public Builder cardField007(String val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Integer val) { instance.cardField008 = val; return this; }
        public Builder cardField009(BigDecimal val) { instance.cardField009 = val; return this; }
        public Builder cardField010(BigDecimal val) { instance.cardField010 = val; return this; }
        public Builder cardField011(Double val) { instance.cardField011 = val; return this; }
        public Builder cardField012(Integer val) { instance.cardField012 = val; return this; }
        public CardDto029 build() { return instance; }
    }

    public String getCardField000() { return cardField000; }
    public void setCardField000(String cardField000) { this.cardField000 = cardField000; }

    public LocalDate getCardField001() { return cardField001; }
    public void setCardField001(LocalDate cardField001) { this.cardField001 = cardField001; }

    public BigDecimal getCardField002() { return cardField002; }
    public void setCardField002(BigDecimal cardField002) { this.cardField002 = cardField002; }

    public Boolean getCardField003() { return cardField003; }
    public void setCardField003(Boolean cardField003) { this.cardField003 = cardField003; }

    public LocalDate getCardField004() { return cardField004; }
    public void setCardField004(LocalDate cardField004) { this.cardField004 = cardField004; }

    public Integer getCardField005() { return cardField005; }
    public void setCardField005(Integer cardField005) { this.cardField005 = cardField005; }

    public Boolean getCardField006() { return cardField006; }
    public void setCardField006(Boolean cardField006) { this.cardField006 = cardField006; }

    public String getCardField007() { return cardField007; }
    public void setCardField007(String cardField007) { this.cardField007 = cardField007; }

    public Integer getCardField008() { return cardField008; }
    public void setCardField008(Integer cardField008) { this.cardField008 = cardField008; }

    public BigDecimal getCardField009() { return cardField009; }
    public void setCardField009(BigDecimal cardField009) { this.cardField009 = cardField009; }

    public BigDecimal getCardField010() { return cardField010; }
    public void setCardField010(BigDecimal cardField010) { this.cardField010 = cardField010; }

    public Double getCardField011() { return cardField011; }
    public void setCardField011(Double cardField011) { this.cardField011 = cardField011; }

    public Integer getCardField012() { return cardField012; }
    public void setCardField012(Integer cardField012) { this.cardField012 = cardField012; }

    @Override
    public String toString() {
        return "CardDto029{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
