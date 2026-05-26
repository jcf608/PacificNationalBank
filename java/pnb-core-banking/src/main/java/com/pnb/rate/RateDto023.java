package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto023 — Data Transfer Object for rate operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto023 {

    @Size(max = 60)
    @JsonProperty("rateField000")
    private String rateField000;

    @JsonProperty("rateField001")
    private Boolean rateField001;

    @JsonProperty("rateField002")
    private LocalDate rateField002;

    @JsonProperty("rateField003")
    private LocalDate rateField003;

    @JsonProperty("rateField004")
    private LocalDate rateField004;

    @JsonProperty("rateField005")
    private Integer rateField005;

    @JsonProperty("rateField006")
    private Long rateField006;

    @JsonProperty("rateField007")
    private Integer rateField007;

    @JsonProperty("rateField008")
    private LocalDate rateField008;

    @JsonProperty("rateField009")
    private LocalDate rateField009;

    @JsonProperty("rateField010")
    private Boolean rateField010;

    @Size(max = 40)
    @JsonProperty("rateField011")
    private String rateField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField012")
    private BigDecimal rateField012;

    @JsonProperty("rateField013")
    private Long rateField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField014")
    private BigDecimal rateField014;

    @JsonProperty("rateField015")
    private Boolean rateField015;

    @JsonProperty("rateField016")
    private Long rateField016;

    @JsonProperty("rateField017")
    private Long rateField017;

    @Size(max = 40)
    @JsonProperty("rateField018")
    private String rateField018;

    public RateDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto023 instance = new RateDto023();

        public Builder rateField000(String val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Boolean val) { instance.rateField001 = val; return this; }
        public Builder rateField002(LocalDate val) { instance.rateField002 = val; return this; }
        public Builder rateField003(LocalDate val) { instance.rateField003 = val; return this; }
        public Builder rateField004(LocalDate val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Integer val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Long val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Integer val) { instance.rateField007 = val; return this; }
        public Builder rateField008(LocalDate val) { instance.rateField008 = val; return this; }
        public Builder rateField009(LocalDate val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Boolean val) { instance.rateField010 = val; return this; }
        public Builder rateField011(String val) { instance.rateField011 = val; return this; }
        public Builder rateField012(BigDecimal val) { instance.rateField012 = val; return this; }
        public Builder rateField013(Long val) { instance.rateField013 = val; return this; }
        public Builder rateField014(BigDecimal val) { instance.rateField014 = val; return this; }
        public Builder rateField015(Boolean val) { instance.rateField015 = val; return this; }
        public Builder rateField016(Long val) { instance.rateField016 = val; return this; }
        public Builder rateField017(Long val) { instance.rateField017 = val; return this; }
        public Builder rateField018(String val) { instance.rateField018 = val; return this; }
        public RateDto023 build() { return instance; }
    }

    public String getRateField000() { return rateField000; }
    public void setRateField000(String rateField000) { this.rateField000 = rateField000; }

    public Boolean getRateField001() { return rateField001; }
    public void setRateField001(Boolean rateField001) { this.rateField001 = rateField001; }

    public LocalDate getRateField002() { return rateField002; }
    public void setRateField002(LocalDate rateField002) { this.rateField002 = rateField002; }

    public LocalDate getRateField003() { return rateField003; }
    public void setRateField003(LocalDate rateField003) { this.rateField003 = rateField003; }

    public LocalDate getRateField004() { return rateField004; }
    public void setRateField004(LocalDate rateField004) { this.rateField004 = rateField004; }

    public Integer getRateField005() { return rateField005; }
    public void setRateField005(Integer rateField005) { this.rateField005 = rateField005; }

    public Long getRateField006() { return rateField006; }
    public void setRateField006(Long rateField006) { this.rateField006 = rateField006; }

    public Integer getRateField007() { return rateField007; }
    public void setRateField007(Integer rateField007) { this.rateField007 = rateField007; }

    public LocalDate getRateField008() { return rateField008; }
    public void setRateField008(LocalDate rateField008) { this.rateField008 = rateField008; }

    public LocalDate getRateField009() { return rateField009; }
    public void setRateField009(LocalDate rateField009) { this.rateField009 = rateField009; }

    public Boolean getRateField010() { return rateField010; }
    public void setRateField010(Boolean rateField010) { this.rateField010 = rateField010; }

    public String getRateField011() { return rateField011; }
    public void setRateField011(String rateField011) { this.rateField011 = rateField011; }

    public BigDecimal getRateField012() { return rateField012; }
    public void setRateField012(BigDecimal rateField012) { this.rateField012 = rateField012; }

    public Long getRateField013() { return rateField013; }
    public void setRateField013(Long rateField013) { this.rateField013 = rateField013; }

    public BigDecimal getRateField014() { return rateField014; }
    public void setRateField014(BigDecimal rateField014) { this.rateField014 = rateField014; }

    public Boolean getRateField015() { return rateField015; }
    public void setRateField015(Boolean rateField015) { this.rateField015 = rateField015; }

    public Long getRateField016() { return rateField016; }
    public void setRateField016(Long rateField016) { this.rateField016 = rateField016; }

    public Long getRateField017() { return rateField017; }
    public void setRateField017(Long rateField017) { this.rateField017 = rateField017; }

    public String getRateField018() { return rateField018; }
    public void setRateField018(String rateField018) { this.rateField018 = rateField018; }

    @Override
    public String toString() {
        return "RateDto023{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
