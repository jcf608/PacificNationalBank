package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto030 — Data Transfer Object for card operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto030 {

    @JsonProperty("cardField000")
    private Double cardField000;

    @JsonProperty("cardField001")
    private Integer cardField001;

    @JsonProperty("cardField002")
    private Boolean cardField002;

    @JsonProperty("cardField003")
    private Boolean cardField003;

    @JsonProperty("cardField004")
    private Integer cardField004;

    @Size(max = 100)
    @JsonProperty("cardField005")
    private String cardField005;

    @JsonProperty("cardField006")
    private Boolean cardField006;

    @JsonProperty("cardField007")
    private Long cardField007;

    @JsonProperty("cardField008")
    private Integer cardField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField009")
    private BigDecimal cardField009;

    @Size(max = 20)
    @JsonProperty("cardField010")
    private String cardField010;

    @Size(max = 60)
    @JsonProperty("cardField011")
    private String cardField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField012")
    private BigDecimal cardField012;

    @Size(max = 200)
    @JsonProperty("cardField013")
    private String cardField013;

    public CardDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto030 instance = new CardDto030();

        public Builder cardField000(Double val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Integer val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Boolean val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Boolean val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Integer val) { instance.cardField004 = val; return this; }
        public Builder cardField005(String val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Boolean val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Long val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Integer val) { instance.cardField008 = val; return this; }
        public Builder cardField009(BigDecimal val) { instance.cardField009 = val; return this; }
        public Builder cardField010(String val) { instance.cardField010 = val; return this; }
        public Builder cardField011(String val) { instance.cardField011 = val; return this; }
        public Builder cardField012(BigDecimal val) { instance.cardField012 = val; return this; }
        public Builder cardField013(String val) { instance.cardField013 = val; return this; }
        public CardDto030 build() { return instance; }
    }

    public Double getCardField000() { return cardField000; }
    public void setCardField000(Double cardField000) { this.cardField000 = cardField000; }

    public Integer getCardField001() { return cardField001; }
    public void setCardField001(Integer cardField001) { this.cardField001 = cardField001; }

    public Boolean getCardField002() { return cardField002; }
    public void setCardField002(Boolean cardField002) { this.cardField002 = cardField002; }

    public Boolean getCardField003() { return cardField003; }
    public void setCardField003(Boolean cardField003) { this.cardField003 = cardField003; }

    public Integer getCardField004() { return cardField004; }
    public void setCardField004(Integer cardField004) { this.cardField004 = cardField004; }

    public String getCardField005() { return cardField005; }
    public void setCardField005(String cardField005) { this.cardField005 = cardField005; }

    public Boolean getCardField006() { return cardField006; }
    public void setCardField006(Boolean cardField006) { this.cardField006 = cardField006; }

    public Long getCardField007() { return cardField007; }
    public void setCardField007(Long cardField007) { this.cardField007 = cardField007; }

    public Integer getCardField008() { return cardField008; }
    public void setCardField008(Integer cardField008) { this.cardField008 = cardField008; }

    public BigDecimal getCardField009() { return cardField009; }
    public void setCardField009(BigDecimal cardField009) { this.cardField009 = cardField009; }

    public String getCardField010() { return cardField010; }
    public void setCardField010(String cardField010) { this.cardField010 = cardField010; }

    public String getCardField011() { return cardField011; }
    public void setCardField011(String cardField011) { this.cardField011 = cardField011; }

    public BigDecimal getCardField012() { return cardField012; }
    public void setCardField012(BigDecimal cardField012) { this.cardField012 = cardField012; }

    public String getCardField013() { return cardField013; }
    public void setCardField013(String cardField013) { this.cardField013 = cardField013; }

    @Override
    public String toString() {
        return "CardDto030{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
