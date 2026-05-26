package com.pnb.risk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RiskDto057 — Data Transfer Object for risk operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskDto057 {

    @Size(max = 60)
    @JsonProperty("riskField000")
    private String riskField000;

    @JsonProperty("riskField001")
    private Long riskField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField002")
    private BigDecimal riskField002;

    @Size(max = 20)
    @JsonProperty("riskField003")
    private String riskField003;

    @JsonProperty("riskField004")
    private LocalDate riskField004;

    @JsonProperty("riskField005")
    private Boolean riskField005;

    @Size(max = 60)
    @JsonProperty("riskField006")
    private String riskField006;

    @JsonProperty("riskField007")
    private Integer riskField007;

    @JsonProperty("riskField008")
    private LocalDate riskField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField009")
    private BigDecimal riskField009;

    @Size(max = 20)
    @JsonProperty("riskField010")
    private String riskField010;

    @JsonProperty("riskField011")
    private Boolean riskField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField012")
    private BigDecimal riskField012;

    @JsonProperty("riskField013")
    private Boolean riskField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField014")
    private BigDecimal riskField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("riskField015")
    private BigDecimal riskField015;

    @JsonProperty("riskField016")
    private Integer riskField016;

    public RiskDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RiskDto057 instance = new RiskDto057();

        public Builder riskField000(String val) { instance.riskField000 = val; return this; }
        public Builder riskField001(Long val) { instance.riskField001 = val; return this; }
        public Builder riskField002(BigDecimal val) { instance.riskField002 = val; return this; }
        public Builder riskField003(String val) { instance.riskField003 = val; return this; }
        public Builder riskField004(LocalDate val) { instance.riskField004 = val; return this; }
        public Builder riskField005(Boolean val) { instance.riskField005 = val; return this; }
        public Builder riskField006(String val) { instance.riskField006 = val; return this; }
        public Builder riskField007(Integer val) { instance.riskField007 = val; return this; }
        public Builder riskField008(LocalDate val) { instance.riskField008 = val; return this; }
        public Builder riskField009(BigDecimal val) { instance.riskField009 = val; return this; }
        public Builder riskField010(String val) { instance.riskField010 = val; return this; }
        public Builder riskField011(Boolean val) { instance.riskField011 = val; return this; }
        public Builder riskField012(BigDecimal val) { instance.riskField012 = val; return this; }
        public Builder riskField013(Boolean val) { instance.riskField013 = val; return this; }
        public Builder riskField014(BigDecimal val) { instance.riskField014 = val; return this; }
        public Builder riskField015(BigDecimal val) { instance.riskField015 = val; return this; }
        public Builder riskField016(Integer val) { instance.riskField016 = val; return this; }
        public RiskDto057 build() { return instance; }
    }

    public String getRiskField000() { return riskField000; }
    public void setRiskField000(String riskField000) { this.riskField000 = riskField000; }

    public Long getRiskField001() { return riskField001; }
    public void setRiskField001(Long riskField001) { this.riskField001 = riskField001; }

    public BigDecimal getRiskField002() { return riskField002; }
    public void setRiskField002(BigDecimal riskField002) { this.riskField002 = riskField002; }

    public String getRiskField003() { return riskField003; }
    public void setRiskField003(String riskField003) { this.riskField003 = riskField003; }

    public LocalDate getRiskField004() { return riskField004; }
    public void setRiskField004(LocalDate riskField004) { this.riskField004 = riskField004; }

    public Boolean getRiskField005() { return riskField005; }
    public void setRiskField005(Boolean riskField005) { this.riskField005 = riskField005; }

    public String getRiskField006() { return riskField006; }
    public void setRiskField006(String riskField006) { this.riskField006 = riskField006; }

    public Integer getRiskField007() { return riskField007; }
    public void setRiskField007(Integer riskField007) { this.riskField007 = riskField007; }

    public LocalDate getRiskField008() { return riskField008; }
    public void setRiskField008(LocalDate riskField008) { this.riskField008 = riskField008; }

    public BigDecimal getRiskField009() { return riskField009; }
    public void setRiskField009(BigDecimal riskField009) { this.riskField009 = riskField009; }

    public String getRiskField010() { return riskField010; }
    public void setRiskField010(String riskField010) { this.riskField010 = riskField010; }

    public Boolean getRiskField011() { return riskField011; }
    public void setRiskField011(Boolean riskField011) { this.riskField011 = riskField011; }

    public BigDecimal getRiskField012() { return riskField012; }
    public void setRiskField012(BigDecimal riskField012) { this.riskField012 = riskField012; }

    public Boolean getRiskField013() { return riskField013; }
    public void setRiskField013(Boolean riskField013) { this.riskField013 = riskField013; }

    public BigDecimal getRiskField014() { return riskField014; }
    public void setRiskField014(BigDecimal riskField014) { this.riskField014 = riskField014; }

    public BigDecimal getRiskField015() { return riskField015; }
    public void setRiskField015(BigDecimal riskField015) { this.riskField015 = riskField015; }

    public Integer getRiskField016() { return riskField016; }
    public void setRiskField016(Integer riskField016) { this.riskField016 = riskField016; }

    @Override
    public String toString() {
        return "RiskDto057{" +
            "riskField000=" + riskField000 + ", " +
            "riskField001=" + riskField001 + ", " +
            "riskField002=" + riskField002 + ", " +
            "riskField003=" + riskField003 + ", " +
            "riskField004=" + riskField004 + ", " +
            "}";
    }
}
