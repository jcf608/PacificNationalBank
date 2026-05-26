package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto022 — Data Transfer Object for card operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto022 {

    @JsonProperty("cardField000")
    private Boolean cardField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField001")
    private BigDecimal cardField001;

    @JsonProperty("cardField002")
    private Double cardField002;

    @JsonProperty("cardField003")
    private Long cardField003;

    @JsonProperty("cardField004")
    private Boolean cardField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField005")
    private BigDecimal cardField005;

    @JsonProperty("cardField006")
    private Double cardField006;

    @JsonProperty("cardField007")
    private Boolean cardField007;

    @Size(max = 100)
    @JsonProperty("cardField008")
    private String cardField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField009")
    private BigDecimal cardField009;

    @JsonProperty("cardField010")
    private Boolean cardField010;

    @JsonProperty("cardField011")
    private LocalDate cardField011;

    @Size(max = 200)
    @JsonProperty("cardField012")
    private String cardField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField013")
    private BigDecimal cardField013;

    @JsonProperty("cardField014")
    private Integer cardField014;

    @JsonProperty("cardField015")
    private Integer cardField015;

    @JsonProperty("cardField016")
    private Double cardField016;

    @Size(max = 100)
    @JsonProperty("cardField017")
    private String cardField017;

    public CardDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto022 instance = new CardDto022();

        public Builder cardField000(Boolean val) { instance.cardField000 = val; return this; }
        public Builder cardField001(BigDecimal val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Double val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Long val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Boolean val) { instance.cardField004 = val; return this; }
        public Builder cardField005(BigDecimal val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Double val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Boolean val) { instance.cardField007 = val; return this; }
        public Builder cardField008(String val) { instance.cardField008 = val; return this; }
        public Builder cardField009(BigDecimal val) { instance.cardField009 = val; return this; }
        public Builder cardField010(Boolean val) { instance.cardField010 = val; return this; }
        public Builder cardField011(LocalDate val) { instance.cardField011 = val; return this; }
        public Builder cardField012(String val) { instance.cardField012 = val; return this; }
        public Builder cardField013(BigDecimal val) { instance.cardField013 = val; return this; }
        public Builder cardField014(Integer val) { instance.cardField014 = val; return this; }
        public Builder cardField015(Integer val) { instance.cardField015 = val; return this; }
        public Builder cardField016(Double val) { instance.cardField016 = val; return this; }
        public Builder cardField017(String val) { instance.cardField017 = val; return this; }
        public CardDto022 build() { return instance; }
    }

    public Boolean getCardField000() { return cardField000; }
    public void setCardField000(Boolean cardField000) { this.cardField000 = cardField000; }

    public BigDecimal getCardField001() { return cardField001; }
    public void setCardField001(BigDecimal cardField001) { this.cardField001 = cardField001; }

    public Double getCardField002() { return cardField002; }
    public void setCardField002(Double cardField002) { this.cardField002 = cardField002; }

    public Long getCardField003() { return cardField003; }
    public void setCardField003(Long cardField003) { this.cardField003 = cardField003; }

    public Boolean getCardField004() { return cardField004; }
    public void setCardField004(Boolean cardField004) { this.cardField004 = cardField004; }

    public BigDecimal getCardField005() { return cardField005; }
    public void setCardField005(BigDecimal cardField005) { this.cardField005 = cardField005; }

    public Double getCardField006() { return cardField006; }
    public void setCardField006(Double cardField006) { this.cardField006 = cardField006; }

    public Boolean getCardField007() { return cardField007; }
    public void setCardField007(Boolean cardField007) { this.cardField007 = cardField007; }

    public String getCardField008() { return cardField008; }
    public void setCardField008(String cardField008) { this.cardField008 = cardField008; }

    public BigDecimal getCardField009() { return cardField009; }
    public void setCardField009(BigDecimal cardField009) { this.cardField009 = cardField009; }

    public Boolean getCardField010() { return cardField010; }
    public void setCardField010(Boolean cardField010) { this.cardField010 = cardField010; }

    public LocalDate getCardField011() { return cardField011; }
    public void setCardField011(LocalDate cardField011) { this.cardField011 = cardField011; }

    public String getCardField012() { return cardField012; }
    public void setCardField012(String cardField012) { this.cardField012 = cardField012; }

    public BigDecimal getCardField013() { return cardField013; }
    public void setCardField013(BigDecimal cardField013) { this.cardField013 = cardField013; }

    public Integer getCardField014() { return cardField014; }
    public void setCardField014(Integer cardField014) { this.cardField014 = cardField014; }

    public Integer getCardField015() { return cardField015; }
    public void setCardField015(Integer cardField015) { this.cardField015 = cardField015; }

    public Double getCardField016() { return cardField016; }
    public void setCardField016(Double cardField016) { this.cardField016 = cardField016; }

    public String getCardField017() { return cardField017; }
    public void setCardField017(String cardField017) { this.cardField017 = cardField017; }

    @Override
    public String toString() {
        return "CardDto022{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
