package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto045 — Data Transfer Object for rate operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto045 {

    @JsonProperty("rateField000")
    private Integer rateField000;

    @JsonProperty("rateField001")
    private LocalDate rateField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField002")
    private BigDecimal rateField002;

    @JsonProperty("rateField003")
    private Double rateField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField004")
    private BigDecimal rateField004;

    @JsonProperty("rateField005")
    private Long rateField005;

    @JsonProperty("rateField006")
    private Integer rateField006;

    @JsonProperty("rateField007")
    private Long rateField007;

    @JsonProperty("rateField008")
    private Boolean rateField008;

    @JsonProperty("rateField009")
    private Long rateField009;

    @JsonProperty("rateField010")
    private LocalDate rateField010;

    @JsonProperty("rateField011")
    private Long rateField011;

    @JsonProperty("rateField012")
    private Double rateField012;

    @JsonProperty("rateField013")
    private Boolean rateField013;

    @JsonProperty("rateField014")
    private Boolean rateField014;

    @Size(max = 20)
    @JsonProperty("rateField015")
    private String rateField015;

    @JsonProperty("rateField016")
    private LocalDate rateField016;

    public RateDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto045 instance = new RateDto045();

        public Builder rateField000(Integer val) { instance.rateField000 = val; return this; }
        public Builder rateField001(LocalDate val) { instance.rateField001 = val; return this; }
        public Builder rateField002(BigDecimal val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Double val) { instance.rateField003 = val; return this; }
        public Builder rateField004(BigDecimal val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Long val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Integer val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Long val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Boolean val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Long val) { instance.rateField009 = val; return this; }
        public Builder rateField010(LocalDate val) { instance.rateField010 = val; return this; }
        public Builder rateField011(Long val) { instance.rateField011 = val; return this; }
        public Builder rateField012(Double val) { instance.rateField012 = val; return this; }
        public Builder rateField013(Boolean val) { instance.rateField013 = val; return this; }
        public Builder rateField014(Boolean val) { instance.rateField014 = val; return this; }
        public Builder rateField015(String val) { instance.rateField015 = val; return this; }
        public Builder rateField016(LocalDate val) { instance.rateField016 = val; return this; }
        public RateDto045 build() { return instance; }
    }

    public Integer getRateField000() { return rateField000; }
    public void setRateField000(Integer rateField000) { this.rateField000 = rateField000; }

    public LocalDate getRateField001() { return rateField001; }
    public void setRateField001(LocalDate rateField001) { this.rateField001 = rateField001; }

    public BigDecimal getRateField002() { return rateField002; }
    public void setRateField002(BigDecimal rateField002) { this.rateField002 = rateField002; }

    public Double getRateField003() { return rateField003; }
    public void setRateField003(Double rateField003) { this.rateField003 = rateField003; }

    public BigDecimal getRateField004() { return rateField004; }
    public void setRateField004(BigDecimal rateField004) { this.rateField004 = rateField004; }

    public Long getRateField005() { return rateField005; }
    public void setRateField005(Long rateField005) { this.rateField005 = rateField005; }

    public Integer getRateField006() { return rateField006; }
    public void setRateField006(Integer rateField006) { this.rateField006 = rateField006; }

    public Long getRateField007() { return rateField007; }
    public void setRateField007(Long rateField007) { this.rateField007 = rateField007; }

    public Boolean getRateField008() { return rateField008; }
    public void setRateField008(Boolean rateField008) { this.rateField008 = rateField008; }

    public Long getRateField009() { return rateField009; }
    public void setRateField009(Long rateField009) { this.rateField009 = rateField009; }

    public LocalDate getRateField010() { return rateField010; }
    public void setRateField010(LocalDate rateField010) { this.rateField010 = rateField010; }

    public Long getRateField011() { return rateField011; }
    public void setRateField011(Long rateField011) { this.rateField011 = rateField011; }

    public Double getRateField012() { return rateField012; }
    public void setRateField012(Double rateField012) { this.rateField012 = rateField012; }

    public Boolean getRateField013() { return rateField013; }
    public void setRateField013(Boolean rateField013) { this.rateField013 = rateField013; }

    public Boolean getRateField014() { return rateField014; }
    public void setRateField014(Boolean rateField014) { this.rateField014 = rateField014; }

    public String getRateField015() { return rateField015; }
    public void setRateField015(String rateField015) { this.rateField015 = rateField015; }

    public LocalDate getRateField016() { return rateField016; }
    public void setRateField016(LocalDate rateField016) { this.rateField016 = rateField016; }

    @Override
    public String toString() {
        return "RateDto045{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
