package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto037 — Data Transfer Object for rate operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto037 {

    @JsonProperty("rateField000")
    private Long rateField000;

    @JsonProperty("rateField001")
    private Double rateField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField002")
    private BigDecimal rateField002;

    @Size(max = 40)
    @JsonProperty("rateField003")
    private String rateField003;

    @JsonProperty("rateField004")
    private Integer rateField004;

    @JsonProperty("rateField005")
    private Boolean rateField005;

    @JsonProperty("rateField006")
    private Integer rateField006;

    @JsonProperty("rateField007")
    private Integer rateField007;

    @JsonProperty("rateField008")
    private Boolean rateField008;

    public RateDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto037 instance = new RateDto037();

        public Builder rateField000(Long val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Double val) { instance.rateField001 = val; return this; }
        public Builder rateField002(BigDecimal val) { instance.rateField002 = val; return this; }
        public Builder rateField003(String val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Integer val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Boolean val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Integer val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Integer val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Boolean val) { instance.rateField008 = val; return this; }
        public RateDto037 build() { return instance; }
    }

    public Long getRateField000() { return rateField000; }
    public void setRateField000(Long rateField000) { this.rateField000 = rateField000; }

    public Double getRateField001() { return rateField001; }
    public void setRateField001(Double rateField001) { this.rateField001 = rateField001; }

    public BigDecimal getRateField002() { return rateField002; }
    public void setRateField002(BigDecimal rateField002) { this.rateField002 = rateField002; }

    public String getRateField003() { return rateField003; }
    public void setRateField003(String rateField003) { this.rateField003 = rateField003; }

    public Integer getRateField004() { return rateField004; }
    public void setRateField004(Integer rateField004) { this.rateField004 = rateField004; }

    public Boolean getRateField005() { return rateField005; }
    public void setRateField005(Boolean rateField005) { this.rateField005 = rateField005; }

    public Integer getRateField006() { return rateField006; }
    public void setRateField006(Integer rateField006) { this.rateField006 = rateField006; }

    public Integer getRateField007() { return rateField007; }
    public void setRateField007(Integer rateField007) { this.rateField007 = rateField007; }

    public Boolean getRateField008() { return rateField008; }
    public void setRateField008(Boolean rateField008) { this.rateField008 = rateField008; }

    @Override
    public String toString() {
        return "RateDto037{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
