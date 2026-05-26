package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto047 — Data Transfer Object for rate operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto047 {

    @JsonProperty("rateField000")
    private Boolean rateField000;

    @JsonProperty("rateField001")
    private LocalDate rateField001;

    @JsonProperty("rateField002")
    private Long rateField002;

    @JsonProperty("rateField003")
    private Boolean rateField003;

    @Size(max = 20)
    @JsonProperty("rateField004")
    private String rateField004;

    @JsonProperty("rateField005")
    private Boolean rateField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField006")
    private BigDecimal rateField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField007")
    private BigDecimal rateField007;

    @JsonProperty("rateField008")
    private Long rateField008;

    @JsonProperty("rateField009")
    private Long rateField009;

    @JsonProperty("rateField010")
    private Double rateField010;

    @Size(max = 40)
    @JsonProperty("rateField011")
    private String rateField011;

    @JsonProperty("rateField012")
    private Boolean rateField012;

    @JsonProperty("rateField013")
    private Long rateField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField014")
    private BigDecimal rateField014;

    @JsonProperty("rateField015")
    private LocalDate rateField015;

    @JsonProperty("rateField016")
    private Integer rateField016;

    @JsonProperty("rateField017")
    private Long rateField017;

    @JsonProperty("rateField018")
    private Integer rateField018;

    public RateDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto047 instance = new RateDto047();

        public Builder rateField000(Boolean val) { instance.rateField000 = val; return this; }
        public Builder rateField001(LocalDate val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Long val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Boolean val) { instance.rateField003 = val; return this; }
        public Builder rateField004(String val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Boolean val) { instance.rateField005 = val; return this; }
        public Builder rateField006(BigDecimal val) { instance.rateField006 = val; return this; }
        public Builder rateField007(BigDecimal val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Long val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Long val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Double val) { instance.rateField010 = val; return this; }
        public Builder rateField011(String val) { instance.rateField011 = val; return this; }
        public Builder rateField012(Boolean val) { instance.rateField012 = val; return this; }
        public Builder rateField013(Long val) { instance.rateField013 = val; return this; }
        public Builder rateField014(BigDecimal val) { instance.rateField014 = val; return this; }
        public Builder rateField015(LocalDate val) { instance.rateField015 = val; return this; }
        public Builder rateField016(Integer val) { instance.rateField016 = val; return this; }
        public Builder rateField017(Long val) { instance.rateField017 = val; return this; }
        public Builder rateField018(Integer val) { instance.rateField018 = val; return this; }
        public RateDto047 build() { return instance; }
    }

    public Boolean getRateField000() { return rateField000; }
    public void setRateField000(Boolean rateField000) { this.rateField000 = rateField000; }

    public LocalDate getRateField001() { return rateField001; }
    public void setRateField001(LocalDate rateField001) { this.rateField001 = rateField001; }

    public Long getRateField002() { return rateField002; }
    public void setRateField002(Long rateField002) { this.rateField002 = rateField002; }

    public Boolean getRateField003() { return rateField003; }
    public void setRateField003(Boolean rateField003) { this.rateField003 = rateField003; }

    public String getRateField004() { return rateField004; }
    public void setRateField004(String rateField004) { this.rateField004 = rateField004; }

    public Boolean getRateField005() { return rateField005; }
    public void setRateField005(Boolean rateField005) { this.rateField005 = rateField005; }

    public BigDecimal getRateField006() { return rateField006; }
    public void setRateField006(BigDecimal rateField006) { this.rateField006 = rateField006; }

    public BigDecimal getRateField007() { return rateField007; }
    public void setRateField007(BigDecimal rateField007) { this.rateField007 = rateField007; }

    public Long getRateField008() { return rateField008; }
    public void setRateField008(Long rateField008) { this.rateField008 = rateField008; }

    public Long getRateField009() { return rateField009; }
    public void setRateField009(Long rateField009) { this.rateField009 = rateField009; }

    public Double getRateField010() { return rateField010; }
    public void setRateField010(Double rateField010) { this.rateField010 = rateField010; }

    public String getRateField011() { return rateField011; }
    public void setRateField011(String rateField011) { this.rateField011 = rateField011; }

    public Boolean getRateField012() { return rateField012; }
    public void setRateField012(Boolean rateField012) { this.rateField012 = rateField012; }

    public Long getRateField013() { return rateField013; }
    public void setRateField013(Long rateField013) { this.rateField013 = rateField013; }

    public BigDecimal getRateField014() { return rateField014; }
    public void setRateField014(BigDecimal rateField014) { this.rateField014 = rateField014; }

    public LocalDate getRateField015() { return rateField015; }
    public void setRateField015(LocalDate rateField015) { this.rateField015 = rateField015; }

    public Integer getRateField016() { return rateField016; }
    public void setRateField016(Integer rateField016) { this.rateField016 = rateField016; }

    public Long getRateField017() { return rateField017; }
    public void setRateField017(Long rateField017) { this.rateField017 = rateField017; }

    public Integer getRateField018() { return rateField018; }
    public void setRateField018(Integer rateField018) { this.rateField018 = rateField018; }

    @Override
    public String toString() {
        return "RateDto047{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
