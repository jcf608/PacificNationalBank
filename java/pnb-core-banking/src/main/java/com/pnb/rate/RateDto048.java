package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto048 — Data Transfer Object for rate operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto048 {

    @JsonProperty("rateField000")
    private LocalDate rateField000;

    @JsonProperty("rateField001")
    private Long rateField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField002")
    private BigDecimal rateField002;

    @Size(max = 200)
    @JsonProperty("rateField003")
    private String rateField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField004")
    private BigDecimal rateField004;

    @JsonProperty("rateField005")
    private LocalDate rateField005;

    @JsonProperty("rateField006")
    private Integer rateField006;

    @JsonProperty("rateField007")
    private Double rateField007;

    public RateDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto048 instance = new RateDto048();

        public Builder rateField000(LocalDate val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Long val) { instance.rateField001 = val; return this; }
        public Builder rateField002(BigDecimal val) { instance.rateField002 = val; return this; }
        public Builder rateField003(String val) { instance.rateField003 = val; return this; }
        public Builder rateField004(BigDecimal val) { instance.rateField004 = val; return this; }
        public Builder rateField005(LocalDate val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Integer val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Double val) { instance.rateField007 = val; return this; }
        public RateDto048 build() { return instance; }
    }

    public LocalDate getRateField000() { return rateField000; }
    public void setRateField000(LocalDate rateField000) { this.rateField000 = rateField000; }

    public Long getRateField001() { return rateField001; }
    public void setRateField001(Long rateField001) { this.rateField001 = rateField001; }

    public BigDecimal getRateField002() { return rateField002; }
    public void setRateField002(BigDecimal rateField002) { this.rateField002 = rateField002; }

    public String getRateField003() { return rateField003; }
    public void setRateField003(String rateField003) { this.rateField003 = rateField003; }

    public BigDecimal getRateField004() { return rateField004; }
    public void setRateField004(BigDecimal rateField004) { this.rateField004 = rateField004; }

    public LocalDate getRateField005() { return rateField005; }
    public void setRateField005(LocalDate rateField005) { this.rateField005 = rateField005; }

    public Integer getRateField006() { return rateField006; }
    public void setRateField006(Integer rateField006) { this.rateField006 = rateField006; }

    public Double getRateField007() { return rateField007; }
    public void setRateField007(Double rateField007) { this.rateField007 = rateField007; }

    @Override
    public String toString() {
        return "RateDto048{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
