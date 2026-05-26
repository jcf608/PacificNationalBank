package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto044 — Data Transfer Object for card operations.
 * Variant 44 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto044 {

    @Size(max = 100)
    @JsonProperty("cardField000")
    private String cardField000;

    @JsonProperty("cardField001")
    private Boolean cardField001;

    @JsonProperty("cardField002")
    private Long cardField002;

    @JsonProperty("cardField003")
    private Boolean cardField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField004")
    private BigDecimal cardField004;

    @JsonProperty("cardField005")
    private Boolean cardField005;

    @JsonProperty("cardField006")
    private LocalDate cardField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField007")
    private BigDecimal cardField007;

    @JsonProperty("cardField008")
    private Long cardField008;

    @Size(max = 100)
    @JsonProperty("cardField009")
    private String cardField009;

    @Size(max = 60)
    @JsonProperty("cardField010")
    private String cardField010;

    @JsonProperty("cardField011")
    private Integer cardField011;

    @JsonProperty("cardField012")
    private Boolean cardField012;

    @Size(max = 20)
    @JsonProperty("cardField013")
    private String cardField013;

    @JsonProperty("cardField014")
    private Long cardField014;

    @Size(max = 40)
    @JsonProperty("cardField015")
    private String cardField015;

    public CardDto044() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto044 instance = new CardDto044();

        public Builder cardField000(String val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Boolean val) { instance.cardField001 = val; return this; }
        public Builder cardField002(Long val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Boolean val) { instance.cardField003 = val; return this; }
        public Builder cardField004(BigDecimal val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Boolean val) { instance.cardField005 = val; return this; }
        public Builder cardField006(LocalDate val) { instance.cardField006 = val; return this; }
        public Builder cardField007(BigDecimal val) { instance.cardField007 = val; return this; }
        public Builder cardField008(Long val) { instance.cardField008 = val; return this; }
        public Builder cardField009(String val) { instance.cardField009 = val; return this; }
        public Builder cardField010(String val) { instance.cardField010 = val; return this; }
        public Builder cardField011(Integer val) { instance.cardField011 = val; return this; }
        public Builder cardField012(Boolean val) { instance.cardField012 = val; return this; }
        public Builder cardField013(String val) { instance.cardField013 = val; return this; }
        public Builder cardField014(Long val) { instance.cardField014 = val; return this; }
        public Builder cardField015(String val) { instance.cardField015 = val; return this; }
        public CardDto044 build() { return instance; }
    }

    public String getCardField000() { return cardField000; }
    public void setCardField000(String cardField000) { this.cardField000 = cardField000; }

    public Boolean getCardField001() { return cardField001; }
    public void setCardField001(Boolean cardField001) { this.cardField001 = cardField001; }

    public Long getCardField002() { return cardField002; }
    public void setCardField002(Long cardField002) { this.cardField002 = cardField002; }

    public Boolean getCardField003() { return cardField003; }
    public void setCardField003(Boolean cardField003) { this.cardField003 = cardField003; }

    public BigDecimal getCardField004() { return cardField004; }
    public void setCardField004(BigDecimal cardField004) { this.cardField004 = cardField004; }

    public Boolean getCardField005() { return cardField005; }
    public void setCardField005(Boolean cardField005) { this.cardField005 = cardField005; }

    public LocalDate getCardField006() { return cardField006; }
    public void setCardField006(LocalDate cardField006) { this.cardField006 = cardField006; }

    public BigDecimal getCardField007() { return cardField007; }
    public void setCardField007(BigDecimal cardField007) { this.cardField007 = cardField007; }

    public Long getCardField008() { return cardField008; }
    public void setCardField008(Long cardField008) { this.cardField008 = cardField008; }

    public String getCardField009() { return cardField009; }
    public void setCardField009(String cardField009) { this.cardField009 = cardField009; }

    public String getCardField010() { return cardField010; }
    public void setCardField010(String cardField010) { this.cardField010 = cardField010; }

    public Integer getCardField011() { return cardField011; }
    public void setCardField011(Integer cardField011) { this.cardField011 = cardField011; }

    public Boolean getCardField012() { return cardField012; }
    public void setCardField012(Boolean cardField012) { this.cardField012 = cardField012; }

    public String getCardField013() { return cardField013; }
    public void setCardField013(String cardField013) { this.cardField013 = cardField013; }

    public Long getCardField014() { return cardField014; }
    public void setCardField014(Long cardField014) { this.cardField014 = cardField014; }

    public String getCardField015() { return cardField015; }
    public void setCardField015(String cardField015) { this.cardField015 = cardField015; }

    @Override
    public String toString() {
        return "CardDto044{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
