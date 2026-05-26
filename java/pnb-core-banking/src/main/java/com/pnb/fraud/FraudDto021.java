package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto021 — Data Transfer Object for fraud operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto021 {

    @Size(max = 40)
    @JsonProperty("frauField000")
    private String frauField000;

    @Size(max = 40)
    @JsonProperty("frauField001")
    private String frauField001;

    @Size(max = 40)
    @JsonProperty("frauField002")
    private String frauField002;

    @JsonProperty("frauField003")
    private Boolean frauField003;

    @JsonProperty("frauField004")
    private Double frauField004;

    @JsonProperty("frauField005")
    private LocalDate frauField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField006")
    private BigDecimal frauField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField007")
    private BigDecimal frauField007;

    @JsonProperty("frauField008")
    private Long frauField008;

    @JsonProperty("frauField009")
    private Long frauField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField010")
    private BigDecimal frauField010;

    @JsonProperty("frauField011")
    private Double frauField011;

    @JsonProperty("frauField012")
    private LocalDate frauField012;

    @JsonProperty("frauField013")
    private Double frauField013;

    @JsonProperty("frauField014")
    private Integer frauField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField015")
    private BigDecimal frauField015;

    @JsonProperty("frauField016")
    private Long frauField016;

    public FraudDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto021 instance = new FraudDto021();

        public Builder frauField000(String val) { instance.frauField000 = val; return this; }
        public Builder frauField001(String val) { instance.frauField001 = val; return this; }
        public Builder frauField002(String val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Boolean val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Double val) { instance.frauField004 = val; return this; }
        public Builder frauField005(LocalDate val) { instance.frauField005 = val; return this; }
        public Builder frauField006(BigDecimal val) { instance.frauField006 = val; return this; }
        public Builder frauField007(BigDecimal val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Long val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Long val) { instance.frauField009 = val; return this; }
        public Builder frauField010(BigDecimal val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Double val) { instance.frauField011 = val; return this; }
        public Builder frauField012(LocalDate val) { instance.frauField012 = val; return this; }
        public Builder frauField013(Double val) { instance.frauField013 = val; return this; }
        public Builder frauField014(Integer val) { instance.frauField014 = val; return this; }
        public Builder frauField015(BigDecimal val) { instance.frauField015 = val; return this; }
        public Builder frauField016(Long val) { instance.frauField016 = val; return this; }
        public FraudDto021 build() { return instance; }
    }

    public String getFrauField000() { return frauField000; }
    public void setFrauField000(String frauField000) { this.frauField000 = frauField000; }

    public String getFrauField001() { return frauField001; }
    public void setFrauField001(String frauField001) { this.frauField001 = frauField001; }

    public String getFrauField002() { return frauField002; }
    public void setFrauField002(String frauField002) { this.frauField002 = frauField002; }

    public Boolean getFrauField003() { return frauField003; }
    public void setFrauField003(Boolean frauField003) { this.frauField003 = frauField003; }

    public Double getFrauField004() { return frauField004; }
    public void setFrauField004(Double frauField004) { this.frauField004 = frauField004; }

    public LocalDate getFrauField005() { return frauField005; }
    public void setFrauField005(LocalDate frauField005) { this.frauField005 = frauField005; }

    public BigDecimal getFrauField006() { return frauField006; }
    public void setFrauField006(BigDecimal frauField006) { this.frauField006 = frauField006; }

    public BigDecimal getFrauField007() { return frauField007; }
    public void setFrauField007(BigDecimal frauField007) { this.frauField007 = frauField007; }

    public Long getFrauField008() { return frauField008; }
    public void setFrauField008(Long frauField008) { this.frauField008 = frauField008; }

    public Long getFrauField009() { return frauField009; }
    public void setFrauField009(Long frauField009) { this.frauField009 = frauField009; }

    public BigDecimal getFrauField010() { return frauField010; }
    public void setFrauField010(BigDecimal frauField010) { this.frauField010 = frauField010; }

    public Double getFrauField011() { return frauField011; }
    public void setFrauField011(Double frauField011) { this.frauField011 = frauField011; }

    public LocalDate getFrauField012() { return frauField012; }
    public void setFrauField012(LocalDate frauField012) { this.frauField012 = frauField012; }

    public Double getFrauField013() { return frauField013; }
    public void setFrauField013(Double frauField013) { this.frauField013 = frauField013; }

    public Integer getFrauField014() { return frauField014; }
    public void setFrauField014(Integer frauField014) { this.frauField014 = frauField014; }

    public BigDecimal getFrauField015() { return frauField015; }
    public void setFrauField015(BigDecimal frauField015) { this.frauField015 = frauField015; }

    public Long getFrauField016() { return frauField016; }
    public void setFrauField016(Long frauField016) { this.frauField016 = frauField016; }

    @Override
    public String toString() {
        return "FraudDto021{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
