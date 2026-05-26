package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto033 — Data Transfer Object for risk operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto033 {

    @Size(max = 40)
    @JsonProperty("riskField000")
    private String riskField000;

    @Size(max = 20)
    @JsonProperty("riskField001")
    private String riskField001;

    @JsonProperty("riskField002")
    private LocalDate riskField002;

    @JsonProperty("riskField003")
    private Integer riskField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField004")
    private BigDecimal riskField004;

    @JsonProperty("riskField005")
    private Integer riskField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField006")
    private BigDecimal riskField006;

    @JsonProperty("riskField007")
    private Integer riskField007;

    @JsonProperty("riskField008")
    private Boolean riskField008;

    @JsonProperty("riskField009")
    private Integer riskField009;

    @JsonProperty("riskField010")
    private Long riskField010;

    @JsonProperty("riskField011")
    private LocalDate riskField011;

    @JsonProperty("riskField012")
    private LocalDate riskField012;

    @JsonProperty("riskField013")
    private Double riskField013;

    @JsonProperty("riskField014")
    private Integer riskField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField015")
    private BigDecimal riskField015;

    @JsonProperty("riskField016")
    private Long riskField016;

    public RiskDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto033 instance = new RiskDto033();

        public Builder riskField000(String val) { instance.riskField000 = val; return this; }
        public Builder riskField001(String val) { instance.riskField001 = val; return this; }
        public Builder riskField002(LocalDate val) { instance.riskField002 = val; return this; }
        public Builder riskField003(Integer val) { instance.riskField003 = val; return this; }
        public Builder riskField004(BigDecimal val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Integer val) { instance.riskField005 = val; return this; }
        public Builder riskField006(BigDecimal val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Integer val) { instance.riskField007 = val; return this; }
        public Builder riskField008(Boolean val) { instance.riskField008 = val; return this; }
        public Builder riskField009(Integer val) { instance.riskField009 = val; return this; }
        public Builder riskField010(Long val) { instance.riskField010 = val; return this; }
        public Builder riskField011(LocalDate val) { instance.riskField011 = val; return this; }
        public Builder riskField012(LocalDate val) { instance.riskField012 = val; return this; }
        public Builder riskField013(Double val) { instance.riskField013 = val; return this; }
        public Builder riskField014(Integer val) { instance.riskField014 = val; return this; }
        public Builder riskField015(BigDecimal val) { instance.riskField015 = val; return this; }
        public Builder riskField016(Long val) { instance.riskField016 = val; return this; }
        public RiskDto033 build() { return instance; }
    }

    public String getRiskField000() { return riskField000; }
    public void setRiskField000(String riskField000) { this.riskField000 = riskField000; }

    public String getRiskField001() { return riskField001; }
    public void setRiskField001(String riskField001) { this.riskField001 = riskField001; }

    public LocalDate getRiskField002() { return riskField002; }
    public void setRiskField002(LocalDate riskField002) { this.riskField002 = riskField002; }

    public Integer getRiskField003() { return riskField003; }
    public void setRiskField003(Integer riskField003) { this.riskField003 = riskField003; }

    public BigDecimal getRiskField004() { return riskField004; }
    public void setRiskField004(BigDecimal riskField004) { this.riskField004 = riskField004; }

    public Integer getRiskField005() { return riskField005; }
    public void setRiskField005(Integer riskField005) { this.riskField005 = riskField005; }

    public BigDecimal getRiskField006() { return riskField006; }
    public void setRiskField006(BigDecimal riskField006) { this.riskField006 = riskField006; }

    public Integer getRiskField007() { return riskField007; }
    public void setRiskField007(Integer riskField007) { this.riskField007 = riskField007; }

    public Boolean getRiskField008() { return riskField008; }
    public void setRiskField008(Boolean riskField008) { this.riskField008 = riskField008; }

    public Integer getRiskField009() { return riskField009; }
    public void setRiskField009(Integer riskField009) { this.riskField009 = riskField009; }

    public Long getRiskField010() { return riskField010; }
    public void setRiskField010(Long riskField010) { this.riskField010 = riskField010; }

    public LocalDate getRiskField011() { return riskField011; }
    public void setRiskField011(LocalDate riskField011) { this.riskField011 = riskField011; }

    public LocalDate getRiskField012() { return riskField012; }
    public void setRiskField012(LocalDate riskField012) { this.riskField012 = riskField012; }

    public Double getRiskField013() { return riskField013; }
    public void setRiskField013(Double riskField013) { this.riskField013 = riskField013; }

    public Integer getRiskField014() { return riskField014; }
    public void setRiskField014(Integer riskField014) { this.riskField014 = riskField014; }

    public BigDecimal getRiskField015() { return riskField015; }
    public void setRiskField015(BigDecimal riskField015) { this.riskField015 = riskField015; }

    public Long getRiskField016() { return riskField016; }
    public void setRiskField016(Long riskField016) { this.riskField016 = riskField016; }

    @Override
    public String toString() {
        return "RiskDto033{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
