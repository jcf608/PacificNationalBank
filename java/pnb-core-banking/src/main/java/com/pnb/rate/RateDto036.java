package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto036 — Data Transfer Object for rate operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto036 {

    @JsonProperty("rateField000")
    private LocalDate rateField000;

    @JsonProperty("rateField001")
    private Boolean rateField001;

    @JsonProperty("rateField002")
    private Boolean rateField002;

    @JsonProperty("rateField003")
    private Long rateField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField004")
    private BigDecimal rateField004;

    @JsonProperty("rateField005")
    private LocalDate rateField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField006")
    private BigDecimal rateField006;

    @JsonProperty("rateField007")
    private LocalDate rateField007;

    public RateDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto036 instance = new RateDto036();

        public Builder rateField000(LocalDate val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Boolean val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Boolean val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Long val) { instance.rateField003 = val; return this; }
        public Builder rateField004(BigDecimal val) { instance.rateField004 = val; return this; }
        public Builder rateField005(LocalDate val) { instance.rateField005 = val; return this; }
        public Builder rateField006(BigDecimal val) { instance.rateField006 = val; return this; }
        public Builder rateField007(LocalDate val) { instance.rateField007 = val; return this; }
        public RateDto036 build() { return instance; }
    }

    public LocalDate getRateField000() { return rateField000; }
    public void setRateField000(LocalDate rateField000) { this.rateField000 = rateField000; }

    public Boolean getRateField001() { return rateField001; }
    public void setRateField001(Boolean rateField001) { this.rateField001 = rateField001; }

    public Boolean getRateField002() { return rateField002; }
    public void setRateField002(Boolean rateField002) { this.rateField002 = rateField002; }

    public Long getRateField003() { return rateField003; }
    public void setRateField003(Long rateField003) { this.rateField003 = rateField003; }

    public BigDecimal getRateField004() { return rateField004; }
    public void setRateField004(BigDecimal rateField004) { this.rateField004 = rateField004; }

    public LocalDate getRateField005() { return rateField005; }
    public void setRateField005(LocalDate rateField005) { this.rateField005 = rateField005; }

    public BigDecimal getRateField006() { return rateField006; }
    public void setRateField006(BigDecimal rateField006) { this.rateField006 = rateField006; }

    public LocalDate getRateField007() { return rateField007; }
    public void setRateField007(LocalDate rateField007) { this.rateField007 = rateField007; }

    @Override
    public String toString() {
        return "RateDto036{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
