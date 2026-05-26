package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto033 — Data Transfer Object for rate operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto033 {

    @Size(max = 200)
    @JsonProperty("rateField000")
    private String rateField000;

    @JsonProperty("rateField001")
    private Integer rateField001;

    @JsonProperty("rateField002")
    private Integer rateField002;

    @JsonProperty("rateField003")
    private Boolean rateField003;

    @JsonProperty("rateField004")
    private Long rateField004;

    @JsonProperty("rateField005")
    private Boolean rateField005;

    @JsonProperty("rateField006")
    private Integer rateField006;

    @JsonProperty("rateField007")
    private Boolean rateField007;

    @JsonProperty("rateField008")
    private Double rateField008;

    @Size(max = 60)
    @JsonProperty("rateField009")
    private String rateField009;

    @Size(max = 100)
    @JsonProperty("rateField010")
    private String rateField010;

    @JsonProperty("rateField011")
    private Boolean rateField011;

    @JsonProperty("rateField012")
    private Double rateField012;

    @JsonProperty("rateField013")
    private LocalDate rateField013;

    @JsonProperty("rateField014")
    private Long rateField014;

    @JsonProperty("rateField015")
    private Boolean rateField015;

    @JsonProperty("rateField016")
    private Integer rateField016;

    public RateDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto033 instance = new RateDto033();

        public Builder rateField000(String val) { instance.rateField000 = val; return this; }
        public Builder rateField001(Integer val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Integer val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Boolean val) { instance.rateField003 = val; return this; }
        public Builder rateField004(Long val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Boolean val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Integer val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Boolean val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Double val) { instance.rateField008 = val; return this; }
        public Builder rateField009(String val) { instance.rateField009 = val; return this; }
        public Builder rateField010(String val) { instance.rateField010 = val; return this; }
        public Builder rateField011(Boolean val) { instance.rateField011 = val; return this; }
        public Builder rateField012(Double val) { instance.rateField012 = val; return this; }
        public Builder rateField013(LocalDate val) { instance.rateField013 = val; return this; }
        public Builder rateField014(Long val) { instance.rateField014 = val; return this; }
        public Builder rateField015(Boolean val) { instance.rateField015 = val; return this; }
        public Builder rateField016(Integer val) { instance.rateField016 = val; return this; }
        public RateDto033 build() { return instance; }
    }

    public String getRateField000() { return rateField000; }
    public void setRateField000(String rateField000) { this.rateField000 = rateField000; }

    public Integer getRateField001() { return rateField001; }
    public void setRateField001(Integer rateField001) { this.rateField001 = rateField001; }

    public Integer getRateField002() { return rateField002; }
    public void setRateField002(Integer rateField002) { this.rateField002 = rateField002; }

    public Boolean getRateField003() { return rateField003; }
    public void setRateField003(Boolean rateField003) { this.rateField003 = rateField003; }

    public Long getRateField004() { return rateField004; }
    public void setRateField004(Long rateField004) { this.rateField004 = rateField004; }

    public Boolean getRateField005() { return rateField005; }
    public void setRateField005(Boolean rateField005) { this.rateField005 = rateField005; }

    public Integer getRateField006() { return rateField006; }
    public void setRateField006(Integer rateField006) { this.rateField006 = rateField006; }

    public Boolean getRateField007() { return rateField007; }
    public void setRateField007(Boolean rateField007) { this.rateField007 = rateField007; }

    public Double getRateField008() { return rateField008; }
    public void setRateField008(Double rateField008) { this.rateField008 = rateField008; }

    public String getRateField009() { return rateField009; }
    public void setRateField009(String rateField009) { this.rateField009 = rateField009; }

    public String getRateField010() { return rateField010; }
    public void setRateField010(String rateField010) { this.rateField010 = rateField010; }

    public Boolean getRateField011() { return rateField011; }
    public void setRateField011(Boolean rateField011) { this.rateField011 = rateField011; }

    public Double getRateField012() { return rateField012; }
    public void setRateField012(Double rateField012) { this.rateField012 = rateField012; }

    public LocalDate getRateField013() { return rateField013; }
    public void setRateField013(LocalDate rateField013) { this.rateField013 = rateField013; }

    public Long getRateField014() { return rateField014; }
    public void setRateField014(Long rateField014) { this.rateField014 = rateField014; }

    public Boolean getRateField015() { return rateField015; }
    public void setRateField015(Boolean rateField015) { this.rateField015 = rateField015; }

    public Integer getRateField016() { return rateField016; }
    public void setRateField016(Integer rateField016) { this.rateField016 = rateField016; }

    @Override
    public String toString() {
        return "RateDto033{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
