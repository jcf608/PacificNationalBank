package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto038 — Data Transfer Object for risk operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto038 {

    @JsonProperty("riskField000")
    private Double riskField000;

    @Size(max = 40)
    @JsonProperty("riskField001")
    private String riskField001;

    @JsonProperty("riskField002")
    private LocalDate riskField002;

    @Size(max = 200)
    @JsonProperty("riskField003")
    private String riskField003;

    @Size(max = 200)
    @JsonProperty("riskField004")
    private String riskField004;

    @JsonProperty("riskField005")
    private Integer riskField005;

    @JsonProperty("riskField006")
    private LocalDate riskField006;

    @JsonProperty("riskField007")
    private Boolean riskField007;

    @JsonProperty("riskField008")
    private Long riskField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField009")
    private BigDecimal riskField009;

    public RiskDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto038 instance = new RiskDto038();

        public Builder riskField000(Double val) { instance.riskField000 = val; return this; }
        public Builder riskField001(String val) { instance.riskField001 = val; return this; }
        public Builder riskField002(LocalDate val) { instance.riskField002 = val; return this; }
        public Builder riskField003(String val) { instance.riskField003 = val; return this; }
        public Builder riskField004(String val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Integer val) { instance.riskField005 = val; return this; }
        public Builder riskField006(LocalDate val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Boolean val) { instance.riskField007 = val; return this; }
        public Builder riskField008(Long val) { instance.riskField008 = val; return this; }
        public Builder riskField009(BigDecimal val) { instance.riskField009 = val; return this; }
        public RiskDto038 build() { return instance; }
    }

    public Double getRiskField000() { return riskField000; }
    public void setRiskField000(Double riskField000) { this.riskField000 = riskField000; }

    public String getRiskField001() { return riskField001; }
    public void setRiskField001(String riskField001) { this.riskField001 = riskField001; }

    public LocalDate getRiskField002() { return riskField002; }
    public void setRiskField002(LocalDate riskField002) { this.riskField002 = riskField002; }

    public String getRiskField003() { return riskField003; }
    public void setRiskField003(String riskField003) { this.riskField003 = riskField003; }

    public String getRiskField004() { return riskField004; }
    public void setRiskField004(String riskField004) { this.riskField004 = riskField004; }

    public Integer getRiskField005() { return riskField005; }
    public void setRiskField005(Integer riskField005) { this.riskField005 = riskField005; }

    public LocalDate getRiskField006() { return riskField006; }
    public void setRiskField006(LocalDate riskField006) { this.riskField006 = riskField006; }

    public Boolean getRiskField007() { return riskField007; }
    public void setRiskField007(Boolean riskField007) { this.riskField007 = riskField007; }

    public Long getRiskField008() { return riskField008; }
    public void setRiskField008(Long riskField008) { this.riskField008 = riskField008; }

    public BigDecimal getRiskField009() { return riskField009; }
    public void setRiskField009(BigDecimal riskField009) { this.riskField009 = riskField009; }

    @Override
    public String toString() {
        return "RiskDto038{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
