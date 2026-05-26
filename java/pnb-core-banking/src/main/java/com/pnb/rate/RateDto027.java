package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto027 — Data Transfer Object for rate operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto027 {

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField000")
    private BigDecimal rateField000;

    @JsonProperty("rateField001")
    private Boolean rateField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField002")
    private BigDecimal rateField002;

    @JsonProperty("rateField003")
    private Boolean rateField003;

    @JsonProperty("rateField004")
    private Long rateField004;

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
    private Integer rateField009;

    @JsonProperty("rateField010")
    private Boolean rateField010;

    public RateDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto027 instance = new RateDto027();

        public Builder rateField000(BigDecimal val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Boolean val) { instance.rateField001 = val; return this; }
        public Builder rateField002(BigDecimal val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Boolean val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Long val) { instance.rateField004 = val; return this; }
        public Builder rateField005(BigDecimal val) { instance.rateField005 = val; return this; }
        public Builder rateField006(BigDecimal val) { instance.rateField006 = val; return this; }
        public Builder rateField007(LocalDate val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Integer val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Integer val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Boolean val) { instance.rateField010 = val; return this; }
        public RateDto027 build() { return instance; }
    }

    public BigDecimal getRateField000() { return rateField000; }
    public void setRateField000(BigDecimal rateField000) { this.rateField000 = rateField000; }

    public Boolean getRateField001() { return rateField001; }
    public void setRateField001(Boolean rateField001) { this.rateField001 = rateField001; }

    public BigDecimal getRateField002() { return rateField002; }
    public void setRateField002(BigDecimal rateField002) { this.rateField002 = rateField002; }

    public Boolean getRateField003() { return rateField003; }
    public void setRateField003(Boolean rateField003) { this.rateField003 = rateField003; }

    public Long getRateField004() { return rateField004; }
    public void setRateField004(Long rateField004) { this.rateField004 = rateField004; }

    public BigDecimal getRateField005() { return rateField005; }
    public void setRateField005(BigDecimal rateField005) { this.rateField005 = rateField005; }

    public BigDecimal getRateField006() { return rateField006; }
    public void setRateField006(BigDecimal rateField006) { this.rateField006 = rateField006; }

    public LocalDate getRateField007() { return rateField007; }
    public void setRateField007(LocalDate rateField007) { this.rateField007 = rateField007; }

    public Integer getRateField008() { return rateField008; }
    public void setRateField008(Integer rateField008) { this.rateField008 = rateField008; }

    public Integer getRateField009() { return rateField009; }
    public void setRateField009(Integer rateField009) { this.rateField009 = rateField009; }

    public Boolean getRateField010() { return rateField010; }
    public void setRateField010(Boolean rateField010) { this.rateField010 = rateField010; }

    @Override
    public String toString() {
        return "RateDto027{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
