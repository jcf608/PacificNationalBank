package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto045 — Data Transfer Object for card operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto045 {

    @JsonProperty("cardField000")
    private Integer cardField000;

    @Size(max = 60)
    @JsonProperty("cardField001")
    private String cardField001;

    @JsonProperty("cardField002")
    private Boolean cardField002;

    @JsonProperty("cardField003")
    private Integer cardField003;

    @Size(max = 60)
    @JsonProperty("cardField004")
    private String cardField004;

    @Size(max = 40)
    @JsonProperty("cardField005")
    private String cardField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField006")
    private BigDecimal cardField006;

    @Size(max = 200)
    @JsonProperty("cardField007")
    private String cardField007;

    @JsonProperty("cardField008")
    private LocalDate cardField008;

    @JsonProperty("cardField009")
    private Long cardField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField010")
    private BigDecimal cardField010;

    @JsonProperty("cardField011")
    private LocalDate cardField011;

    @JsonProperty("cardField012")
    private Boolean cardField012;

    @JsonProperty("cardField013")
    private Double cardField013;

    @JsonProperty("cardField014")
    private Long cardField014;

    @Size(max = 100)
    @JsonProperty("cardField015")
    private String cardField015;

    @JsonProperty("cardField016")
    private Boolean cardField016;

    public CardDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto045 instance = new CardDto045();

        public Builder cardField000(Integer val) { instance.cardField000 = val; return this; }
        public Builder cardField001(String val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Boolean val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Integer val) { instance.cardField003 = val; return this; }
        public Builder cardField004(String val) { instance.cardField004 = val; return this; }
        public Builder cardField005(String val) { instance.cardField005 = val; return this; }
        public Builder cardField006(BigDecimal val) { instance.cardField006 = val; return this; }
        public Builder cardField007(String val) { instance.cardField007 = val; return this; }
        public Builder cardField008(LocalDate val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Long val) { instance.cardField009 = val; return this; }
        public Builder cardField010(BigDecimal val) { instance.cardField010 = val; return this; }
        public Builder cardField011(LocalDate val) { instance.cardField011 = val; return this; }
        public Builder cardField012(Boolean val) { instance.cardField012 = val; return this; }
        public Builder cardField013(Double val) { instance.cardField013 = val; return this; }
        public Builder cardField014(Long val) { instance.cardField014 = val; return this; }
        public Builder cardField015(String val) { instance.cardField015 = val; return this; }
        public Builder cardField016(Boolean val) { instance.cardField016 = val; return this; }
        public CardDto045 build() { return instance; }
    }

    public Integer getCardField000() { return cardField000; }
    public void setCardField000(Integer cardField000) { this.cardField000 = cardField000; }

    public String getCardField001() { return cardField001; }
    public void setCardField001(String cardField001) { this.cardField001 = cardField001; }

    public Boolean getCardField002() { return cardField002; }
    public void setCardField002(Boolean cardField002) { this.cardField002 = cardField002; }

    public Integer getCardField003() { return cardField003; }
    public void setCardField003(Integer cardField003) { this.cardField003 = cardField003; }

    public String getCardField004() { return cardField004; }
    public void setCardField004(String cardField004) { this.cardField004 = cardField004; }

    public String getCardField005() { return cardField005; }
    public void setCardField005(String cardField005) { this.cardField005 = cardField005; }

    public BigDecimal getCardField006() { return cardField006; }
    public void setCardField006(BigDecimal cardField006) { this.cardField006 = cardField006; }

    public String getCardField007() { return cardField007; }
    public void setCardField007(String cardField007) { this.cardField007 = cardField007; }

    public LocalDate getCardField008() { return cardField008; }
    public void setCardField008(LocalDate cardField008) { this.cardField008 = cardField008; }

    public Long getCardField009() { return cardField009; }
    public void setCardField009(Long cardField009) { this.cardField009 = cardField009; }

    public BigDecimal getCardField010() { return cardField010; }
    public void setCardField010(BigDecimal cardField010) { this.cardField010 = cardField010; }

    public LocalDate getCardField011() { return cardField011; }
    public void setCardField011(LocalDate cardField011) { this.cardField011 = cardField011; }

    public Boolean getCardField012() { return cardField012; }
    public void setCardField012(Boolean cardField012) { this.cardField012 = cardField012; }

    public Double getCardField013() { return cardField013; }
    public void setCardField013(Double cardField013) { this.cardField013 = cardField013; }

    public Long getCardField014() { return cardField014; }
    public void setCardField014(Long cardField014) { this.cardField014 = cardField014; }

    public String getCardField015() { return cardField015; }
    public void setCardField015(String cardField015) { this.cardField015 = cardField015; }

    public Boolean getCardField016() { return cardField016; }
    public void setCardField016(Boolean cardField016) { this.cardField016 = cardField016; }

    @Override
    public String toString() {
        return "CardDto045{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
