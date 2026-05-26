package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto041 — Data Transfer Object for risk operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto041 {

    @JsonProperty("riskField000")
    private LocalDate riskField000;

    @JsonProperty("riskField001")
    private Integer riskField001;

    @JsonProperty("riskField002")
    private Long riskField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField003")
    private BigDecimal riskField003;

    @Size(max = 20)
    @JsonProperty("riskField004")
    private String riskField004;

    @JsonProperty("riskField005")
    private Long riskField005;

    @JsonProperty("riskField006")
    private Long riskField006;

    @JsonProperty("riskField007")
    private Integer riskField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField008")
    private BigDecimal riskField008;

    @JsonProperty("riskField009")
    private LocalDate riskField009;

    @JsonProperty("riskField010")
    private Double riskField010;

    @JsonProperty("riskField011")
    private LocalDate riskField011;

    @JsonProperty("riskField012")
    private Double riskField012;

    public RiskDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto041 instance = new RiskDto041();

        public Builder riskField000(LocalDate val) { instance.riskField000 = val; return this; }
        public Builder riskField001(Integer val) { instance.riskField001 = val; return this; }
        public Builder riskField002(Long val) { instance.riskField002 = val; return this; }
        public Builder riskField003(BigDecimal val) { instance.riskField003 = val; return this; }
        public Builder riskField004(String val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Long val) { instance.riskField005 = val; return this; }
        public Builder riskField006(Long val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Integer val) { instance.riskField007 = val; return this; }
        public Builder riskField008(BigDecimal val) { instance.riskField008 = val; return this; }
        public Builder riskField009(LocalDate val) { instance.riskField009 = val; return this; }
        public Builder riskField010(Double val) { instance.riskField010 = val; return this; }
        public Builder riskField011(LocalDate val) { instance.riskField011 = val; return this; }
        public Builder riskField012(Double val) { instance.riskField012 = val; return this; }
        public RiskDto041 build() { return instance; }
    }

    public LocalDate getRiskField000() { return riskField000; }
    public void setRiskField000(LocalDate riskField000) { this.riskField000 = riskField000; }

    public Integer getRiskField001() { return riskField001; }
    public void setRiskField001(Integer riskField001) { this.riskField001 = riskField001; }

    public Long getRiskField002() { return riskField002; }
    public void setRiskField002(Long riskField002) { this.riskField002 = riskField002; }

    public BigDecimal getRiskField003() { return riskField003; }
    public void setRiskField003(BigDecimal riskField003) { this.riskField003 = riskField003; }

    public String getRiskField004() { return riskField004; }
    public void setRiskField004(String riskField004) { this.riskField004 = riskField004; }

    public Long getRiskField005() { return riskField005; }
    public void setRiskField005(Long riskField005) { this.riskField005 = riskField005; }

    public Long getRiskField006() { return riskField006; }
    public void setRiskField006(Long riskField006) { this.riskField006 = riskField006; }

    public Integer getRiskField007() { return riskField007; }
    public void setRiskField007(Integer riskField007) { this.riskField007 = riskField007; }

    public BigDecimal getRiskField008() { return riskField008; }
    public void setRiskField008(BigDecimal riskField008) { this.riskField008 = riskField008; }

    public LocalDate getRiskField009() { return riskField009; }
    public void setRiskField009(LocalDate riskField009) { this.riskField009 = riskField009; }

    public Double getRiskField010() { return riskField010; }
    public void setRiskField010(Double riskField010) { this.riskField010 = riskField010; }

    public LocalDate getRiskField011() { return riskField011; }
    public void setRiskField011(LocalDate riskField011) { this.riskField011 = riskField011; }

    public Double getRiskField012() { return riskField012; }
    public void setRiskField012(Double riskField012) { this.riskField012 = riskField012; }

    @Override
    public String toString() {
        return "RiskDto041{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
