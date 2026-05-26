package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto020 — Data Transfer Object for risk operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto020 {

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField000")
    private BigDecimal riskField000;

    @Size(max = 60)
    @JsonProperty("riskField001")
    private String riskField001;

    @JsonProperty("riskField002")
    private Long riskField002;

    @JsonProperty("riskField003")
    private Integer riskField003;

    @JsonProperty("riskField004")
    private LocalDate riskField004;

    @Size(max = 20)
    @JsonProperty("riskField005")
    private String riskField005;

    @JsonProperty("riskField006")
    private Boolean riskField006;

    @JsonProperty("riskField007")
    private Integer riskField007;

    @JsonProperty("riskField008")
    private Boolean riskField008;

    @Size(max = 20)
    @JsonProperty("riskField009")
    private String riskField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField010")
    private BigDecimal riskField010;

    @JsonProperty("riskField011")
    private LocalDate riskField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField012")
    private BigDecimal riskField012;

    @JsonProperty("riskField013")
    private Double riskField013;

    @JsonProperty("riskField014")
    private Double riskField014;

    @JsonProperty("riskField015")
    private Long riskField015;

    public RiskDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto020 instance = new RiskDto020();

        public Builder riskField000(BigDecimal val) { instance.riskField000 = val; return this; }
        public Builder riskField001(String val) { instance.riskField001 = val; return this; }
        public Builder riskField002(Long val) { instance.riskField002 = val; return this; }
        public Builder riskField003(Integer val) { instance.riskField003 = val; return this; }
        public Builder riskField004(LocalDate val) { instance.riskField004 = val; return this; }
        public Builder riskField005(String val) { instance.riskField005 = val; return this; }
        public Builder riskField006(Boolean val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Integer val) { instance.riskField007 = val; return this; }
        public Builder riskField008(Boolean val) { instance.riskField008 = val; return this; }
        public Builder riskField009(String val) { instance.riskField009 = val; return this; }
        public Builder riskField010(BigDecimal val) { instance.riskField010 = val; return this; }
        public Builder riskField011(LocalDate val) { instance.riskField011 = val; return this; }
        public Builder riskField012(BigDecimal val) { instance.riskField012 = val; return this; }
        public Builder riskField013(Double val) { instance.riskField013 = val; return this; }
        public Builder riskField014(Double val) { instance.riskField014 = val; return this; }
        public Builder riskField015(Long val) { instance.riskField015 = val; return this; }
        public RiskDto020 build() { return instance; }
    }

    public BigDecimal getRiskField000() { return riskField000; }
    public void setRiskField000(BigDecimal riskField000) { this.riskField000 = riskField000; }

    public String getRiskField001() { return riskField001; }
    public void setRiskField001(String riskField001) { this.riskField001 = riskField001; }

    public Long getRiskField002() { return riskField002; }
    public void setRiskField002(Long riskField002) { this.riskField002 = riskField002; }

    public Integer getRiskField003() { return riskField003; }
    public void setRiskField003(Integer riskField003) { this.riskField003 = riskField003; }

    public LocalDate getRiskField004() { return riskField004; }
    public void setRiskField004(LocalDate riskField004) { this.riskField004 = riskField004; }

    public String getRiskField005() { return riskField005; }
    public void setRiskField005(String riskField005) { this.riskField005 = riskField005; }

    public Boolean getRiskField006() { return riskField006; }
    public void setRiskField006(Boolean riskField006) { this.riskField006 = riskField006; }

    public Integer getRiskField007() { return riskField007; }
    public void setRiskField007(Integer riskField007) { this.riskField007 = riskField007; }

    public Boolean getRiskField008() { return riskField008; }
    public void setRiskField008(Boolean riskField008) { this.riskField008 = riskField008; }

    public String getRiskField009() { return riskField009; }
    public void setRiskField009(String riskField009) { this.riskField009 = riskField009; }

    public BigDecimal getRiskField010() { return riskField010; }
    public void setRiskField010(BigDecimal riskField010) { this.riskField010 = riskField010; }

    public LocalDate getRiskField011() { return riskField011; }
    public void setRiskField011(LocalDate riskField011) { this.riskField011 = riskField011; }

    public BigDecimal getRiskField012() { return riskField012; }
    public void setRiskField012(BigDecimal riskField012) { this.riskField012 = riskField012; }

    public Double getRiskField013() { return riskField013; }
    public void setRiskField013(Double riskField013) { this.riskField013 = riskField013; }

    public Double getRiskField014() { return riskField014; }
    public void setRiskField014(Double riskField014) { this.riskField014 = riskField014; }

    public Long getRiskField015() { return riskField015; }
    public void setRiskField015(Long riskField015) { this.riskField015 = riskField015; }

    @Override
    public String toString() {
        return "RiskDto020{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
