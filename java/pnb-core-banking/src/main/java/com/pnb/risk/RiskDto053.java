package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto053 — Data Transfer Object for risk operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto053 {

    @JsonProperty("riskField000")
    private Double riskField000;

    @JsonProperty("riskField001")
    private Double riskField001;

    @JsonProperty("riskField002")
    private Double riskField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField003")
    private BigDecimal riskField003;

    @JsonProperty("riskField004")
    private LocalDate riskField004;

    @JsonProperty("riskField005")
    private LocalDate riskField005;

    @Size(max = 100)
    @JsonProperty("riskField006")
    private String riskField006;

    @JsonProperty("riskField007")
    private Integer riskField007;

    @Size(max = 200)
    @JsonProperty("riskField008")
    private String riskField008;

    @JsonProperty("riskField009")
    private Integer riskField009;

    @JsonProperty("riskField010")
    private Double riskField010;

    @JsonProperty("riskField011")
    private Integer riskField011;

    @JsonProperty("riskField012")
    private Integer riskField012;

    public RiskDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto053 instance = new RiskDto053();

        public Builder riskField000(Double val) { instance.riskField000 = val; return this; }
        public Builder riskField001(Double val) { instance.riskField001 = val; return this; }
        public Builder riskField002(Double val) { instance.riskField002 = val; return this; }
        public Builder riskField003(BigDecimal val) { instance.riskField003 = val; return this; }
        public Builder riskField004(LocalDate val) { instance.riskField004 = val; return this; }
        public Builder riskField005(LocalDate val) { instance.riskField005 = val; return this; }
        public Builder riskField006(String val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Integer val) { instance.riskField007 = val; return this; }
        public Builder riskField008(String val) { instance.riskField008 = val; return this; }
        public Builder riskField009(Integer val) { instance.riskField009 = val; return this; }
        public Builder riskField010(Double val) { instance.riskField010 = val; return this; }
        public Builder riskField011(Integer val) { instance.riskField011 = val; return this; }
        public Builder riskField012(Integer val) { instance.riskField012 = val; return this; }
        public RiskDto053 build() { return instance; }
    }

    public Double getRiskField000() { return riskField000; }
    public void setRiskField000(Double riskField000) { this.riskField000 = riskField000; }

    public Double getRiskField001() { return riskField001; }
    public void setRiskField001(Double riskField001) { this.riskField001 = riskField001; }

    public Double getRiskField002() { return riskField002; }
    public void setRiskField002(Double riskField002) { this.riskField002 = riskField002; }

    public BigDecimal getRiskField003() { return riskField003; }
    public void setRiskField003(BigDecimal riskField003) { this.riskField003 = riskField003; }

    public LocalDate getRiskField004() { return riskField004; }
    public void setRiskField004(LocalDate riskField004) { this.riskField004 = riskField004; }

    public LocalDate getRiskField005() { return riskField005; }
    public void setRiskField005(LocalDate riskField005) { this.riskField005 = riskField005; }

    public String getRiskField006() { return riskField006; }
    public void setRiskField006(String riskField006) { this.riskField006 = riskField006; }

    public Integer getRiskField007() { return riskField007; }
    public void setRiskField007(Integer riskField007) { this.riskField007 = riskField007; }

    public String getRiskField008() { return riskField008; }
    public void setRiskField008(String riskField008) { this.riskField008 = riskField008; }

    public Integer getRiskField009() { return riskField009; }
    public void setRiskField009(Integer riskField009) { this.riskField009 = riskField009; }

    public Double getRiskField010() { return riskField010; }
    public void setRiskField010(Double riskField010) { this.riskField010 = riskField010; }

    public Integer getRiskField011() { return riskField011; }
    public void setRiskField011(Integer riskField011) { this.riskField011 = riskField011; }

    public Integer getRiskField012() { return riskField012; }
    public void setRiskField012(Integer riskField012) { this.riskField012 = riskField012; }

    @Override
    public String toString() {
        return "RiskDto053{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
