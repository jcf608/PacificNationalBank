package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto038 — Data Transfer Object for rate operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto038 {

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField000")
    private BigDecimal rateField000;

    @JsonProperty("rateField001")
    private Long rateField001;

    @JsonProperty("rateField002")
    private Double rateField002;

    @JsonProperty("rateField003")
    private Boolean rateField003;

    @JsonProperty("rateField004")
    private Double rateField004;

    @Size(max = 60)
    @JsonProperty("rateField005")
    private String rateField005;

    @JsonProperty("rateField006")
    private Long rateField006;

    @JsonProperty("rateField007")
    private Double rateField007;

    @JsonProperty("rateField008")
    private Long rateField008;

    @JsonProperty("rateField009")
    private LocalDate rateField009;

    public RateDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto038 instance = new RateDto038();

        public Builder rateField000(BigDecimal val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Long val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Double val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Boolean val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Double val) { instance.rateField004 = val; return this; }
        public Builder rateField005(String val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Long val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Double val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Long val) { instance.rateField008 = val; return this; }
        public Builder rateField009(LocalDate val) { instance.rateField009 = val; return this; }
        public RateDto038 build() { return instance; }
    }

    public BigDecimal getRateField000() { return rateField000; }
    public void setRateField000(BigDecimal rateField000) { this.rateField000 = rateField000; }

    public Long getRateField001() { return rateField001; }
    public void setRateField001(Long rateField001) { this.rateField001 = rateField001; }

    public Double getRateField002() { return rateField002; }
    public void setRateField002(Double rateField002) { this.rateField002 = rateField002; }

    public Boolean getRateField003() { return rateField003; }
    public void setRateField003(Boolean rateField003) { this.rateField003 = rateField003; }

    public Double getRateField004() { return rateField004; }
    public void setRateField004(Double rateField004) { this.rateField004 = rateField004; }

    public String getRateField005() { return rateField005; }
    public void setRateField005(String rateField005) { this.rateField005 = rateField005; }

    public Long getRateField006() { return rateField006; }
    public void setRateField006(Long rateField006) { this.rateField006 = rateField006; }

    public Double getRateField007() { return rateField007; }
    public void setRateField007(Double rateField007) { this.rateField007 = rateField007; }

    public Long getRateField008() { return rateField008; }
    public void setRateField008(Long rateField008) { this.rateField008 = rateField008; }

    public LocalDate getRateField009() { return rateField009; }
    public void setRateField009(LocalDate rateField009) { this.rateField009 = rateField009; }

    @Override
    public String toString() {
        return "RateDto038{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
