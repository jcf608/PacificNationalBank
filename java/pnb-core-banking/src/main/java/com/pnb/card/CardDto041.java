package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto041 — Data Transfer Object for card operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto041 {

    @JsonProperty("cardField000")
    private Boolean cardField000;

    @Size(max = 40)
    @JsonProperty("cardField001")
    private String cardField001;

    @JsonProperty("cardField002")
    private Integer cardField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField003")
    private BigDecimal cardField003;

    @JsonProperty("cardField004")
    private Double cardField004;

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
    private Boolean cardField009;

    @JsonProperty("cardField010")
    private Boolean cardField010;

    @JsonProperty("cardField011")
    private LocalDate cardField011;

    @JsonProperty("cardField012")
    private Long cardField012;

    public CardDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto041 instance = new CardDto041();

        public Builder cardField000(Boolean val) { instance.cardField000 = val; return this; }
        public Builder cardField001(String val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Integer val) { instance.cardField002 = val; return this; }
        public Builder cardField003(BigDecimal val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Double val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Double val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Integer val) { instance.cardField006 = val; return this; }
        public Builder cardField007(BigDecimal val) { instance.cardField007 = val; return this; }
        public Builder cardField008(String val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Boolean val) { instance.cardField009 = val; return this; }
        public Builder cardField010(Boolean val) { instance.cardField010 = val; return this; }
        public Builder cardField011(LocalDate val) { instance.cardField011 = val; return this; }
        public Builder cardField012(Long val) { instance.cardField012 = val; return this; }
        public CardDto041 build() { return instance; }
    }

    public Boolean getCardField000() { return cardField000; }
    public void setCardField000(Boolean cardField000) { this.cardField000 = cardField000; }

    public String getCardField001() { return cardField001; }
    public void setCardField001(String cardField001) { this.cardField001 = cardField001; }

    public Integer getCardField002() { return cardField002; }
    public void setCardField002(Integer cardField002) { this.cardField002 = cardField002; }

    public BigDecimal getCardField003() { return cardField003; }
    public void setCardField003(BigDecimal cardField003) { this.cardField003 = cardField003; }

    public Double getCardField004() { return cardField004; }
    public void setCardField004(Double cardField004) { this.cardField004 = cardField004; }

    public Double getCardField005() { return cardField005; }
    public void setCardField005(Double cardField005) { this.cardField005 = cardField005; }

    public Integer getCardField006() { return cardField006; }
    public void setCardField006(Integer cardField006) { this.cardField006 = cardField006; }

    public BigDecimal getCardField007() { return cardField007; }
    public void setCardField007(BigDecimal cardField007) { this.cardField007 = cardField007; }

    public String getCardField008() { return cardField008; }
    public void setCardField008(String cardField008) { this.cardField008 = cardField008; }

    public Boolean getCardField009() { return cardField009; }
    public void setCardField009(Boolean cardField009) { this.cardField009 = cardField009; }

    public Boolean getCardField010() { return cardField010; }
    public void setCardField010(Boolean cardField010) { this.cardField010 = cardField010; }

    public LocalDate getCardField011() { return cardField011; }
    public void setCardField011(LocalDate cardField011) { this.cardField011 = cardField011; }

    public Long getCardField012() { return cardField012; }
    public void setCardField012(Long cardField012) { this.cardField012 = cardField012; }

    @Override
    public String toString() {
        return "CardDto041{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
