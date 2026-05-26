package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto029 — Data Transfer Object for risk operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto029 {

    @Size(max = 200)
    @JsonProperty("riskField000")
    private String riskField000;

    @JsonProperty("riskField001")
    private Integer riskField001;

    @JsonProperty("riskField002")
    private Long riskField002;

    @JsonProperty("riskField003")
    private Boolean riskField003;

    @Size(max = 200)
    @JsonProperty("riskField004")
    private String riskField004;

    @JsonProperty("riskField005")
    private Long riskField005;

    @Size(max = 60)
    @JsonProperty("riskField006")
    private String riskField006;

    @JsonProperty("riskField007")
    private LocalDate riskField007;

    @JsonProperty("riskField008")
    private Boolean riskField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField009")
    private BigDecimal riskField009;

    @Size(max = 20)
    @JsonProperty("riskField010")
    private String riskField010;

    @JsonProperty("riskField011")
    private Double riskField011;

    @JsonProperty("riskField012")
    private LocalDate riskField012;

    public RiskDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto029 instance = new RiskDto029();

        public Builder riskField000(String val) { instance.riskField000 = val; return this; }
        public Builder riskField001(Integer val) { instance.riskField001 = val; return this; }
        public Builder riskField002(Long val) { instance.riskField002 = val; return this; }
        public Builder riskField003(Boolean val) { instance.riskField003 = val; return this; }
        public Builder riskField004(String val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Long val) { instance.riskField005 = val; return this; }
        public Builder riskField006(String val) { instance.riskField006 = val; return this; }
        public Builder riskField007(LocalDate val) { instance.riskField007 = val; return this; }
        public Builder riskField008(Boolean val) { instance.riskField008 = val; return this; }
        public Builder riskField009(BigDecimal val) { instance.riskField009 = val; return this; }
        public Builder riskField010(String val) { instance.riskField010 = val; return this; }
        public Builder riskField011(Double val) { instance.riskField011 = val; return this; }
        public Builder riskField012(LocalDate val) { instance.riskField012 = val; return this; }
        public RiskDto029 build() { return instance; }
    }

    public String getRiskField000() { return riskField000; }
    public void setRiskField000(String riskField000) { this.riskField000 = riskField000; }

    public Integer getRiskField001() { return riskField001; }
    public void setRiskField001(Integer riskField001) { this.riskField001 = riskField001; }

    public Long getRiskField002() { return riskField002; }
    public void setRiskField002(Long riskField002) { this.riskField002 = riskField002; }

    public Boolean getRiskField003() { return riskField003; }
    public void setRiskField003(Boolean riskField003) { this.riskField003 = riskField003; }

    public String getRiskField004() { return riskField004; }
    public void setRiskField004(String riskField004) { this.riskField004 = riskField004; }

    public Long getRiskField005() { return riskField005; }
    public void setRiskField005(Long riskField005) { this.riskField005 = riskField005; }

    public String getRiskField006() { return riskField006; }
    public void setRiskField006(String riskField006) { this.riskField006 = riskField006; }

    public LocalDate getRiskField007() { return riskField007; }
    public void setRiskField007(LocalDate riskField007) { this.riskField007 = riskField007; }

    public Boolean getRiskField008() { return riskField008; }
    public void setRiskField008(Boolean riskField008) { this.riskField008 = riskField008; }

    public BigDecimal getRiskField009() { return riskField009; }
    public void setRiskField009(BigDecimal riskField009) { this.riskField009 = riskField009; }

    public String getRiskField010() { return riskField010; }
    public void setRiskField010(String riskField010) { this.riskField010 = riskField010; }

    public Double getRiskField011() { return riskField011; }
    public void setRiskField011(Double riskField011) { this.riskField011 = riskField011; }

    public LocalDate getRiskField012() { return riskField012; }
    public void setRiskField012(LocalDate riskField012) { this.riskField012 = riskField012; }

    @Override
    public String toString() {
        return "RiskDto029{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
