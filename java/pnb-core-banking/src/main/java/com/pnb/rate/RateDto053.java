package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto053 — Data Transfer Object for rate operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto053 {

    @JsonProperty("rateField000")
    private Boolean rateField000;

    @JsonProperty("rateField001")
    private Integer rateField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField002")
    private BigDecimal rateField002;

    @Size(max = 20)
    @JsonProperty("rateField003")
    private String rateField003;

    @JsonProperty("rateField004")
    private Double rateField004;

    @JsonProperty("rateField005")
    private Double rateField005;

    @JsonProperty("rateField006")
    private Double rateField006;

    @JsonProperty("rateField007")
    private Double rateField007;

    @JsonProperty("rateField008")
    private LocalDate rateField008;

    @JsonProperty("rateField009")
    private LocalDate rateField009;

    @Size(max = 20)
    @JsonProperty("rateField010")
    private String rateField010;

    @Size(max = 20)
    @JsonProperty("rateField011")
    private String rateField011;

    @JsonProperty("rateField012")
    private Integer rateField012;

    public RateDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto053 instance = new RateDto053();

        public Builder rateField000(Boolean val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Integer val) { instance.rateField001 = val; return this; }
        public Builder rateField002(BigDecimal val) { instance.rateField002 = val; return this; }
        public Builder rateField003(String val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Double val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Double val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Double val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Double val) { instance.rateField007 = val; return this; }
        public Builder rateField008(LocalDate val) { instance.rateField008 = val; return this; }
        public Builder rateField009(LocalDate val) { instance.rateField009 = val; return this; }
        public Builder rateField010(String val) { instance.rateField010 = val; return this; }
        public Builder rateField011(String val) { instance.rateField011 = val; return this; }
        public Builder rateField012(Integer val) { instance.rateField012 = val; return this; }
        public RateDto053 build() { return instance; }
    }

    public Boolean getRateField000() { return rateField000; }
    public void setRateField000(Boolean rateField000) { this.rateField000 = rateField000; }

    public Integer getRateField001() { return rateField001; }
    public void setRateField001(Integer rateField001) { this.rateField001 = rateField001; }

    public BigDecimal getRateField002() { return rateField002; }
    public void setRateField002(BigDecimal rateField002) { this.rateField002 = rateField002; }

    public String getRateField003() { return rateField003; }
    public void setRateField003(String rateField003) { this.rateField003 = rateField003; }

    public Double getRateField004() { return rateField004; }
    public void setRateField004(Double rateField004) { this.rateField004 = rateField004; }

    public Double getRateField005() { return rateField005; }
    public void setRateField005(Double rateField005) { this.rateField005 = rateField005; }

    public Double getRateField006() { return rateField006; }
    public void setRateField006(Double rateField006) { this.rateField006 = rateField006; }

    public Double getRateField007() { return rateField007; }
    public void setRateField007(Double rateField007) { this.rateField007 = rateField007; }

    public LocalDate getRateField008() { return rateField008; }
    public void setRateField008(LocalDate rateField008) { this.rateField008 = rateField008; }

    public LocalDate getRateField009() { return rateField009; }
    public void setRateField009(LocalDate rateField009) { this.rateField009 = rateField009; }

    public String getRateField010() { return rateField010; }
    public void setRateField010(String rateField010) { this.rateField010 = rateField010; }

    public String getRateField011() { return rateField011; }
    public void setRateField011(String rateField011) { this.rateField011 = rateField011; }

    public Integer getRateField012() { return rateField012; }
    public void setRateField012(Integer rateField012) { this.rateField012 = rateField012; }

    @Override
    public String toString() {
        return "RateDto053{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
