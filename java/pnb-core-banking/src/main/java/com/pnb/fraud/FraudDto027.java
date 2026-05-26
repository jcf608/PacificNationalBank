package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto027 — Data Transfer Object for fraud operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto027 {

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField000")
    private BigDecimal frauField000;

    @Size(max = 100)
    @JsonProperty("frauField001")
    private String frauField001;

    @JsonProperty("frauField002")
    private Boolean frauField002;

    @JsonProperty("frauField003")
    private Boolean frauField003;

    @JsonProperty("frauField004")
    private LocalDate frauField004;

    @JsonProperty("frauField005")
    private Integer frauField005;

    @JsonProperty("frauField006")
    private Double frauField006;

    @JsonProperty("frauField007")
    private Integer frauField007;

    @JsonProperty("frauField008")
    private Long frauField008;

    @JsonProperty("frauField009")
    private Boolean frauField009;

    @JsonProperty("frauField010")
    private Boolean frauField010;

    public FraudDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto027 instance = new FraudDto027();

        public Builder frauField000(BigDecimal val) { instance.frauField000 = val; return this; }
        public Builder frauField001(String val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Boolean val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Boolean val) { instance.frauField003 = val; return this; }
        public Builder frauField004(LocalDate val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Integer val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Double val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Integer val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Long val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Boolean val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Boolean val) { instance.frauField010 = val; return this; }
        public FraudDto027 build() { return instance; }
    }

    public BigDecimal getFrauField000() { return frauField000; }
    public void setFrauField000(BigDecimal frauField000) { this.frauField000 = frauField000; }

    public String getFrauField001() { return frauField001; }
    public void setFrauField001(String frauField001) { this.frauField001 = frauField001; }

    public Boolean getFrauField002() { return frauField002; }
    public void setFrauField002(Boolean frauField002) { this.frauField002 = frauField002; }

    public Boolean getFrauField003() { return frauField003; }
    public void setFrauField003(Boolean frauField003) { this.frauField003 = frauField003; }

    public LocalDate getFrauField004() { return frauField004; }
    public void setFrauField004(LocalDate frauField004) { this.frauField004 = frauField004; }

    public Integer getFrauField005() { return frauField005; }
    public void setFrauField005(Integer frauField005) { this.frauField005 = frauField005; }

    public Double getFrauField006() { return frauField006; }
    public void setFrauField006(Double frauField006) { this.frauField006 = frauField006; }

    public Integer getFrauField007() { return frauField007; }
    public void setFrauField007(Integer frauField007) { this.frauField007 = frauField007; }

    public Long getFrauField008() { return frauField008; }
    public void setFrauField008(Long frauField008) { this.frauField008 = frauField008; }

    public Boolean getFrauField009() { return frauField009; }
    public void setFrauField009(Boolean frauField009) { this.frauField009 = frauField009; }

    public Boolean getFrauField010() { return frauField010; }
    public void setFrauField010(Boolean frauField010) { this.frauField010 = frauField010; }

    @Override
    public String toString() {
        return "FraudDto027{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
