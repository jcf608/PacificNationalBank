package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto027 — Data Transfer Object for risk operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto027 {

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField000")
    private BigDecimal riskField000;

    @JsonProperty("riskField001")
    private Long riskField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField002")
    private BigDecimal riskField002;

    @Size(max = 100)
    @JsonProperty("riskField003")
    private String riskField003;

    @JsonProperty("riskField004")
    private Double riskField004;

    @JsonProperty("riskField005")
    private Long riskField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField006")
    private BigDecimal riskField006;

    @JsonProperty("riskField007")
    private Integer riskField007;

    @Size(max = 100)
    @JsonProperty("riskField008")
    private String riskField008;

    @JsonProperty("riskField009")
    private LocalDate riskField009;

    @JsonProperty("riskField010")
    private Integer riskField010;

    public RiskDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto027 instance = new RiskDto027();

        public Builder riskField000(BigDecimal val) { instance.riskField000 = val; return this; }
        public Builder riskField001(Long val) { instance.riskField001 = val; return this; }
        public Builder riskField002(BigDecimal val) { instance.riskField002 = val; return this; }
        public Builder riskField003(String val) { instance.riskField003 = val; return this; }
        public Builder riskField004(Double val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Long val) { instance.riskField005 = val; return this; }
        public Builder riskField006(BigDecimal val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Integer val) { instance.riskField007 = val; return this; }
        public Builder riskField008(String val) { instance.riskField008 = val; return this; }
        public Builder riskField009(LocalDate val) { instance.riskField009 = val; return this; }
        public Builder riskField010(Integer val) { instance.riskField010 = val; return this; }
        public RiskDto027 build() { return instance; }
    }

    public BigDecimal getRiskField000() { return riskField000; }
    public void setRiskField000(BigDecimal riskField000) { this.riskField000 = riskField000; }

    public Long getRiskField001() { return riskField001; }
    public void setRiskField001(Long riskField001) { this.riskField001 = riskField001; }

    public BigDecimal getRiskField002() { return riskField002; }
    public void setRiskField002(BigDecimal riskField002) { this.riskField002 = riskField002; }

    public String getRiskField003() { return riskField003; }
    public void setRiskField003(String riskField003) { this.riskField003 = riskField003; }

    public Double getRiskField004() { return riskField004; }
    public void setRiskField004(Double riskField004) { this.riskField004 = riskField004; }

    public Long getRiskField005() { return riskField005; }
    public void setRiskField005(Long riskField005) { this.riskField005 = riskField005; }

    public BigDecimal getRiskField006() { return riskField006; }
    public void setRiskField006(BigDecimal riskField006) { this.riskField006 = riskField006; }

    public Integer getRiskField007() { return riskField007; }
    public void setRiskField007(Integer riskField007) { this.riskField007 = riskField007; }

    public String getRiskField008() { return riskField008; }
    public void setRiskField008(String riskField008) { this.riskField008 = riskField008; }

    public LocalDate getRiskField009() { return riskField009; }
    public void setRiskField009(LocalDate riskField009) { this.riskField009 = riskField009; }

    public Integer getRiskField010() { return riskField010; }
    public void setRiskField010(Integer riskField010) { this.riskField010 = riskField010; }

    @Override
    public String toString() {
        return "RiskDto027{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
