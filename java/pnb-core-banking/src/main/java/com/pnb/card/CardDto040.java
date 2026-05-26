package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto040 — Data Transfer Object for card operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto040 {

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField000")
    private BigDecimal cardField000;

    @Size(max = 60)
    @JsonProperty("cardField001")
    private String cardField001;

    @Size(max = 60)
    @JsonProperty("cardField002")
    private String cardField002;

    @JsonProperty("cardField003")
    private Long cardField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("cardField004")
    private BigDecimal cardField004;

    @JsonProperty("cardField005")
    private Boolean cardField005;

    @JsonProperty("cardField006")
    private Long cardField006;

    @JsonProperty("cardField007")
    private Long cardField007;

    @JsonProperty("cardField008")
    private LocalDate cardField008;

    @JsonProperty("cardField009")
    private Boolean cardField009;

    @JsonProperty("cardField010")
    private LocalDate cardField010;

    @JsonProperty("cardField011")
    private Integer cardField011;

    public CardDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto040 instance = new CardDto040();

        public Builder cardField000(BigDecimal val) { instance.cardField000 = val; return this; }
        public Builder cardField001(String val) { instance.cardField001 = val; return this; }
        public Builder cardField002(String val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Long val) { instance.cardField003 = val; return this; }
        public Builder cardField004(BigDecimal val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Boolean val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Long val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Long val) { instance.cardField007 = val; return this; }
        public Builder cardField008(LocalDate val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Boolean val) { instance.cardField009 = val; return this; }
        public Builder cardField010(LocalDate val) { instance.cardField010 = val; return this; }
        public Builder cardField011(Integer val) { instance.cardField011 = val; return this; }
        public CardDto040 build() { return instance; }
    }

    public BigDecimal getCardField000() { return cardField000; }
    public void setCardField000(BigDecimal cardField000) { this.cardField000 = cardField000; }

    public String getCardField001() { return cardField001; }
    public void setCardField001(String cardField001) { this.cardField001 = cardField001; }

    public String getCardField002() { return cardField002; }
    public void setCardField002(String cardField002) { this.cardField002 = cardField002; }

    public Long getCardField003() { return cardField003; }
    public void setCardField003(Long cardField003) { this.cardField003 = cardField003; }

    public BigDecimal getCardField004() { return cardField004; }
    public void setCardField004(BigDecimal cardField004) { this.cardField004 = cardField004; }

    public Boolean getCardField005() { return cardField005; }
    public void setCardField005(Boolean cardField005) { this.cardField005 = cardField005; }

    public Long getCardField006() { return cardField006; }
    public void setCardField006(Long cardField006) { this.cardField006 = cardField006; }

    public Long getCardField007() { return cardField007; }
    public void setCardField007(Long cardField007) { this.cardField007 = cardField007; }

    public LocalDate getCardField008() { return cardField008; }
    public void setCardField008(LocalDate cardField008) { this.cardField008 = cardField008; }

    public Boolean getCardField009() { return cardField009; }
    public void setCardField009(Boolean cardField009) { this.cardField009 = cardField009; }

    public LocalDate getCardField010() { return cardField010; }
    public void setCardField010(LocalDate cardField010) { this.cardField010 = cardField010; }

    public Integer getCardField011() { return cardField011; }
    public void setCardField011(Integer cardField011) { this.cardField011 = cardField011; }

    @Override
    public String toString() {
        return "CardDto040{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
