package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto044 — Data Transfer Object for fraud operations.
 * Variant 44 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto044 {

    @JsonProperty("frauField000")
    private Long frauField000;

    @JsonProperty("frauField001")
    private Double frauField001;

    @Size(max = 200)
    @JsonProperty("frauField002")
    private String frauField002;

    @JsonProperty("frauField003")
    private LocalDate frauField003;

    @JsonProperty("frauField004")
    private Boolean frauField004;

    @JsonProperty("frauField005")
    private Long frauField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField006")
    private BigDecimal frauField006;

    @JsonProperty("frauField007")
    private Long frauField007;

    @JsonProperty("frauField008")
    private Double frauField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField009")
    private BigDecimal frauField009;

    @Size(max = 40)
    @JsonProperty("frauField010")
    private String frauField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField011")
    private BigDecimal frauField011;

    @JsonProperty("frauField012")
    private LocalDate frauField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField013")
    private BigDecimal frauField013;

    @JsonProperty("frauField014")
    private LocalDate frauField014;

    @JsonProperty("frauField015")
    private Double frauField015;

    public FraudDto044() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto044 instance = new FraudDto044();

        public Builder frauField000(Long val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Double val) { instance.frauField001 = val; return this; }
        public Builder frauField002(String val) { instance.frauField002 = val; return this; }
        public Builder frauField003(LocalDate val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Boolean val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Long val) { instance.frauField005 = val; return this; }
        public Builder frauField006(BigDecimal val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Long val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Double val) { instance.frauField008 = val; return this; }
        public Builder frauField009(BigDecimal val) { instance.frauField009 = val; return this; }
        public Builder frauField010(String val) { instance.frauField010 = val; return this; }
        public Builder frauField011(BigDecimal val) { instance.frauField011 = val; return this; }
        public Builder frauField012(LocalDate val) { instance.frauField012 = val; return this; }
        public Builder frauField013(BigDecimal val) { instance.frauField013 = val; return this; }
        public Builder frauField014(LocalDate val) { instance.frauField014 = val; return this; }
        public Builder frauField015(Double val) { instance.frauField015 = val; return this; }
        public FraudDto044 build() { return instance; }
    }

    public Long getFrauField000() { return frauField000; }
    public void setFrauField000(Long frauField000) { this.frauField000 = frauField000; }

    public Double getFrauField001() { return frauField001; }
    public void setFrauField001(Double frauField001) { this.frauField001 = frauField001; }

    public String getFrauField002() { return frauField002; }
    public void setFrauField002(String frauField002) { this.frauField002 = frauField002; }

    public LocalDate getFrauField003() { return frauField003; }
    public void setFrauField003(LocalDate frauField003) { this.frauField003 = frauField003; }

    public Boolean getFrauField004() { return frauField004; }
    public void setFrauField004(Boolean frauField004) { this.frauField004 = frauField004; }

    public Long getFrauField005() { return frauField005; }
    public void setFrauField005(Long frauField005) { this.frauField005 = frauField005; }

    public BigDecimal getFrauField006() { return frauField006; }
    public void setFrauField006(BigDecimal frauField006) { this.frauField006 = frauField006; }

    public Long getFrauField007() { return frauField007; }
    public void setFrauField007(Long frauField007) { this.frauField007 = frauField007; }

    public Double getFrauField008() { return frauField008; }
    public void setFrauField008(Double frauField008) { this.frauField008 = frauField008; }

    public BigDecimal getFrauField009() { return frauField009; }
    public void setFrauField009(BigDecimal frauField009) { this.frauField009 = frauField009; }

    public String getFrauField010() { return frauField010; }
    public void setFrauField010(String frauField010) { this.frauField010 = frauField010; }

    public BigDecimal getFrauField011() { return frauField011; }
    public void setFrauField011(BigDecimal frauField011) { this.frauField011 = frauField011; }

    public LocalDate getFrauField012() { return frauField012; }
    public void setFrauField012(LocalDate frauField012) { this.frauField012 = frauField012; }

    public BigDecimal getFrauField013() { return frauField013; }
    public void setFrauField013(BigDecimal frauField013) { this.frauField013 = frauField013; }

    public LocalDate getFrauField014() { return frauField014; }
    public void setFrauField014(LocalDate frauField014) { this.frauField014 = frauField014; }

    public Double getFrauField015() { return frauField015; }
    public void setFrauField015(Double frauField015) { this.frauField015 = frauField015; }

    @Override
    public String toString() {
        return "FraudDto044{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
