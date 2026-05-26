package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto050 — Data Transfer Object for rate operations.
 * Variant 50 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto050 {

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField000")
    private BigDecimal rateField000;

    @JsonProperty("rateField001")
    private Boolean rateField001;

    @JsonProperty("rateField002")
    private Long rateField002;

    @Size(max = 20)
    @JsonProperty("rateField003")
    private String rateField003;

    @JsonProperty("rateField004")
    private LocalDate rateField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField005")
    private BigDecimal rateField005;

    @JsonProperty("rateField006")
    private Long rateField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField007")
    private BigDecimal rateField007;

    @JsonProperty("rateField008")
    private Long rateField008;

    @JsonProperty("rateField009")
    private Double rateField009;

    public RateDto050() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto050 instance = new RateDto050();

        public Builder rateField000(BigDecimal val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Boolean val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Long val) { instance.rateField002 = val; return this; }
        public Builder rateField003(String val) { instance.rateField003 = val; return this; }
        public Builder rateField004(LocalDate val) { instance.rateField004 = val; return this; }
        public Builder rateField005(BigDecimal val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Long val) { instance.rateField006 = val; return this; }
        public Builder rateField007(BigDecimal val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Long val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Double val) { instance.rateField009 = val; return this; }
        public RateDto050 build() { return instance; }
    }

    public BigDecimal getRateField000() { return rateField000; }
    public void setRateField000(BigDecimal rateField000) { this.rateField000 = rateField000; }

    public Boolean getRateField001() { return rateField001; }
    public void setRateField001(Boolean rateField001) { this.rateField001 = rateField001; }

    public Long getRateField002() { return rateField002; }
    public void setRateField002(Long rateField002) { this.rateField002 = rateField002; }

    public String getRateField003() { return rateField003; }
    public void setRateField003(String rateField003) { this.rateField003 = rateField003; }

    public LocalDate getRateField004() { return rateField004; }
    public void setRateField004(LocalDate rateField004) { this.rateField004 = rateField004; }

    public BigDecimal getRateField005() { return rateField005; }
    public void setRateField005(BigDecimal rateField005) { this.rateField005 = rateField005; }

    public Long getRateField006() { return rateField006; }
    public void setRateField006(Long rateField006) { this.rateField006 = rateField006; }

    public BigDecimal getRateField007() { return rateField007; }
    public void setRateField007(BigDecimal rateField007) { this.rateField007 = rateField007; }

    public Long getRateField008() { return rateField008; }
    public void setRateField008(Long rateField008) { this.rateField008 = rateField008; }

    public Double getRateField009() { return rateField009; }
    public void setRateField009(Double rateField009) { this.rateField009 = rateField009; }

    @Override
    public String toString() {
        return "RateDto050{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
