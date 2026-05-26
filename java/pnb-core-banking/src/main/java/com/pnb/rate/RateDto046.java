package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto046 — Data Transfer Object for rate operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto046 {

    @JsonProperty("rateField000")
    private LocalDate rateField000;

    @JsonProperty("rateField001")
    private Boolean rateField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField002")
    private BigDecimal rateField002;

    @JsonProperty("rateField003")
    private Double rateField003;

    @JsonProperty("rateField004")
    private Boolean rateField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField005")
    private BigDecimal rateField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField006")
    private BigDecimal rateField006;

    @JsonProperty("rateField007")
    private Boolean rateField007;

    @Size(max = 20)
    @JsonProperty("rateField008")
    private String rateField008;

    @JsonProperty("rateField009")
    private Boolean rateField009;

    @JsonProperty("rateField010")
    private Double rateField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField011")
    private BigDecimal rateField011;

    @JsonProperty("rateField012")
    private Double rateField012;

    @JsonProperty("rateField013")
    private LocalDate rateField013;

    @Size(max = 60)
    @JsonProperty("rateField014")
    private String rateField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField015")
    private BigDecimal rateField015;

    @JsonProperty("rateField016")
    private Double rateField016;

    @JsonProperty("rateField017")
    private LocalDate rateField017;

    public RateDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto046 instance = new RateDto046();

        public Builder rateField000(LocalDate val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Boolean val) { instance.rateField001 = val; return this; }
        public Builder rateField002(BigDecimal val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Double val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Boolean val) { instance.rateField004 = val; return this; }
        public Builder rateField005(BigDecimal val) { instance.rateField005 = val; return this; }
        public Builder rateField006(BigDecimal val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Boolean val) { instance.rateField007 = val; return this; }
        public Builder rateField008(String val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Boolean val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Double val) { instance.rateField010 = val; return this; }
        public Builder rateField011(BigDecimal val) { instance.rateField011 = val; return this; }
        public Builder rateField012(Double val) { instance.rateField012 = val; return this; }
        public Builder rateField013(LocalDate val) { instance.rateField013 = val; return this; }
        public Builder rateField014(String val) { instance.rateField014 = val; return this; }
        public Builder rateField015(BigDecimal val) { instance.rateField015 = val; return this; }
        public Builder rateField016(Double val) { instance.rateField016 = val; return this; }
        public Builder rateField017(LocalDate val) { instance.rateField017 = val; return this; }
        public RateDto046 build() { return instance; }
    }

    public LocalDate getRateField000() { return rateField000; }
    public void setRateField000(LocalDate rateField000) { this.rateField000 = rateField000; }

    public Boolean getRateField001() { return rateField001; }
    public void setRateField001(Boolean rateField001) { this.rateField001 = rateField001; }

    public BigDecimal getRateField002() { return rateField002; }
    public void setRateField002(BigDecimal rateField002) { this.rateField002 = rateField002; }

    public Double getRateField003() { return rateField003; }
    public void setRateField003(Double rateField003) { this.rateField003 = rateField003; }

    public Boolean getRateField004() { return rateField004; }
    public void setRateField004(Boolean rateField004) { this.rateField004 = rateField004; }

    public BigDecimal getRateField005() { return rateField005; }
    public void setRateField005(BigDecimal rateField005) { this.rateField005 = rateField005; }

    public BigDecimal getRateField006() { return rateField006; }
    public void setRateField006(BigDecimal rateField006) { this.rateField006 = rateField006; }

    public Boolean getRateField007() { return rateField007; }
    public void setRateField007(Boolean rateField007) { this.rateField007 = rateField007; }

    public String getRateField008() { return rateField008; }
    public void setRateField008(String rateField008) { this.rateField008 = rateField008; }

    public Boolean getRateField009() { return rateField009; }
    public void setRateField009(Boolean rateField009) { this.rateField009 = rateField009; }

    public Double getRateField010() { return rateField010; }
    public void setRateField010(Double rateField010) { this.rateField010 = rateField010; }

    public BigDecimal getRateField011() { return rateField011; }
    public void setRateField011(BigDecimal rateField011) { this.rateField011 = rateField011; }

    public Double getRateField012() { return rateField012; }
    public void setRateField012(Double rateField012) { this.rateField012 = rateField012; }

    public LocalDate getRateField013() { return rateField013; }
    public void setRateField013(LocalDate rateField013) { this.rateField013 = rateField013; }

    public String getRateField014() { return rateField014; }
    public void setRateField014(String rateField014) { this.rateField014 = rateField014; }

    public BigDecimal getRateField015() { return rateField015; }
    public void setRateField015(BigDecimal rateField015) { this.rateField015 = rateField015; }

    public Double getRateField016() { return rateField016; }
    public void setRateField016(Double rateField016) { this.rateField016 = rateField016; }

    public LocalDate getRateField017() { return rateField017; }
    public void setRateField017(LocalDate rateField017) { this.rateField017 = rateField017; }

    @Override
    public String toString() {
        return "RateDto046{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
