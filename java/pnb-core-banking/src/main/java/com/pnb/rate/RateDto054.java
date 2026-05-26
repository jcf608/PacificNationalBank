package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto054 — Data Transfer Object for rate operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto054 {

    @Size(max = 60)
    @JsonProperty("rateField000")
    private String rateField000;

    @JsonProperty("rateField001")
    private Double rateField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField002")
    private BigDecimal rateField002;

    @JsonProperty("rateField003")
    private LocalDate rateField003;

    @JsonProperty("rateField004")
    private Long rateField004;

    @JsonProperty("rateField005")
    private Integer rateField005;

    @Size(max = 40)
    @JsonProperty("rateField006")
    private String rateField006;

    @JsonProperty("rateField007")
    private Long rateField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField008")
    private BigDecimal rateField008;

    @JsonProperty("rateField009")
    private Boolean rateField009;

    @JsonProperty("rateField010")
    private Boolean rateField010;

    @Size(max = 200)
    @JsonProperty("rateField011")
    private String rateField011;

    @JsonProperty("rateField012")
    private Integer rateField012;

    @JsonProperty("rateField013")
    private Long rateField013;

    public RateDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto054 instance = new RateDto054();

        public Builder rateField000(String val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Double val) { instance.rateField001 = val; return this; }
        public Builder rateField002(BigDecimal val) { instance.rateField002 = val; return this; }
        public Builder rateField003(LocalDate val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Long val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Integer val) { instance.rateField005 = val; return this; }
        public Builder rateField006(String val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Long val) { instance.rateField007 = val; return this; }
        public Builder rateField008(BigDecimal val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Boolean val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Boolean val) { instance.rateField010 = val; return this; }
        public Builder rateField011(String val) { instance.rateField011 = val; return this; }
        public Builder rateField012(Integer val) { instance.rateField012 = val; return this; }
        public Builder rateField013(Long val) { instance.rateField013 = val; return this; }
        public RateDto054 build() { return instance; }
    }

    public String getRateField000() { return rateField000; }
    public void setRateField000(String rateField000) { this.rateField000 = rateField000; }

    public Double getRateField001() { return rateField001; }
    public void setRateField001(Double rateField001) { this.rateField001 = rateField001; }

    public BigDecimal getRateField002() { return rateField002; }
    public void setRateField002(BigDecimal rateField002) { this.rateField002 = rateField002; }

    public LocalDate getRateField003() { return rateField003; }
    public void setRateField003(LocalDate rateField003) { this.rateField003 = rateField003; }

    public Long getRateField004() { return rateField004; }
    public void setRateField004(Long rateField004) { this.rateField004 = rateField004; }

    public Integer getRateField005() { return rateField005; }
    public void setRateField005(Integer rateField005) { this.rateField005 = rateField005; }

    public String getRateField006() { return rateField006; }
    public void setRateField006(String rateField006) { this.rateField006 = rateField006; }

    public Long getRateField007() { return rateField007; }
    public void setRateField007(Long rateField007) { this.rateField007 = rateField007; }

    public BigDecimal getRateField008() { return rateField008; }
    public void setRateField008(BigDecimal rateField008) { this.rateField008 = rateField008; }

    public Boolean getRateField009() { return rateField009; }
    public void setRateField009(Boolean rateField009) { this.rateField009 = rateField009; }

    public Boolean getRateField010() { return rateField010; }
    public void setRateField010(Boolean rateField010) { this.rateField010 = rateField010; }

    public String getRateField011() { return rateField011; }
    public void setRateField011(String rateField011) { this.rateField011 = rateField011; }

    public Integer getRateField012() { return rateField012; }
    public void setRateField012(Integer rateField012) { this.rateField012 = rateField012; }

    public Long getRateField013() { return rateField013; }
    public void setRateField013(Long rateField013) { this.rateField013 = rateField013; }

    @Override
    public String toString() {
        return "RateDto054{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
