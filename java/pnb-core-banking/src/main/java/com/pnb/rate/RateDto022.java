package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto022 — Data Transfer Object for rate operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto022 {

    @JsonProperty("rateField000")
    private Boolean rateField000;

    @JsonProperty("rateField001")
    private Double rateField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField002")
    private BigDecimal rateField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField003")
    private BigDecimal rateField003;

    @JsonProperty("rateField004")
    private Long rateField004;

    @JsonProperty("rateField005")
    private Double rateField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField006")
    private BigDecimal rateField006;

    @JsonProperty("rateField007")
    private Boolean rateField007;

    @JsonProperty("rateField008")
    private Boolean rateField008;

    @JsonProperty("rateField009")
    private Long rateField009;

    @JsonProperty("rateField010")
    private LocalDate rateField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField011")
    private BigDecimal rateField011;

    @Size(max = 20)
    @JsonProperty("rateField012")
    private String rateField012;

    @JsonProperty("rateField013")
    private LocalDate rateField013;

    @Size(max = 20)
    @JsonProperty("rateField014")
    private String rateField014;

    @JsonProperty("rateField015")
    private Double rateField015;

    @JsonProperty("rateField016")
    private Integer rateField016;

    @JsonProperty("rateField017")
    private Integer rateField017;

    public RateDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto022 instance = new RateDto022();

        public Builder rateField000(Boolean val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Double val) { instance.rateField001 = val; return this; }
        public Builder rateField002(BigDecimal val) { instance.rateField002 = val; return this; }
        public Builder rateField003(BigDecimal val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Long val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Double val) { instance.rateField005 = val; return this; }
        public Builder rateField006(BigDecimal val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Boolean val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Boolean val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Long val) { instance.rateField009 = val; return this; }
        public Builder rateField010(LocalDate val) { instance.rateField010 = val; return this; }
        public Builder rateField011(BigDecimal val) { instance.rateField011 = val; return this; }
        public Builder rateField012(String val) { instance.rateField012 = val; return this; }
        public Builder rateField013(LocalDate val) { instance.rateField013 = val; return this; }
        public Builder rateField014(String val) { instance.rateField014 = val; return this; }
        public Builder rateField015(Double val) { instance.rateField015 = val; return this; }
        public Builder rateField016(Integer val) { instance.rateField016 = val; return this; }
        public Builder rateField017(Integer val) { instance.rateField017 = val; return this; }
        public RateDto022 build() { return instance; }
    }

    public Boolean getRateField000() { return rateField000; }
    public void setRateField000(Boolean rateField000) { this.rateField000 = rateField000; }

    public Double getRateField001() { return rateField001; }
    public void setRateField001(Double rateField001) { this.rateField001 = rateField001; }

    public BigDecimal getRateField002() { return rateField002; }
    public void setRateField002(BigDecimal rateField002) { this.rateField002 = rateField002; }

    public BigDecimal getRateField003() { return rateField003; }
    public void setRateField003(BigDecimal rateField003) { this.rateField003 = rateField003; }

    public Long getRateField004() { return rateField004; }
    public void setRateField004(Long rateField004) { this.rateField004 = rateField004; }

    public Double getRateField005() { return rateField005; }
    public void setRateField005(Double rateField005) { this.rateField005 = rateField005; }

    public BigDecimal getRateField006() { return rateField006; }
    public void setRateField006(BigDecimal rateField006) { this.rateField006 = rateField006; }

    public Boolean getRateField007() { return rateField007; }
    public void setRateField007(Boolean rateField007) { this.rateField007 = rateField007; }

    public Boolean getRateField008() { return rateField008; }
    public void setRateField008(Boolean rateField008) { this.rateField008 = rateField008; }

    public Long getRateField009() { return rateField009; }
    public void setRateField009(Long rateField009) { this.rateField009 = rateField009; }

    public LocalDate getRateField010() { return rateField010; }
    public void setRateField010(LocalDate rateField010) { this.rateField010 = rateField010; }

    public BigDecimal getRateField011() { return rateField011; }
    public void setRateField011(BigDecimal rateField011) { this.rateField011 = rateField011; }

    public String getRateField012() { return rateField012; }
    public void setRateField012(String rateField012) { this.rateField012 = rateField012; }

    public LocalDate getRateField013() { return rateField013; }
    public void setRateField013(LocalDate rateField013) { this.rateField013 = rateField013; }

    public String getRateField014() { return rateField014; }
    public void setRateField014(String rateField014) { this.rateField014 = rateField014; }

    public Double getRateField015() { return rateField015; }
    public void setRateField015(Double rateField015) { this.rateField015 = rateField015; }

    public Integer getRateField016() { return rateField016; }
    public void setRateField016(Integer rateField016) { this.rateField016 = rateField016; }

    public Integer getRateField017() { return rateField017; }
    public void setRateField017(Integer rateField017) { this.rateField017 = rateField017; }

    @Override
    public String toString() {
        return "RateDto022{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
