package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto026 — Data Transfer Object for rate operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto026 {

    @JsonProperty("rateField000")
    private Boolean rateField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField001")
    private BigDecimal rateField001;

    @JsonProperty("rateField002")
    private Long rateField002;

    @Size(max = 60)
    @JsonProperty("rateField003")
    private String rateField003;

    @JsonProperty("rateField004")
    private Boolean rateField004;

    @JsonProperty("rateField005")
    private Boolean rateField005;

    @JsonProperty("rateField006")
    private Integer rateField006;

    @JsonProperty("rateField007")
    private Integer rateField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField008")
    private BigDecimal rateField008;

    @JsonProperty("rateField009")
    private Double rateField009;

    public RateDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto026 instance = new RateDto026();

        public Builder rateField000(Boolean val) { instance.rateField000 = val; return this; }
        public Builder rateField001(BigDecimal val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Long val) { instance.rateField002 = val; return this; }
        public Builder rateField003(String val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Boolean val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Boolean val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Integer val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Integer val) { instance.rateField007 = val; return this; }
        public Builder rateField008(BigDecimal val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Double val) { instance.rateField009 = val; return this; }
        public RateDto026 build() { return instance; }
    }

    public Boolean getRateField000() { return rateField000; }
    public void setRateField000(Boolean rateField000) { this.rateField000 = rateField000; }

    public BigDecimal getRateField001() { return rateField001; }
    public void setRateField001(BigDecimal rateField001) { this.rateField001 = rateField001; }

    public Long getRateField002() { return rateField002; }
    public void setRateField002(Long rateField002) { this.rateField002 = rateField002; }

    public String getRateField003() { return rateField003; }
    public void setRateField003(String rateField003) { this.rateField003 = rateField003; }

    public Boolean getRateField004() { return rateField004; }
    public void setRateField004(Boolean rateField004) { this.rateField004 = rateField004; }

    public Boolean getRateField005() { return rateField005; }
    public void setRateField005(Boolean rateField005) { this.rateField005 = rateField005; }

    public Integer getRateField006() { return rateField006; }
    public void setRateField006(Integer rateField006) { this.rateField006 = rateField006; }

    public Integer getRateField007() { return rateField007; }
    public void setRateField007(Integer rateField007) { this.rateField007 = rateField007; }

    public BigDecimal getRateField008() { return rateField008; }
    public void setRateField008(BigDecimal rateField008) { this.rateField008 = rateField008; }

    public Double getRateField009() { return rateField009; }
    public void setRateField009(Double rateField009) { this.rateField009 = rateField009; }

    @Override
    public String toString() {
        return "RateDto026{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
