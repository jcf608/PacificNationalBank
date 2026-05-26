package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto051 — Data Transfer Object for rate operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto051 {

    @JsonProperty("rateField000")
    private LocalDate rateField000;

    @JsonProperty("rateField001")
    private Long rateField001;

    @Size(max = 20)
    @JsonProperty("rateField002")
    private String rateField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField003")
    private BigDecimal rateField003;

    @JsonProperty("rateField004")
    private Long rateField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField005")
    private BigDecimal rateField005;

    @JsonProperty("rateField006")
    private Double rateField006;

    @JsonProperty("rateField007")
    private Long rateField007;

    @JsonProperty("rateField008")
    private Boolean rateField008;

    @JsonProperty("rateField009")
    private Boolean rateField009;

    @Size(max = 200)
    @JsonProperty("rateField010")
    private String rateField010;

    public RateDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto051 instance = new RateDto051();

        public Builder rateField000(LocalDate val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Long val) { instance.rateField001 = val; return this; }
        public Builder rateField002(String val) { instance.rateField002 = val; return this; }
        public Builder rateField003(BigDecimal val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Long val) { instance.rateField004 = val; return this; }
        public Builder rateField005(BigDecimal val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Double val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Long val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Boolean val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Boolean val) { instance.rateField009 = val; return this; }
        public Builder rateField010(String val) { instance.rateField010 = val; return this; }
        public RateDto051 build() { return instance; }
    }

    public LocalDate getRateField000() { return rateField000; }
    public void setRateField000(LocalDate rateField000) { this.rateField000 = rateField000; }

    public Long getRateField001() { return rateField001; }
    public void setRateField001(Long rateField001) { this.rateField001 = rateField001; }

    public String getRateField002() { return rateField002; }
    public void setRateField002(String rateField002) { this.rateField002 = rateField002; }

    public BigDecimal getRateField003() { return rateField003; }
    public void setRateField003(BigDecimal rateField003) { this.rateField003 = rateField003; }

    public Long getRateField004() { return rateField004; }
    public void setRateField004(Long rateField004) { this.rateField004 = rateField004; }

    public BigDecimal getRateField005() { return rateField005; }
    public void setRateField005(BigDecimal rateField005) { this.rateField005 = rateField005; }

    public Double getRateField006() { return rateField006; }
    public void setRateField006(Double rateField006) { this.rateField006 = rateField006; }

    public Long getRateField007() { return rateField007; }
    public void setRateField007(Long rateField007) { this.rateField007 = rateField007; }

    public Boolean getRateField008() { return rateField008; }
    public void setRateField008(Boolean rateField008) { this.rateField008 = rateField008; }

    public Boolean getRateField009() { return rateField009; }
    public void setRateField009(Boolean rateField009) { this.rateField009 = rateField009; }

    public String getRateField010() { return rateField010; }
    public void setRateField010(String rateField010) { this.rateField010 = rateField010; }

    @Override
    public String toString() {
        return "RateDto051{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
