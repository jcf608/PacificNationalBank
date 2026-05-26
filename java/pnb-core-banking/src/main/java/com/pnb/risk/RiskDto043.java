package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto043 — Data Transfer Object for risk operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto043 {

    @JsonProperty("riskField000")
    private Double riskField000;

    @JsonProperty("riskField001")
    private LocalDate riskField001;

    @Size(max = 60)
    @JsonProperty("riskField002")
    private String riskField002;

    @JsonProperty("riskField003")
    private Integer riskField003;

    @JsonProperty("riskField004")
    private Boolean riskField004;

    @JsonProperty("riskField005")
    private Boolean riskField005;

    @Size(max = 40)
    @JsonProperty("riskField006")
    private String riskField006;

    @JsonProperty("riskField007")
    private Long riskField007;

    @JsonProperty("riskField008")
    private LocalDate riskField008;

    @JsonProperty("riskField009")
    private Integer riskField009;

    @JsonProperty("riskField010")
    private Long riskField010;

    @Size(max = 100)
    @JsonProperty("riskField011")
    private String riskField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField012")
    private BigDecimal riskField012;

    @JsonProperty("riskField013")
    private LocalDate riskField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField014")
    private BigDecimal riskField014;

    public RiskDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto043 instance = new RiskDto043();

        public Builder riskField000(Double val) { instance.riskField000 = val; return this; }
        public Builder riskField001(LocalDate val) { instance.riskField001 = val; return this; }
        public Builder riskField002(String val) { instance.riskField002 = val; return this; }
        public Builder riskField003(Integer val) { instance.riskField003 = val; return this; }
        public Builder riskField004(Boolean val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Boolean val) { instance.riskField005 = val; return this; }
        public Builder riskField006(String val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Long val) { instance.riskField007 = val; return this; }
        public Builder riskField008(LocalDate val) { instance.riskField008 = val; return this; }
        public Builder riskField009(Integer val) { instance.riskField009 = val; return this; }
        public Builder riskField010(Long val) { instance.riskField010 = val; return this; }
        public Builder riskField011(String val) { instance.riskField011 = val; return this; }
        public Builder riskField012(BigDecimal val) { instance.riskField012 = val; return this; }
        public Builder riskField013(LocalDate val) { instance.riskField013 = val; return this; }
        public Builder riskField014(BigDecimal val) { instance.riskField014 = val; return this; }
        public RiskDto043 build() { return instance; }
    }

    public Double getRiskField000() { return riskField000; }
    public void setRiskField000(Double riskField000) { this.riskField000 = riskField000; }

    public LocalDate getRiskField001() { return riskField001; }
    public void setRiskField001(LocalDate riskField001) { this.riskField001 = riskField001; }

    public String getRiskField002() { return riskField002; }
    public void setRiskField002(String riskField002) { this.riskField002 = riskField002; }

    public Integer getRiskField003() { return riskField003; }
    public void setRiskField003(Integer riskField003) { this.riskField003 = riskField003; }

    public Boolean getRiskField004() { return riskField004; }
    public void setRiskField004(Boolean riskField004) { this.riskField004 = riskField004; }

    public Boolean getRiskField005() { return riskField005; }
    public void setRiskField005(Boolean riskField005) { this.riskField005 = riskField005; }

    public String getRiskField006() { return riskField006; }
    public void setRiskField006(String riskField006) { this.riskField006 = riskField006; }

    public Long getRiskField007() { return riskField007; }
    public void setRiskField007(Long riskField007) { this.riskField007 = riskField007; }

    public LocalDate getRiskField008() { return riskField008; }
    public void setRiskField008(LocalDate riskField008) { this.riskField008 = riskField008; }

    public Integer getRiskField009() { return riskField009; }
    public void setRiskField009(Integer riskField009) { this.riskField009 = riskField009; }

    public Long getRiskField010() { return riskField010; }
    public void setRiskField010(Long riskField010) { this.riskField010 = riskField010; }

    public String getRiskField011() { return riskField011; }
    public void setRiskField011(String riskField011) { this.riskField011 = riskField011; }

    public BigDecimal getRiskField012() { return riskField012; }
    public void setRiskField012(BigDecimal riskField012) { this.riskField012 = riskField012; }

    public LocalDate getRiskField013() { return riskField013; }
    public void setRiskField013(LocalDate riskField013) { this.riskField013 = riskField013; }

    public BigDecimal getRiskField014() { return riskField014; }
    public void setRiskField014(BigDecimal riskField014) { this.riskField014 = riskField014; }

    @Override
    public String toString() {
        return "RiskDto043{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
