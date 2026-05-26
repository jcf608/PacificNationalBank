package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto031 — Data Transfer Object for rate operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto031 {

    @JsonProperty("rateField000")
    private Long rateField000;

    @JsonProperty("rateField001")
    private Boolean rateField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField002")
    private BigDecimal rateField002;

    @JsonProperty("rateField003")
    private Long rateField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField004")
    private BigDecimal rateField004;

    @JsonProperty("rateField005")
    private Long rateField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField006")
    private BigDecimal rateField006;

    @JsonProperty("rateField007")
    private Integer rateField007;

    @JsonProperty("rateField008")
    private Double rateField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField009")
    private BigDecimal rateField009;

    @JsonProperty("rateField010")
    private Integer rateField010;

    @JsonProperty("rateField011")
    private LocalDate rateField011;

    @JsonProperty("rateField012")
    private LocalDate rateField012;

    @Size(max = 40)
    @JsonProperty("rateField013")
    private String rateField013;

    @Size(max = 200)
    @JsonProperty("rateField014")
    private String rateField014;

    public RateDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto031 instance = new RateDto031();

        public Builder rateField000(Long val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Boolean val) { instance.rateField001 = val; return this; }
        public Builder rateField002(BigDecimal val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Long val) { instance.rateField003 = val; return this; }
        public Builder rateField004(BigDecimal val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Long val) { instance.rateField005 = val; return this; }
        public Builder rateField006(BigDecimal val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Integer val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Double val) { instance.rateField008 = val; return this; }
        public Builder rateField009(BigDecimal val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Integer val) { instance.rateField010 = val; return this; }
        public Builder rateField011(LocalDate val) { instance.rateField011 = val; return this; }
        public Builder rateField012(LocalDate val) { instance.rateField012 = val; return this; }
        public Builder rateField013(String val) { instance.rateField013 = val; return this; }
        public Builder rateField014(String val) { instance.rateField014 = val; return this; }
        public RateDto031 build() { return instance; }
    }

    public Long getRateField000() { return rateField000; }
    public void setRateField000(Long rateField000) { this.rateField000 = rateField000; }

    public Boolean getRateField001() { return rateField001; }
    public void setRateField001(Boolean rateField001) { this.rateField001 = rateField001; }

    public BigDecimal getRateField002() { return rateField002; }
    public void setRateField002(BigDecimal rateField002) { this.rateField002 = rateField002; }

    public Long getRateField003() { return rateField003; }
    public void setRateField003(Long rateField003) { this.rateField003 = rateField003; }

    public BigDecimal getRateField004() { return rateField004; }
    public void setRateField004(BigDecimal rateField004) { this.rateField004 = rateField004; }

    public Long getRateField005() { return rateField005; }
    public void setRateField005(Long rateField005) { this.rateField005 = rateField005; }

    public BigDecimal getRateField006() { return rateField006; }
    public void setRateField006(BigDecimal rateField006) { this.rateField006 = rateField006; }

    public Integer getRateField007() { return rateField007; }
    public void setRateField007(Integer rateField007) { this.rateField007 = rateField007; }

    public Double getRateField008() { return rateField008; }
    public void setRateField008(Double rateField008) { this.rateField008 = rateField008; }

    public BigDecimal getRateField009() { return rateField009; }
    public void setRateField009(BigDecimal rateField009) { this.rateField009 = rateField009; }

    public Integer getRateField010() { return rateField010; }
    public void setRateField010(Integer rateField010) { this.rateField010 = rateField010; }

    public LocalDate getRateField011() { return rateField011; }
    public void setRateField011(LocalDate rateField011) { this.rateField011 = rateField011; }

    public LocalDate getRateField012() { return rateField012; }
    public void setRateField012(LocalDate rateField012) { this.rateField012 = rateField012; }

    public String getRateField013() { return rateField013; }
    public void setRateField013(String rateField013) { this.rateField013 = rateField013; }

    public String getRateField014() { return rateField014; }
    public void setRateField014(String rateField014) { this.rateField014 = rateField014; }

    @Override
    public String toString() {
        return "RateDto031{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
