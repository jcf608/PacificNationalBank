package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto021 — Data Transfer Object for card operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto021 {

    @JsonProperty("cardField000")
    private Long cardField000;

    @Size(max = 60)
    @JsonProperty("cardField001")
    private String cardField001;

    @JsonProperty("cardField002")
    private Integer cardField002;

    @Size(max = 60)
    @JsonProperty("cardField003")
    private String cardField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField004")
    private BigDecimal cardField004;

    @JsonProperty("cardField005")
    private LocalDate cardField005;

    @JsonProperty("cardField006")
    private LocalDate cardField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField007")
    private BigDecimal cardField007;

    @JsonProperty("cardField008")
    private LocalDate cardField008;

    @JsonProperty("cardField009")
    private Boolean cardField009;

    @JsonProperty("cardField010")
    private Boolean cardField010;

    @Size(max = 60)
    @JsonProperty("cardField011")
    private String cardField011;

    @JsonProperty("cardField012")
    private Long cardField012;

    @JsonProperty("cardField013")
    private Integer cardField013;

    @JsonProperty("cardField014")
    private Boolean cardField014;

    @JsonProperty("cardField015")
    private Long cardField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField016")
    private BigDecimal cardField016;

    public CardDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto021 instance = new CardDto021();

        public Builder cardField000(Long val) { instance.cardField000 = val; return this; }
        public Builder cardField001(String val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Integer val) { instance.cardField002 = val; return this; }
        public Builder cardField003(String val) { instance.cardField003 = val; return this; }
        public Builder cardField004(BigDecimal val) { instance.cardField004 = val; return this; }
        public Builder cardField005(LocalDate val) { instance.cardField005 = val; return this; }
        public Builder cardField006(LocalDate val) { instance.cardField006 = val; return this; }
        public Builder cardField007(BigDecimal val) { instance.cardField007 = val; return this; }
        public Builder cardField008(LocalDate val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Boolean val) { instance.cardField009 = val; return this; }
        public Builder cardField010(Boolean val) { instance.cardField010 = val; return this; }
        public Builder cardField011(String val) { instance.cardField011 = val; return this; }
        public Builder cardField012(Long val) { instance.cardField012 = val; return this; }
        public Builder cardField013(Integer val) { instance.cardField013 = val; return this; }
        public Builder cardField014(Boolean val) { instance.cardField014 = val; return this; }
        public Builder cardField015(Long val) { instance.cardField015 = val; return this; }
        public Builder cardField016(BigDecimal val) { instance.cardField016 = val; return this; }
        public CardDto021 build() { return instance; }
    }

    public Long getCardField000() { return cardField000; }
    public void setCardField000(Long cardField000) { this.cardField000 = cardField000; }

    public String getCardField001() { return cardField001; }
    public void setCardField001(String cardField001) { this.cardField001 = cardField001; }

    public Integer getCardField002() { return cardField002; }
    public void setCardField002(Integer cardField002) { this.cardField002 = cardField002; }

    public String getCardField003() { return cardField003; }
    public void setCardField003(String cardField003) { this.cardField003 = cardField003; }

    public BigDecimal getCardField004() { return cardField004; }
    public void setCardField004(BigDecimal cardField004) { this.cardField004 = cardField004; }

    public LocalDate getCardField005() { return cardField005; }
    public void setCardField005(LocalDate cardField005) { this.cardField005 = cardField005; }

    public LocalDate getCardField006() { return cardField006; }
    public void setCardField006(LocalDate cardField006) { this.cardField006 = cardField006; }

    public BigDecimal getCardField007() { return cardField007; }
    public void setCardField007(BigDecimal cardField007) { this.cardField007 = cardField007; }

    public LocalDate getCardField008() { return cardField008; }
    public void setCardField008(LocalDate cardField008) { this.cardField008 = cardField008; }

    public Boolean getCardField009() { return cardField009; }
    public void setCardField009(Boolean cardField009) { this.cardField009 = cardField009; }

    public Boolean getCardField010() { return cardField010; }
    public void setCardField010(Boolean cardField010) { this.cardField010 = cardField010; }

    public String getCardField011() { return cardField011; }
    public void setCardField011(String cardField011) { this.cardField011 = cardField011; }

    public Long getCardField012() { return cardField012; }
    public void setCardField012(Long cardField012) { this.cardField012 = cardField012; }

    public Integer getCardField013() { return cardField013; }
    public void setCardField013(Integer cardField013) { this.cardField013 = cardField013; }

    public Boolean getCardField014() { return cardField014; }
    public void setCardField014(Boolean cardField014) { this.cardField014 = cardField014; }

    public Long getCardField015() { return cardField015; }
    public void setCardField015(Long cardField015) { this.cardField015 = cardField015; }

    public BigDecimal getCardField016() { return cardField016; }
    public void setCardField016(BigDecimal cardField016) { this.cardField016 = cardField016; }

    @Override
    public String toString() {
        return "CardDto021{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
