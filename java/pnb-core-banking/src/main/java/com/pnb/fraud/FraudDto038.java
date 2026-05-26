package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto038 — Data Transfer Object for fraud operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto038 {

    @JsonProperty("frauField000")
    private Long frauField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField001")
    private BigDecimal frauField001;

    @JsonProperty("frauField002")
    private Long frauField002;

    @Size(max = 60)
    @JsonProperty("frauField003")
    private String frauField003;

    @Size(max = 40)
    @JsonProperty("frauField004")
    private String frauField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField005")
    private BigDecimal frauField005;

    @Size(max = 60)
    @JsonProperty("frauField006")
    private String frauField006;

    @JsonProperty("frauField007")
    private LocalDate frauField007;

    @JsonProperty("frauField008")
    private Long frauField008;

    @Size(max = 200)
    @JsonProperty("frauField009")
    private String frauField009;

    public FraudDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto038 instance = new FraudDto038();

        public Builder frauField000(Long val) { instance.frauField000 = val; return this; }
        public Builder frauField001(BigDecimal val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Long val) { instance.frauField002 = val; return this; }
        public Builder frauField003(String val) { instance.frauField003 = val; return this; }
        public Builder frauField004(String val) { instance.frauField004 = val; return this; }
        public Builder frauField005(BigDecimal val) { instance.frauField005 = val; return this; }
        public Builder frauField006(String val) { instance.frauField006 = val; return this; }
        public Builder frauField007(LocalDate val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Long val) { instance.frauField008 = val; return this; }
        public Builder frauField009(String val) { instance.frauField009 = val; return this; }
        public FraudDto038 build() { return instance; }
    }

    public Long getFrauField000() { return frauField000; }
    public void setFrauField000(Long frauField000) { this.frauField000 = frauField000; }

    public BigDecimal getFrauField001() { return frauField001; }
    public void setFrauField001(BigDecimal frauField001) { this.frauField001 = frauField001; }

    public Long getFrauField002() { return frauField002; }
    public void setFrauField002(Long frauField002) { this.frauField002 = frauField002; }

    public String getFrauField003() { return frauField003; }
    public void setFrauField003(String frauField003) { this.frauField003 = frauField003; }

    public String getFrauField004() { return frauField004; }
    public void setFrauField004(String frauField004) { this.frauField004 = frauField004; }

    public BigDecimal getFrauField005() { return frauField005; }
    public void setFrauField005(BigDecimal frauField005) { this.frauField005 = frauField005; }

    public String getFrauField006() { return frauField006; }
    public void setFrauField006(String frauField006) { this.frauField006 = frauField006; }

    public LocalDate getFrauField007() { return frauField007; }
    public void setFrauField007(LocalDate frauField007) { this.frauField007 = frauField007; }

    public Long getFrauField008() { return frauField008; }
    public void setFrauField008(Long frauField008) { this.frauField008 = frauField008; }

    public String getFrauField009() { return frauField009; }
    public void setFrauField009(String frauField009) { this.frauField009 = frauField009; }

    @Override
    public String toString() {
        return "FraudDto038{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
