package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto050 — Data Transfer Object for fraud operations.
 * Variant 50 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto050 {

    @JsonProperty("frauField000")
    private Double frauField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField001")
    private BigDecimal frauField001;

    @JsonProperty("frauField002")
    private Long frauField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField003")
    private BigDecimal frauField003;

    @JsonProperty("frauField004")
    private LocalDate frauField004;

    @JsonProperty("frauField005")
    private Double frauField005;

    @Size(max = 20)
    @JsonProperty("frauField006")
    private String frauField006;

    @JsonProperty("frauField007")
    private Double frauField007;

    @JsonProperty("frauField008")
    private Double frauField008;

    @JsonProperty("frauField009")
    private Long frauField009;

    public FraudDto050() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto050 instance = new FraudDto050();

        public Builder frauField000(Double val) { instance.frauField000 = val; return this; }
        public Builder frauField001(BigDecimal val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Long val) { instance.frauField002 = val; return this; }
        public Builder frauField003(BigDecimal val) { instance.frauField003 = val; return this; }
        public Builder frauField004(LocalDate val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Double val) { instance.frauField005 = val; return this; }
        public Builder frauField006(String val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Double val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Double val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Long val) { instance.frauField009 = val; return this; }
        public FraudDto050 build() { return instance; }
    }

    public Double getFrauField000() { return frauField000; }
    public void setFrauField000(Double frauField000) { this.frauField000 = frauField000; }

    public BigDecimal getFrauField001() { return frauField001; }
    public void setFrauField001(BigDecimal frauField001) { this.frauField001 = frauField001; }

    public Long getFrauField002() { return frauField002; }
    public void setFrauField002(Long frauField002) { this.frauField002 = frauField002; }

    public BigDecimal getFrauField003() { return frauField003; }
    public void setFrauField003(BigDecimal frauField003) { this.frauField003 = frauField003; }

    public LocalDate getFrauField004() { return frauField004; }
    public void setFrauField004(LocalDate frauField004) { this.frauField004 = frauField004; }

    public Double getFrauField005() { return frauField005; }
    public void setFrauField005(Double frauField005) { this.frauField005 = frauField005; }

    public String getFrauField006() { return frauField006; }
    public void setFrauField006(String frauField006) { this.frauField006 = frauField006; }

    public Double getFrauField007() { return frauField007; }
    public void setFrauField007(Double frauField007) { this.frauField007 = frauField007; }

    public Double getFrauField008() { return frauField008; }
    public void setFrauField008(Double frauField008) { this.frauField008 = frauField008; }

    public Long getFrauField009() { return frauField009; }
    public void setFrauField009(Long frauField009) { this.frauField009 = frauField009; }

    @Override
    public String toString() {
        return "FraudDto050{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
