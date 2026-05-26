package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto036 — Data Transfer Object for fraud operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto036 {

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField000")
    private BigDecimal frauField000;

    @Size(max = 60)
    @JsonProperty("frauField001")
    private String frauField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField002")
    private BigDecimal frauField002;

    @JsonProperty("frauField003")
    private Double frauField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField004")
    private BigDecimal frauField004;

    @JsonProperty("frauField005")
    private LocalDate frauField005;

    @JsonProperty("frauField006")
    private LocalDate frauField006;

    @Size(max = 40)
    @JsonProperty("frauField007")
    private String frauField007;

    public FraudDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto036 instance = new FraudDto036();

        public Builder frauField000(BigDecimal val) { instance.frauField000 = val; return this; }
        public Builder frauField001(String val) { instance.frauField001 = val; return this; }
        public Builder frauField002(BigDecimal val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Double val) { instance.frauField003 = val; return this; }
        public Builder frauField004(BigDecimal val) { instance.frauField004 = val; return this; }
        public Builder frauField005(LocalDate val) { instance.frauField005 = val; return this; }
        public Builder frauField006(LocalDate val) { instance.frauField006 = val; return this; }
        public Builder frauField007(String val) { instance.frauField007 = val; return this; }
        public FraudDto036 build() { return instance; }
    }

    public BigDecimal getFrauField000() { return frauField000; }
    public void setFrauField000(BigDecimal frauField000) { this.frauField000 = frauField000; }

    public String getFrauField001() { return frauField001; }
    public void setFrauField001(String frauField001) { this.frauField001 = frauField001; }

    public BigDecimal getFrauField002() { return frauField002; }
    public void setFrauField002(BigDecimal frauField002) { this.frauField002 = frauField002; }

    public Double getFrauField003() { return frauField003; }
    public void setFrauField003(Double frauField003) { this.frauField003 = frauField003; }

    public BigDecimal getFrauField004() { return frauField004; }
    public void setFrauField004(BigDecimal frauField004) { this.frauField004 = frauField004; }

    public LocalDate getFrauField005() { return frauField005; }
    public void setFrauField005(LocalDate frauField005) { this.frauField005 = frauField005; }

    public LocalDate getFrauField006() { return frauField006; }
    public void setFrauField006(LocalDate frauField006) { this.frauField006 = frauField006; }

    public String getFrauField007() { return frauField007; }
    public void setFrauField007(String frauField007) { this.frauField007 = frauField007; }

    @Override
    public String toString() {
        return "FraudDto036{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
