package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto039 — Data Transfer Object for risk operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto039 {

    @Size(max = 200)
    @JsonProperty("riskField000")
    private String riskField000;

    @JsonProperty("riskField001")
    private Long riskField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField002")
    private BigDecimal riskField002;

    @Size(max = 20)
    @JsonProperty("riskField003")
    private String riskField003;

    @JsonProperty("riskField004")
    private Boolean riskField004;

    @JsonProperty("riskField005")
    private Integer riskField005;

    @Size(max = 60)
    @JsonProperty("riskField006")
    private String riskField006;

    @JsonProperty("riskField007")
    private Boolean riskField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField008")
    private BigDecimal riskField008;

    @JsonProperty("riskField009")
    private LocalDate riskField009;

    @JsonProperty("riskField010")
    private Double riskField010;

    public RiskDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto039 instance = new RiskDto039();

        public Builder riskField000(String val) { instance.riskField000 = val; return this; }
        public Builder riskField001(Long val) { instance.riskField001 = val; return this; }
        public Builder riskField002(BigDecimal val) { instance.riskField002 = val; return this; }
        public Builder riskField003(String val) { instance.riskField003 = val; return this; }
        public Builder riskField004(Boolean val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Integer val) { instance.riskField005 = val; return this; }
        public Builder riskField006(String val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Boolean val) { instance.riskField007 = val; return this; }
        public Builder riskField008(BigDecimal val) { instance.riskField008 = val; return this; }
        public Builder riskField009(LocalDate val) { instance.riskField009 = val; return this; }
        public Builder riskField010(Double val) { instance.riskField010 = val; return this; }
        public RiskDto039 build() { return instance; }
    }

    public String getRiskField000() { return riskField000; }
    public void setRiskField000(String riskField000) { this.riskField000 = riskField000; }

    public Long getRiskField001() { return riskField001; }
    public void setRiskField001(Long riskField001) { this.riskField001 = riskField001; }

    public BigDecimal getRiskField002() { return riskField002; }
    public void setRiskField002(BigDecimal riskField002) { this.riskField002 = riskField002; }

    public String getRiskField003() { return riskField003; }
    public void setRiskField003(String riskField003) { this.riskField003 = riskField003; }

    public Boolean getRiskField004() { return riskField004; }
    public void setRiskField004(Boolean riskField004) { this.riskField004 = riskField004; }

    public Integer getRiskField005() { return riskField005; }
    public void setRiskField005(Integer riskField005) { this.riskField005 = riskField005; }

    public String getRiskField006() { return riskField006; }
    public void setRiskField006(String riskField006) { this.riskField006 = riskField006; }

    public Boolean getRiskField007() { return riskField007; }
    public void setRiskField007(Boolean riskField007) { this.riskField007 = riskField007; }

    public BigDecimal getRiskField008() { return riskField008; }
    public void setRiskField008(BigDecimal riskField008) { this.riskField008 = riskField008; }

    public LocalDate getRiskField009() { return riskField009; }
    public void setRiskField009(LocalDate riskField009) { this.riskField009 = riskField009; }

    public Double getRiskField010() { return riskField010; }
    public void setRiskField010(Double riskField010) { this.riskField010 = riskField010; }

    @Override
    public String toString() {
        return "RiskDto039{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
