package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto049 — Data Transfer Object for fraud operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto049 {

    @JsonProperty("frauField000")
    private Double frauField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField001")
    private BigDecimal frauField001;

    @JsonProperty("frauField002")
    private Integer frauField002;

    @JsonProperty("frauField003")
    private Double frauField003;

    @Size(max = 200)
    @JsonProperty("frauField004")
    private String frauField004;

    @Size(max = 60)
    @JsonProperty("frauField005")
    private String frauField005;

    @Size(max = 40)
    @JsonProperty("frauField006")
    private String frauField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField007")
    private BigDecimal frauField007;

    @JsonProperty("frauField008")
    private Long frauField008;

    public FraudDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto049 instance = new FraudDto049();

        public Builder frauField000(Double val) { instance.frauField000 = val; return this; }
        public Builder frauField001(BigDecimal val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Integer val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Double val) { instance.frauField003 = val; return this; }
        public Builder frauField004(String val) { instance.frauField004 = val; return this; }
        public Builder frauField005(String val) { instance.frauField005 = val; return this; }
        public Builder frauField006(String val) { instance.frauField006 = val; return this; }
        public Builder frauField007(BigDecimal val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Long val) { instance.frauField008 = val; return this; }
        public FraudDto049 build() { return instance; }
    }

    public Double getFrauField000() { return frauField000; }
    public void setFrauField000(Double frauField000) { this.frauField000 = frauField000; }

    public BigDecimal getFrauField001() { return frauField001; }
    public void setFrauField001(BigDecimal frauField001) { this.frauField001 = frauField001; }

    public Integer getFrauField002() { return frauField002; }
    public void setFrauField002(Integer frauField002) { this.frauField002 = frauField002; }

    public Double getFrauField003() { return frauField003; }
    public void setFrauField003(Double frauField003) { this.frauField003 = frauField003; }

    public String getFrauField004() { return frauField004; }
    public void setFrauField004(String frauField004) { this.frauField004 = frauField004; }

    public String getFrauField005() { return frauField005; }
    public void setFrauField005(String frauField005) { this.frauField005 = frauField005; }

    public String getFrauField006() { return frauField006; }
    public void setFrauField006(String frauField006) { this.frauField006 = frauField006; }

    public BigDecimal getFrauField007() { return frauField007; }
    public void setFrauField007(BigDecimal frauField007) { this.frauField007 = frauField007; }

    public Long getFrauField008() { return frauField008; }
    public void setFrauField008(Long frauField008) { this.frauField008 = frauField008; }

    @Override
    public String toString() {
        return "FraudDto049{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
