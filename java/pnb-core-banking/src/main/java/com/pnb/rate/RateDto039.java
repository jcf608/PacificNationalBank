package com.pnb.rate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * RateDto039 — Data Transfer Object for rate operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateDto039 {

    @JsonProperty("rateField000")
    private Double rateField000;

    @Size(max = 100)
    @JsonProperty("rateField001")
    private String rateField001;

    @JsonProperty("rateField002")
    private Long rateField002;

    @JsonProperty("rateField003")
    private Long rateField003;

    @JsonProperty("rateField004")
    private LocalDate rateField004;

    @JsonProperty("rateField005")
    private LocalDate rateField005;

    @JsonProperty("rateField006")
    private Integer rateField006;

    @Size(max = 100)
    @JsonProperty("rateField007")
    private String rateField007;

    @JsonProperty("rateField008")
    private LocalDate rateField008;

    @JsonProperty("rateField009")
    private Boolean rateField009;

    @JsonProperty("rateField010")
    private LocalDate rateField010;

    public RateDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final RateDto039 instance = new RateDto039();

        public Builder rateField000(Double val) { instance.rateField000 = val; return this; }
        public Builder rateField001(String val) { instance.rateField001 = val; return this; }
        public Builder rateField002(Long val) { instance.rateField002 = val; return this; }
        public Builder rateField003(Long val) { instance.rateField003 = val; return this; }
        public Builder rateField004(LocalDate val) { instance.rateField004 = val; return this; }
        public Builder rateField005(LocalDate val) { instance.rateField005 = val; return this; }
        public Builder rateField006(Integer val) { instance.rateField006 = val; return this; }
        public Builder rateField007(String val) { instance.rateField007 = val; return this; }
        public Builder rateField008(LocalDate val) { instance.rateField008 = val; return this; }
        public Builder rateField009(Boolean val) { instance.rateField009 = val; return this; }
        public Builder rateField010(LocalDate val) { instance.rateField010 = val; return this; }
        public RateDto039 build() { return instance; }
    }

    public Double getRateField000() { return rateField000; }
    public void setRateField000(Double rateField000) { this.rateField000 = rateField000; }

    public String getRateField001() { return rateField001; }
    public void setRateField001(String rateField001) { this.rateField001 = rateField001; }

    public Long getRateField002() { return rateField002; }
    public void setRateField002(Long rateField002) { this.rateField002 = rateField002; }

    public Long getRateField003() { return rateField003; }
    public void setRateField003(Long rateField003) { this.rateField003 = rateField003; }

    public LocalDate getRateField004() { return rateField004; }
    public void setRateField004(LocalDate rateField004) { this.rateField004 = rateField004; }

    public LocalDate getRateField005() { return rateField005; }
    public void setRateField005(LocalDate rateField005) { this.rateField005 = rateField005; }

    public Integer getRateField006() { return rateField006; }
    public void setRateField006(Integer rateField006) { this.rateField006 = rateField006; }

    public String getRateField007() { return rateField007; }
    public void setRateField007(String rateField007) { this.rateField007 = rateField007; }

    public LocalDate getRateField008() { return rateField008; }
    public void setRateField008(LocalDate rateField008) { this.rateField008 = rateField008; }

    public Boolean getRateField009() { return rateField009; }
    public void setRateField009(Boolean rateField009) { this.rateField009 = rateField009; }

    public LocalDate getRateField010() { return rateField010; }
    public void setRateField010(LocalDate rateField010) { this.rateField010 = rateField010; }

    @Override
    public String toString() {
        return "RateDto039{" +
            "rateField000=" + rateField000 + ", " +
            "rateField001=" + rateField001 + ", " +
            "rateField002=" + rateField002 + ", " +
            "rateField003=" + rateField003 + ", " +
            "rateField004=" + rateField004 + ", " +
            "}";
    }
}
