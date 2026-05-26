package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto034 — Data Transfer Object for rate operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto034 {

    @JsonProperty("rateField000")
    private Integer rateField000;

    @JsonProperty("rateField001")
    private Boolean rateField001;

    @Size(max = 60)
    @JsonProperty("rateField002")
    private String rateField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField003")
    private BigDecimal rateField003;

    @JsonProperty("rateField004")
    private Boolean rateField004;

    @JsonProperty("rateField005")
    private LocalDate rateField005;

    @JsonProperty("rateField006")
    private LocalDate rateField006;

    @JsonProperty("rateField007")
    private Boolean rateField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField008")
    private BigDecimal rateField008;

    @JsonProperty("rateField009")
    private Double rateField009;

    @JsonProperty("rateField010")
    private Long rateField010;

    @JsonProperty("rateField011")
    private Long rateField011;

    @Size(max = 40)
    @JsonProperty("rateField012")
    private String rateField012;

    @JsonProperty("rateField013")
    private Long rateField013;

    @JsonProperty("rateField014")
    private Long rateField014;

    @JsonProperty("rateField015")
    private Double rateField015;

    @JsonProperty("rateField016")
    private Boolean rateField016;

    @Size(max = 200)
    @JsonProperty("rateField017")
    private String rateField017;

    public RateDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto034 instance = new RateDto034();

        public Builder rateField000(Integer val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Boolean val) { instance.rateField001 = val; return this; }
        public Builder rateField002(String val) { instance.rateField002 = val; return this; }
        public Builder rateField003(BigDecimal val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Boolean val) { instance.rateField004 = val; return this; }
        public Builder rateField005(LocalDate val) { instance.rateField005 = val; return this; }
        public Builder rateField006(LocalDate val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Boolean val) { instance.rateField007 = val; return this; }
        public Builder rateField008(BigDecimal val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Double val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Long val) { instance.rateField010 = val; return this; }
        public Builder rateField011(Long val) { instance.rateField011 = val; return this; }
        public Builder rateField012(String val) { instance.rateField012 = val; return this; }
        public Builder rateField013(Long val) { instance.rateField013 = val; return this; }
        public Builder rateField014(Long val) { instance.rateField014 = val; return this; }
        public Builder rateField015(Double val) { instance.rateField015 = val; return this; }
        public Builder rateField016(Boolean val) { instance.rateField016 = val; return this; }
        public Builder rateField017(String val) { instance.rateField017 = val; return this; }
        public RateDto034 build() { return instance; }
    }

    public Integer getRateField000() { return rateField000; }
    public void setRateField000(Integer rateField000) { this.rateField000 = rateField000; }

    public Boolean getRateField001() { return rateField001; }
    public void setRateField001(Boolean rateField001) { this.rateField001 = rateField001; }

    public String getRateField002() { return rateField002; }
    public void setRateField002(String rateField002) { this.rateField002 = rateField002; }

    public BigDecimal getRateField003() { return rateField003; }
    public void setRateField003(BigDecimal rateField003) { this.rateField003 = rateField003; }

    public Boolean getRateField004() { return rateField004; }
    public void setRateField004(Boolean rateField004) { this.rateField004 = rateField004; }

    public LocalDate getRateField005() { return rateField005; }
    public void setRateField005(LocalDate rateField005) { this.rateField005 = rateField005; }

    public LocalDate getRateField006() { return rateField006; }
    public void setRateField006(LocalDate rateField006) { this.rateField006 = rateField006; }

    public Boolean getRateField007() { return rateField007; }
    public void setRateField007(Boolean rateField007) { this.rateField007 = rateField007; }

    public BigDecimal getRateField008() { return rateField008; }
    public void setRateField008(BigDecimal rateField008) { this.rateField008 = rateField008; }

    public Double getRateField009() { return rateField009; }
    public void setRateField009(Double rateField009) { this.rateField009 = rateField009; }

    public Long getRateField010() { return rateField010; }
    public void setRateField010(Long rateField010) { this.rateField010 = rateField010; }

    public Long getRateField011() { return rateField011; }
    public void setRateField011(Long rateField011) { this.rateField011 = rateField011; }

    public String getRateField012() { return rateField012; }
    public void setRateField012(String rateField012) { this.rateField012 = rateField012; }

    public Long getRateField013() { return rateField013; }
    public void setRateField013(Long rateField013) { this.rateField013 = rateField013; }

    public Long getRateField014() { return rateField014; }
    public void setRateField014(Long rateField014) { this.rateField014 = rateField014; }

    public Double getRateField015() { return rateField015; }
    public void setRateField015(Double rateField015) { this.rateField015 = rateField015; }

    public Boolean getRateField016() { return rateField016; }
    public void setRateField016(Boolean rateField016) { this.rateField016 = rateField016; }

    public String getRateField017() { return rateField017; }
    public void setRateField017(String rateField017) { this.rateField017 = rateField017; }

    @Override
    public String toString() {
        return "RateDto034{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
