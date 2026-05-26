package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto059 — Data Transfer Object for rate operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto059 {

    @JsonProperty("rateField000")
    private Integer rateField000;

    @JsonProperty("rateField001")
    private Double rateField001;

    @JsonProperty("rateField002")
    private Boolean rateField002;

    @JsonProperty("rateField003")
    private Long rateField003;

    @JsonProperty("rateField004")
    private LocalDate rateField004;

    @JsonProperty("rateField005")
    private LocalDate rateField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField006")
    private BigDecimal rateField006;

    @JsonProperty("rateField007")
    private LocalDate rateField007;

    @Size(max = 200)
    @JsonProperty("rateField008")
    private String rateField008;

    @JsonProperty("rateField009")
    private Boolean rateField009;

    @JsonProperty("rateField010")
    private Integer rateField010;

    @JsonProperty("rateField011")
    private Long rateField011;

    @JsonProperty("rateField012")
    private Boolean rateField012;

    @Size(max = 100)
    @JsonProperty("rateField013")
    private String rateField013;

    @JsonProperty("rateField014")
    private LocalDate rateField014;

    @JsonProperty("rateField015")
    private Boolean rateField015;

    @JsonProperty("rateField016")
    private Boolean rateField016;

    @JsonProperty("rateField017")
    private Double rateField017;

    @Size(max = 40)
    @JsonProperty("rateField018")
    private String rateField018;

    public RateDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto059 instance = new RateDto059();

        public Builder rateField000(Integer val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Double val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Boolean val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Long val) { instance.rateField003 = val; return this; }
        public Builder rateField004(LocalDate val) { instance.rateField004 = val; return this; }
        public Builder rateField005(LocalDate val) { instance.rateField005 = val; return this; }
        public Builder rateField006(BigDecimal val) { instance.rateField006 = val; return this; }
        public Builder rateField007(LocalDate val) { instance.rateField007 = val; return this; }
        public Builder rateField008(String val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Boolean val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Integer val) { instance.rateField010 = val; return this; }
        public Builder rateField011(Long val) { instance.rateField011 = val; return this; }
        public Builder rateField012(Boolean val) { instance.rateField012 = val; return this; }
        public Builder rateField013(String val) { instance.rateField013 = val; return this; }
        public Builder rateField014(LocalDate val) { instance.rateField014 = val; return this; }
        public Builder rateField015(Boolean val) { instance.rateField015 = val; return this; }
        public Builder rateField016(Boolean val) { instance.rateField016 = val; return this; }
        public Builder rateField017(Double val) { instance.rateField017 = val; return this; }
        public Builder rateField018(String val) { instance.rateField018 = val; return this; }
        public RateDto059 build() { return instance; }
    }

    public Integer getRateField000() { return rateField000; }
    public void setRateField000(Integer rateField000) { this.rateField000 = rateField000; }

    public Double getRateField001() { return rateField001; }
    public void setRateField001(Double rateField001) { this.rateField001 = rateField001; }

    public Boolean getRateField002() { return rateField002; }
    public void setRateField002(Boolean rateField002) { this.rateField002 = rateField002; }

    public Long getRateField003() { return rateField003; }
    public void setRateField003(Long rateField003) { this.rateField003 = rateField003; }

    public LocalDate getRateField004() { return rateField004; }
    public void setRateField004(LocalDate rateField004) { this.rateField004 = rateField004; }

    public LocalDate getRateField005() { return rateField005; }
    public void setRateField005(LocalDate rateField005) { this.rateField005 = rateField005; }

    public BigDecimal getRateField006() { return rateField006; }
    public void setRateField006(BigDecimal rateField006) { this.rateField006 = rateField006; }

    public LocalDate getRateField007() { return rateField007; }
    public void setRateField007(LocalDate rateField007) { this.rateField007 = rateField007; }

    public String getRateField008() { return rateField008; }
    public void setRateField008(String rateField008) { this.rateField008 = rateField008; }

    public Boolean getRateField009() { return rateField009; }
    public void setRateField009(Boolean rateField009) { this.rateField009 = rateField009; }

    public Integer getRateField010() { return rateField010; }
    public void setRateField010(Integer rateField010) { this.rateField010 = rateField010; }

    public Long getRateField011() { return rateField011; }
    public void setRateField011(Long rateField011) { this.rateField011 = rateField011; }

    public Boolean getRateField012() { return rateField012; }
    public void setRateField012(Boolean rateField012) { this.rateField012 = rateField012; }

    public String getRateField013() { return rateField013; }
    public void setRateField013(String rateField013) { this.rateField013 = rateField013; }

    public LocalDate getRateField014() { return rateField014; }
    public void setRateField014(LocalDate rateField014) { this.rateField014 = rateField014; }

    public Boolean getRateField015() { return rateField015; }
    public void setRateField015(Boolean rateField015) { this.rateField015 = rateField015; }

    public Boolean getRateField016() { return rateField016; }
    public void setRateField016(Boolean rateField016) { this.rateField016 = rateField016; }

    public Double getRateField017() { return rateField017; }
    public void setRateField017(Double rateField017) { this.rateField017 = rateField017; }

    public String getRateField018() { return rateField018; }
    public void setRateField018(String rateField018) { this.rateField018 = rateField018; }

    @Override
    public String toString() {
        return "RateDto059{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
