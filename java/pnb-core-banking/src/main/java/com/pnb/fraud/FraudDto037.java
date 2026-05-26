package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto037 — Data Transfer Object for fraud operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto037 {

    @Size(max = 200)
    @JsonProperty("frauField000")
    private String frauField000;

    @JsonProperty("frauField001")
    private Long frauField001;

    @JsonProperty("frauField002")
    private Boolean frauField002;

    @JsonProperty("frauField003")
    private Boolean frauField003;

    @JsonProperty("frauField004")
    private Integer frauField004;

    @JsonProperty("frauField005")
    private Boolean frauField005;

    @JsonProperty("frauField006")
    private Long frauField006;

    @JsonProperty("frauField007")
    private Boolean frauField007;

    @JsonProperty("frauField008")
    private Integer frauField008;

    public FraudDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto037 instance = new FraudDto037();

        public Builder frauField000(String val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Long val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Boolean val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Boolean val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Integer val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Boolean val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Long val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Boolean val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Integer val) { instance.frauField008 = val; return this; }
        public FraudDto037 build() { return instance; }
    }

    public String getFrauField000() { return frauField000; }
    public void setFrauField000(String frauField000) { this.frauField000 = frauField000; }

    public Long getFrauField001() { return frauField001; }
    public void setFrauField001(Long frauField001) { this.frauField001 = frauField001; }

    public Boolean getFrauField002() { return frauField002; }
    public void setFrauField002(Boolean frauField002) { this.frauField002 = frauField002; }

    public Boolean getFrauField003() { return frauField003; }
    public void setFrauField003(Boolean frauField003) { this.frauField003 = frauField003; }

    public Integer getFrauField004() { return frauField004; }
    public void setFrauField004(Integer frauField004) { this.frauField004 = frauField004; }

    public Boolean getFrauField005() { return frauField005; }
    public void setFrauField005(Boolean frauField005) { this.frauField005 = frauField005; }

    public Long getFrauField006() { return frauField006; }
    public void setFrauField006(Long frauField006) { this.frauField006 = frauField006; }

    public Boolean getFrauField007() { return frauField007; }
    public void setFrauField007(Boolean frauField007) { this.frauField007 = frauField007; }

    public Integer getFrauField008() { return frauField008; }
    public void setFrauField008(Integer frauField008) { this.frauField008 = frauField008; }

    @Override
    public String toString() {
        return "FraudDto037{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
