package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto052 — Data Transfer Object for fraud operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto052 {

    @JsonProperty("frauField000")
    private Long frauField000;

    @JsonProperty("frauField001")
    private Integer frauField001;

    @JsonProperty("frauField002")
    private Long frauField002;

    @JsonProperty("frauField003")
    private LocalDate frauField003;

    @JsonProperty("frauField004")
    private Double frauField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField005")
    private BigDecimal frauField005;

    @JsonProperty("frauField006")
    private Long frauField006;

    @JsonProperty("frauField007")
    private Integer frauField007;

    @JsonProperty("frauField008")
    private Integer frauField008;

    @JsonProperty("frauField009")
    private Double frauField009;

    @JsonProperty("frauField010")
    private Double frauField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField011")
    private BigDecimal frauField011;

    public FraudDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto052 instance = new FraudDto052();

        public Builder frauField000(Long val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Integer val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Long val) { instance.frauField002 = val; return this; }
        public Builder frauField003(LocalDate val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Double val) { instance.frauField004 = val; return this; }
        public Builder frauField005(BigDecimal val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Long val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Integer val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Integer val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Double val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Double val) { instance.frauField010 = val; return this; }
        public Builder frauField011(BigDecimal val) { instance.frauField011 = val; return this; }
        public FraudDto052 build() { return instance; }
    }

    public Long getFrauField000() { return frauField000; }
    public void setFrauField000(Long frauField000) { this.frauField000 = frauField000; }

    public Integer getFrauField001() { return frauField001; }
    public void setFrauField001(Integer frauField001) { this.frauField001 = frauField001; }

    public Long getFrauField002() { return frauField002; }
    public void setFrauField002(Long frauField002) { this.frauField002 = frauField002; }

    public LocalDate getFrauField003() { return frauField003; }
    public void setFrauField003(LocalDate frauField003) { this.frauField003 = frauField003; }

    public Double getFrauField004() { return frauField004; }
    public void setFrauField004(Double frauField004) { this.frauField004 = frauField004; }

    public BigDecimal getFrauField005() { return frauField005; }
    public void setFrauField005(BigDecimal frauField005) { this.frauField005 = frauField005; }

    public Long getFrauField006() { return frauField006; }
    public void setFrauField006(Long frauField006) { this.frauField006 = frauField006; }

    public Integer getFrauField007() { return frauField007; }
    public void setFrauField007(Integer frauField007) { this.frauField007 = frauField007; }

    public Integer getFrauField008() { return frauField008; }
    public void setFrauField008(Integer frauField008) { this.frauField008 = frauField008; }

    public Double getFrauField009() { return frauField009; }
    public void setFrauField009(Double frauField009) { this.frauField009 = frauField009; }

    public Double getFrauField010() { return frauField010; }
    public void setFrauField010(Double frauField010) { this.frauField010 = frauField010; }

    public BigDecimal getFrauField011() { return frauField011; }
    public void setFrauField011(BigDecimal frauField011) { this.frauField011 = frauField011; }

    @Override
    public String toString() {
        return "FraudDto052{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
