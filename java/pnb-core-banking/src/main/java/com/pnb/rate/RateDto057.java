package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto057 — Data Transfer Object for rate operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto057 {

    @JsonProperty("rateField000")
    private LocalDate rateField000;

    @JsonProperty("rateField001")
    private Integer rateField001;

    @JsonProperty("rateField002")
    private LocalDate rateField002;

    @JsonProperty("rateField003")
    private Boolean rateField003;

    @JsonProperty("rateField004")
    private Double rateField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField005")
    private BigDecimal rateField005;

    @JsonProperty("rateField006")
    private Boolean rateField006;

    @JsonProperty("rateField007")
    private Integer rateField007;

    @Size(max = 100)
    @JsonProperty("rateField008")
    private String rateField008;

    @JsonProperty("rateField009")
    private Double rateField009;

    @JsonProperty("rateField010")
    private Boolean rateField010;

    @JsonProperty("rateField011")
    private Integer rateField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField012")
    private BigDecimal rateField012;

    @Size(max = 100)
    @JsonProperty("rateField013")
    private String rateField013;

    @JsonProperty("rateField014")
    private Double rateField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField015")
    private BigDecimal rateField015;

    @JsonProperty("rateField016")
    private Long rateField016;

    public RateDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto057 instance = new RateDto057();

        public Builder rateField000(LocalDate val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Integer val) { instance.rateField001 = val; return this; }
        public Builder rateField002(LocalDate val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Boolean val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Double val) { instance.rateField004 = val; return this; }
        public Builder rateField005(BigDecimal val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Boolean val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Integer val) { instance.rateField007 = val; return this; }
        public Builder rateField008(String val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Double val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Boolean val) { instance.rateField010 = val; return this; }
        public Builder rateField011(Integer val) { instance.rateField011 = val; return this; }
        public Builder rateField012(BigDecimal val) { instance.rateField012 = val; return this; }
        public Builder rateField013(String val) { instance.rateField013 = val; return this; }
        public Builder rateField014(Double val) { instance.rateField014 = val; return this; }
        public Builder rateField015(BigDecimal val) { instance.rateField015 = val; return this; }
        public Builder rateField016(Long val) { instance.rateField016 = val; return this; }
        public RateDto057 build() { return instance; }
    }

    public LocalDate getRateField000() { return rateField000; }
    public void setRateField000(LocalDate rateField000) { this.rateField000 = rateField000; }

    public Integer getRateField001() { return rateField001; }
    public void setRateField001(Integer rateField001) { this.rateField001 = rateField001; }

    public LocalDate getRateField002() { return rateField002; }
    public void setRateField002(LocalDate rateField002) { this.rateField002 = rateField002; }

    public Boolean getRateField003() { return rateField003; }
    public void setRateField003(Boolean rateField003) { this.rateField003 = rateField003; }

    public Double getRateField004() { return rateField004; }
    public void setRateField004(Double rateField004) { this.rateField004 = rateField004; }

    public BigDecimal getRateField005() { return rateField005; }
    public void setRateField005(BigDecimal rateField005) { this.rateField005 = rateField005; }

    public Boolean getRateField006() { return rateField006; }
    public void setRateField006(Boolean rateField006) { this.rateField006 = rateField006; }

    public Integer getRateField007() { return rateField007; }
    public void setRateField007(Integer rateField007) { this.rateField007 = rateField007; }

    public String getRateField008() { return rateField008; }
    public void setRateField008(String rateField008) { this.rateField008 = rateField008; }

    public Double getRateField009() { return rateField009; }
    public void setRateField009(Double rateField009) { this.rateField009 = rateField009; }

    public Boolean getRateField010() { return rateField010; }
    public void setRateField010(Boolean rateField010) { this.rateField010 = rateField010; }

    public Integer getRateField011() { return rateField011; }
    public void setRateField011(Integer rateField011) { this.rateField011 = rateField011; }

    public BigDecimal getRateField012() { return rateField012; }
    public void setRateField012(BigDecimal rateField012) { this.rateField012 = rateField012; }

    public String getRateField013() { return rateField013; }
    public void setRateField013(String rateField013) { this.rateField013 = rateField013; }

    public Double getRateField014() { return rateField014; }
    public void setRateField014(Double rateField014) { this.rateField014 = rateField014; }

    public BigDecimal getRateField015() { return rateField015; }
    public void setRateField015(BigDecimal rateField015) { this.rateField015 = rateField015; }

    public Long getRateField016() { return rateField016; }
    public void setRateField016(Long rateField016) { this.rateField016 = rateField016; }

    @Override
    public String toString() {
        return "RateDto057{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
