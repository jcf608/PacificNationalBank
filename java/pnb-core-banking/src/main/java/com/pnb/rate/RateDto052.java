package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto052 — Data Transfer Object for rate operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto052 {

    @JsonProperty("rateField000")
    private Boolean rateField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField001")
    private BigDecimal rateField001;

    @JsonProperty("rateField002")
    private Integer rateField002;

    @JsonProperty("rateField003")
    private Integer rateField003;

    @JsonProperty("rateField004")
    private Double rateField004;

    @Size(max = 20)
    @JsonProperty("rateField005")
    private String rateField005;

    @JsonProperty("rateField006")
    private Boolean rateField006;

    @JsonProperty("rateField007")
    private Boolean rateField007;

    @JsonProperty("rateField008")
    private Boolean rateField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField009")
    private BigDecimal rateField009;

    @Size(max = 20)
    @JsonProperty("rateField010")
    private String rateField010;

    @JsonProperty("rateField011")
    private Boolean rateField011;

    public RateDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto052 instance = new RateDto052();

        public Builder rateField000(Boolean val) { instance.rateField000 = val; return this; }
        public Builder rateField001(BigDecimal val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Integer val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Integer val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Double val) { instance.rateField004 = val; return this; }
        public Builder rateField005(String val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Boolean val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Boolean val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Boolean val) { instance.rateField008 = val; return this; }
        public Builder rateField009(BigDecimal val) { instance.rateField009 = val; return this; }
        public Builder rateField010(String val) { instance.rateField010 = val; return this; }
        public Builder rateField011(Boolean val) { instance.rateField011 = val; return this; }
        public RateDto052 build() { return instance; }
    }

    public Boolean getRateField000() { return rateField000; }
    public void setRateField000(Boolean rateField000) { this.rateField000 = rateField000; }

    public BigDecimal getRateField001() { return rateField001; }
    public void setRateField001(BigDecimal rateField001) { this.rateField001 = rateField001; }

    public Integer getRateField002() { return rateField002; }
    public void setRateField002(Integer rateField002) { this.rateField002 = rateField002; }

    public Integer getRateField003() { return rateField003; }
    public void setRateField003(Integer rateField003) { this.rateField003 = rateField003; }

    public Double getRateField004() { return rateField004; }
    public void setRateField004(Double rateField004) { this.rateField004 = rateField004; }

    public String getRateField005() { return rateField005; }
    public void setRateField005(String rateField005) { this.rateField005 = rateField005; }

    public Boolean getRateField006() { return rateField006; }
    public void setRateField006(Boolean rateField006) { this.rateField006 = rateField006; }

    public Boolean getRateField007() { return rateField007; }
    public void setRateField007(Boolean rateField007) { this.rateField007 = rateField007; }

    public Boolean getRateField008() { return rateField008; }
    public void setRateField008(Boolean rateField008) { this.rateField008 = rateField008; }

    public BigDecimal getRateField009() { return rateField009; }
    public void setRateField009(BigDecimal rateField009) { this.rateField009 = rateField009; }

    public String getRateField010() { return rateField010; }
    public void setRateField010(String rateField010) { this.rateField010 = rateField010; }

    public Boolean getRateField011() { return rateField011; }
    public void setRateField011(Boolean rateField011) { this.rateField011 = rateField011; }

    @Override
    public String toString() {
        return "RateDto052{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
