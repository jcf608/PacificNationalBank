package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto048 — Data Transfer Object for risk operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto048 {

    @JsonProperty("riskField000")
    private LocalDate riskField000;

    @Size(max = 100)
    @JsonProperty("riskField001")
    private String riskField001;

    @JsonProperty("riskField002")
    private LocalDate riskField002;

    @JsonProperty("riskField003")
    private LocalDate riskField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField004")
    private BigDecimal riskField004;

    @JsonProperty("riskField005")
    private Boolean riskField005;

    @JsonProperty("riskField006")
    private Integer riskField006;

    @Size(max = 20)
    @JsonProperty("riskField007")
    private String riskField007;

    public RiskDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto048 instance = new RiskDto048();

        public Builder riskField000(LocalDate val) { instance.riskField000 = val; return this; }
        public Builder riskField001(String val) { instance.riskField001 = val; return this; }
        public Builder riskField002(LocalDate val) { instance.riskField002 = val; return this; }
        public Builder riskField003(LocalDate val) { instance.riskField003 = val; return this; }
        public Builder riskField004(BigDecimal val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Boolean val) { instance.riskField005 = val; return this; }
        public Builder riskField006(Integer val) { instance.riskField006 = val; return this; }
        public Builder riskField007(String val) { instance.riskField007 = val; return this; }
        public RiskDto048 build() { return instance; }
    }

    public LocalDate getRiskField000() { return riskField000; }
    public void setRiskField000(LocalDate riskField000) { this.riskField000 = riskField000; }

    public String getRiskField001() { return riskField001; }
    public void setRiskField001(String riskField001) { this.riskField001 = riskField001; }

    public LocalDate getRiskField002() { return riskField002; }
    public void setRiskField002(LocalDate riskField002) { this.riskField002 = riskField002; }

    public LocalDate getRiskField003() { return riskField003; }
    public void setRiskField003(LocalDate riskField003) { this.riskField003 = riskField003; }

    public BigDecimal getRiskField004() { return riskField004; }
    public void setRiskField004(BigDecimal riskField004) { this.riskField004 = riskField004; }

    public Boolean getRiskField005() { return riskField005; }
    public void setRiskField005(Boolean riskField005) { this.riskField005 = riskField005; }

    public Integer getRiskField006() { return riskField006; }
    public void setRiskField006(Integer riskField006) { this.riskField006 = riskField006; }

    public String getRiskField007() { return riskField007; }
    public void setRiskField007(String riskField007) { this.riskField007 = riskField007; }

    @Override
    public String toString() {
        return "RiskDto048{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
