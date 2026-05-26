package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto039 — Data Transfer Object for fraud operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto039 {

    @JsonProperty("frauField000")
    private Integer frauField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField001")
    private BigDecimal frauField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField002")
    private BigDecimal frauField002;

    @JsonProperty("frauField003")
    private Integer frauField003;

    @JsonProperty("frauField004")
    private Long frauField004;

    @Size(max = 60)
    @JsonProperty("frauField005")
    private String frauField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField006")
    private BigDecimal frauField006;

    @JsonProperty("frauField007")
    private Integer frauField007;

    @JsonProperty("frauField008")
    private Double frauField008;

    @JsonProperty("frauField009")
    private Long frauField009;

    @JsonProperty("frauField010")
    private Integer frauField010;

    public FraudDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto039 instance = new FraudDto039();

        public Builder frauField000(Integer val) { instance.frauField000 = val; return this; }
        public Builder frauField001(BigDecimal val) { instance.frauField001 = val; return this; }
        public Builder frauField002(BigDecimal val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Integer val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Long val) { instance.frauField004 = val; return this; }
        public Builder frauField005(String val) { instance.frauField005 = val; return this; }
        public Builder frauField006(BigDecimal val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Integer val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Double val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Long val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Integer val) { instance.frauField010 = val; return this; }
        public FraudDto039 build() { return instance; }
    }

    public Integer getFrauField000() { return frauField000; }
    public void setFrauField000(Integer frauField000) { this.frauField000 = frauField000; }

    public BigDecimal getFrauField001() { return frauField001; }
    public void setFrauField001(BigDecimal frauField001) { this.frauField001 = frauField001; }

    public BigDecimal getFrauField002() { return frauField002; }
    public void setFrauField002(BigDecimal frauField002) { this.frauField002 = frauField002; }

    public Integer getFrauField003() { return frauField003; }
    public void setFrauField003(Integer frauField003) { this.frauField003 = frauField003; }

    public Long getFrauField004() { return frauField004; }
    public void setFrauField004(Long frauField004) { this.frauField004 = frauField004; }

    public String getFrauField005() { return frauField005; }
    public void setFrauField005(String frauField005) { this.frauField005 = frauField005; }

    public BigDecimal getFrauField006() { return frauField006; }
    public void setFrauField006(BigDecimal frauField006) { this.frauField006 = frauField006; }

    public Integer getFrauField007() { return frauField007; }
    public void setFrauField007(Integer frauField007) { this.frauField007 = frauField007; }

    public Double getFrauField008() { return frauField008; }
    public void setFrauField008(Double frauField008) { this.frauField008 = frauField008; }

    public Long getFrauField009() { return frauField009; }
    public void setFrauField009(Long frauField009) { this.frauField009 = frauField009; }

    public Integer getFrauField010() { return frauField010; }
    public void setFrauField010(Integer frauField010) { this.frauField010 = frauField010; }

    @Override
    public String toString() {
        return "FraudDto039{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
