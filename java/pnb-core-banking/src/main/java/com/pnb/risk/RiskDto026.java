package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto026 — Data Transfer Object for risk operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto026 {

    @JsonProperty("riskField000")
    private LocalDate riskField000;

    @JsonProperty("riskField001")
    private Integer riskField001;

    @JsonProperty("riskField002")
    private Integer riskField002;

    @JsonProperty("riskField003")
    private Boolean riskField003;

    @Size(max = 40)
    @JsonProperty("riskField004")
    private String riskField004;

    @JsonProperty("riskField005")
    private Boolean riskField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField006")
    private BigDecimal riskField006;

    @JsonProperty("riskField007")
    private Integer riskField007;

    @JsonProperty("riskField008")
    private Integer riskField008;

    @JsonProperty("riskField009")
    private Boolean riskField009;

    public RiskDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto026 instance = new RiskDto026();

        public Builder riskField000(LocalDate val) { instance.riskField000 = val; return this; }
        public Builder riskField001(Integer val) { instance.riskField001 = val; return this; }
        public Builder riskField002(Integer val) { instance.riskField002 = val; return this; }
        public Builder riskField003(Boolean val) { instance.riskField003 = val; return this; }
        public Builder riskField004(String val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Boolean val) { instance.riskField005 = val; return this; }
        public Builder riskField006(BigDecimal val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Integer val) { instance.riskField007 = val; return this; }
        public Builder riskField008(Integer val) { instance.riskField008 = val; return this; }
        public Builder riskField009(Boolean val) { instance.riskField009 = val; return this; }
        public RiskDto026 build() { return instance; }
    }

    public LocalDate getRiskField000() { return riskField000; }
    public void setRiskField000(LocalDate riskField000) { this.riskField000 = riskField000; }

    public Integer getRiskField001() { return riskField001; }
    public void setRiskField001(Integer riskField001) { this.riskField001 = riskField001; }

    public Integer getRiskField002() { return riskField002; }
    public void setRiskField002(Integer riskField002) { this.riskField002 = riskField002; }

    public Boolean getRiskField003() { return riskField003; }
    public void setRiskField003(Boolean riskField003) { this.riskField003 = riskField003; }

    public String getRiskField004() { return riskField004; }
    public void setRiskField004(String riskField004) { this.riskField004 = riskField004; }

    public Boolean getRiskField005() { return riskField005; }
    public void setRiskField005(Boolean riskField005) { this.riskField005 = riskField005; }

    public BigDecimal getRiskField006() { return riskField006; }
    public void setRiskField006(BigDecimal riskField006) { this.riskField006 = riskField006; }

    public Integer getRiskField007() { return riskField007; }
    public void setRiskField007(Integer riskField007) { this.riskField007 = riskField007; }

    public Integer getRiskField008() { return riskField008; }
    public void setRiskField008(Integer riskField008) { this.riskField008 = riskField008; }

    public Boolean getRiskField009() { return riskField009; }
    public void setRiskField009(Boolean riskField009) { this.riskField009 = riskField009; }

    @Override
    public String toString() {
        return "RiskDto026{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
