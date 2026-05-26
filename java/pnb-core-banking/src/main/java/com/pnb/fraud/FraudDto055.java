package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto055 — Data Transfer Object for fraud operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto055 {

    @JsonProperty("frauField000")
    private Double frauField000;

    @Size(max = 20)
    @JsonProperty("frauField001")
    private String frauField001;

    @JsonProperty("frauField002")
    private LocalDate frauField002;

    @Size(max = 200)
    @JsonProperty("frauField003")
    private String frauField003;

    @JsonProperty("frauField004")
    private Integer frauField004;

    @JsonProperty("frauField005")
    private LocalDate frauField005;

    @JsonProperty("frauField006")
    private Double frauField006;

    @JsonProperty("frauField007")
    private Double frauField007;

    @JsonProperty("frauField008")
    private Integer frauField008;

    @JsonProperty("frauField009")
    private Long frauField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField010")
    private BigDecimal frauField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField011")
    private BigDecimal frauField011;

    @JsonProperty("frauField012")
    private Boolean frauField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField013")
    private BigDecimal frauField013;

    @JsonProperty("frauField014")
    private Integer frauField014;

    public FraudDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto055 instance = new FraudDto055();

        public Builder frauField000(Double val) { instance.frauField000 = val; return this; }
        public Builder frauField001(String val) { instance.frauField001 = val; return this; }
        public Builder frauField002(LocalDate val) { instance.frauField002 = val; return this; }
        public Builder frauField003(String val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Integer val) { instance.frauField004 = val; return this; }
        public Builder frauField005(LocalDate val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Double val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Double val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Integer val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Long val) { instance.frauField009 = val; return this; }
        public Builder frauField010(BigDecimal val) { instance.frauField010 = val; return this; }
        public Builder frauField011(BigDecimal val) { instance.frauField011 = val; return this; }
        public Builder frauField012(Boolean val) { instance.frauField012 = val; return this; }
        public Builder frauField013(BigDecimal val) { instance.frauField013 = val; return this; }
        public Builder frauField014(Integer val) { instance.frauField014 = val; return this; }
        public FraudDto055 build() { return instance; }
    }

    public Double getFrauField000() { return frauField000; }
    public void setFrauField000(Double frauField000) { this.frauField000 = frauField000; }

    public String getFrauField001() { return frauField001; }
    public void setFrauField001(String frauField001) { this.frauField001 = frauField001; }

    public LocalDate getFrauField002() { return frauField002; }
    public void setFrauField002(LocalDate frauField002) { this.frauField002 = frauField002; }

    public String getFrauField003() { return frauField003; }
    public void setFrauField003(String frauField003) { this.frauField003 = frauField003; }

    public Integer getFrauField004() { return frauField004; }
    public void setFrauField004(Integer frauField004) { this.frauField004 = frauField004; }

    public LocalDate getFrauField005() { return frauField005; }
    public void setFrauField005(LocalDate frauField005) { this.frauField005 = frauField005; }

    public Double getFrauField006() { return frauField006; }
    public void setFrauField006(Double frauField006) { this.frauField006 = frauField006; }

    public Double getFrauField007() { return frauField007; }
    public void setFrauField007(Double frauField007) { this.frauField007 = frauField007; }

    public Integer getFrauField008() { return frauField008; }
    public void setFrauField008(Integer frauField008) { this.frauField008 = frauField008; }

    public Long getFrauField009() { return frauField009; }
    public void setFrauField009(Long frauField009) { this.frauField009 = frauField009; }

    public BigDecimal getFrauField010() { return frauField010; }
    public void setFrauField010(BigDecimal frauField010) { this.frauField010 = frauField010; }

    public BigDecimal getFrauField011() { return frauField011; }
    public void setFrauField011(BigDecimal frauField011) { this.frauField011 = frauField011; }

    public Boolean getFrauField012() { return frauField012; }
    public void setFrauField012(Boolean frauField012) { this.frauField012 = frauField012; }

    public BigDecimal getFrauField013() { return frauField013; }
    public void setFrauField013(BigDecimal frauField013) { this.frauField013 = frauField013; }

    public Integer getFrauField014() { return frauField014; }
    public void setFrauField014(Integer frauField014) { this.frauField014 = frauField014; }

    @Override
    public String toString() {
        return "FraudDto055{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
