package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto024 — Data Transfer Object for rate operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto024 {

    @Size(max = 100)
    @JsonProperty("rateField000")
    private String rateField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField001")
    private BigDecimal rateField001;

    @JsonProperty("rateField002")
    private Integer rateField002;

    @Size(max = 100)
    @JsonProperty("rateField003")
    private String rateField003;

    @JsonProperty("rateField004")
    private Double rateField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField005")
    private BigDecimal rateField005;

    @JsonProperty("rateField006")
    private Long rateField006;

    @JsonProperty("rateField007")
    private Integer rateField007;

    public RateDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto024 instance = new RateDto024();

        public Builder rateField000(String val) { instance.rateField000 = val; return this; }
        public Builder rateField001(BigDecimal val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Integer val) { instance.rateField002 = val; return this; }
        public Builder rateField003(String val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Double val) { instance.rateField004 = val; return this; }
        public Builder rateField005(BigDecimal val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Long val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Integer val) { instance.rateField007 = val; return this; }
        public RateDto024 build() { return instance; }
    }

    public String getRateField000() { return rateField000; }
    public void setRateField000(String rateField000) { this.rateField000 = rateField000; }

    public BigDecimal getRateField001() { return rateField001; }
    public void setRateField001(BigDecimal rateField001) { this.rateField001 = rateField001; }

    public Integer getRateField002() { return rateField002; }
    public void setRateField002(Integer rateField002) { this.rateField002 = rateField002; }

    public String getRateField003() { return rateField003; }
    public void setRateField003(String rateField003) { this.rateField003 = rateField003; }

    public Double getRateField004() { return rateField004; }
    public void setRateField004(Double rateField004) { this.rateField004 = rateField004; }

    public BigDecimal getRateField005() { return rateField005; }
    public void setRateField005(BigDecimal rateField005) { this.rateField005 = rateField005; }

    public Long getRateField006() { return rateField006; }
    public void setRateField006(Long rateField006) { this.rateField006 = rateField006; }

    public Integer getRateField007() { return rateField007; }
    public void setRateField007(Integer rateField007) { this.rateField007 = rateField007; }

    @Override
    public String toString() {
        return "RateDto024{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
