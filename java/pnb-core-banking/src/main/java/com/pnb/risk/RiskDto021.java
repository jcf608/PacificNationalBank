package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto021 — Data Transfer Object for risk operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto021 {

    @JsonProperty("riskField000")
    private Double riskField000;

    @JsonProperty("riskField001")
    private Boolean riskField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField002")
    private BigDecimal riskField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField003")
    private BigDecimal riskField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField004")
    private BigDecimal riskField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField005")
    private BigDecimal riskField005;

    @JsonProperty("riskField006")
    private Long riskField006;

    @JsonProperty("riskField007")
    private Integer riskField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField008")
    private BigDecimal riskField008;

    @JsonProperty("riskField009")
    private Integer riskField009;

    @JsonProperty("riskField010")
    private Boolean riskField010;

    @JsonProperty("riskField011")
    private Integer riskField011;

    @JsonProperty("riskField012")
    private LocalDate riskField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField013")
    private BigDecimal riskField013;

    @Size(max = 200)
    @JsonProperty("riskField014")
    private String riskField014;

    @Size(max = 40)
    @JsonProperty("riskField015")
    private String riskField015;

    @JsonProperty("riskField016")
    private LocalDate riskField016;

    public RiskDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto021 instance = new RiskDto021();

        public Builder riskField000(Double val) { instance.riskField000 = val; return this; }
        public Builder riskField001(Boolean val) { instance.riskField001 = val; return this; }
        public Builder riskField002(BigDecimal val) { instance.riskField002 = val; return this; }
        public Builder riskField003(BigDecimal val) { instance.riskField003 = val; return this; }
        public Builder riskField004(BigDecimal val) { instance.riskField004 = val; return this; }
        public Builder riskField005(BigDecimal val) { instance.riskField005 = val; return this; }
        public Builder riskField006(Long val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Integer val) { instance.riskField007 = val; return this; }
        public Builder riskField008(BigDecimal val) { instance.riskField008 = val; return this; }
        public Builder riskField009(Integer val) { instance.riskField009 = val; return this; }
        public Builder riskField010(Boolean val) { instance.riskField010 = val; return this; }
        public Builder riskField011(Integer val) { instance.riskField011 = val; return this; }
        public Builder riskField012(LocalDate val) { instance.riskField012 = val; return this; }
        public Builder riskField013(BigDecimal val) { instance.riskField013 = val; return this; }
        public Builder riskField014(String val) { instance.riskField014 = val; return this; }
        public Builder riskField015(String val) { instance.riskField015 = val; return this; }
        public Builder riskField016(LocalDate val) { instance.riskField016 = val; return this; }
        public RiskDto021 build() { return instance; }
    }

    public Double getRiskField000() { return riskField000; }
    public void setRiskField000(Double riskField000) { this.riskField000 = riskField000; }

    public Boolean getRiskField001() { return riskField001; }
    public void setRiskField001(Boolean riskField001) { this.riskField001 = riskField001; }

    public BigDecimal getRiskField002() { return riskField002; }
    public void setRiskField002(BigDecimal riskField002) { this.riskField002 = riskField002; }

    public BigDecimal getRiskField003() { return riskField003; }
    public void setRiskField003(BigDecimal riskField003) { this.riskField003 = riskField003; }

    public BigDecimal getRiskField004() { return riskField004; }
    public void setRiskField004(BigDecimal riskField004) { this.riskField004 = riskField004; }

    public BigDecimal getRiskField005() { return riskField005; }
    public void setRiskField005(BigDecimal riskField005) { this.riskField005 = riskField005; }

    public Long getRiskField006() { return riskField006; }
    public void setRiskField006(Long riskField006) { this.riskField006 = riskField006; }

    public Integer getRiskField007() { return riskField007; }
    public void setRiskField007(Integer riskField007) { this.riskField007 = riskField007; }

    public BigDecimal getRiskField008() { return riskField008; }
    public void setRiskField008(BigDecimal riskField008) { this.riskField008 = riskField008; }

    public Integer getRiskField009() { return riskField009; }
    public void setRiskField009(Integer riskField009) { this.riskField009 = riskField009; }

    public Boolean getRiskField010() { return riskField010; }
    public void setRiskField010(Boolean riskField010) { this.riskField010 = riskField010; }

    public Integer getRiskField011() { return riskField011; }
    public void setRiskField011(Integer riskField011) { this.riskField011 = riskField011; }

    public LocalDate getRiskField012() { return riskField012; }
    public void setRiskField012(LocalDate riskField012) { this.riskField012 = riskField012; }

    public BigDecimal getRiskField013() { return riskField013; }
    public void setRiskField013(BigDecimal riskField013) { this.riskField013 = riskField013; }

    public String getRiskField014() { return riskField014; }
    public void setRiskField014(String riskField014) { this.riskField014 = riskField014; }

    public String getRiskField015() { return riskField015; }
    public void setRiskField015(String riskField015) { this.riskField015 = riskField015; }

    public LocalDate getRiskField016() { return riskField016; }
    public void setRiskField016(LocalDate riskField016) { this.riskField016 = riskField016; }

    @Override
    public String toString() {
        return "RiskDto021{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
