package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto059 — Data Transfer Object for risk operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto059 {

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField000")
    private BigDecimal riskField000;

    @JsonProperty("riskField001")
    private Double riskField001;

    @JsonProperty("riskField002")
    private Long riskField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField003")
    private BigDecimal riskField003;

    @JsonProperty("riskField004")
    private LocalDate riskField004;

    @JsonProperty("riskField005")
    private Long riskField005;

    @JsonProperty("riskField006")
    private Double riskField006;

    @JsonProperty("riskField007")
    private Double riskField007;

    @JsonProperty("riskField008")
    private Double riskField008;

    @JsonProperty("riskField009")
    private LocalDate riskField009;

    @JsonProperty("riskField010")
    private Integer riskField010;

    @JsonProperty("riskField011")
    private Long riskField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField012")
    private BigDecimal riskField012;

    @JsonProperty("riskField013")
    private Long riskField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField014")
    private BigDecimal riskField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField015")
    private BigDecimal riskField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField016")
    private BigDecimal riskField016;

    @JsonProperty("riskField017")
    private Boolean riskField017;

    @Size(max = 200)
    @JsonProperty("riskField018")
    private String riskField018;

    public RiskDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto059 instance = new RiskDto059();

        public Builder riskField000(BigDecimal val) { instance.riskField000 = val; return this; }
        public Builder riskField001(Double val) { instance.riskField001 = val; return this; }
        public Builder riskField002(Long val) { instance.riskField002 = val; return this; }
        public Builder riskField003(BigDecimal val) { instance.riskField003 = val; return this; }
        public Builder riskField004(LocalDate val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Long val) { instance.riskField005 = val; return this; }
        public Builder riskField006(Double val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Double val) { instance.riskField007 = val; return this; }
        public Builder riskField008(Double val) { instance.riskField008 = val; return this; }
        public Builder riskField009(LocalDate val) { instance.riskField009 = val; return this; }
        public Builder riskField010(Integer val) { instance.riskField010 = val; return this; }
        public Builder riskField011(Long val) { instance.riskField011 = val; return this; }
        public Builder riskField012(BigDecimal val) { instance.riskField012 = val; return this; }
        public Builder riskField013(Long val) { instance.riskField013 = val; return this; }
        public Builder riskField014(BigDecimal val) { instance.riskField014 = val; return this; }
        public Builder riskField015(BigDecimal val) { instance.riskField015 = val; return this; }
        public Builder riskField016(BigDecimal val) { instance.riskField016 = val; return this; }
        public Builder riskField017(Boolean val) { instance.riskField017 = val; return this; }
        public Builder riskField018(String val) { instance.riskField018 = val; return this; }
        public RiskDto059 build() { return instance; }
    }

    public BigDecimal getRiskField000() { return riskField000; }
    public void setRiskField000(BigDecimal riskField000) { this.riskField000 = riskField000; }

    public Double getRiskField001() { return riskField001; }
    public void setRiskField001(Double riskField001) { this.riskField001 = riskField001; }

    public Long getRiskField002() { return riskField002; }
    public void setRiskField002(Long riskField002) { this.riskField002 = riskField002; }

    public BigDecimal getRiskField003() { return riskField003; }
    public void setRiskField003(BigDecimal riskField003) { this.riskField003 = riskField003; }

    public LocalDate getRiskField004() { return riskField004; }
    public void setRiskField004(LocalDate riskField004) { this.riskField004 = riskField004; }

    public Long getRiskField005() { return riskField005; }
    public void setRiskField005(Long riskField005) { this.riskField005 = riskField005; }

    public Double getRiskField006() { return riskField006; }
    public void setRiskField006(Double riskField006) { this.riskField006 = riskField006; }

    public Double getRiskField007() { return riskField007; }
    public void setRiskField007(Double riskField007) { this.riskField007 = riskField007; }

    public Double getRiskField008() { return riskField008; }
    public void setRiskField008(Double riskField008) { this.riskField008 = riskField008; }

    public LocalDate getRiskField009() { return riskField009; }
    public void setRiskField009(LocalDate riskField009) { this.riskField009 = riskField009; }

    public Integer getRiskField010() { return riskField010; }
    public void setRiskField010(Integer riskField010) { this.riskField010 = riskField010; }

    public Long getRiskField011() { return riskField011; }
    public void setRiskField011(Long riskField011) { this.riskField011 = riskField011; }

    public BigDecimal getRiskField012() { return riskField012; }
    public void setRiskField012(BigDecimal riskField012) { this.riskField012 = riskField012; }

    public Long getRiskField013() { return riskField013; }
    public void setRiskField013(Long riskField013) { this.riskField013 = riskField013; }

    public BigDecimal getRiskField014() { return riskField014; }
    public void setRiskField014(BigDecimal riskField014) { this.riskField014 = riskField014; }

    public BigDecimal getRiskField015() { return riskField015; }
    public void setRiskField015(BigDecimal riskField015) { this.riskField015 = riskField015; }

    public BigDecimal getRiskField016() { return riskField016; }
    public void setRiskField016(BigDecimal riskField016) { this.riskField016 = riskField016; }

    public Boolean getRiskField017() { return riskField017; }
    public void setRiskField017(Boolean riskField017) { this.riskField017 = riskField017; }

    public String getRiskField018() { return riskField018; }
    public void setRiskField018(String riskField018) { this.riskField018 = riskField018; }

    @Override
    public String toString() {
        return "RiskDto059{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
