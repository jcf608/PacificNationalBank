package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto051 — Data Transfer Object for risk operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto051 {

    @JsonProperty("riskField000")
    private Long riskField000;

    @Size(max = 40)
    @JsonProperty("riskField001")
    private String riskField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField002")
    private BigDecimal riskField002;

    @JsonProperty("riskField003")
    private Double riskField003;

    @JsonProperty("riskField004")
    private LocalDate riskField004;

    @JsonProperty("riskField005")
    private Long riskField005;

    @JsonProperty("riskField006")
    private Double riskField006;

    @JsonProperty("riskField007")
    private Boolean riskField007;

    @JsonProperty("riskField008")
    private LocalDate riskField008;

    @JsonProperty("riskField009")
    private LocalDate riskField009;

    @JsonProperty("riskField010")
    private LocalDate riskField010;

    public RiskDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto051 instance = new RiskDto051();

        public Builder riskField000(Long val) { instance.riskField000 = val; return this; }
        public Builder riskField001(String val) { instance.riskField001 = val; return this; }
        public Builder riskField002(BigDecimal val) { instance.riskField002 = val; return this; }
        public Builder riskField003(Double val) { instance.riskField003 = val; return this; }
        public Builder riskField004(LocalDate val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Long val) { instance.riskField005 = val; return this; }
        public Builder riskField006(Double val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Boolean val) { instance.riskField007 = val; return this; }
        public Builder riskField008(LocalDate val) { instance.riskField008 = val; return this; }
        public Builder riskField009(LocalDate val) { instance.riskField009 = val; return this; }
        public Builder riskField010(LocalDate val) { instance.riskField010 = val; return this; }
        public RiskDto051 build() { return instance; }
    }

    public Long getRiskField000() { return riskField000; }
    public void setRiskField000(Long riskField000) { this.riskField000 = riskField000; }

    public String getRiskField001() { return riskField001; }
    public void setRiskField001(String riskField001) { this.riskField001 = riskField001; }

    public BigDecimal getRiskField002() { return riskField002; }
    public void setRiskField002(BigDecimal riskField002) { this.riskField002 = riskField002; }

    public Double getRiskField003() { return riskField003; }
    public void setRiskField003(Double riskField003) { this.riskField003 = riskField003; }

    public LocalDate getRiskField004() { return riskField004; }
    public void setRiskField004(LocalDate riskField004) { this.riskField004 = riskField004; }

    public Long getRiskField005() { return riskField005; }
    public void setRiskField005(Long riskField005) { this.riskField005 = riskField005; }

    public Double getRiskField006() { return riskField006; }
    public void setRiskField006(Double riskField006) { this.riskField006 = riskField006; }

    public Boolean getRiskField007() { return riskField007; }
    public void setRiskField007(Boolean riskField007) { this.riskField007 = riskField007; }

    public LocalDate getRiskField008() { return riskField008; }
    public void setRiskField008(LocalDate riskField008) { this.riskField008 = riskField008; }

    public LocalDate getRiskField009() { return riskField009; }
    public void setRiskField009(LocalDate riskField009) { this.riskField009 = riskField009; }

    public LocalDate getRiskField010() { return riskField010; }
    public void setRiskField010(LocalDate riskField010) { this.riskField010 = riskField010; }

    @Override
    public String toString() {
        return "RiskDto051{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
