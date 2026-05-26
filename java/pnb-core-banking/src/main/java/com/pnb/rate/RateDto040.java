package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto040 — Data Transfer Object for rate operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto040 {

    @JsonProperty("rateField000")
    private Integer rateField000;

    @Size(max = 100)
    @JsonProperty("rateField001")
    private String rateField001;

    @JsonProperty("rateField002")
    private Integer rateField002;

    @JsonProperty("rateField003")
    private Integer rateField003;

    @JsonProperty("rateField004")
    private LocalDate rateField004;

    @JsonProperty("rateField005")
    private Integer rateField005;

    @Size(max = 100)
    @JsonProperty("rateField006")
    private String rateField006;

    @JsonProperty("rateField007")
    private Long rateField007;

    @JsonProperty("rateField008")
    private Long rateField008;

    @JsonProperty("rateField009")
    private Double rateField009;

    @JsonProperty("rateField010")
    private Double rateField010;

    @JsonProperty("rateField011")
    private Double rateField011;

    public RateDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto040 instance = new RateDto040();

        public Builder rateField000(Integer val) { instance.rateField000 = val; return this; }
        public Builder rateField001(String val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Integer val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Integer val) { instance.rateField003 = val; return this; }
        public Builder rateField004(LocalDate val) { instance.rateField004 = val; return this; }
        public Builder rateField005(Integer val) { instance.rateField005 = val; return this; }
        public Builder rateField006(String val) { instance.rateField006 = val; return this; }
        public Builder rateField007(Long val) { instance.rateField007 = val; return this; }
        public Builder rateField008(Long val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Double val) { instance.rateField009 = val; return this; }
        public Builder rateField010(Double val) { instance.rateField010 = val; return this; }
        public Builder rateField011(Double val) { instance.rateField011 = val; return this; }
        public RateDto040 build() { return instance; }
    }

    public Integer getRateField000() { return rateField000; }
    public void setRateField000(Integer rateField000) { this.rateField000 = rateField000; }

    public String getRateField001() { return rateField001; }
    public void setRateField001(String rateField001) { this.rateField001 = rateField001; }

    public Integer getRateField002() { return rateField002; }
    public void setRateField002(Integer rateField002) { this.rateField002 = rateField002; }

    public Integer getRateField003() { return rateField003; }
    public void setRateField003(Integer rateField003) { this.rateField003 = rateField003; }

    public LocalDate getRateField004() { return rateField004; }
    public void setRateField004(LocalDate rateField004) { this.rateField004 = rateField004; }

    public Integer getRateField005() { return rateField005; }
    public void setRateField005(Integer rateField005) { this.rateField005 = rateField005; }

    public String getRateField006() { return rateField006; }
    public void setRateField006(String rateField006) { this.rateField006 = rateField006; }

    public Long getRateField007() { return rateField007; }
    public void setRateField007(Long rateField007) { this.rateField007 = rateField007; }

    public Long getRateField008() { return rateField008; }
    public void setRateField008(Long rateField008) { this.rateField008 = rateField008; }

    public Double getRateField009() { return rateField009; }
    public void setRateField009(Double rateField009) { this.rateField009 = rateField009; }

    public Double getRateField010() { return rateField010; }
    public void setRateField010(Double rateField010) { this.rateField010 = rateField010; }

    public Double getRateField011() { return rateField011; }
    public void setRateField011(Double rateField011) { this.rateField011 = rateField011; }

    @Override
    public String toString() {
        return "RateDto040{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
