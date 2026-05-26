package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto034 — Data Transfer Object for risk operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto034 {

    @JsonProperty("riskField000")
    private Integer riskField000;

    @JsonProperty("riskField001")
    private Double riskField001;

    @JsonProperty("riskField002")
    private LocalDate riskField002;

    @JsonProperty("riskField003")
    private Long riskField003;

    @JsonProperty("riskField004")
    private Long riskField004;

    @JsonProperty("riskField005")
    private Double riskField005;

    @Size(max = 20)
    @JsonProperty("riskField006")
    private String riskField006;

    @JsonProperty("riskField007")
    private Double riskField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField008")
    private BigDecimal riskField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField009")
    private BigDecimal riskField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField010")
    private BigDecimal riskField010;

    @JsonProperty("riskField011")
    private Double riskField011;

    @JsonProperty("riskField012")
    private Double riskField012;

    @JsonProperty("riskField013")
    private Boolean riskField013;

    @JsonProperty("riskField014")
    private Long riskField014;

    @JsonProperty("riskField015")
    private Double riskField015;

    @Size(max = 60)
    @JsonProperty("riskField016")
    private String riskField016;

    @JsonProperty("riskField017")
    private LocalDate riskField017;

    public RiskDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto034 instance = new RiskDto034();

        public Builder riskField000(Integer val) { instance.riskField000 = val; return this; }
        public Builder riskField001(Double val) { instance.riskField001 = val; return this; }
        public Builder riskField002(LocalDate val) { instance.riskField002 = val; return this; }
        public Builder riskField003(Long val) { instance.riskField003 = val; return this; }
        public Builder riskField004(Long val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Double val) { instance.riskField005 = val; return this; }
        public Builder riskField006(String val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Double val) { instance.riskField007 = val; return this; }
        public Builder riskField008(BigDecimal val) { instance.riskField008 = val; return this; }
        public Builder riskField009(BigDecimal val) { instance.riskField009 = val; return this; }
        public Builder riskField010(BigDecimal val) { instance.riskField010 = val; return this; }
        public Builder riskField011(Double val) { instance.riskField011 = val; return this; }
        public Builder riskField012(Double val) { instance.riskField012 = val; return this; }
        public Builder riskField013(Boolean val) { instance.riskField013 = val; return this; }
        public Builder riskField014(Long val) { instance.riskField014 = val; return this; }
        public Builder riskField015(Double val) { instance.riskField015 = val; return this; }
        public Builder riskField016(String val) { instance.riskField016 = val; return this; }
        public Builder riskField017(LocalDate val) { instance.riskField017 = val; return this; }
        public RiskDto034 build() { return instance; }
    }

    public Integer getRiskField000() { return riskField000; }
    public void setRiskField000(Integer riskField000) { this.riskField000 = riskField000; }

    public Double getRiskField001() { return riskField001; }
    public void setRiskField001(Double riskField001) { this.riskField001 = riskField001; }

    public LocalDate getRiskField002() { return riskField002; }
    public void setRiskField002(LocalDate riskField002) { this.riskField002 = riskField002; }

    public Long getRiskField003() { return riskField003; }
    public void setRiskField003(Long riskField003) { this.riskField003 = riskField003; }

    public Long getRiskField004() { return riskField004; }
    public void setRiskField004(Long riskField004) { this.riskField004 = riskField004; }

    public Double getRiskField005() { return riskField005; }
    public void setRiskField005(Double riskField005) { this.riskField005 = riskField005; }

    public String getRiskField006() { return riskField006; }
    public void setRiskField006(String riskField006) { this.riskField006 = riskField006; }

    public Double getRiskField007() { return riskField007; }
    public void setRiskField007(Double riskField007) { this.riskField007 = riskField007; }

    public BigDecimal getRiskField008() { return riskField008; }
    public void setRiskField008(BigDecimal riskField008) { this.riskField008 = riskField008; }

    public BigDecimal getRiskField009() { return riskField009; }
    public void setRiskField009(BigDecimal riskField009) { this.riskField009 = riskField009; }

    public BigDecimal getRiskField010() { return riskField010; }
    public void setRiskField010(BigDecimal riskField010) { this.riskField010 = riskField010; }

    public Double getRiskField011() { return riskField011; }
    public void setRiskField011(Double riskField011) { this.riskField011 = riskField011; }

    public Double getRiskField012() { return riskField012; }
    public void setRiskField012(Double riskField012) { this.riskField012 = riskField012; }

    public Boolean getRiskField013() { return riskField013; }
    public void setRiskField013(Boolean riskField013) { this.riskField013 = riskField013; }

    public Long getRiskField014() { return riskField014; }
    public void setRiskField014(Long riskField014) { this.riskField014 = riskField014; }

    public Double getRiskField015() { return riskField015; }
    public void setRiskField015(Double riskField015) { this.riskField015 = riskField015; }

    public String getRiskField016() { return riskField016; }
    public void setRiskField016(String riskField016) { this.riskField016 = riskField016; }

    public LocalDate getRiskField017() { return riskField017; }
    public void setRiskField017(LocalDate riskField017) { this.riskField017 = riskField017; }

    @Override
    public String toString() {
        return "RiskDto034{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
