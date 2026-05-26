package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto035 — Data Transfer Object for rate operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto035 {

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField000")
    private BigDecimal rateField000;

    @JsonProperty("rateField001")
    private LocalDate rateField001;

    @JsonProperty("rateField002")
    private Long rateField002;

    @JsonProperty("rateField003")
    private Long rateField003;

    @JsonProperty("rateField004")
    private Long rateField004;

    @JsonProperty("rateField005")
    private Double rateField005;

    @JsonProperty("rateField006")
    private LocalDate rateField006;

    @JsonProperty("rateField007")
    private Long rateField007;

    @JsonProperty("rateField008")
    private Long rateField008;

    @Size(max = 200)
    @JsonProperty("rateField009")
    private String rateField009;

    @JsonProperty("rateField010")
    private Boolean rateField010;

    @JsonProperty("rateField011")
    private Boolean rateField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField012")
    private BigDecimal rateField012;

    @JsonProperty("rateField013")
    private Integer rateField013;

    @JsonProperty("rateField014")
    private Boolean rateField014;

    @JsonProperty("rateField015")
    private LocalDate rateField015;

    @JsonProperty("rateField016")
    private Integer rateField016;

    @JsonProperty("rateField017")
    private Double rateField017;

    @Size(max = 20)
    @JsonProperty("rateField018")
    private String rateField018;

    public RateDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto035 instance = new RateDto035();

        public Builder rateField000(BigDecimal val) { instance.rateField000 = val; return this; }
        public Builder rateField001(LocalDate val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Long val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Long val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Long val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Double val) { instance.rateField005 = val; return this; }
        public Builder rateField006(LocalDate val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Long val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Long val) { instance.rateField008 = val; return this; }
        public Builder rateField009(String val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Boolean val) { instance.rateField010 = val; return this; }
        public Builder rateField011(Boolean val) { instance.rateField011 = val; return this; }
        public Builder rateField012(BigDecimal val) { instance.rateField012 = val; return this; }
        public Builder rateField013(Integer val) { instance.rateField013 = val; return this; }
        public Builder rateField014(Boolean val) { instance.rateField014 = val; return this; }
        public Builder rateField015(LocalDate val) { instance.rateField015 = val; return this; }
        public Builder rateField016(Integer val) { instance.rateField016 = val; return this; }
        public Builder rateField017(Double val) { instance.rateField017 = val; return this; }
        public Builder rateField018(String val) { instance.rateField018 = val; return this; }
        public RateDto035 build() { return instance; }
    }

    public BigDecimal getRateField000() { return rateField000; }
    public void setRateField000(BigDecimal rateField000) { this.rateField000 = rateField000; }

    public LocalDate getRateField001() { return rateField001; }
    public void setRateField001(LocalDate rateField001) { this.rateField001 = rateField001; }

    public Long getRateField002() { return rateField002; }
    public void setRateField002(Long rateField002) { this.rateField002 = rateField002; }

    public Long getRateField003() { return rateField003; }
    public void setRateField003(Long rateField003) { this.rateField003 = rateField003; }

    public Long getRateField004() { return rateField004; }
    public void setRateField004(Long rateField004) { this.rateField004 = rateField004; }

    public Double getRateField005() { return rateField005; }
    public void setRateField005(Double rateField005) { this.rateField005 = rateField005; }

    public LocalDate getRateField006() { return rateField006; }
    public void setRateField006(LocalDate rateField006) { this.rateField006 = rateField006; }

    public Long getRateField007() { return rateField007; }
    public void setRateField007(Long rateField007) { this.rateField007 = rateField007; }

    public Long getRateField008() { return rateField008; }
    public void setRateField008(Long rateField008) { this.rateField008 = rateField008; }

    public String getRateField009() { return rateField009; }
    public void setRateField009(String rateField009) { this.rateField009 = rateField009; }

    public Boolean getRateField010() { return rateField010; }
    public void setRateField010(Boolean rateField010) { this.rateField010 = rateField010; }

    public Boolean getRateField011() { return rateField011; }
    public void setRateField011(Boolean rateField011) { this.rateField011 = rateField011; }

    public BigDecimal getRateField012() { return rateField012; }
    public void setRateField012(BigDecimal rateField012) { this.rateField012 = rateField012; }

    public Integer getRateField013() { return rateField013; }
    public void setRateField013(Integer rateField013) { this.rateField013 = rateField013; }

    public Boolean getRateField014() { return rateField014; }
    public void setRateField014(Boolean rateField014) { this.rateField014 = rateField014; }

    public LocalDate getRateField015() { return rateField015; }
    public void setRateField015(LocalDate rateField015) { this.rateField015 = rateField015; }

    public Integer getRateField016() { return rateField016; }
    public void setRateField016(Integer rateField016) { this.rateField016 = rateField016; }

    public Double getRateField017() { return rateField017; }
    public void setRateField017(Double rateField017) { this.rateField017 = rateField017; }

    public String getRateField018() { return rateField018; }
    public void setRateField018(String rateField018) { this.rateField018 = rateField018; }

    @Override
    public String toString() {
        return "RateDto035{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
