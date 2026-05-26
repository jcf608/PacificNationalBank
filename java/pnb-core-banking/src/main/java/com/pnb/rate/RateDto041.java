package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto041 — Data Transfer Object for rate operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto041 {

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField000")
    private BigDecimal rateField000;

    @Size(max = 100)
    @JsonProperty("rateField001")
    private String rateField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField002")
    private BigDecimal rateField002;

    @JsonProperty("rateField003")
    private Long rateField003;

    @JsonProperty("rateField004")
    private Integer rateField004;

    @JsonProperty("rateField005")
    private Long rateField005;

    @JsonProperty("rateField006")
    private LocalDate rateField006;

    @JsonProperty("rateField007")
    private LocalDate rateField007;

    @JsonProperty("rateField008")
    private Integer rateField008;

    @JsonProperty("rateField009")
    private Long rateField009;

    @Size(max = 60)
    @JsonProperty("rateField010")
    private String rateField010;

    @JsonProperty("rateField011")
    private LocalDate rateField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField012")
    private BigDecimal rateField012;

    public RateDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto041 instance = new RateDto041();

        public Builder rateField000(BigDecimal val) { instance.rateField000 = val; return this; }
        public Builder rateField001(String val) { instance.rateField001 = val; return this; }
        public Builder rateField002(BigDecimal val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Long val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Integer val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Long val) { instance.rateField005 = val; return this; }
        public Builder rateField006(LocalDate val) { instance.rateField006 = val; return this; }
        public Builder rateField007(LocalDate val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Integer val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Long val) { instance.rateField009 = val; return this; }
        public Builder rateField010(String val) { instance.rateField010 = val; return this; }
        public Builder rateField011(LocalDate val) { instance.rateField011 = val; return this; }
        public Builder rateField012(BigDecimal val) { instance.rateField012 = val; return this; }
        public RateDto041 build() { return instance; }
    }

    public BigDecimal getRateField000() { return rateField000; }
    public void setRateField000(BigDecimal rateField000) { this.rateField000 = rateField000; }

    public String getRateField001() { return rateField001; }
    public void setRateField001(String rateField001) { this.rateField001 = rateField001; }

    public BigDecimal getRateField002() { return rateField002; }
    public void setRateField002(BigDecimal rateField002) { this.rateField002 = rateField002; }

    public Long getRateField003() { return rateField003; }
    public void setRateField003(Long rateField003) { this.rateField003 = rateField003; }

    public Integer getRateField004() { return rateField004; }
    public void setRateField004(Integer rateField004) { this.rateField004 = rateField004; }

    public Long getRateField005() { return rateField005; }
    public void setRateField005(Long rateField005) { this.rateField005 = rateField005; }

    public LocalDate getRateField006() { return rateField006; }
    public void setRateField006(LocalDate rateField006) { this.rateField006 = rateField006; }

    public LocalDate getRateField007() { return rateField007; }
    public void setRateField007(LocalDate rateField007) { this.rateField007 = rateField007; }

    public Integer getRateField008() { return rateField008; }
    public void setRateField008(Integer rateField008) { this.rateField008 = rateField008; }

    public Long getRateField009() { return rateField009; }
    public void setRateField009(Long rateField009) { this.rateField009 = rateField009; }

    public String getRateField010() { return rateField010; }
    public void setRateField010(String rateField010) { this.rateField010 = rateField010; }

    public LocalDate getRateField011() { return rateField011; }
    public void setRateField011(LocalDate rateField011) { this.rateField011 = rateField011; }

    public BigDecimal getRateField012() { return rateField012; }
    public void setRateField012(BigDecimal rateField012) { this.rateField012 = rateField012; }

    @Override
    public String toString() {
        return "RateDto041{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
