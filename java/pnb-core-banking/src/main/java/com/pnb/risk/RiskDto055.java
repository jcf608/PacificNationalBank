package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto055 — Data Transfer Object for risk operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto055 {

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField000")
    private BigDecimal riskField000;

    @JsonProperty("riskField001")
    private Long riskField001;

    @JsonProperty("riskField002")
    private Integer riskField002;

    @JsonProperty("riskField003")
    private Double riskField003;

    @JsonProperty("riskField004")
    private LocalDate riskField004;

    @Size(max = 200)
    @JsonProperty("riskField005")
    private String riskField005;

    @JsonProperty("riskField006")
    private Integer riskField006;

    @Size(max = 100)
    @JsonProperty("riskField007")
    private String riskField007;

    @JsonProperty("riskField008")
    private Long riskField008;

    @JsonProperty("riskField009")
    private Long riskField009;

    @JsonProperty("riskField010")
    private Integer riskField010;

    @JsonProperty("riskField011")
    private LocalDate riskField011;

    @Size(max = 40)
    @JsonProperty("riskField012")
    private String riskField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField013")
    private BigDecimal riskField013;

    @Size(max = 200)
    @JsonProperty("riskField014")
    private String riskField014;

    public RiskDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto055 instance = new RiskDto055();

        public Builder riskField000(BigDecimal val) { instance.riskField000 = val; return this; }
        public Builder riskField001(Long val) { instance.riskField001 = val; return this; }
        public Builder riskField002(Integer val) { instance.riskField002 = val; return this; }
        public Builder riskField003(Double val) { instance.riskField003 = val; return this; }
        public Builder riskField004(LocalDate val) { instance.riskField004 = val; return this; }
        public Builder riskField005(String val) { instance.riskField005 = val; return this; }
        public Builder riskField006(Integer val) { instance.riskField006 = val; return this; }
        public Builder riskField007(String val) { instance.riskField007 = val; return this; }
        public Builder riskField008(Long val) { instance.riskField008 = val; return this; }
        public Builder riskField009(Long val) { instance.riskField009 = val; return this; }
        public Builder riskField010(Integer val) { instance.riskField010 = val; return this; }
        public Builder riskField011(LocalDate val) { instance.riskField011 = val; return this; }
        public Builder riskField012(String val) { instance.riskField012 = val; return this; }
        public Builder riskField013(BigDecimal val) { instance.riskField013 = val; return this; }
        public Builder riskField014(String val) { instance.riskField014 = val; return this; }
        public RiskDto055 build() { return instance; }
    }

    public BigDecimal getRiskField000() { return riskField000; }
    public void setRiskField000(BigDecimal riskField000) { this.riskField000 = riskField000; }

    public Long getRiskField001() { return riskField001; }
    public void setRiskField001(Long riskField001) { this.riskField001 = riskField001; }

    public Integer getRiskField002() { return riskField002; }
    public void setRiskField002(Integer riskField002) { this.riskField002 = riskField002; }

    public Double getRiskField003() { return riskField003; }
    public void setRiskField003(Double riskField003) { this.riskField003 = riskField003; }

    public LocalDate getRiskField004() { return riskField004; }
    public void setRiskField004(LocalDate riskField004) { this.riskField004 = riskField004; }

    public String getRiskField005() { return riskField005; }
    public void setRiskField005(String riskField005) { this.riskField005 = riskField005; }

    public Integer getRiskField006() { return riskField006; }
    public void setRiskField006(Integer riskField006) { this.riskField006 = riskField006; }

    public String getRiskField007() { return riskField007; }
    public void setRiskField007(String riskField007) { this.riskField007 = riskField007; }

    public Long getRiskField008() { return riskField008; }
    public void setRiskField008(Long riskField008) { this.riskField008 = riskField008; }

    public Long getRiskField009() { return riskField009; }
    public void setRiskField009(Long riskField009) { this.riskField009 = riskField009; }

    public Integer getRiskField010() { return riskField010; }
    public void setRiskField010(Integer riskField010) { this.riskField010 = riskField010; }

    public LocalDate getRiskField011() { return riskField011; }
    public void setRiskField011(LocalDate riskField011) { this.riskField011 = riskField011; }

    public String getRiskField012() { return riskField012; }
    public void setRiskField012(String riskField012) { this.riskField012 = riskField012; }

    public BigDecimal getRiskField013() { return riskField013; }
    public void setRiskField013(BigDecimal riskField013) { this.riskField013 = riskField013; }

    public String getRiskField014() { return riskField014; }
    public void setRiskField014(String riskField014) { this.riskField014 = riskField014; }

    @Override
    public String toString() {
        return "RiskDto055{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
