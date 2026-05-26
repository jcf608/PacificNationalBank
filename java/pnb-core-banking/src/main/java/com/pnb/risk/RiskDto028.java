package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto028 — Data Transfer Object for risk operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto028 {

    @JsonProperty("riskField000")
    private Boolean riskField000;

    @JsonProperty("riskField001")
    private LocalDate riskField001;

    @JsonProperty("riskField002")
    private Boolean riskField002;

    @JsonProperty("riskField003")
    private Double riskField003;

    @JsonProperty("riskField004")
    private Double riskField004;

    @JsonProperty("riskField005")
    private LocalDate riskField005;

    @JsonProperty("riskField006")
    private Integer riskField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField007")
    private BigDecimal riskField007;

    @JsonProperty("riskField008")
    private Double riskField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField009")
    private BigDecimal riskField009;

    @JsonProperty("riskField010")
    private Boolean riskField010;

    @JsonProperty("riskField011")
    private Boolean riskField011;

    public RiskDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto028 instance = new RiskDto028();

        public Builder riskField000(Boolean val) { instance.riskField000 = val; return this; }
        public Builder riskField001(LocalDate val) { instance.riskField001 = val; return this; }
        public Builder riskField002(Boolean val) { instance.riskField002 = val; return this; }
        public Builder riskField003(Double val) { instance.riskField003 = val; return this; }
        public Builder riskField004(Double val) { instance.riskField004 = val; return this; }
        public Builder riskField005(LocalDate val) { instance.riskField005 = val; return this; }
        public Builder riskField006(Integer val) { instance.riskField006 = val; return this; }
        public Builder riskField007(BigDecimal val) { instance.riskField007 = val; return this; }
        public Builder riskField008(Double val) { instance.riskField008 = val; return this; }
        public Builder riskField009(BigDecimal val) { instance.riskField009 = val; return this; }
        public Builder riskField010(Boolean val) { instance.riskField010 = val; return this; }
        public Builder riskField011(Boolean val) { instance.riskField011 = val; return this; }
        public RiskDto028 build() { return instance; }
    }

    public Boolean getRiskField000() { return riskField000; }
    public void setRiskField000(Boolean riskField000) { this.riskField000 = riskField000; }

    public LocalDate getRiskField001() { return riskField001; }
    public void setRiskField001(LocalDate riskField001) { this.riskField001 = riskField001; }

    public Boolean getRiskField002() { return riskField002; }
    public void setRiskField002(Boolean riskField002) { this.riskField002 = riskField002; }

    public Double getRiskField003() { return riskField003; }
    public void setRiskField003(Double riskField003) { this.riskField003 = riskField003; }

    public Double getRiskField004() { return riskField004; }
    public void setRiskField004(Double riskField004) { this.riskField004 = riskField004; }

    public LocalDate getRiskField005() { return riskField005; }
    public void setRiskField005(LocalDate riskField005) { this.riskField005 = riskField005; }

    public Integer getRiskField006() { return riskField006; }
    public void setRiskField006(Integer riskField006) { this.riskField006 = riskField006; }

    public BigDecimal getRiskField007() { return riskField007; }
    public void setRiskField007(BigDecimal riskField007) { this.riskField007 = riskField007; }

    public Double getRiskField008() { return riskField008; }
    public void setRiskField008(Double riskField008) { this.riskField008 = riskField008; }

    public BigDecimal getRiskField009() { return riskField009; }
    public void setRiskField009(BigDecimal riskField009) { this.riskField009 = riskField009; }

    public Boolean getRiskField010() { return riskField010; }
    public void setRiskField010(Boolean riskField010) { this.riskField010 = riskField010; }

    public Boolean getRiskField011() { return riskField011; }
    public void setRiskField011(Boolean riskField011) { this.riskField011 = riskField011; }

    @Override
    public String toString() {
        return "RiskDto028{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
