package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto055 — Data Transfer Object for rate operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto055 {

    @Size(max = 100)
    @JsonProperty("rateField000")
    private String rateField000;

    @JsonProperty("rateField001")
    private Boolean rateField001;

    @JsonProperty("rateField002")
    private Boolean rateField002;

    @JsonProperty("rateField003")
    private LocalDate rateField003;

    @JsonProperty("rateField004")
    private Double rateField004;

    @JsonProperty("rateField005")
    private Boolean rateField005;

    @JsonProperty("rateField006")
    private LocalDate rateField006;

    @JsonProperty("rateField007")
    private LocalDate rateField007;

    @JsonProperty("rateField008")
    private LocalDate rateField008;

    @JsonProperty("rateField009")
    private Long rateField009;

    @JsonProperty("rateField010")
    private Double rateField010;

    @JsonProperty("rateField011")
    private Double rateField011;

    @JsonProperty("rateField012")
    private Boolean rateField012;

    @JsonProperty("rateField013")
    private Boolean rateField013;

    @JsonProperty("rateField014")
    private Boolean rateField014;

    public RateDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto055 instance = new RateDto055();

        public Builder rateField000(String val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Boolean val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Boolean val) { instance.rateField002 = val; return this; }
        public Builder rateField003(LocalDate val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Double val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Boolean val) { instance.rateField005 = val; return this; }
        public Builder rateField006(LocalDate val) { instance.rateField006 = val; return this; }
        public Builder rateField007(LocalDate val) { instance.rateField007 = val; return this; }
        public Builder rateField008(LocalDate val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Long val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Double val) { instance.rateField010 = val; return this; }
        public Builder rateField011(Double val) { instance.rateField011 = val; return this; }
        public Builder rateField012(Boolean val) { instance.rateField012 = val; return this; }
        public Builder rateField013(Boolean val) { instance.rateField013 = val; return this; }
        public Builder rateField014(Boolean val) { instance.rateField014 = val; return this; }
        public RateDto055 build() { return instance; }
    }

    public String getRateField000() { return rateField000; }
    public void setRateField000(String rateField000) { this.rateField000 = rateField000; }

    public Boolean getRateField001() { return rateField001; }
    public void setRateField001(Boolean rateField001) { this.rateField001 = rateField001; }

    public Boolean getRateField002() { return rateField002; }
    public void setRateField002(Boolean rateField002) { this.rateField002 = rateField002; }

    public LocalDate getRateField003() { return rateField003; }
    public void setRateField003(LocalDate rateField003) { this.rateField003 = rateField003; }

    public Double getRateField004() { return rateField004; }
    public void setRateField004(Double rateField004) { this.rateField004 = rateField004; }

    public Boolean getRateField005() { return rateField005; }
    public void setRateField005(Boolean rateField005) { this.rateField005 = rateField005; }

    public LocalDate getRateField006() { return rateField006; }
    public void setRateField006(LocalDate rateField006) { this.rateField006 = rateField006; }

    public LocalDate getRateField007() { return rateField007; }
    public void setRateField007(LocalDate rateField007) { this.rateField007 = rateField007; }

    public LocalDate getRateField008() { return rateField008; }
    public void setRateField008(LocalDate rateField008) { this.rateField008 = rateField008; }

    public Long getRateField009() { return rateField009; }
    public void setRateField009(Long rateField009) { this.rateField009 = rateField009; }

    public Double getRateField010() { return rateField010; }
    public void setRateField010(Double rateField010) { this.rateField010 = rateField010; }

    public Double getRateField011() { return rateField011; }
    public void setRateField011(Double rateField011) { this.rateField011 = rateField011; }

    public Boolean getRateField012() { return rateField012; }
    public void setRateField012(Boolean rateField012) { this.rateField012 = rateField012; }

    public Boolean getRateField013() { return rateField013; }
    public void setRateField013(Boolean rateField013) { this.rateField013 = rateField013; }

    public Boolean getRateField014() { return rateField014; }
    public void setRateField014(Boolean rateField014) { this.rateField014 = rateField014; }

    @Override
    public String toString() {
        return "RateDto055{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
