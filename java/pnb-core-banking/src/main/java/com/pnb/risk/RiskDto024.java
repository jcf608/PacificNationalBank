package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto024 — Data Transfer Object for risk operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto024 {

    @Size(max = 40)
    @JsonProperty("riskField000")
    private String riskField000;

    @JsonProperty("riskField001")
    private LocalDate riskField001;

    @Size(max = 20)
    @JsonProperty("riskField002")
    private String riskField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField003")
    private BigDecimal riskField003;

    @JsonProperty("riskField004")
    private Integer riskField004;

    @JsonProperty("riskField005")
    private Integer riskField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField006")
    private BigDecimal riskField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField007")
    private BigDecimal riskField007;

    public RiskDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto024 instance = new RiskDto024();

        public Builder riskField000(String val) { instance.riskField000 = val; return this; }
        public Builder riskField001(LocalDate val) { instance.riskField001 = val; return this; }
        public Builder riskField002(String val) { instance.riskField002 = val; return this; }
        public Builder riskField003(BigDecimal val) { instance.riskField003 = val; return this; }
        public Builder riskField004(Integer val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Integer val) { instance.riskField005 = val; return this; }
        public Builder riskField006(BigDecimal val) { instance.riskField006 = val; return this; }
        public Builder riskField007(BigDecimal val) { instance.riskField007 = val; return this; }
        public RiskDto024 build() { return instance; }
    }

    public String getRiskField000() { return riskField000; }
    public void setRiskField000(String riskField000) { this.riskField000 = riskField000; }

    public LocalDate getRiskField001() { return riskField001; }
    public void setRiskField001(LocalDate riskField001) { this.riskField001 = riskField001; }

    public String getRiskField002() { return riskField002; }
    public void setRiskField002(String riskField002) { this.riskField002 = riskField002; }

    public BigDecimal getRiskField003() { return riskField003; }
    public void setRiskField003(BigDecimal riskField003) { this.riskField003 = riskField003; }

    public Integer getRiskField004() { return riskField004; }
    public void setRiskField004(Integer riskField004) { this.riskField004 = riskField004; }

    public Integer getRiskField005() { return riskField005; }
    public void setRiskField005(Integer riskField005) { this.riskField005 = riskField005; }

    public BigDecimal getRiskField006() { return riskField006; }
    public void setRiskField006(BigDecimal riskField006) { this.riskField006 = riskField006; }

    public BigDecimal getRiskField007() { return riskField007; }
    public void setRiskField007(BigDecimal riskField007) { this.riskField007 = riskField007; }

    @Override
    public String toString() {
        return "RiskDto024{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
