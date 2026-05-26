package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto056 — Data Transfer Object for risk operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto056 {

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField000")
    private BigDecimal riskField000;

    @JsonProperty("riskField001")
    private Long riskField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField002")
    private BigDecimal riskField002;

    @JsonProperty("riskField003")
    private Integer riskField003;

    @JsonProperty("riskField004")
    private Double riskField004;

    @JsonProperty("riskField005")
    private LocalDate riskField005;

    @JsonProperty("riskField006")
    private Double riskField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField007")
    private BigDecimal riskField007;

    @JsonProperty("riskField008")
    private Double riskField008;

    @Size(max = 40)
    @JsonProperty("riskField009")
    private String riskField009;

    @JsonProperty("riskField010")
    private Long riskField010;

    @JsonProperty("riskField011")
    private Double riskField011;

    @JsonProperty("riskField012")
    private Long riskField012;

    @JsonProperty("riskField013")
    private Boolean riskField013;

    @JsonProperty("riskField014")
    private Boolean riskField014;

    @Size(max = 100)
    @JsonProperty("riskField015")
    private String riskField015;

    public RiskDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto056 instance = new RiskDto056();

        public Builder riskField000(BigDecimal val) { instance.riskField000 = val; return this; }
        public Builder riskField001(Long val) { instance.riskField001 = val; return this; }
        public Builder riskField002(BigDecimal val) { instance.riskField002 = val; return this; }
        public Builder riskField003(Integer val) { instance.riskField003 = val; return this; }
        public Builder riskField004(Double val) { instance.riskField004 = val; return this; }
        public Builder riskField005(LocalDate val) { instance.riskField005 = val; return this; }
        public Builder riskField006(Double val) { instance.riskField006 = val; return this; }
        public Builder riskField007(BigDecimal val) { instance.riskField007 = val; return this; }
        public Builder riskField008(Double val) { instance.riskField008 = val; return this; }
        public Builder riskField009(String val) { instance.riskField009 = val; return this; }
        public Builder riskField010(Long val) { instance.riskField010 = val; return this; }
        public Builder riskField011(Double val) { instance.riskField011 = val; return this; }
        public Builder riskField012(Long val) { instance.riskField012 = val; return this; }
        public Builder riskField013(Boolean val) { instance.riskField013 = val; return this; }
        public Builder riskField014(Boolean val) { instance.riskField014 = val; return this; }
        public Builder riskField015(String val) { instance.riskField015 = val; return this; }
        public RiskDto056 build() { return instance; }
    }

    public BigDecimal getRiskField000() { return riskField000; }
    public void setRiskField000(BigDecimal riskField000) { this.riskField000 = riskField000; }

    public Long getRiskField001() { return riskField001; }
    public void setRiskField001(Long riskField001) { this.riskField001 = riskField001; }

    public BigDecimal getRiskField002() { return riskField002; }
    public void setRiskField002(BigDecimal riskField002) { this.riskField002 = riskField002; }

    public Integer getRiskField003() { return riskField003; }
    public void setRiskField003(Integer riskField003) { this.riskField003 = riskField003; }

    public Double getRiskField004() { return riskField004; }
    public void setRiskField004(Double riskField004) { this.riskField004 = riskField004; }

    public LocalDate getRiskField005() { return riskField005; }
    public void setRiskField005(LocalDate riskField005) { this.riskField005 = riskField005; }

    public Double getRiskField006() { return riskField006; }
    public void setRiskField006(Double riskField006) { this.riskField006 = riskField006; }

    public BigDecimal getRiskField007() { return riskField007; }
    public void setRiskField007(BigDecimal riskField007) { this.riskField007 = riskField007; }

    public Double getRiskField008() { return riskField008; }
    public void setRiskField008(Double riskField008) { this.riskField008 = riskField008; }

    public String getRiskField009() { return riskField009; }
    public void setRiskField009(String riskField009) { this.riskField009 = riskField009; }

    public Long getRiskField010() { return riskField010; }
    public void setRiskField010(Long riskField010) { this.riskField010 = riskField010; }

    public Double getRiskField011() { return riskField011; }
    public void setRiskField011(Double riskField011) { this.riskField011 = riskField011; }

    public Long getRiskField012() { return riskField012; }
    public void setRiskField012(Long riskField012) { this.riskField012 = riskField012; }

    public Boolean getRiskField013() { return riskField013; }
    public void setRiskField013(Boolean riskField013) { this.riskField013 = riskField013; }

    public Boolean getRiskField014() { return riskField014; }
    public void setRiskField014(Boolean riskField014) { this.riskField014 = riskField014; }

    public String getRiskField015() { return riskField015; }
    public void setRiskField015(String riskField015) { this.riskField015 = riskField015; }

    @Override
    public String toString() {
        return "RiskDto056{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
