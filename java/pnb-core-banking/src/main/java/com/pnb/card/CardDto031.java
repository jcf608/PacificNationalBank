package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto031 — Data Transfer Object for card operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto031 {

    @Size(max = 40)
    @JsonProperty("cardField000")
    private String cardField000;

    @JsonProperty("cardField001")
    private Long cardField001;

    @JsonProperty("cardField002")
    private LocalDate cardField002;

    @JsonProperty("cardField003")
    private Long cardField003;

    @JsonProperty("cardField004")
    private Boolean cardField004;

    @JsonProperty("cardField005")
    private Double cardField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField006")
    private BigDecimal cardField006;

    @JsonProperty("cardField007")
    private Integer cardField007;

    @JsonProperty("cardField008")
    private Long cardField008;

    @JsonProperty("cardField009")
    private LocalDate cardField009;

    @JsonProperty("cardField010")
    private Long cardField010;

    @JsonProperty("cardField011")
    private Double cardField011;

    @JsonProperty("cardField012")
    private Boolean cardField012;

    @JsonProperty("cardField013")
    private Double cardField013;

    @Size(max = 60)
    @JsonProperty("cardField014")
    private String cardField014;

    public CardDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto031 instance = new CardDto031();

        public Builder cardField000(String val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Long val) { instance.cardField001 = val; return this; }
        public Builder cardField002(LocalDate val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Long val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Boolean val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Double val) { instance.cardField005 = val; return this; }
        public Builder cardField006(BigDecimal val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Integer val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Long val) { instance.cardField008 = val; return this; }
        public Builder cardField009(LocalDate val) { instance.cardField009 = val; return this; }
        public Builder cardField010(Long val) { instance.cardField010 = val; return this; }
        public Builder cardField011(Double val) { instance.cardField011 = val; return this; }
        public Builder cardField012(Boolean val) { instance.cardField012 = val; return this; }
        public Builder cardField013(Double val) { instance.cardField013 = val; return this; }
        public Builder cardField014(String val) { instance.cardField014 = val; return this; }
        public CardDto031 build() { return instance; }
    }

    public String getCardField000() { return cardField000; }
    public void setCardField000(String cardField000) { this.cardField000 = cardField000; }

    public Long getCardField001() { return cardField001; }
    public void setCardField001(Long cardField001) { this.cardField001 = cardField001; }

    public LocalDate getCardField002() { return cardField002; }
    public void setCardField002(LocalDate cardField002) { this.cardField002 = cardField002; }

    public Long getCardField003() { return cardField003; }
    public void setCardField003(Long cardField003) { this.cardField003 = cardField003; }

    public Boolean getCardField004() { return cardField004; }
    public void setCardField004(Boolean cardField004) { this.cardField004 = cardField004; }

    public Double getCardField005() { return cardField005; }
    public void setCardField005(Double cardField005) { this.cardField005 = cardField005; }

    public BigDecimal getCardField006() { return cardField006; }
    public void setCardField006(BigDecimal cardField006) { this.cardField006 = cardField006; }

    public Integer getCardField007() { return cardField007; }
    public void setCardField007(Integer cardField007) { this.cardField007 = cardField007; }

    public Long getCardField008() { return cardField008; }
    public void setCardField008(Long cardField008) { this.cardField008 = cardField008; }

    public LocalDate getCardField009() { return cardField009; }
    public void setCardField009(LocalDate cardField009) { this.cardField009 = cardField009; }

    public Long getCardField010() { return cardField010; }
    public void setCardField010(Long cardField010) { this.cardField010 = cardField010; }

    public Double getCardField011() { return cardField011; }
    public void setCardField011(Double cardField011) { this.cardField011 = cardField011; }

    public Boolean getCardField012() { return cardField012; }
    public void setCardField012(Boolean cardField012) { this.cardField012 = cardField012; }

    public Double getCardField013() { return cardField013; }
    public void setCardField013(Double cardField013) { this.cardField013 = cardField013; }

    public String getCardField014() { return cardField014; }
    public void setCardField014(String cardField014) { this.cardField014 = cardField014; }

    @Override
    public String toString() {
        return "CardDto031{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
