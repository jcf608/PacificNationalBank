package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto043 — Data Transfer Object for rate operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto043 {

    @JsonProperty("rateField000")
    private Integer rateField000;

    @JsonProperty("rateField001")
    private Integer rateField001;

    @JsonProperty("rateField002")
    private Long rateField002;

    @JsonProperty("rateField003")
    private Integer rateField003;

    @JsonProperty("rateField004")
    private Long rateField004;

    @JsonProperty("rateField005")
    private LocalDate rateField005;

    @JsonProperty("rateField006")
    private Boolean rateField006;

    @JsonProperty("rateField007")
    private Long rateField007;

    @JsonProperty("rateField008")
    private Boolean rateField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField009")
    private BigDecimal rateField009;

    @JsonProperty("rateField010")
    private Integer rateField010;

    @JsonProperty("rateField011")
    private Long rateField011;

    @Size(max = 20)
    @JsonProperty("rateField012")
    private String rateField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField013")
    private BigDecimal rateField013;

    @JsonProperty("rateField014")
    private LocalDate rateField014;

    public RateDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto043 instance = new RateDto043();

        public Builder rateField000(Integer val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Integer val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Long val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Integer val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Long val) { instance.rateField004 = val; return this; }
        public Builder rateField005(LocalDate val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Boolean val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Long val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Boolean val) { instance.rateField008 = val; return this; }
        public Builder rateField009(BigDecimal val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Integer val) { instance.rateField010 = val; return this; }
        public Builder rateField011(Long val) { instance.rateField011 = val; return this; }
        public Builder rateField012(String val) { instance.rateField012 = val; return this; }
        public Builder rateField013(BigDecimal val) { instance.rateField013 = val; return this; }
        public Builder rateField014(LocalDate val) { instance.rateField014 = val; return this; }
        public RateDto043 build() { return instance; }
    }

    public Integer getRateField000() { return rateField000; }
    public void setRateField000(Integer rateField000) { this.rateField000 = rateField000; }

    public Integer getRateField001() { return rateField001; }
    public void setRateField001(Integer rateField001) { this.rateField001 = rateField001; }

    public Long getRateField002() { return rateField002; }
    public void setRateField002(Long rateField002) { this.rateField002 = rateField002; }

    public Integer getRateField003() { return rateField003; }
    public void setRateField003(Integer rateField003) { this.rateField003 = rateField003; }

    public Long getRateField004() { return rateField004; }
    public void setRateField004(Long rateField004) { this.rateField004 = rateField004; }

    public LocalDate getRateField005() { return rateField005; }
    public void setRateField005(LocalDate rateField005) { this.rateField005 = rateField005; }

    public Boolean getRateField006() { return rateField006; }
    public void setRateField006(Boolean rateField006) { this.rateField006 = rateField006; }

    public Long getRateField007() { return rateField007; }
    public void setRateField007(Long rateField007) { this.rateField007 = rateField007; }

    public Boolean getRateField008() { return rateField008; }
    public void setRateField008(Boolean rateField008) { this.rateField008 = rateField008; }

    public BigDecimal getRateField009() { return rateField009; }
    public void setRateField009(BigDecimal rateField009) { this.rateField009 = rateField009; }

    public Integer getRateField010() { return rateField010; }
    public void setRateField010(Integer rateField010) { this.rateField010 = rateField010; }

    public Long getRateField011() { return rateField011; }
    public void setRateField011(Long rateField011) { this.rateField011 = rateField011; }

    public String getRateField012() { return rateField012; }
    public void setRateField012(String rateField012) { this.rateField012 = rateField012; }

    public BigDecimal getRateField013() { return rateField013; }
    public void setRateField013(BigDecimal rateField013) { this.rateField013 = rateField013; }

    public LocalDate getRateField014() { return rateField014; }
    public void setRateField014(LocalDate rateField014) { this.rateField014 = rateField014; }

    @Override
    public String toString() {
        return "RateDto043{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
