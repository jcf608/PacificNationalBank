package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto036 — Data Transfer Object for risk operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto036 {

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField000")
    private BigDecimal riskField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField001")
    private BigDecimal riskField001;

    @JsonProperty("riskField002")
    private Integer riskField002;

    @Size(max = 100)
    @JsonProperty("riskField003")
    private String riskField003;

    @JsonProperty("riskField004")
    private Double riskField004;

    @JsonProperty("riskField005")
    private Double riskField005;

    @Size(max = 100)
    @JsonProperty("riskField006")
    private String riskField006;

    @Size(max = 100)
    @JsonProperty("riskField007")
    private String riskField007;

    public RiskDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto036 instance = new RiskDto036();

        public Builder riskField000(BigDecimal val) { instance.riskField000 = val; return this; }
        public Builder riskField001(BigDecimal val) { instance.riskField001 = val; return this; }
        public Builder riskField002(Integer val) { instance.riskField002 = val; return this; }
        public Builder riskField003(String val) { instance.riskField003 = val; return this; }
        public Builder riskField004(Double val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Double val) { instance.riskField005 = val; return this; }
        public Builder riskField006(String val) { instance.riskField006 = val; return this; }
        public Builder riskField007(String val) { instance.riskField007 = val; return this; }
        public RiskDto036 build() { return instance; }
    }

    public BigDecimal getRiskField000() { return riskField000; }
    public void setRiskField000(BigDecimal riskField000) { this.riskField000 = riskField000; }

    public BigDecimal getRiskField001() { return riskField001; }
    public void setRiskField001(BigDecimal riskField001) { this.riskField001 = riskField001; }

    public Integer getRiskField002() { return riskField002; }
    public void setRiskField002(Integer riskField002) { this.riskField002 = riskField002; }

    public String getRiskField003() { return riskField003; }
    public void setRiskField003(String riskField003) { this.riskField003 = riskField003; }

    public Double getRiskField004() { return riskField004; }
    public void setRiskField004(Double riskField004) { this.riskField004 = riskField004; }

    public Double getRiskField005() { return riskField005; }
    public void setRiskField005(Double riskField005) { this.riskField005 = riskField005; }

    public String getRiskField006() { return riskField006; }
    public void setRiskField006(String riskField006) { this.riskField006 = riskField006; }

    public String getRiskField007() { return riskField007; }
    public void setRiskField007(String riskField007) { this.riskField007 = riskField007; }

    @Override
    public String toString() {
        return "RiskDto036{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
