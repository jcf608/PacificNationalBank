package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto054 — Data Transfer Object for risk operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto054 {

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField000")
    private BigDecimal riskField000;

    @JsonProperty("riskField001")
    private Double riskField001;

    @JsonProperty("riskField002")
    private Integer riskField002;

    @JsonProperty("riskField003")
    private LocalDate riskField003;

    @JsonProperty("riskField004")
    private Integer riskField004;

    @JsonProperty("riskField005")
    private Boolean riskField005;

    @Size(max = 100)
    @JsonProperty("riskField006")
    private String riskField006;

    @Size(max = 20)
    @JsonProperty("riskField007")
    private String riskField007;

    @Size(max = 60)
    @JsonProperty("riskField008")
    private String riskField008;

    @JsonProperty("riskField009")
    private Integer riskField009;

    @Size(max = 200)
    @JsonProperty("riskField010")
    private String riskField010;

    @JsonProperty("riskField011")
    private Long riskField011;

    @JsonProperty("riskField012")
    private Boolean riskField012;

    @JsonProperty("riskField013")
    private Long riskField013;

    public RiskDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto054 instance = new RiskDto054();

        public Builder riskField000(BigDecimal val) { instance.riskField000 = val; return this; }
        public Builder riskField001(Double val) { instance.riskField001 = val; return this; }
        public Builder riskField002(Integer val) { instance.riskField002 = val; return this; }
        public Builder riskField003(LocalDate val) { instance.riskField003 = val; return this; }
        public Builder riskField004(Integer val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Boolean val) { instance.riskField005 = val; return this; }
        public Builder riskField006(String val) { instance.riskField006 = val; return this; }
        public Builder riskField007(String val) { instance.riskField007 = val; return this; }
        public Builder riskField008(String val) { instance.riskField008 = val; return this; }
        public Builder riskField009(Integer val) { instance.riskField009 = val; return this; }
        public Builder riskField010(String val) { instance.riskField010 = val; return this; }
        public Builder riskField011(Long val) { instance.riskField011 = val; return this; }
        public Builder riskField012(Boolean val) { instance.riskField012 = val; return this; }
        public Builder riskField013(Long val) { instance.riskField013 = val; return this; }
        public RiskDto054 build() { return instance; }
    }

    public BigDecimal getRiskField000() { return riskField000; }
    public void setRiskField000(BigDecimal riskField000) { this.riskField000 = riskField000; }

    public Double getRiskField001() { return riskField001; }
    public void setRiskField001(Double riskField001) { this.riskField001 = riskField001; }

    public Integer getRiskField002() { return riskField002; }
    public void setRiskField002(Integer riskField002) { this.riskField002 = riskField002; }

    public LocalDate getRiskField003() { return riskField003; }
    public void setRiskField003(LocalDate riskField003) { this.riskField003 = riskField003; }

    public Integer getRiskField004() { return riskField004; }
    public void setRiskField004(Integer riskField004) { this.riskField004 = riskField004; }

    public Boolean getRiskField005() { return riskField005; }
    public void setRiskField005(Boolean riskField005) { this.riskField005 = riskField005; }

    public String getRiskField006() { return riskField006; }
    public void setRiskField006(String riskField006) { this.riskField006 = riskField006; }

    public String getRiskField007() { return riskField007; }
    public void setRiskField007(String riskField007) { this.riskField007 = riskField007; }

    public String getRiskField008() { return riskField008; }
    public void setRiskField008(String riskField008) { this.riskField008 = riskField008; }

    public Integer getRiskField009() { return riskField009; }
    public void setRiskField009(Integer riskField009) { this.riskField009 = riskField009; }

    public String getRiskField010() { return riskField010; }
    public void setRiskField010(String riskField010) { this.riskField010 = riskField010; }

    public Long getRiskField011() { return riskField011; }
    public void setRiskField011(Long riskField011) { this.riskField011 = riskField011; }

    public Boolean getRiskField012() { return riskField012; }
    public void setRiskField012(Boolean riskField012) { this.riskField012 = riskField012; }

    public Long getRiskField013() { return riskField013; }
    public void setRiskField013(Long riskField013) { this.riskField013 = riskField013; }

    @Override
    public String toString() {
        return "RiskDto054{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
