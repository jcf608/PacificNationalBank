package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto025 — Data Transfer Object for fraud operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto025 {

    @JsonProperty("frauField000")
    private Double frauField000;

    @Size(max = 20)
    @JsonProperty("frauField001")
    private String frauField001;

    @JsonProperty("frauField002")
    private Double frauField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField003")
    private BigDecimal frauField003;

    @Size(max = 200)
    @JsonProperty("frauField004")
    private String frauField004;

    @JsonProperty("frauField005")
    private Double frauField005;

    @Size(max = 200)
    @JsonProperty("frauField006")
    private String frauField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField007")
    private BigDecimal frauField007;

    @JsonProperty("frauField008")
    private Boolean frauField008;

    public FraudDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto025 instance = new FraudDto025();

        public Builder frauField000(Double val) { instance.frauField000 = val; return this; }
        public Builder frauField001(String val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Double val) { instance.frauField002 = val; return this; }
        public Builder frauField003(BigDecimal val) { instance.frauField003 = val; return this; }
        public Builder frauField004(String val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Double val) { instance.frauField005 = val; return this; }
        public Builder frauField006(String val) { instance.frauField006 = val; return this; }
        public Builder frauField007(BigDecimal val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Boolean val) { instance.frauField008 = val; return this; }
        public FraudDto025 build() { return instance; }
    }

    public Double getFrauField000() { return frauField000; }
    public void setFrauField000(Double frauField000) { this.frauField000 = frauField000; }

    public String getFrauField001() { return frauField001; }
    public void setFrauField001(String frauField001) { this.frauField001 = frauField001; }

    public Double getFrauField002() { return frauField002; }
    public void setFrauField002(Double frauField002) { this.frauField002 = frauField002; }

    public BigDecimal getFrauField003() { return frauField003; }
    public void setFrauField003(BigDecimal frauField003) { this.frauField003 = frauField003; }

    public String getFrauField004() { return frauField004; }
    public void setFrauField004(String frauField004) { this.frauField004 = frauField004; }

    public Double getFrauField005() { return frauField005; }
    public void setFrauField005(Double frauField005) { this.frauField005 = frauField005; }

    public String getFrauField006() { return frauField006; }
    public void setFrauField006(String frauField006) { this.frauField006 = frauField006; }

    public BigDecimal getFrauField007() { return frauField007; }
    public void setFrauField007(BigDecimal frauField007) { this.frauField007 = frauField007; }

    public Boolean getFrauField008() { return frauField008; }
    public void setFrauField008(Boolean frauField008) { this.frauField008 = frauField008; }

    @Override
    public String toString() {
        return "FraudDto025{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
