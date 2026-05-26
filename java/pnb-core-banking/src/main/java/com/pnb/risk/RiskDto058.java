package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto058 — Data Transfer Object for risk operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto058 {

    @JsonProperty("riskField000")
    private Boolean riskField000;

    @JsonProperty("riskField001")
    private LocalDate riskField001;

    @JsonProperty("riskField002")
    private Double riskField002;

    @JsonProperty("riskField003")
    private Integer riskField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField004")
    private BigDecimal riskField004;

    @JsonProperty("riskField005")
    private LocalDate riskField005;

    @JsonProperty("riskField006")
    private Integer riskField006;

    @JsonProperty("riskField007")
    private Long riskField007;

    @Size(max = 200)
    @JsonProperty("riskField008")
    private String riskField008;

    @JsonProperty("riskField009")
    private LocalDate riskField009;

    @JsonProperty("riskField010")
    private LocalDate riskField010;

    @JsonProperty("riskField011")
    private Boolean riskField011;

    @JsonProperty("riskField012")
    private Boolean riskField012;

    @Size(max = 200)
    @JsonProperty("riskField013")
    private String riskField013;

    @JsonProperty("riskField014")
    private Boolean riskField014;

    @JsonProperty("riskField015")
    private LocalDate riskField015;

    @JsonProperty("riskField016")
    private Long riskField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField017")
    private BigDecimal riskField017;

    public RiskDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto058 instance = new RiskDto058();

        public Builder riskField000(Boolean val) { instance.riskField000 = val; return this; }
        public Builder riskField001(LocalDate val) { instance.riskField001 = val; return this; }
        public Builder riskField002(Double val) { instance.riskField002 = val; return this; }
        public Builder riskField003(Integer val) { instance.riskField003 = val; return this; }
        public Builder riskField004(BigDecimal val) { instance.riskField004 = val; return this; }
        public Builder riskField005(LocalDate val) { instance.riskField005 = val; return this; }
        public Builder riskField006(Integer val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Long val) { instance.riskField007 = val; return this; }
        public Builder riskField008(String val) { instance.riskField008 = val; return this; }
        public Builder riskField009(LocalDate val) { instance.riskField009 = val; return this; }
        public Builder riskField010(LocalDate val) { instance.riskField010 = val; return this; }
        public Builder riskField011(Boolean val) { instance.riskField011 = val; return this; }
        public Builder riskField012(Boolean val) { instance.riskField012 = val; return this; }
        public Builder riskField013(String val) { instance.riskField013 = val; return this; }
        public Builder riskField014(Boolean val) { instance.riskField014 = val; return this; }
        public Builder riskField015(LocalDate val) { instance.riskField015 = val; return this; }
        public Builder riskField016(Long val) { instance.riskField016 = val; return this; }
        public Builder riskField017(BigDecimal val) { instance.riskField017 = val; return this; }
        public RiskDto058 build() { return instance; }
    }

    public Boolean getRiskField000() { return riskField000; }
    public void setRiskField000(Boolean riskField000) { this.riskField000 = riskField000; }

    public LocalDate getRiskField001() { return riskField001; }
    public void setRiskField001(LocalDate riskField001) { this.riskField001 = riskField001; }

    public Double getRiskField002() { return riskField002; }
    public void setRiskField002(Double riskField002) { this.riskField002 = riskField002; }

    public Integer getRiskField003() { return riskField003; }
    public void setRiskField003(Integer riskField003) { this.riskField003 = riskField003; }

    public BigDecimal getRiskField004() { return riskField004; }
    public void setRiskField004(BigDecimal riskField004) { this.riskField004 = riskField004; }

    public LocalDate getRiskField005() { return riskField005; }
    public void setRiskField005(LocalDate riskField005) { this.riskField005 = riskField005; }

    public Integer getRiskField006() { return riskField006; }
    public void setRiskField006(Integer riskField006) { this.riskField006 = riskField006; }

    public Long getRiskField007() { return riskField007; }
    public void setRiskField007(Long riskField007) { this.riskField007 = riskField007; }

    public String getRiskField008() { return riskField008; }
    public void setRiskField008(String riskField008) { this.riskField008 = riskField008; }

    public LocalDate getRiskField009() { return riskField009; }
    public void setRiskField009(LocalDate riskField009) { this.riskField009 = riskField009; }

    public LocalDate getRiskField010() { return riskField010; }
    public void setRiskField010(LocalDate riskField010) { this.riskField010 = riskField010; }

    public Boolean getRiskField011() { return riskField011; }
    public void setRiskField011(Boolean riskField011) { this.riskField011 = riskField011; }

    public Boolean getRiskField012() { return riskField012; }
    public void setRiskField012(Boolean riskField012) { this.riskField012 = riskField012; }

    public String getRiskField013() { return riskField013; }
    public void setRiskField013(String riskField013) { this.riskField013 = riskField013; }

    public Boolean getRiskField014() { return riskField014; }
    public void setRiskField014(Boolean riskField014) { this.riskField014 = riskField014; }

    public LocalDate getRiskField015() { return riskField015; }
    public void setRiskField015(LocalDate riskField015) { this.riskField015 = riskField015; }

    public Long getRiskField016() { return riskField016; }
    public void setRiskField016(Long riskField016) { this.riskField016 = riskField016; }

    public BigDecimal getRiskField017() { return riskField017; }
    public void setRiskField017(BigDecimal riskField017) { this.riskField017 = riskField017; }

    @Override
    public String toString() {
        return "RiskDto058{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
