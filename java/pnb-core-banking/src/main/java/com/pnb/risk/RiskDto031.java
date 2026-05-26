package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto031 — Data Transfer Object for risk operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto031 {

    @Size(max = 100)
    @JsonProperty("riskField000")
    private String riskField000;

    @JsonProperty("riskField001")
    private LocalDate riskField001;

    @Size(max = 60)
    @JsonProperty("riskField002")
    private String riskField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField003")
    private BigDecimal riskField003;

    @JsonProperty("riskField004")
    private Double riskField004;

    @JsonProperty("riskField005")
    private Double riskField005;

    @JsonProperty("riskField006")
    private LocalDate riskField006;

    @JsonProperty("riskField007")
    private Integer riskField007;

    @JsonProperty("riskField008")
    private Double riskField008;

    @JsonProperty("riskField009")
    private Integer riskField009;

    @JsonProperty("riskField010")
    private Integer riskField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField011")
    private BigDecimal riskField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField012")
    private BigDecimal riskField012;

    @JsonProperty("riskField013")
    private Integer riskField013;

    @JsonProperty("riskField014")
    private Double riskField014;

    public RiskDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto031 instance = new RiskDto031();

        public Builder riskField000(String val) { instance.riskField000 = val; return this; }
        public Builder riskField001(LocalDate val) { instance.riskField001 = val; return this; }
        public Builder riskField002(String val) { instance.riskField002 = val; return this; }
        public Builder riskField003(BigDecimal val) { instance.riskField003 = val; return this; }
        public Builder riskField004(Double val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Double val) { instance.riskField005 = val; return this; }
        public Builder riskField006(LocalDate val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Integer val) { instance.riskField007 = val; return this; }
        public Builder riskField008(Double val) { instance.riskField008 = val; return this; }
        public Builder riskField009(Integer val) { instance.riskField009 = val; return this; }
        public Builder riskField010(Integer val) { instance.riskField010 = val; return this; }
        public Builder riskField011(BigDecimal val) { instance.riskField011 = val; return this; }
        public Builder riskField012(BigDecimal val) { instance.riskField012 = val; return this; }
        public Builder riskField013(Integer val) { instance.riskField013 = val; return this; }
        public Builder riskField014(Double val) { instance.riskField014 = val; return this; }
        public RiskDto031 build() { return instance; }
    }

    public String getRiskField000() { return riskField000; }
    public void setRiskField000(String riskField000) { this.riskField000 = riskField000; }

    public LocalDate getRiskField001() { return riskField001; }
    public void setRiskField001(LocalDate riskField001) { this.riskField001 = riskField001; }

    public String getRiskField002() { return riskField002; }
    public void setRiskField002(String riskField002) { this.riskField002 = riskField002; }

    public BigDecimal getRiskField003() { return riskField003; }
    public void setRiskField003(BigDecimal riskField003) { this.riskField003 = riskField003; }

    public Double getRiskField004() { return riskField004; }
    public void setRiskField004(Double riskField004) { this.riskField004 = riskField004; }

    public Double getRiskField005() { return riskField005; }
    public void setRiskField005(Double riskField005) { this.riskField005 = riskField005; }

    public LocalDate getRiskField006() { return riskField006; }
    public void setRiskField006(LocalDate riskField006) { this.riskField006 = riskField006; }

    public Integer getRiskField007() { return riskField007; }
    public void setRiskField007(Integer riskField007) { this.riskField007 = riskField007; }

    public Double getRiskField008() { return riskField008; }
    public void setRiskField008(Double riskField008) { this.riskField008 = riskField008; }

    public Integer getRiskField009() { return riskField009; }
    public void setRiskField009(Integer riskField009) { this.riskField009 = riskField009; }

    public Integer getRiskField010() { return riskField010; }
    public void setRiskField010(Integer riskField010) { this.riskField010 = riskField010; }

    public BigDecimal getRiskField011() { return riskField011; }
    public void setRiskField011(BigDecimal riskField011) { this.riskField011 = riskField011; }

    public BigDecimal getRiskField012() { return riskField012; }
    public void setRiskField012(BigDecimal riskField012) { this.riskField012 = riskField012; }

    public Integer getRiskField013() { return riskField013; }
    public void setRiskField013(Integer riskField013) { this.riskField013 = riskField013; }

    public Double getRiskField014() { return riskField014; }
    public void setRiskField014(Double riskField014) { this.riskField014 = riskField014; }

    @Override
    public String toString() {
        return "RiskDto031{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
