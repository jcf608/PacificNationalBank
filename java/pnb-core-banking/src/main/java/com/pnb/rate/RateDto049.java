package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto049 — Data Transfer Object for rate operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto049 {

    @JsonProperty("rateField000")
    private Boolean rateField000;

    @JsonProperty("rateField001")
    private LocalDate rateField001;

    @JsonProperty("rateField002")
    private Boolean rateField002;

    @JsonProperty("rateField003")
    private LocalDate rateField003;

    @JsonProperty("rateField004")
    private Double rateField004;

    @JsonProperty("rateField005")
    private Boolean rateField005;

    @JsonProperty("rateField006")
    private Boolean rateField006;

    @Size(max = 200)
    @JsonProperty("rateField007")
    private String rateField007;

    @JsonProperty("rateField008")
    private Boolean rateField008;

    public RateDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto049 instance = new RateDto049();

        public Builder rateField000(Boolean val) { instance.rateField000 = val; return this; }
        public Builder rateField001(LocalDate val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Boolean val) { instance.rateField002 = val; return this; }
        public Builder rateField003(LocalDate val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Double val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Boolean val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Boolean val) { instance.rateField006 = val; return this; }
        public Builder rateField007(String val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Boolean val) { instance.rateField008 = val; return this; }
        public RateDto049 build() { return instance; }
    }

    public Boolean getRateField000() { return rateField000; }
    public void setRateField000(Boolean rateField000) { this.rateField000 = rateField000; }

    public LocalDate getRateField001() { return rateField001; }
    public void setRateField001(LocalDate rateField001) { this.rateField001 = rateField001; }

    public Boolean getRateField002() { return rateField002; }
    public void setRateField002(Boolean rateField002) { this.rateField002 = rateField002; }

    public LocalDate getRateField003() { return rateField003; }
    public void setRateField003(LocalDate rateField003) { this.rateField003 = rateField003; }

    public Double getRateField004() { return rateField004; }
    public void setRateField004(Double rateField004) { this.rateField004 = rateField004; }

    public Boolean getRateField005() { return rateField005; }
    public void setRateField005(Boolean rateField005) { this.rateField005 = rateField005; }

    public Boolean getRateField006() { return rateField006; }
    public void setRateField006(Boolean rateField006) { this.rateField006 = rateField006; }

    public String getRateField007() { return rateField007; }
    public void setRateField007(String rateField007) { this.rateField007 = rateField007; }

    public Boolean getRateField008() { return rateField008; }
    public void setRateField008(Boolean rateField008) { this.rateField008 = rateField008; }

    @Override
    public String toString() {
        return "RateDto049{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
