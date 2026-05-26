package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto030 — Data Transfer Object for rate operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto030 {

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField000")
    private BigDecimal rateField000;

    @JsonProperty("rateField001")
    private Double rateField001;

    @JsonProperty("rateField002")
    private Long rateField002;

    @JsonProperty("rateField003")
    private Double rateField003;

    @JsonProperty("rateField004")
    private Long rateField004;

    @JsonProperty("rateField005")
    private Boolean rateField005;

    @JsonProperty("rateField006")
    private Long rateField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField007")
    private BigDecimal rateField007;

    @Size(max = 20)
    @JsonProperty("rateField008")
    private String rateField008;

    @Size(max = 100)
    @JsonProperty("rateField009")
    private String rateField009;

    @JsonProperty("rateField010")
    private LocalDate rateField010;

    @JsonProperty("rateField011")
    private Double rateField011;

    @JsonProperty("rateField012")
    private Integer rateField012;

    @JsonProperty("rateField013")
    private Boolean rateField013;

    public RateDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto030 instance = new RateDto030();

        public Builder rateField000(BigDecimal val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Double val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Long val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Double val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Long val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Boolean val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Long val) { instance.rateField006 = val; return this; }
        public Builder rateField007(BigDecimal val) { instance.rateField007 = val; return this; }
        public Builder rateField008(String val) { instance.rateField008 = val; return this; }
        public Builder rateField009(String val) { instance.rateField009 = val; return this; }
        public Builder rateField010(LocalDate val) { instance.rateField010 = val; return this; }
        public Builder rateField011(Double val) { instance.rateField011 = val; return this; }
        public Builder rateField012(Integer val) { instance.rateField012 = val; return this; }
        public Builder rateField013(Boolean val) { instance.rateField013 = val; return this; }
        public RateDto030 build() { return instance; }
    }

    public BigDecimal getRateField000() { return rateField000; }
    public void setRateField000(BigDecimal rateField000) { this.rateField000 = rateField000; }

    public Double getRateField001() { return rateField001; }
    public void setRateField001(Double rateField001) { this.rateField001 = rateField001; }

    public Long getRateField002() { return rateField002; }
    public void setRateField002(Long rateField002) { this.rateField002 = rateField002; }

    public Double getRateField003() { return rateField003; }
    public void setRateField003(Double rateField003) { this.rateField003 = rateField003; }

    public Long getRateField004() { return rateField004; }
    public void setRateField004(Long rateField004) { this.rateField004 = rateField004; }

    public Boolean getRateField005() { return rateField005; }
    public void setRateField005(Boolean rateField005) { this.rateField005 = rateField005; }

    public Long getRateField006() { return rateField006; }
    public void setRateField006(Long rateField006) { this.rateField006 = rateField006; }

    public BigDecimal getRateField007() { return rateField007; }
    public void setRateField007(BigDecimal rateField007) { this.rateField007 = rateField007; }

    public String getRateField008() { return rateField008; }
    public void setRateField008(String rateField008) { this.rateField008 = rateField008; }

    public String getRateField009() { return rateField009; }
    public void setRateField009(String rateField009) { this.rateField009 = rateField009; }

    public LocalDate getRateField010() { return rateField010; }
    public void setRateField010(LocalDate rateField010) { this.rateField010 = rateField010; }

    public Double getRateField011() { return rateField011; }
    public void setRateField011(Double rateField011) { this.rateField011 = rateField011; }

    public Integer getRateField012() { return rateField012; }
    public void setRateField012(Integer rateField012) { this.rateField012 = rateField012; }

    public Boolean getRateField013() { return rateField013; }
    public void setRateField013(Boolean rateField013) { this.rateField013 = rateField013; }

    @Override
    public String toString() {
        return "RateDto030{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
