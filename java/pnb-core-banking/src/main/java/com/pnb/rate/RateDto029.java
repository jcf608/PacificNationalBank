package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto029 — Data Transfer Object for rate operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto029 {

    @JsonProperty("rateField000")
    private Long rateField000;

    @JsonProperty("rateField001")
    private LocalDate rateField001;

    @JsonProperty("rateField002")
    private Integer rateField002;

    @JsonProperty("rateField003")
    private Boolean rateField003;

    @JsonProperty("rateField004")
    private LocalDate rateField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField005")
    private BigDecimal rateField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField006")
    private BigDecimal rateField006;

    @JsonProperty("rateField007")
    private LocalDate rateField007;

    @JsonProperty("rateField008")
    private Integer rateField008;

    @JsonProperty("rateField009")
    private Long rateField009;

    @JsonProperty("rateField010")
    private Integer rateField010;

    @JsonProperty("rateField011")
    private Integer rateField011;

    @JsonProperty("rateField012")
    private LocalDate rateField012;

    public RateDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto029 instance = new RateDto029();

        public Builder rateField000(Long val) { instance.rateField000 = val; return this; }
        public Builder rateField001(LocalDate val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Integer val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Boolean val) { instance.rateField003 = val; return this; }
        public Builder rateField004(LocalDate val) { instance.rateField004 = val; return this; }
        public Builder rateField005(BigDecimal val) { instance.rateField005 = val; return this; }
        public Builder rateField006(BigDecimal val) { instance.rateField006 = val; return this; }
        public Builder rateField007(LocalDate val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Integer val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Long val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Integer val) { instance.rateField010 = val; return this; }
        public Builder rateField011(Integer val) { instance.rateField011 = val; return this; }
        public Builder rateField012(LocalDate val) { instance.rateField012 = val; return this; }
        public RateDto029 build() { return instance; }
    }

    public Long getRateField000() { return rateField000; }
    public void setRateField000(Long rateField000) { this.rateField000 = rateField000; }

    public LocalDate getRateField001() { return rateField001; }
    public void setRateField001(LocalDate rateField001) { this.rateField001 = rateField001; }

    public Integer getRateField002() { return rateField002; }
    public void setRateField002(Integer rateField002) { this.rateField002 = rateField002; }

    public Boolean getRateField003() { return rateField003; }
    public void setRateField003(Boolean rateField003) { this.rateField003 = rateField003; }

    public LocalDate getRateField004() { return rateField004; }
    public void setRateField004(LocalDate rateField004) { this.rateField004 = rateField004; }

    public BigDecimal getRateField005() { return rateField005; }
    public void setRateField005(BigDecimal rateField005) { this.rateField005 = rateField005; }

    public BigDecimal getRateField006() { return rateField006; }
    public void setRateField006(BigDecimal rateField006) { this.rateField006 = rateField006; }

    public LocalDate getRateField007() { return rateField007; }
    public void setRateField007(LocalDate rateField007) { this.rateField007 = rateField007; }

    public Integer getRateField008() { return rateField008; }
    public void setRateField008(Integer rateField008) { this.rateField008 = rateField008; }

    public Long getRateField009() { return rateField009; }
    public void setRateField009(Long rateField009) { this.rateField009 = rateField009; }

    public Integer getRateField010() { return rateField010; }
    public void setRateField010(Integer rateField010) { this.rateField010 = rateField010; }

    public Integer getRateField011() { return rateField011; }
    public void setRateField011(Integer rateField011) { this.rateField011 = rateField011; }

    public LocalDate getRateField012() { return rateField012; }
    public void setRateField012(LocalDate rateField012) { this.rateField012 = rateField012; }

    @Override
    public String toString() {
        return "RateDto029{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
