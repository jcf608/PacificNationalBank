package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto051 — Data Transfer Object for fraud operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto051 {

    @JsonProperty("frauField000")
    private Long frauField000;

    @JsonProperty("frauField001")
    private Double frauField001;

    @JsonProperty("frauField002")
    private LocalDate frauField002;

    @JsonProperty("frauField003")
    private Double frauField003;

    @JsonProperty("frauField004")
    private LocalDate frauField004;

    @JsonProperty("frauField005")
    private Double frauField005;

    @JsonProperty("frauField006")
    private Boolean frauField006;

    @JsonProperty("frauField007")
    private Boolean frauField007;

    @JsonProperty("frauField008")
    private Double frauField008;

    @JsonProperty("frauField009")
    private LocalDate frauField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField010")
    private BigDecimal frauField010;

    public FraudDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto051 instance = new FraudDto051();

        public Builder frauField000(Long val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Double val) { instance.frauField001 = val; return this; }
        public Builder frauField002(LocalDate val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Double val) { instance.frauField003 = val; return this; }
        public Builder frauField004(LocalDate val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Double val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Boolean val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Boolean val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Double val) { instance.frauField008 = val; return this; }
        public Builder frauField009(LocalDate val) { instance.frauField009 = val; return this; }
        public Builder frauField010(BigDecimal val) { instance.frauField010 = val; return this; }
        public FraudDto051 build() { return instance; }
    }

    public Long getFrauField000() { return frauField000; }
    public void setFrauField000(Long frauField000) { this.frauField000 = frauField000; }

    public Double getFrauField001() { return frauField001; }
    public void setFrauField001(Double frauField001) { this.frauField001 = frauField001; }

    public LocalDate getFrauField002() { return frauField002; }
    public void setFrauField002(LocalDate frauField002) { this.frauField002 = frauField002; }

    public Double getFrauField003() { return frauField003; }
    public void setFrauField003(Double frauField003) { this.frauField003 = frauField003; }

    public LocalDate getFrauField004() { return frauField004; }
    public void setFrauField004(LocalDate frauField004) { this.frauField004 = frauField004; }

    public Double getFrauField005() { return frauField005; }
    public void setFrauField005(Double frauField005) { this.frauField005 = frauField005; }

    public Boolean getFrauField006() { return frauField006; }
    public void setFrauField006(Boolean frauField006) { this.frauField006 = frauField006; }

    public Boolean getFrauField007() { return frauField007; }
    public void setFrauField007(Boolean frauField007) { this.frauField007 = frauField007; }

    public Double getFrauField008() { return frauField008; }
    public void setFrauField008(Double frauField008) { this.frauField008 = frauField008; }

    public LocalDate getFrauField009() { return frauField009; }
    public void setFrauField009(LocalDate frauField009) { this.frauField009 = frauField009; }

    public BigDecimal getFrauField010() { return frauField010; }
    public void setFrauField010(BigDecimal frauField010) { this.frauField010 = frauField010; }

    @Override
    public String toString() {
        return "FraudDto051{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
