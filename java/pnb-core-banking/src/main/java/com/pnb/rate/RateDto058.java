package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto058 — Data Transfer Object for rate operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto058 {

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField000")
    private BigDecimal rateField000;

    @Size(max = 60)
    @JsonProperty("rateField001")
    private String rateField001;

    @JsonProperty("rateField002")
    private Boolean rateField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField003")
    private BigDecimal rateField003;

    @Size(max = 60)
    @JsonProperty("rateField004")
    private String rateField004;

    @JsonProperty("rateField005")
    private Integer rateField005;

    @JsonProperty("rateField006")
    private Boolean rateField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField007")
    private BigDecimal rateField007;

    @JsonProperty("rateField008")
    private Integer rateField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("rateField009")
    private BigDecimal rateField009;

    @Size(max = 20)
    @JsonProperty("rateField010")
    private String rateField010;

    @Size(max = 40)
    @JsonProperty("rateField011")
    private String rateField011;

    @JsonProperty("rateField012")
    private Boolean rateField012;

    @Size(max = 20)
    @JsonProperty("rateField013")
    private String rateField013;

    @JsonProperty("rateField014")
    private Boolean rateField014;

    @Size(max = 40)
    @JsonProperty("rateField015")
    private String rateField015;

    @JsonProperty("rateField016")
    private Boolean rateField016;

    @JsonProperty("rateField017")
    private Integer rateField017;

    public RateDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto058 instance = new RateDto058();

        public Builder rateField000(BigDecimal val) { instance.rateField000 = val; return this; }
        public Builder rateField001(String val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Boolean val) { instance.rateField002 = val; return this; }
        public Builder rateField003(BigDecimal val) { instance.rateField003 = val; return this; }
        public Builder rateField004(String val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Integer val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Boolean val) { instance.rateField006 = val; return this; }
        public Builder rateField007(BigDecimal val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Integer val) { instance.rateField008 = val; return this; }
        public Builder rateField009(BigDecimal val) { instance.rateField009 = val; return this; }
        public Builder rateField010(String val) { instance.rateField010 = val; return this; }
        public Builder rateField011(String val) { instance.rateField011 = val; return this; }
        public Builder rateField012(Boolean val) { instance.rateField012 = val; return this; }
        public Builder rateField013(String val) { instance.rateField013 = val; return this; }
        public Builder rateField014(Boolean val) { instance.rateField014 = val; return this; }
        public Builder rateField015(String val) { instance.rateField015 = val; return this; }
        public Builder rateField016(Boolean val) { instance.rateField016 = val; return this; }
        public Builder rateField017(Integer val) { instance.rateField017 = val; return this; }
        public RateDto058 build() { return instance; }
    }

    public BigDecimal getRateField000() { return rateField000; }
    public void setRateField000(BigDecimal rateField000) { this.rateField000 = rateField000; }

    public String getRateField001() { return rateField001; }
    public void setRateField001(String rateField001) { this.rateField001 = rateField001; }

    public Boolean getRateField002() { return rateField002; }
    public void setRateField002(Boolean rateField002) { this.rateField002 = rateField002; }

    public BigDecimal getRateField003() { return rateField003; }
    public void setRateField003(BigDecimal rateField003) { this.rateField003 = rateField003; }

    public String getRateField004() { return rateField004; }
    public void setRateField004(String rateField004) { this.rateField004 = rateField004; }

    public Integer getRateField005() { return rateField005; }
    public void setRateField005(Integer rateField005) { this.rateField005 = rateField005; }

    public Boolean getRateField006() { return rateField006; }
    public void setRateField006(Boolean rateField006) { this.rateField006 = rateField006; }

    public BigDecimal getRateField007() { return rateField007; }
    public void setRateField007(BigDecimal rateField007) { this.rateField007 = rateField007; }

    public Integer getRateField008() { return rateField008; }
    public void setRateField008(Integer rateField008) { this.rateField008 = rateField008; }

    public BigDecimal getRateField009() { return rateField009; }
    public void setRateField009(BigDecimal rateField009) { this.rateField009 = rateField009; }

    public String getRateField010() { return rateField010; }
    public void setRateField010(String rateField010) { this.rateField010 = rateField010; }

    public String getRateField011() { return rateField011; }
    public void setRateField011(String rateField011) { this.rateField011 = rateField011; }

    public Boolean getRateField012() { return rateField012; }
    public void setRateField012(Boolean rateField012) { this.rateField012 = rateField012; }

    public String getRateField013() { return rateField013; }
    public void setRateField013(String rateField013) { this.rateField013 = rateField013; }

    public Boolean getRateField014() { return rateField014; }
    public void setRateField014(Boolean rateField014) { this.rateField014 = rateField014; }

    public String getRateField015() { return rateField015; }
    public void setRateField015(String rateField015) { this.rateField015 = rateField015; }

    public Boolean getRateField016() { return rateField016; }
    public void setRateField016(Boolean rateField016) { this.rateField016 = rateField016; }

    public Integer getRateField017() { return rateField017; }
    public void setRateField017(Integer rateField017) { this.rateField017 = rateField017; }

    @Override
    public String toString() {
        return "RateDto058{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
