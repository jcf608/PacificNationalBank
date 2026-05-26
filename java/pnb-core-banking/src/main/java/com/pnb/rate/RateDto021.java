package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto021 — Data Transfer Object for rate operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto021 {

    @JsonProperty("rateField000")
    private Double rateField000;

    @JsonProperty("rateField001")
    private Long rateField001;

    @JsonProperty("rateField002")
    private Double rateField002;

    @JsonProperty("rateField003")
    private LocalDate rateField003;

    @JsonProperty("rateField004")
    private Integer rateField004;

    @JsonProperty("rateField005")
    private LocalDate rateField005;

    @JsonProperty("rateField006")
    private Integer rateField006;

    @JsonProperty("rateField007")
    private Long rateField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField008")
    private BigDecimal rateField008;

    @JsonProperty("rateField009")
    private Double rateField009;

    @JsonProperty("rateField010")
    private Integer rateField010;

    @JsonProperty("rateField011")
    private Double rateField011;

    @JsonProperty("rateField012")
    private Double rateField012;

    @JsonProperty("rateField013")
    private Long rateField013;

    @JsonProperty("rateField014")
    private Long rateField014;

    @JsonProperty("rateField015")
    private Boolean rateField015;

    @JsonProperty("rateField016")
    private LocalDate rateField016;

    public RateDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto021 instance = new RateDto021();

        public Builder rateField000(Double val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Long val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Double val) { instance.rateField002 = val; return this; }
        public Builder rateField003(LocalDate val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Integer val) { instance.rateField004 = val; return this; }
        public Builder rateField005(LocalDate val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Integer val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Long val) { instance.rateField007 = val; return this; }
        public Builder rateField008(BigDecimal val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Double val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Integer val) { instance.rateField010 = val; return this; }
        public Builder rateField011(Double val) { instance.rateField011 = val; return this; }
        public Builder rateField012(Double val) { instance.rateField012 = val; return this; }
        public Builder rateField013(Long val) { instance.rateField013 = val; return this; }
        public Builder rateField014(Long val) { instance.rateField014 = val; return this; }
        public Builder rateField015(Boolean val) { instance.rateField015 = val; return this; }
        public Builder rateField016(LocalDate val) { instance.rateField016 = val; return this; }
        public RateDto021 build() { return instance; }
    }

    public Double getRateField000() { return rateField000; }
    public void setRateField000(Double rateField000) { this.rateField000 = rateField000; }

    public Long getRateField001() { return rateField001; }
    public void setRateField001(Long rateField001) { this.rateField001 = rateField001; }

    public Double getRateField002() { return rateField002; }
    public void setRateField002(Double rateField002) { this.rateField002 = rateField002; }

    public LocalDate getRateField003() { return rateField003; }
    public void setRateField003(LocalDate rateField003) { this.rateField003 = rateField003; }

    public Integer getRateField004() { return rateField004; }
    public void setRateField004(Integer rateField004) { this.rateField004 = rateField004; }

    public LocalDate getRateField005() { return rateField005; }
    public void setRateField005(LocalDate rateField005) { this.rateField005 = rateField005; }

    public Integer getRateField006() { return rateField006; }
    public void setRateField006(Integer rateField006) { this.rateField006 = rateField006; }

    public Long getRateField007() { return rateField007; }
    public void setRateField007(Long rateField007) { this.rateField007 = rateField007; }

    public BigDecimal getRateField008() { return rateField008; }
    public void setRateField008(BigDecimal rateField008) { this.rateField008 = rateField008; }

    public Double getRateField009() { return rateField009; }
    public void setRateField009(Double rateField009) { this.rateField009 = rateField009; }

    public Integer getRateField010() { return rateField010; }
    public void setRateField010(Integer rateField010) { this.rateField010 = rateField010; }

    public Double getRateField011() { return rateField011; }
    public void setRateField011(Double rateField011) { this.rateField011 = rateField011; }

    public Double getRateField012() { return rateField012; }
    public void setRateField012(Double rateField012) { this.rateField012 = rateField012; }

    public Long getRateField013() { return rateField013; }
    public void setRateField013(Long rateField013) { this.rateField013 = rateField013; }

    public Long getRateField014() { return rateField014; }
    public void setRateField014(Long rateField014) { this.rateField014 = rateField014; }

    public Boolean getRateField015() { return rateField015; }
    public void setRateField015(Boolean rateField015) { this.rateField015 = rateField015; }

    public LocalDate getRateField016() { return rateField016; }
    public void setRateField016(LocalDate rateField016) { this.rateField016 = rateField016; }

    @Override
    public String toString() {
        return "RateDto021{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
