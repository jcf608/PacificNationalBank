package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto025 — Data Transfer Object for rate operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto025 {

    @JsonProperty("rateField000")
    private Integer rateField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField001")
    private BigDecimal rateField001;

    @JsonProperty("rateField002")
    private Double rateField002;

    @JsonProperty("rateField003")
    private Integer rateField003;

    @JsonProperty("rateField004")
    private Integer rateField004;

    @JsonProperty("rateField005")
    private Double rateField005;

    @JsonProperty("rateField006")
    private Boolean rateField006;

    @JsonProperty("rateField007")
    private Boolean rateField007;

    @JsonProperty("rateField008")
    private LocalDate rateField008;

    public RateDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto025 instance = new RateDto025();

        public Builder rateField000(Integer val) { instance.rateField000 = val; return this; }
        public Builder rateField001(BigDecimal val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Double val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Integer val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Integer val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Double val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Boolean val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Boolean val) { instance.rateField007 = val; return this; }
        public Builder rateField008(LocalDate val) { instance.rateField008 = val; return this; }
        public RateDto025 build() { return instance; }
    }

    public Integer getRateField000() { return rateField000; }
    public void setRateField000(Integer rateField000) { this.rateField000 = rateField000; }

    public BigDecimal getRateField001() { return rateField001; }
    public void setRateField001(BigDecimal rateField001) { this.rateField001 = rateField001; }

    public Double getRateField002() { return rateField002; }
    public void setRateField002(Double rateField002) { this.rateField002 = rateField002; }

    public Integer getRateField003() { return rateField003; }
    public void setRateField003(Integer rateField003) { this.rateField003 = rateField003; }

    public Integer getRateField004() { return rateField004; }
    public void setRateField004(Integer rateField004) { this.rateField004 = rateField004; }

    public Double getRateField005() { return rateField005; }
    public void setRateField005(Double rateField005) { this.rateField005 = rateField005; }

    public Boolean getRateField006() { return rateField006; }
    public void setRateField006(Boolean rateField006) { this.rateField006 = rateField006; }

    public Boolean getRateField007() { return rateField007; }
    public void setRateField007(Boolean rateField007) { this.rateField007 = rateField007; }

    public LocalDate getRateField008() { return rateField008; }
    public void setRateField008(LocalDate rateField008) { this.rateField008 = rateField008; }

    @Override
    public String toString() {
        return "RateDto025{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
