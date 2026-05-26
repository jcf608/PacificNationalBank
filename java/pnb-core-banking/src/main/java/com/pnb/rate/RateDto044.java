package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto044 — Data Transfer Object for rate operations.
 * Variant 44 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto044 {

    @JsonProperty("rateField000")
    private Boolean rateField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField001")
    private BigDecimal rateField001;

    @JsonProperty("rateField002")
    private LocalDate rateField002;

    @JsonProperty("rateField003")
    private LocalDate rateField003;

    @JsonProperty("rateField004")
    private LocalDate rateField004;

    @JsonProperty("rateField005")
    private Boolean rateField005;

    @JsonProperty("rateField006")
    private LocalDate rateField006;

    @JsonProperty("rateField007")
    private LocalDate rateField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField008")
    private BigDecimal rateField008;

    @JsonProperty("rateField009")
    private Double rateField009;

    @JsonProperty("rateField010")
    private Boolean rateField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField011")
    private BigDecimal rateField011;

    @JsonProperty("rateField012")
    private Boolean rateField012;

    @JsonProperty("rateField013")
    private Integer rateField013;

    @JsonProperty("rateField014")
    private Boolean rateField014;

    @JsonProperty("rateField015")
    private LocalDate rateField015;

    public RateDto044() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto044 instance = new RateDto044();

        public Builder rateField000(Boolean val) { instance.rateField000 = val; return this; }
        public Builder rateField001(BigDecimal val) { instance.rateField001 = val; return this; }
        public Builder rateField002(LocalDate val) { instance.rateField002 = val; return this; }
        public Builder rateField003(LocalDate val) { instance.rateField003 = val; return this; }
        public Builder rateField004(LocalDate val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Boolean val) { instance.rateField005 = val; return this; }
        public Builder rateField006(LocalDate val) { instance.rateField006 = val; return this; }
        public Builder rateField007(LocalDate val) { instance.rateField007 = val; return this; }
        public Builder rateField008(BigDecimal val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Double val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Boolean val) { instance.rateField010 = val; return this; }
        public Builder rateField011(BigDecimal val) { instance.rateField011 = val; return this; }
        public Builder rateField012(Boolean val) { instance.rateField012 = val; return this; }
        public Builder rateField013(Integer val) { instance.rateField013 = val; return this; }
        public Builder rateField014(Boolean val) { instance.rateField014 = val; return this; }
        public Builder rateField015(LocalDate val) { instance.rateField015 = val; return this; }
        public RateDto044 build() { return instance; }
    }

    public Boolean getRateField000() { return rateField000; }
    public void setRateField000(Boolean rateField000) { this.rateField000 = rateField000; }

    public BigDecimal getRateField001() { return rateField001; }
    public void setRateField001(BigDecimal rateField001) { this.rateField001 = rateField001; }

    public LocalDate getRateField002() { return rateField002; }
    public void setRateField002(LocalDate rateField002) { this.rateField002 = rateField002; }

    public LocalDate getRateField003() { return rateField003; }
    public void setRateField003(LocalDate rateField003) { this.rateField003 = rateField003; }

    public LocalDate getRateField004() { return rateField004; }
    public void setRateField004(LocalDate rateField004) { this.rateField004 = rateField004; }

    public Boolean getRateField005() { return rateField005; }
    public void setRateField005(Boolean rateField005) { this.rateField005 = rateField005; }

    public LocalDate getRateField006() { return rateField006; }
    public void setRateField006(LocalDate rateField006) { this.rateField006 = rateField006; }

    public LocalDate getRateField007() { return rateField007; }
    public void setRateField007(LocalDate rateField007) { this.rateField007 = rateField007; }

    public BigDecimal getRateField008() { return rateField008; }
    public void setRateField008(BigDecimal rateField008) { this.rateField008 = rateField008; }

    public Double getRateField009() { return rateField009; }
    public void setRateField009(Double rateField009) { this.rateField009 = rateField009; }

    public Boolean getRateField010() { return rateField010; }
    public void setRateField010(Boolean rateField010) { this.rateField010 = rateField010; }

    public BigDecimal getRateField011() { return rateField011; }
    public void setRateField011(BigDecimal rateField011) { this.rateField011 = rateField011; }

    public Boolean getRateField012() { return rateField012; }
    public void setRateField012(Boolean rateField012) { this.rateField012 = rateField012; }

    public Integer getRateField013() { return rateField013; }
    public void setRateField013(Integer rateField013) { this.rateField013 = rateField013; }

    public Boolean getRateField014() { return rateField014; }
    public void setRateField014(Boolean rateField014) { this.rateField014 = rateField014; }

    public LocalDate getRateField015() { return rateField015; }
    public void setRateField015(LocalDate rateField015) { this.rateField015 = rateField015; }

    @Override
    public String toString() {
        return "RateDto044{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
