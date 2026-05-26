package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto033 — Data Transfer Object for fraud operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto033 {

    @JsonProperty("frauField000")
    private Long frauField000;

    @JsonProperty("frauField001")
    private LocalDate frauField001;

    @Size(max = 20)
    @JsonProperty("frauField002")
    private String frauField002;

    @Size(max = 100)
    @JsonProperty("frauField003")
    private String frauField003;

    @JsonProperty("frauField004")
    private Double frauField004;

    @JsonProperty("frauField005")
    private Long frauField005;

    @Size(max = 20)
    @JsonProperty("frauField006")
    private String frauField006;

    @JsonProperty("frauField007")
    private LocalDate frauField007;

    @JsonProperty("frauField008")
    private Boolean frauField008;

    @JsonProperty("frauField009")
    private Double frauField009;

    @JsonProperty("frauField010")
    private Boolean frauField010;

    @JsonProperty("frauField011")
    private LocalDate frauField011;

    @JsonProperty("frauField012")
    private Double frauField012;

    @JsonProperty("frauField013")
    private LocalDate frauField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField014")
    private BigDecimal frauField014;

    @JsonProperty("frauField015")
    private LocalDate frauField015;

    @JsonProperty("frauField016")
    private Double frauField016;

    public FraudDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto033 instance = new FraudDto033();

        public Builder frauField000(Long val) { instance.frauField000 = val; return this; }
        public Builder frauField001(LocalDate val) { instance.frauField001 = val; return this; }
        public Builder frauField002(String val) { instance.frauField002 = val; return this; }
        public Builder frauField003(String val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Double val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Long val) { instance.frauField005 = val; return this; }
        public Builder frauField006(String val) { instance.frauField006 = val; return this; }
        public Builder frauField007(LocalDate val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Boolean val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Double val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Boolean val) { instance.frauField010 = val; return this; }
        public Builder frauField011(LocalDate val) { instance.frauField011 = val; return this; }
        public Builder frauField012(Double val) { instance.frauField012 = val; return this; }
        public Builder frauField013(LocalDate val) { instance.frauField013 = val; return this; }
        public Builder frauField014(BigDecimal val) { instance.frauField014 = val; return this; }
        public Builder frauField015(LocalDate val) { instance.frauField015 = val; return this; }
        public Builder frauField016(Double val) { instance.frauField016 = val; return this; }
        public FraudDto033 build() { return instance; }
    }

    public Long getFrauField000() { return frauField000; }
    public void setFrauField000(Long frauField000) { this.frauField000 = frauField000; }

    public LocalDate getFrauField001() { return frauField001; }
    public void setFrauField001(LocalDate frauField001) { this.frauField001 = frauField001; }

    public String getFrauField002() { return frauField002; }
    public void setFrauField002(String frauField002) { this.frauField002 = frauField002; }

    public String getFrauField003() { return frauField003; }
    public void setFrauField003(String frauField003) { this.frauField003 = frauField003; }

    public Double getFrauField004() { return frauField004; }
    public void setFrauField004(Double frauField004) { this.frauField004 = frauField004; }

    public Long getFrauField005() { return frauField005; }
    public void setFrauField005(Long frauField005) { this.frauField005 = frauField005; }

    public String getFrauField006() { return frauField006; }
    public void setFrauField006(String frauField006) { this.frauField006 = frauField006; }

    public LocalDate getFrauField007() { return frauField007; }
    public void setFrauField007(LocalDate frauField007) { this.frauField007 = frauField007; }

    public Boolean getFrauField008() { return frauField008; }
    public void setFrauField008(Boolean frauField008) { this.frauField008 = frauField008; }

    public Double getFrauField009() { return frauField009; }
    public void setFrauField009(Double frauField009) { this.frauField009 = frauField009; }

    public Boolean getFrauField010() { return frauField010; }
    public void setFrauField010(Boolean frauField010) { this.frauField010 = frauField010; }

    public LocalDate getFrauField011() { return frauField011; }
    public void setFrauField011(LocalDate frauField011) { this.frauField011 = frauField011; }

    public Double getFrauField012() { return frauField012; }
    public void setFrauField012(Double frauField012) { this.frauField012 = frauField012; }

    public LocalDate getFrauField013() { return frauField013; }
    public void setFrauField013(LocalDate frauField013) { this.frauField013 = frauField013; }

    public BigDecimal getFrauField014() { return frauField014; }
    public void setFrauField014(BigDecimal frauField014) { this.frauField014 = frauField014; }

    public LocalDate getFrauField015() { return frauField015; }
    public void setFrauField015(LocalDate frauField015) { this.frauField015 = frauField015; }

    public Double getFrauField016() { return frauField016; }
    public void setFrauField016(Double frauField016) { this.frauField016 = frauField016; }

    @Override
    public String toString() {
        return "FraudDto033{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
