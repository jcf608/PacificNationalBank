package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto042 — Data Transfer Object for rate operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto042 {

    @Size(max = 100)
    @JsonProperty("rateField000")
    private String rateField000;

    @JsonProperty("rateField001")
    private Boolean rateField001;

    @JsonProperty("rateField002")
    private Boolean rateField002;

    @JsonProperty("rateField003")
    private Long rateField003;

    @JsonProperty("rateField004")
    private Boolean rateField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField005")
    private BigDecimal rateField005;

    @Size(max = 60)
    @JsonProperty("rateField006")
    private String rateField006;

    @JsonProperty("rateField007")
    private Integer rateField007;

    @JsonProperty("rateField008")
    private Integer rateField008;

    @JsonProperty("rateField009")
    private Long rateField009;

    @JsonProperty("rateField010")
    private Boolean rateField010;

    @JsonProperty("rateField011")
    private Integer rateField011;

    @JsonProperty("rateField012")
    private Integer rateField012;

    @JsonProperty("rateField013")
    private Double rateField013;

    public RateDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto042 instance = new RateDto042();

        public Builder rateField000(String val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Boolean val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Boolean val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Long val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Boolean val) { instance.rateField004 = val; return this; }
        public Builder rateField005(BigDecimal val) { instance.rateField005 = val; return this; }
        public Builder rateField006(String val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Integer val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Integer val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Long val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Boolean val) { instance.rateField010 = val; return this; }
        public Builder rateField011(Integer val) { instance.rateField011 = val; return this; }
        public Builder rateField012(Integer val) { instance.rateField012 = val; return this; }
        public Builder rateField013(Double val) { instance.rateField013 = val; return this; }
        public RateDto042 build() { return instance; }
    }

    public String getRateField000() { return rateField000; }
    public void setRateField000(String rateField000) { this.rateField000 = rateField000; }

    public Boolean getRateField001() { return rateField001; }
    public void setRateField001(Boolean rateField001) { this.rateField001 = rateField001; }

    public Boolean getRateField002() { return rateField002; }
    public void setRateField002(Boolean rateField002) { this.rateField002 = rateField002; }

    public Long getRateField003() { return rateField003; }
    public void setRateField003(Long rateField003) { this.rateField003 = rateField003; }

    public Boolean getRateField004() { return rateField004; }
    public void setRateField004(Boolean rateField004) { this.rateField004 = rateField004; }

    public BigDecimal getRateField005() { return rateField005; }
    public void setRateField005(BigDecimal rateField005) { this.rateField005 = rateField005; }

    public String getRateField006() { return rateField006; }
    public void setRateField006(String rateField006) { this.rateField006 = rateField006; }

    public Integer getRateField007() { return rateField007; }
    public void setRateField007(Integer rateField007) { this.rateField007 = rateField007; }

    public Integer getRateField008() { return rateField008; }
    public void setRateField008(Integer rateField008) { this.rateField008 = rateField008; }

    public Long getRateField009() { return rateField009; }
    public void setRateField009(Long rateField009) { this.rateField009 = rateField009; }

    public Boolean getRateField010() { return rateField010; }
    public void setRateField010(Boolean rateField010) { this.rateField010 = rateField010; }

    public Integer getRateField011() { return rateField011; }
    public void setRateField011(Integer rateField011) { this.rateField011 = rateField011; }

    public Integer getRateField012() { return rateField012; }
    public void setRateField012(Integer rateField012) { this.rateField012 = rateField012; }

    public Double getRateField013() { return rateField013; }
    public void setRateField013(Double rateField013) { this.rateField013 = rateField013; }

    @Override
    public String toString() {
        return "RateDto042{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
