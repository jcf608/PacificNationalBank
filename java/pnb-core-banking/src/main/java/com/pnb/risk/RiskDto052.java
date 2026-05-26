package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto052 — Data Transfer Object for risk operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto052 {

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField000")
    private BigDecimal riskField000;

    @JsonProperty("riskField001")
    private LocalDate riskField001;

    @JsonProperty("riskField002")
    private Long riskField002;

    @JsonProperty("riskField003")
    private Boolean riskField003;

    @JsonProperty("riskField004")
    private Boolean riskField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField005")
    private BigDecimal riskField005;

    @JsonProperty("riskField006")
    private Double riskField006;

    @JsonProperty("riskField007")
    private LocalDate riskField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField008")
    private BigDecimal riskField008;

    @JsonProperty("riskField009")
    private Boolean riskField009;

    @JsonProperty("riskField010")
    private Integer riskField010;

    @Size(max = 20)
    @JsonProperty("riskField011")
    private String riskField011;

    public RiskDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto052 instance = new RiskDto052();

        public Builder riskField000(BigDecimal val) { instance.riskField000 = val; return this; }
        public Builder riskField001(LocalDate val) { instance.riskField001 = val; return this; }
        public Builder riskField002(Long val) { instance.riskField002 = val; return this; }
        public Builder riskField003(Boolean val) { instance.riskField003 = val; return this; }
        public Builder riskField004(Boolean val) { instance.riskField004 = val; return this; }
        public Builder riskField005(BigDecimal val) { instance.riskField005 = val; return this; }
        public Builder riskField006(Double val) { instance.riskField006 = val; return this; }
        public Builder riskField007(LocalDate val) { instance.riskField007 = val; return this; }
        public Builder riskField008(BigDecimal val) { instance.riskField008 = val; return this; }
        public Builder riskField009(Boolean val) { instance.riskField009 = val; return this; }
        public Builder riskField010(Integer val) { instance.riskField010 = val; return this; }
        public Builder riskField011(String val) { instance.riskField011 = val; return this; }
        public RiskDto052 build() { return instance; }
    }

    public BigDecimal getRiskField000() { return riskField000; }
    public void setRiskField000(BigDecimal riskField000) { this.riskField000 = riskField000; }

    public LocalDate getRiskField001() { return riskField001; }
    public void setRiskField001(LocalDate riskField001) { this.riskField001 = riskField001; }

    public Long getRiskField002() { return riskField002; }
    public void setRiskField002(Long riskField002) { this.riskField002 = riskField002; }

    public Boolean getRiskField003() { return riskField003; }
    public void setRiskField003(Boolean riskField003) { this.riskField003 = riskField003; }

    public Boolean getRiskField004() { return riskField004; }
    public void setRiskField004(Boolean riskField004) { this.riskField004 = riskField004; }

    public BigDecimal getRiskField005() { return riskField005; }
    public void setRiskField005(BigDecimal riskField005) { this.riskField005 = riskField005; }

    public Double getRiskField006() { return riskField006; }
    public void setRiskField006(Double riskField006) { this.riskField006 = riskField006; }

    public LocalDate getRiskField007() { return riskField007; }
    public void setRiskField007(LocalDate riskField007) { this.riskField007 = riskField007; }

    public BigDecimal getRiskField008() { return riskField008; }
    public void setRiskField008(BigDecimal riskField008) { this.riskField008 = riskField008; }

    public Boolean getRiskField009() { return riskField009; }
    public void setRiskField009(Boolean riskField009) { this.riskField009 = riskField009; }

    public Integer getRiskField010() { return riskField010; }
    public void setRiskField010(Integer riskField010) { this.riskField010 = riskField010; }

    public String getRiskField011() { return riskField011; }
    public void setRiskField011(String riskField011) { this.riskField011 = riskField011; }

    @Override
    public String toString() {
        return "RiskDto052{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
