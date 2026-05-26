package com.pnb.card;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CardDto046 — Data Transfer Object for card operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDto046 {

    @JsonProperty("cardField000")
    private Double cardField000;

    @JsonProperty("cardField001")
    private Double cardField001;

    @JsonProperty("cardField002")
    private LocalDate cardField002;

    @JsonProperty("cardField003")
    private Double cardField003;

    @JsonProperty("cardField004")
    private Integer cardField004;

    @JsonProperty("cardField005")
    private Integer cardField005;

    @JsonProperty("cardField006")
    private Boolean cardField006;

    @JsonProperty("cardField007")
    private Integer cardField007;

    @JsonProperty("cardField008")
    private LocalDate cardField008;

    @JsonProperty("cardField009")
    private Double cardField009;

    @Size(max = 60)
    @JsonProperty("cardField010")
    private String cardField010;

    @JsonProperty("cardField011")
    private LocalDate cardField011;

    @JsonProperty("cardField012")
    private Long cardField012;

    @JsonProperty("cardField013")
    private Double cardField013;

    @JsonProperty("cardField014")
    private Long cardField014;

    @Size(max = 40)
    @JsonProperty("cardField015")
    private String cardField015;

    @Size(max = 100)
    @JsonProperty("cardField016")
    private String cardField016;

    @JsonProperty("cardField017")
    private Boolean cardField017;

    public CardDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CardDto046 instance = new CardDto046();

        public Builder cardField000(Double val) { instance.cardField000 = val; return this; }
        public Builder cardField001(Double val) { instance.cardField001 = val; return this; }
        public Builder cardField002(LocalDate val) { instance.cardField002 = val; return this; }
        public Builder cardField003(Double val) { instance.cardField003 = val; return this; }
        public Builder cardField004(Integer val) { instance.cardField004 = val; return this; }
        public Builder cardField005(Integer val) { instance.cardField005 = val; return this; }
        public Builder cardField006(Boolean val) { instance.cardField006 = val; return this; }
        public Builder cardField007(Integer val) { instance.cardField007 = val; return this; }
        public Builder cardField008(LocalDate val) { instance.cardField008 = val; return this; }
        public Builder cardField009(Double val) { instance.cardField009 = val; return this; }
        public Builder cardField010(String val) { instance.cardField010 = val; return this; }
        public Builder cardField011(LocalDate val) { instance.cardField011 = val; return this; }
        public Builder cardField012(Long val) { instance.cardField012 = val; return this; }
        public Builder cardField013(Double val) { instance.cardField013 = val; return this; }
        public Builder cardField014(Long val) { instance.cardField014 = val; return this; }
        public Builder cardField015(String val) { instance.cardField015 = val; return this; }
        public Builder cardField016(String val) { instance.cardField016 = val; return this; }
        public Builder cardField017(Boolean val) { instance.cardField017 = val; return this; }
        public CardDto046 build() { return instance; }
    }

    public Double getCardField000() { return cardField000; }
    public void setCardField000(Double cardField000) { this.cardField000 = cardField000; }

    public Double getCardField001() { return cardField001; }
    public void setCardField001(Double cardField001) { this.cardField001 = cardField001; }

    public LocalDate getCardField002() { return cardField002; }
    public void setCardField002(LocalDate cardField002) { this.cardField002 = cardField002; }

    public Double getCardField003() { return cardField003; }
    public void setCardField003(Double cardField003) { this.cardField003 = cardField003; }

    public Integer getCardField004() { return cardField004; }
    public void setCardField004(Integer cardField004) { this.cardField004 = cardField004; }

    public Integer getCardField005() { return cardField005; }
    public void setCardField005(Integer cardField005) { this.cardField005 = cardField005; }

    public Boolean getCardField006() { return cardField006; }
    public void setCardField006(Boolean cardField006) { this.cardField006 = cardField006; }

    public Integer getCardField007() { return cardField007; }
    public void setCardField007(Integer cardField007) { this.cardField007 = cardField007; }

    public LocalDate getCardField008() { return cardField008; }
    public void setCardField008(LocalDate cardField008) { this.cardField008 = cardField008; }

    public Double getCardField009() { return cardField009; }
    public void setCardField009(Double cardField009) { this.cardField009 = cardField009; }

    public String getCardField010() { return cardField010; }
    public void setCardField010(String cardField010) { this.cardField010 = cardField010; }

    public LocalDate getCardField011() { return cardField011; }
    public void setCardField011(LocalDate cardField011) { this.cardField011 = cardField011; }

    public Long getCardField012() { return cardField012; }
    public void setCardField012(Long cardField012) { this.cardField012 = cardField012; }

    public Double getCardField013() { return cardField013; }
    public void setCardField013(Double cardField013) { this.cardField013 = cardField013; }

    public Long getCardField014() { return cardField014; }
    public void setCardField014(Long cardField014) { this.cardField014 = cardField014; }

    public String getCardField015() { return cardField015; }
    public void setCardField015(String cardField015) { this.cardField015 = cardField015; }

    public String getCardField016() { return cardField016; }
    public void setCardField016(String cardField016) { this.cardField016 = cardField016; }

    public Boolean getCardField017() { return cardField017; }
    public void setCardField017(Boolean cardField017) { this.cardField017 = cardField017; }

    @Override
    public String toString() {
        return "CardDto046{" +
            "cardField000=" + cardField000 + ", " +
            "cardField001=" + cardField001 + ", " +
            "cardField002=" + cardField002 + ", " +
            "cardField003=" + cardField003 + ", " +
            "cardField004=" + cardField004 + ", " +
            "}";
    }
}
