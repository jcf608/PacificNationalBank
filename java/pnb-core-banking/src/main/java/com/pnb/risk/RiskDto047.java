package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto047 — Data Transfer Object for risk operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto047 {

    @JsonProperty("riskField000")
    private Integer riskField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField001")
    private BigDecimal riskField001;

    @Size(max = 100)
    @JsonProperty("riskField002")
    private String riskField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField003")
    private BigDecimal riskField003;

    @Size(max = 200)
    @JsonProperty("riskField004")
    private String riskField004;

    @JsonProperty("riskField005")
    private Integer riskField005;

    @JsonProperty("riskField006")
    private Double riskField006;

    @JsonProperty("riskField007")
    private Long riskField007;

    @JsonProperty("riskField008")
    private Boolean riskField008;

    @Size(max = 100)
    @JsonProperty("riskField009")
    private String riskField009;

    @JsonProperty("riskField010")
    private LocalDate riskField010;

    @JsonProperty("riskField011")
    private Double riskField011;

    @Size(max = 200)
    @JsonProperty("riskField012")
    private String riskField012;

    @JsonProperty("riskField013")
    private Double riskField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField014")
    private BigDecimal riskField014;

    @JsonProperty("riskField015")
    private Double riskField015;

    @JsonProperty("riskField016")
    private LocalDate riskField016;

    @JsonProperty("riskField017")
    private LocalDate riskField017;

    @JsonProperty("riskField018")
    private Double riskField018;

    public RiskDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto047 instance = new RiskDto047();

        public Builder riskField000(Integer val) { instance.riskField000 = val; return this; }
        public Builder riskField001(BigDecimal val) { instance.riskField001 = val; return this; }
        public Builder riskField002(String val) { instance.riskField002 = val; return this; }
        public Builder riskField003(BigDecimal val) { instance.riskField003 = val; return this; }
        public Builder riskField004(String val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Integer val) { instance.riskField005 = val; return this; }
        public Builder riskField006(Double val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Long val) { instance.riskField007 = val; return this; }
        public Builder riskField008(Boolean val) { instance.riskField008 = val; return this; }
        public Builder riskField009(String val) { instance.riskField009 = val; return this; }
        public Builder riskField010(LocalDate val) { instance.riskField010 = val; return this; }
        public Builder riskField011(Double val) { instance.riskField011 = val; return this; }
        public Builder riskField012(String val) { instance.riskField012 = val; return this; }
        public Builder riskField013(Double val) { instance.riskField013 = val; return this; }
        public Builder riskField014(BigDecimal val) { instance.riskField014 = val; return this; }
        public Builder riskField015(Double val) { instance.riskField015 = val; return this; }
        public Builder riskField016(LocalDate val) { instance.riskField016 = val; return this; }
        public Builder riskField017(LocalDate val) { instance.riskField017 = val; return this; }
        public Builder riskField018(Double val) { instance.riskField018 = val; return this; }
        public RiskDto047 build() { return instance; }
    }

    public Integer getRiskField000() { return riskField000; }
    public void setRiskField000(Integer riskField000) { this.riskField000 = riskField000; }

    public BigDecimal getRiskField001() { return riskField001; }
    public void setRiskField001(BigDecimal riskField001) { this.riskField001 = riskField001; }

    public String getRiskField002() { return riskField002; }
    public void setRiskField002(String riskField002) { this.riskField002 = riskField002; }

    public BigDecimal getRiskField003() { return riskField003; }
    public void setRiskField003(BigDecimal riskField003) { this.riskField003 = riskField003; }

    public String getRiskField004() { return riskField004; }
    public void setRiskField004(String riskField004) { this.riskField004 = riskField004; }

    public Integer getRiskField005() { return riskField005; }
    public void setRiskField005(Integer riskField005) { this.riskField005 = riskField005; }

    public Double getRiskField006() { return riskField006; }
    public void setRiskField006(Double riskField006) { this.riskField006 = riskField006; }

    public Long getRiskField007() { return riskField007; }
    public void setRiskField007(Long riskField007) { this.riskField007 = riskField007; }

    public Boolean getRiskField008() { return riskField008; }
    public void setRiskField008(Boolean riskField008) { this.riskField008 = riskField008; }

    public String getRiskField009() { return riskField009; }
    public void setRiskField009(String riskField009) { this.riskField009 = riskField009; }

    public LocalDate getRiskField010() { return riskField010; }
    public void setRiskField010(LocalDate riskField010) { this.riskField010 = riskField010; }

    public Double getRiskField011() { return riskField011; }
    public void setRiskField011(Double riskField011) { this.riskField011 = riskField011; }

    public String getRiskField012() { return riskField012; }
    public void setRiskField012(String riskField012) { this.riskField012 = riskField012; }

    public Double getRiskField013() { return riskField013; }
    public void setRiskField013(Double riskField013) { this.riskField013 = riskField013; }

    public BigDecimal getRiskField014() { return riskField014; }
    public void setRiskField014(BigDecimal riskField014) { this.riskField014 = riskField014; }

    public Double getRiskField015() { return riskField015; }
    public void setRiskField015(Double riskField015) { this.riskField015 = riskField015; }

    public LocalDate getRiskField016() { return riskField016; }
    public void setRiskField016(LocalDate riskField016) { this.riskField016 = riskField016; }

    public LocalDate getRiskField017() { return riskField017; }
    public void setRiskField017(LocalDate riskField017) { this.riskField017 = riskField017; }

    public Double getRiskField018() { return riskField018; }
    public void setRiskField018(Double riskField018) { this.riskField018 = riskField018; }

    @Override
    public String toString() {
        return "RiskDto047{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
