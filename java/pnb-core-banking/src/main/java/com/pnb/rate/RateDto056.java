package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto056 — Data Transfer Object for rate operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto056 {

    @JsonProperty("rateField000")
    private Boolean rateField000;

    @JsonProperty("rateField001")
    private Double rateField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField002")
    private BigDecimal rateField002;

    @JsonProperty("rateField003")
    private Boolean rateField003;

    @JsonProperty("rateField004")
    private Long rateField004;

    @JsonProperty("rateField005")
    private Long rateField005;

    @JsonProperty("rateField006")
    private LocalDate rateField006;

    @JsonProperty("rateField007")
    private Double rateField007;

    @JsonProperty("rateField008")
    private Long rateField008;

    @JsonProperty("rateField009")
    private Long rateField009;

    @JsonProperty("rateField010")
    private Double rateField010;

    @JsonProperty("rateField011")
    private Integer rateField011;

    @Size(max = 20)
    @JsonProperty("rateField012")
    private String rateField012;

    @JsonProperty("rateField013")
    private LocalDate rateField013;

    @JsonProperty("rateField014")
    private Boolean rateField014;

    @JsonProperty("rateField015")
    private Integer rateField015;

    public RateDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto056 instance = new RateDto056();

        public Builder rateField000(Boolean val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Double val) { instance.rateField001 = val; return this; }
        public Builder rateField002(BigDecimal val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Boolean val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Long val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Long val) { instance.rateField005 = val; return this; }
        public Builder rateField006(LocalDate val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Double val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Long val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Long val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Double val) { instance.rateField010 = val; return this; }
        public Builder rateField011(Integer val) { instance.rateField011 = val; return this; }
        public Builder rateField012(String val) { instance.rateField012 = val; return this; }
        public Builder rateField013(LocalDate val) { instance.rateField013 = val; return this; }
        public Builder rateField014(Boolean val) { instance.rateField014 = val; return this; }
        public Builder rateField015(Integer val) { instance.rateField015 = val; return this; }
        public RateDto056 build() { return instance; }
    }

    public Boolean getRateField000() { return rateField000; }
    public void setRateField000(Boolean rateField000) { this.rateField000 = rateField000; }

    public Double getRateField001() { return rateField001; }
    public void setRateField001(Double rateField001) { this.rateField001 = rateField001; }

    public BigDecimal getRateField002() { return rateField002; }
    public void setRateField002(BigDecimal rateField002) { this.rateField002 = rateField002; }

    public Boolean getRateField003() { return rateField003; }
    public void setRateField003(Boolean rateField003) { this.rateField003 = rateField003; }

    public Long getRateField004() { return rateField004; }
    public void setRateField004(Long rateField004) { this.rateField004 = rateField004; }

    public Long getRateField005() { return rateField005; }
    public void setRateField005(Long rateField005) { this.rateField005 = rateField005; }

    public LocalDate getRateField006() { return rateField006; }
    public void setRateField006(LocalDate rateField006) { this.rateField006 = rateField006; }

    public Double getRateField007() { return rateField007; }
    public void setRateField007(Double rateField007) { this.rateField007 = rateField007; }

    public Long getRateField008() { return rateField008; }
    public void setRateField008(Long rateField008) { this.rateField008 = rateField008; }

    public Long getRateField009() { return rateField009; }
    public void setRateField009(Long rateField009) { this.rateField009 = rateField009; }

    public Double getRateField010() { return rateField010; }
    public void setRateField010(Double rateField010) { this.rateField010 = rateField010; }

    public Integer getRateField011() { return rateField011; }
    public void setRateField011(Integer rateField011) { this.rateField011 = rateField011; }

    public String getRateField012() { return rateField012; }
    public void setRateField012(String rateField012) { this.rateField012 = rateField012; }

    public LocalDate getRateField013() { return rateField013; }
    public void setRateField013(LocalDate rateField013) { this.rateField013 = rateField013; }

    public Boolean getRateField014() { return rateField014; }
    public void setRateField014(Boolean rateField014) { this.rateField014 = rateField014; }

    public Integer getRateField015() { return rateField015; }
    public void setRateField015(Integer rateField015) { this.rateField015 = rateField015; }

    @Override
    public String toString() {
        return "RateDto056{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
