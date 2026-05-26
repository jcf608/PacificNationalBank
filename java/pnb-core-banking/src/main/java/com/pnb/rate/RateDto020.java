package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto020 — Data Transfer Object for rate operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto020 {

    @JsonProperty("rateField000")
    private Integer rateField000;

    @JsonProperty("rateField001")
    private Integer rateField001;

    @JsonProperty("rateField002")
    private Double rateField002;

    @JsonProperty("rateField003")
    private Double rateField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField004")
    private BigDecimal rateField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField005")
    private BigDecimal rateField005;

    @Size(max = 60)
    @JsonProperty("rateField006")
    private String rateField006;

    @JsonProperty("rateField007")
    private Long rateField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField008")
    private BigDecimal rateField008;

    @JsonProperty("rateField009")
    private Long rateField009;

    @Size(max = 100)
    @JsonProperty("rateField010")
    private String rateField010;

    @JsonProperty("rateField011")
    private LocalDate rateField011;

    @JsonProperty("rateField012")
    private Long rateField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField013")
    private BigDecimal rateField013;

    @JsonProperty("rateField014")
    private Long rateField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField015")
    private BigDecimal rateField015;

    public RateDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto020 instance = new RateDto020();

        public Builder rateField000(Integer val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Integer val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Double val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Double val) { instance.rateField003 = val; return this; }
        public Builder rateField004(BigDecimal val) { instance.rateField004 = val; return this; }
        public Builder rateField005(BigDecimal val) { instance.rateField005 = val; return this; }
        public Builder rateField006(String val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Long val) { instance.rateField007 = val; return this; }
        public Builder rateField008(BigDecimal val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Long val) { instance.rateField009 = val; return this; }
        public Builder rateField010(String val) { instance.rateField010 = val; return this; }
        public Builder rateField011(LocalDate val) { instance.rateField011 = val; return this; }
        public Builder rateField012(Long val) { instance.rateField012 = val; return this; }
        public Builder rateField013(BigDecimal val) { instance.rateField013 = val; return this; }
        public Builder rateField014(Long val) { instance.rateField014 = val; return this; }
        public Builder rateField015(BigDecimal val) { instance.rateField015 = val; return this; }
        public RateDto020 build() { return instance; }
    }

    public Integer getRateField000() { return rateField000; }
    public void setRateField000(Integer rateField000) { this.rateField000 = rateField000; }

    public Integer getRateField001() { return rateField001; }
    public void setRateField001(Integer rateField001) { this.rateField001 = rateField001; }

    public Double getRateField002() { return rateField002; }
    public void setRateField002(Double rateField002) { this.rateField002 = rateField002; }

    public Double getRateField003() { return rateField003; }
    public void setRateField003(Double rateField003) { this.rateField003 = rateField003; }

    public BigDecimal getRateField004() { return rateField004; }
    public void setRateField004(BigDecimal rateField004) { this.rateField004 = rateField004; }

    public BigDecimal getRateField005() { return rateField005; }
    public void setRateField005(BigDecimal rateField005) { this.rateField005 = rateField005; }

    public String getRateField006() { return rateField006; }
    public void setRateField006(String rateField006) { this.rateField006 = rateField006; }

    public Long getRateField007() { return rateField007; }
    public void setRateField007(Long rateField007) { this.rateField007 = rateField007; }

    public BigDecimal getRateField008() { return rateField008; }
    public void setRateField008(BigDecimal rateField008) { this.rateField008 = rateField008; }

    public Long getRateField009() { return rateField009; }
    public void setRateField009(Long rateField009) { this.rateField009 = rateField009; }

    public String getRateField010() { return rateField010; }
    public void setRateField010(String rateField010) { this.rateField010 = rateField010; }

    public LocalDate getRateField011() { return rateField011; }
    public void setRateField011(LocalDate rateField011) { this.rateField011 = rateField011; }

    public Long getRateField012() { return rateField012; }
    public void setRateField012(Long rateField012) { this.rateField012 = rateField012; }

    public BigDecimal getRateField013() { return rateField013; }
    public void setRateField013(BigDecimal rateField013) { this.rateField013 = rateField013; }

    public Long getRateField014() { return rateField014; }
    public void setRateField014(Long rateField014) { this.rateField014 = rateField014; }

    public BigDecimal getRateField015() { return rateField015; }
    public void setRateField015(BigDecimal rateField015) { this.rateField015 = rateField015; }

    @Override
    public String toString() {
        return "RateDto020{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
