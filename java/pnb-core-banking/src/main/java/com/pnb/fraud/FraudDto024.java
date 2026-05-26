package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto024 — Data Transfer Object for fraud operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto024 {

    @Size(max = 20)
    @JsonProperty("frauField000")
    private String frauField000;

    @JsonProperty("frauField001")
    private Boolean frauField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField002")
    private BigDecimal frauField002;

    @JsonProperty("frauField003")
    private Integer frauField003;

    @JsonProperty("frauField004")
    private Boolean frauField004;

    @JsonProperty("frauField005")
    private Integer frauField005;

    @JsonProperty("frauField006")
    private Integer frauField006;

    @JsonProperty("frauField007")
    private LocalDate frauField007;

    public FraudDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto024 instance = new FraudDto024();

        public Builder frauField000(String val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Boolean val) { instance.frauField001 = val; return this; }
        public Builder frauField002(BigDecimal val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Integer val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Boolean val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Integer val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Integer val) { instance.frauField006 = val; return this; }
        public Builder frauField007(LocalDate val) { instance.frauField007 = val; return this; }
        public FraudDto024 build() { return instance; }
    }

    public String getFrauField000() { return frauField000; }
    public void setFrauField000(String frauField000) { this.frauField000 = frauField000; }

    public Boolean getFrauField001() { return frauField001; }
    public void setFrauField001(Boolean frauField001) { this.frauField001 = frauField001; }

    public BigDecimal getFrauField002() { return frauField002; }
    public void setFrauField002(BigDecimal frauField002) { this.frauField002 = frauField002; }

    public Integer getFrauField003() { return frauField003; }
    public void setFrauField003(Integer frauField003) { this.frauField003 = frauField003; }

    public Boolean getFrauField004() { return frauField004; }
    public void setFrauField004(Boolean frauField004) { this.frauField004 = frauField004; }

    public Integer getFrauField005() { return frauField005; }
    public void setFrauField005(Integer frauField005) { this.frauField005 = frauField005; }

    public Integer getFrauField006() { return frauField006; }
    public void setFrauField006(Integer frauField006) { this.frauField006 = frauField006; }

    public LocalDate getFrauField007() { return frauField007; }
    public void setFrauField007(LocalDate frauField007) { this.frauField007 = frauField007; }

    @Override
    public String toString() {
        return "FraudDto024{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
