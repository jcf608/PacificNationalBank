package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto030 — Data Transfer Object for risk operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto030 {

    @JsonProperty("riskField000")
    private LocalDate riskField000;

    @JsonProperty("riskField001")
    private LocalDate riskField001;

    @JsonProperty("riskField002")
    private Long riskField002;

    @JsonProperty("riskField003")
    private Long riskField003;

    @JsonProperty("riskField004")
    private Double riskField004;

    @JsonProperty("riskField005")
    private Double riskField005;

    @JsonProperty("riskField006")
    private Boolean riskField006;

    @JsonProperty("riskField007")
    private Long riskField007;

    @Size(max = 40)
    @JsonProperty("riskField008")
    private String riskField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField009")
    private BigDecimal riskField009;

    @JsonProperty("riskField010")
    private LocalDate riskField010;

    @Size(max = 20)
    @JsonProperty("riskField011")
    private String riskField011;

    @JsonProperty("riskField012")
    private Long riskField012;

    @JsonProperty("riskField013")
    private LocalDate riskField013;

    public RiskDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto030 instance = new RiskDto030();

        public Builder riskField000(LocalDate val) { instance.riskField000 = val; return this; }
        public Builder riskField001(LocalDate val) { instance.riskField001 = val; return this; }
        public Builder riskField002(Long val) { instance.riskField002 = val; return this; }
        public Builder riskField003(Long val) { instance.riskField003 = val; return this; }
        public Builder riskField004(Double val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Double val) { instance.riskField005 = val; return this; }
        public Builder riskField006(Boolean val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Long val) { instance.riskField007 = val; return this; }
        public Builder riskField008(String val) { instance.riskField008 = val; return this; }
        public Builder riskField009(BigDecimal val) { instance.riskField009 = val; return this; }
        public Builder riskField010(LocalDate val) { instance.riskField010 = val; return this; }
        public Builder riskField011(String val) { instance.riskField011 = val; return this; }
        public Builder riskField012(Long val) { instance.riskField012 = val; return this; }
        public Builder riskField013(LocalDate val) { instance.riskField013 = val; return this; }
        public RiskDto030 build() { return instance; }
    }

    public LocalDate getRiskField000() { return riskField000; }
    public void setRiskField000(LocalDate riskField000) { this.riskField000 = riskField000; }

    public LocalDate getRiskField001() { return riskField001; }
    public void setRiskField001(LocalDate riskField001) { this.riskField001 = riskField001; }

    public Long getRiskField002() { return riskField002; }
    public void setRiskField002(Long riskField002) { this.riskField002 = riskField002; }

    public Long getRiskField003() { return riskField003; }
    public void setRiskField003(Long riskField003) { this.riskField003 = riskField003; }

    public Double getRiskField004() { return riskField004; }
    public void setRiskField004(Double riskField004) { this.riskField004 = riskField004; }

    public Double getRiskField005() { return riskField005; }
    public void setRiskField005(Double riskField005) { this.riskField005 = riskField005; }

    public Boolean getRiskField006() { return riskField006; }
    public void setRiskField006(Boolean riskField006) { this.riskField006 = riskField006; }

    public Long getRiskField007() { return riskField007; }
    public void setRiskField007(Long riskField007) { this.riskField007 = riskField007; }

    public String getRiskField008() { return riskField008; }
    public void setRiskField008(String riskField008) { this.riskField008 = riskField008; }

    public BigDecimal getRiskField009() { return riskField009; }
    public void setRiskField009(BigDecimal riskField009) { this.riskField009 = riskField009; }

    public LocalDate getRiskField010() { return riskField010; }
    public void setRiskField010(LocalDate riskField010) { this.riskField010 = riskField010; }

    public String getRiskField011() { return riskField011; }
    public void setRiskField011(String riskField011) { this.riskField011 = riskField011; }

    public Long getRiskField012() { return riskField012; }
    public void setRiskField012(Long riskField012) { this.riskField012 = riskField012; }

    public LocalDate getRiskField013() { return riskField013; }
    public void setRiskField013(LocalDate riskField013) { this.riskField013 = riskField013; }

    @Override
    public String toString() {
        return "RiskDto030{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
