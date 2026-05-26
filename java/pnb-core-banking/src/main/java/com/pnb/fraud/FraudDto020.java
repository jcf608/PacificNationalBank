package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto020 — Data Transfer Object for fraud operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto020 {

    @JsonProperty("frauField000")
    private LocalDate frauField000;

    @JsonProperty("frauField001")
    private Integer frauField001;

    @JsonProperty("frauField002")
    private Boolean frauField002;

    @JsonProperty("frauField003")
    private Double frauField003;

    @Size(max = 200)
    @JsonProperty("frauField004")
    private String frauField004;

    @JsonProperty("frauField005")
    private Boolean frauField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField006")
    private BigDecimal frauField006;

    @JsonProperty("frauField007")
    private Double frauField007;

    @Size(max = 200)
    @JsonProperty("frauField008")
    private String frauField008;

    @JsonProperty("frauField009")
    private Boolean frauField009;

    @JsonProperty("frauField010")
    private Double frauField010;

    @JsonProperty("frauField011")
    private Double frauField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField012")
    private BigDecimal frauField012;

    @JsonProperty("frauField013")
    private Long frauField013;

    @JsonProperty("frauField014")
    private LocalDate frauField014;

    @JsonProperty("frauField015")
    private Boolean frauField015;

    public FraudDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto020 instance = new FraudDto020();

        public Builder frauField000(LocalDate val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Integer val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Boolean val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Double val) { instance.frauField003 = val; return this; }
        public Builder frauField004(String val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Boolean val) { instance.frauField005 = val; return this; }
        public Builder frauField006(BigDecimal val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Double val) { instance.frauField007 = val; return this; }
        public Builder frauField008(String val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Boolean val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Double val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Double val) { instance.frauField011 = val; return this; }
        public Builder frauField012(BigDecimal val) { instance.frauField012 = val; return this; }
        public Builder frauField013(Long val) { instance.frauField013 = val; return this; }
        public Builder frauField014(LocalDate val) { instance.frauField014 = val; return this; }
        public Builder frauField015(Boolean val) { instance.frauField015 = val; return this; }
        public FraudDto020 build() { return instance; }
    }

    public LocalDate getFrauField000() { return frauField000; }
    public void setFrauField000(LocalDate frauField000) { this.frauField000 = frauField000; }

    public Integer getFrauField001() { return frauField001; }
    public void setFrauField001(Integer frauField001) { this.frauField001 = frauField001; }

    public Boolean getFrauField002() { return frauField002; }
    public void setFrauField002(Boolean frauField002) { this.frauField002 = frauField002; }

    public Double getFrauField003() { return frauField003; }
    public void setFrauField003(Double frauField003) { this.frauField003 = frauField003; }

    public String getFrauField004() { return frauField004; }
    public void setFrauField004(String frauField004) { this.frauField004 = frauField004; }

    public Boolean getFrauField005() { return frauField005; }
    public void setFrauField005(Boolean frauField005) { this.frauField005 = frauField005; }

    public BigDecimal getFrauField006() { return frauField006; }
    public void setFrauField006(BigDecimal frauField006) { this.frauField006 = frauField006; }

    public Double getFrauField007() { return frauField007; }
    public void setFrauField007(Double frauField007) { this.frauField007 = frauField007; }

    public String getFrauField008() { return frauField008; }
    public void setFrauField008(String frauField008) { this.frauField008 = frauField008; }

    public Boolean getFrauField009() { return frauField009; }
    public void setFrauField009(Boolean frauField009) { this.frauField009 = frauField009; }

    public Double getFrauField010() { return frauField010; }
    public void setFrauField010(Double frauField010) { this.frauField010 = frauField010; }

    public Double getFrauField011() { return frauField011; }
    public void setFrauField011(Double frauField011) { this.frauField011 = frauField011; }

    public BigDecimal getFrauField012() { return frauField012; }
    public void setFrauField012(BigDecimal frauField012) { this.frauField012 = frauField012; }

    public Long getFrauField013() { return frauField013; }
    public void setFrauField013(Long frauField013) { this.frauField013 = frauField013; }

    public LocalDate getFrauField014() { return frauField014; }
    public void setFrauField014(LocalDate frauField014) { this.frauField014 = frauField014; }

    public Boolean getFrauField015() { return frauField015; }
    public void setFrauField015(Boolean frauField015) { this.frauField015 = frauField015; }

    @Override
    public String toString() {
        return "FraudDto020{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
