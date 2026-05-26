package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto026 — Data Transfer Object for fraud operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto026 {

    @JsonProperty("frauField000")
    private Double frauField000;

    @JsonProperty("frauField001")
    private Double frauField001;

    @JsonProperty("frauField002")
    private Long frauField002;

    @JsonProperty("frauField003")
    private Integer frauField003;

    @JsonProperty("frauField004")
    private Long frauField004;

    @Size(max = 20)
    @JsonProperty("frauField005")
    private String frauField005;

    @JsonProperty("frauField006")
    private Double frauField006;

    @Size(max = 60)
    @JsonProperty("frauField007")
    private String frauField007;

    @JsonProperty("frauField008")
    private Integer frauField008;

    @JsonProperty("frauField009")
    private Boolean frauField009;

    public FraudDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto026 instance = new FraudDto026();

        public Builder frauField000(Double val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Double val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Long val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Integer val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Long val) { instance.frauField004 = val; return this; }
        public Builder frauField005(String val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Double val) { instance.frauField006 = val; return this; }
        public Builder frauField007(String val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Integer val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Boolean val) { instance.frauField009 = val; return this; }
        public FraudDto026 build() { return instance; }
    }

    public Double getFrauField000() { return frauField000; }
    public void setFrauField000(Double frauField000) { this.frauField000 = frauField000; }

    public Double getFrauField001() { return frauField001; }
    public void setFrauField001(Double frauField001) { this.frauField001 = frauField001; }

    public Long getFrauField002() { return frauField002; }
    public void setFrauField002(Long frauField002) { this.frauField002 = frauField002; }

    public Integer getFrauField003() { return frauField003; }
    public void setFrauField003(Integer frauField003) { this.frauField003 = frauField003; }

    public Long getFrauField004() { return frauField004; }
    public void setFrauField004(Long frauField004) { this.frauField004 = frauField004; }

    public String getFrauField005() { return frauField005; }
    public void setFrauField005(String frauField005) { this.frauField005 = frauField005; }

    public Double getFrauField006() { return frauField006; }
    public void setFrauField006(Double frauField006) { this.frauField006 = frauField006; }

    public String getFrauField007() { return frauField007; }
    public void setFrauField007(String frauField007) { this.frauField007 = frauField007; }

    public Integer getFrauField008() { return frauField008; }
    public void setFrauField008(Integer frauField008) { this.frauField008 = frauField008; }

    public Boolean getFrauField009() { return frauField009; }
    public void setFrauField009(Boolean frauField009) { this.frauField009 = frauField009; }

    @Override
    public String toString() {
        return "FraudDto026{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
