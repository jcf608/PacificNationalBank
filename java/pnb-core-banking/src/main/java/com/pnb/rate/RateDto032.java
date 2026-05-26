package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto032 — Data Transfer Object for rate operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto032 {

    @JsonProperty("rateField000")
    private Double rateField000;

    @Size(max = 100)
    @JsonProperty("rateField001")
    private String rateField001;

    @Size(max = 200)
    @JsonProperty("rateField002")
    private String rateField002;

    @Size(max = 20)
    @JsonProperty("rateField003")
    private String rateField003;

    @JsonProperty("rateField004")
    private LocalDate rateField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField005")
    private BigDecimal rateField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField006")
    private BigDecimal rateField006;

    @JsonProperty("rateField007")
    private Long rateField007;

    @JsonProperty("rateField008")
    private Integer rateField008;

    @JsonProperty("rateField009")
    private Integer rateField009;

    @Size(max = 40)
    @JsonProperty("rateField010")
    private String rateField010;

    @Size(max = 60)
    @JsonProperty("rateField011")
    private String rateField011;

    @JsonProperty("rateField012")
    private Long rateField012;

    @JsonProperty("rateField013")
    private LocalDate rateField013;

    @Size(max = 100)
    @JsonProperty("rateField014")
    private String rateField014;

    @Size(max = 100)
    @JsonProperty("rateField015")
    private String rateField015;

    public RateDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto032 instance = new RateDto032();

        public Builder rateField000(Double val) { instance.rateField000 = val; return this; }
        public Builder rateField001(String val) { instance.rateField001 = val; return this; }
        public Builder rateField002(String val) { instance.rateField002 = val; return this; }
        public Builder rateField003(String val) { instance.rateField003 = val; return this; }
        public Builder rateField004(LocalDate val) { instance.rateField004 = val; return this; }
        public Builder rateField005(BigDecimal val) { instance.rateField005 = val; return this; }
        public Builder rateField006(BigDecimal val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Long val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Integer val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Integer val) { instance.rateField009 = val; return this; }
        public Builder rateField010(String val) { instance.rateField010 = val; return this; }
        public Builder rateField011(String val) { instance.rateField011 = val; return this; }
        public Builder rateField012(Long val) { instance.rateField012 = val; return this; }
        public Builder rateField013(LocalDate val) { instance.rateField013 = val; return this; }
        public Builder rateField014(String val) { instance.rateField014 = val; return this; }
        public Builder rateField015(String val) { instance.rateField015 = val; return this; }
        public RateDto032 build() { return instance; }
    }

    public Double getRateField000() { return rateField000; }
    public void setRateField000(Double rateField000) { this.rateField000 = rateField000; }

    public String getRateField001() { return rateField001; }
    public void setRateField001(String rateField001) { this.rateField001 = rateField001; }

    public String getRateField002() { return rateField002; }
    public void setRateField002(String rateField002) { this.rateField002 = rateField002; }

    public String getRateField003() { return rateField003; }
    public void setRateField003(String rateField003) { this.rateField003 = rateField003; }

    public LocalDate getRateField004() { return rateField004; }
    public void setRateField004(LocalDate rateField004) { this.rateField004 = rateField004; }

    public BigDecimal getRateField005() { return rateField005; }
    public void setRateField005(BigDecimal rateField005) { this.rateField005 = rateField005; }

    public BigDecimal getRateField006() { return rateField006; }
    public void setRateField006(BigDecimal rateField006) { this.rateField006 = rateField006; }

    public Long getRateField007() { return rateField007; }
    public void setRateField007(Long rateField007) { this.rateField007 = rateField007; }

    public Integer getRateField008() { return rateField008; }
    public void setRateField008(Integer rateField008) { this.rateField008 = rateField008; }

    public Integer getRateField009() { return rateField009; }
    public void setRateField009(Integer rateField009) { this.rateField009 = rateField009; }

    public String getRateField010() { return rateField010; }
    public void setRateField010(String rateField010) { this.rateField010 = rateField010; }

    public String getRateField011() { return rateField011; }
    public void setRateField011(String rateField011) { this.rateField011 = rateField011; }

    public Long getRateField012() { return rateField012; }
    public void setRateField012(Long rateField012) { this.rateField012 = rateField012; }

    public LocalDate getRateField013() { return rateField013; }
    public void setRateField013(LocalDate rateField013) { this.rateField013 = rateField013; }

    public String getRateField014() { return rateField014; }
    public void setRateField014(String rateField014) { this.rateField014 = rateField014; }

    public String getRateField015() { return rateField015; }
    public void setRateField015(String rateField015) { this.rateField015 = rateField015; }

    @Override
    public String toString() {
        return "RateDto032{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
