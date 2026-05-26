package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto023 — Data Transfer Object for risk operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto023 {

    @JsonProperty("riskField000")
    private Long riskField000;

    @JsonProperty("riskField001")
    private Boolean riskField001;

    @JsonProperty("riskField002")
    private Double riskField002;

    @JsonProperty("riskField003")
    private Integer riskField003;

    @JsonProperty("riskField004")
    private Integer riskField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField005")
    private BigDecimal riskField005;

    @JsonProperty("riskField006")
    private Integer riskField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField007")
    private BigDecimal riskField007;

    @Size(max = 40)
    @JsonProperty("riskField008")
    private String riskField008;

    @JsonProperty("riskField009")
    private Double riskField009;

    @Size(max = 100)
    @JsonProperty("riskField010")
    private String riskField010;

    @JsonProperty("riskField011")
    private Boolean riskField011;

    @JsonProperty("riskField012")
    private Integer riskField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField013")
    private BigDecimal riskField013;

    @JsonProperty("riskField014")
    private Boolean riskField014;

    @JsonProperty("riskField015")
    private Boolean riskField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField016")
    private BigDecimal riskField016;

    @JsonProperty("riskField017")
    private Double riskField017;

    @Size(max = 20)
    @JsonProperty("riskField018")
    private String riskField018;

    public RiskDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto023 instance = new RiskDto023();

        public Builder riskField000(Long val) { instance.riskField000 = val; return this; }
        public Builder riskField001(Boolean val) { instance.riskField001 = val; return this; }
        public Builder riskField002(Double val) { instance.riskField002 = val; return this; }
        public Builder riskField003(Integer val) { instance.riskField003 = val; return this; }
        public Builder riskField004(Integer val) { instance.riskField004 = val; return this; }
        public Builder riskField005(BigDecimal val) { instance.riskField005 = val; return this; }
        public Builder riskField006(Integer val) { instance.riskField006 = val; return this; }
        public Builder riskField007(BigDecimal val) { instance.riskField007 = val; return this; }
        public Builder riskField008(String val) { instance.riskField008 = val; return this; }
        public Builder riskField009(Double val) { instance.riskField009 = val; return this; }
        public Builder riskField010(String val) { instance.riskField010 = val; return this; }
        public Builder riskField011(Boolean val) { instance.riskField011 = val; return this; }
        public Builder riskField012(Integer val) { instance.riskField012 = val; return this; }
        public Builder riskField013(BigDecimal val) { instance.riskField013 = val; return this; }
        public Builder riskField014(Boolean val) { instance.riskField014 = val; return this; }
        public Builder riskField015(Boolean val) { instance.riskField015 = val; return this; }
        public Builder riskField016(BigDecimal val) { instance.riskField016 = val; return this; }
        public Builder riskField017(Double val) { instance.riskField017 = val; return this; }
        public Builder riskField018(String val) { instance.riskField018 = val; return this; }
        public RiskDto023 build() { return instance; }
    }

    public Long getRiskField000() { return riskField000; }
    public void setRiskField000(Long riskField000) { this.riskField000 = riskField000; }

    public Boolean getRiskField001() { return riskField001; }
    public void setRiskField001(Boolean riskField001) { this.riskField001 = riskField001; }

    public Double getRiskField002() { return riskField002; }
    public void setRiskField002(Double riskField002) { this.riskField002 = riskField002; }

    public Integer getRiskField003() { return riskField003; }
    public void setRiskField003(Integer riskField003) { this.riskField003 = riskField003; }

    public Integer getRiskField004() { return riskField004; }
    public void setRiskField004(Integer riskField004) { this.riskField004 = riskField004; }

    public BigDecimal getRiskField005() { return riskField005; }
    public void setRiskField005(BigDecimal riskField005) { this.riskField005 = riskField005; }

    public Integer getRiskField006() { return riskField006; }
    public void setRiskField006(Integer riskField006) { this.riskField006 = riskField006; }

    public BigDecimal getRiskField007() { return riskField007; }
    public void setRiskField007(BigDecimal riskField007) { this.riskField007 = riskField007; }

    public String getRiskField008() { return riskField008; }
    public void setRiskField008(String riskField008) { this.riskField008 = riskField008; }

    public Double getRiskField009() { return riskField009; }
    public void setRiskField009(Double riskField009) { this.riskField009 = riskField009; }

    public String getRiskField010() { return riskField010; }
    public void setRiskField010(String riskField010) { this.riskField010 = riskField010; }

    public Boolean getRiskField011() { return riskField011; }
    public void setRiskField011(Boolean riskField011) { this.riskField011 = riskField011; }

    public Integer getRiskField012() { return riskField012; }
    public void setRiskField012(Integer riskField012) { this.riskField012 = riskField012; }

    public BigDecimal getRiskField013() { return riskField013; }
    public void setRiskField013(BigDecimal riskField013) { this.riskField013 = riskField013; }

    public Boolean getRiskField014() { return riskField014; }
    public void setRiskField014(Boolean riskField014) { this.riskField014 = riskField014; }

    public Boolean getRiskField015() { return riskField015; }
    public void setRiskField015(Boolean riskField015) { this.riskField015 = riskField015; }

    public BigDecimal getRiskField016() { return riskField016; }
    public void setRiskField016(BigDecimal riskField016) { this.riskField016 = riskField016; }

    public Double getRiskField017() { return riskField017; }
    public void setRiskField017(Double riskField017) { this.riskField017 = riskField017; }

    public String getRiskField018() { return riskField018; }
    public void setRiskField018(String riskField018) { this.riskField018 = riskField018; }

    @Override
    public String toString() {
        return "RiskDto023{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
