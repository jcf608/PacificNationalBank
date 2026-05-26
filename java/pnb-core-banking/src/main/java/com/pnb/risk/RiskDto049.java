package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto049 — Data Transfer Object for risk operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto049 {

    @Size(max = 200)
    @JsonProperty("riskField000")
    private String riskField000;

    @JsonProperty("riskField001")
    private Boolean riskField001;

    @JsonProperty("riskField002")
    private Double riskField002;

    @JsonProperty("riskField003")
    private Integer riskField003;

    @JsonProperty("riskField004")
    private Long riskField004;

    @JsonProperty("riskField005")
    private LocalDate riskField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField006")
    private BigDecimal riskField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField007")
    private BigDecimal riskField007;

    @JsonProperty("riskField008")
    private Boolean riskField008;

    public RiskDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto049 instance = new RiskDto049();

        public Builder riskField000(String val) { instance.riskField000 = val; return this; }
        public Builder riskField001(Boolean val) { instance.riskField001 = val; return this; }
        public Builder riskField002(Double val) { instance.riskField002 = val; return this; }
        public Builder riskField003(Integer val) { instance.riskField003 = val; return this; }
        public Builder riskField004(Long val) { instance.riskField004 = val; return this; }
        public Builder riskField005(LocalDate val) { instance.riskField005 = val; return this; }
        public Builder riskField006(BigDecimal val) { instance.riskField006 = val; return this; }
        public Builder riskField007(BigDecimal val) { instance.riskField007 = val; return this; }
        public Builder riskField008(Boolean val) { instance.riskField008 = val; return this; }
        public RiskDto049 build() { return instance; }
    }

    public String getRiskField000() { return riskField000; }
    public void setRiskField000(String riskField000) { this.riskField000 = riskField000; }

    public Boolean getRiskField001() { return riskField001; }
    public void setRiskField001(Boolean riskField001) { this.riskField001 = riskField001; }

    public Double getRiskField002() { return riskField002; }
    public void setRiskField002(Double riskField002) { this.riskField002 = riskField002; }

    public Integer getRiskField003() { return riskField003; }
    public void setRiskField003(Integer riskField003) { this.riskField003 = riskField003; }

    public Long getRiskField004() { return riskField004; }
    public void setRiskField004(Long riskField004) { this.riskField004 = riskField004; }

    public LocalDate getRiskField005() { return riskField005; }
    public void setRiskField005(LocalDate riskField005) { this.riskField005 = riskField005; }

    public BigDecimal getRiskField006() { return riskField006; }
    public void setRiskField006(BigDecimal riskField006) { this.riskField006 = riskField006; }

    public BigDecimal getRiskField007() { return riskField007; }
    public void setRiskField007(BigDecimal riskField007) { this.riskField007 = riskField007; }

    public Boolean getRiskField008() { return riskField008; }
    public void setRiskField008(Boolean riskField008) { this.riskField008 = riskField008; }

    @Override
    public String toString() {
        return "RiskDto049{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
