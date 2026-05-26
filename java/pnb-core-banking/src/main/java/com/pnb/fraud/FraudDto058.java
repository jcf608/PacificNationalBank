package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto058 — Data Transfer Object for fraud operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto058 {

    @JsonProperty("frauField000")
    private Boolean frauField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField001")
    private BigDecimal frauField001;

    @JsonProperty("frauField002")
    private Integer frauField002;

    @Size(max = 60)
    @JsonProperty("frauField003")
    private String frauField003;

    @JsonProperty("frauField004")
    private LocalDate frauField004;

    @Size(max = 200)
    @JsonProperty("frauField005")
    private String frauField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField006")
    private BigDecimal frauField006;

    @JsonProperty("frauField007")
    private LocalDate frauField007;

    @JsonProperty("frauField008")
    private Long frauField008;

    @JsonProperty("frauField009")
    private Long frauField009;

    @Size(max = 60)
    @JsonProperty("frauField010")
    private String frauField010;

    @JsonProperty("frauField011")
    private Boolean frauField011;

    @JsonProperty("frauField012")
    private Double frauField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField013")
    private BigDecimal frauField013;

    @JsonProperty("frauField014")
    private LocalDate frauField014;

    @JsonProperty("frauField015")
    private Boolean frauField015;

    @JsonProperty("frauField016")
    private Integer frauField016;

    @JsonProperty("frauField017")
    private Double frauField017;

    public FraudDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto058 instance = new FraudDto058();

        public Builder frauField000(Boolean val) { instance.frauField000 = val; return this; }
        public Builder frauField001(BigDecimal val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Integer val) { instance.frauField002 = val; return this; }
        public Builder frauField003(String val) { instance.frauField003 = val; return this; }
        public Builder frauField004(LocalDate val) { instance.frauField004 = val; return this; }
        public Builder frauField005(String val) { instance.frauField005 = val; return this; }
        public Builder frauField006(BigDecimal val) { instance.frauField006 = val; return this; }
        public Builder frauField007(LocalDate val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Long val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Long val) { instance.frauField009 = val; return this; }
        public Builder frauField010(String val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Boolean val) { instance.frauField011 = val; return this; }
        public Builder frauField012(Double val) { instance.frauField012 = val; return this; }
        public Builder frauField013(BigDecimal val) { instance.frauField013 = val; return this; }
        public Builder frauField014(LocalDate val) { instance.frauField014 = val; return this; }
        public Builder frauField015(Boolean val) { instance.frauField015 = val; return this; }
        public Builder frauField016(Integer val) { instance.frauField016 = val; return this; }
        public Builder frauField017(Double val) { instance.frauField017 = val; return this; }
        public FraudDto058 build() { return instance; }
    }

    public Boolean getFrauField000() { return frauField000; }
    public void setFrauField000(Boolean frauField000) { this.frauField000 = frauField000; }

    public BigDecimal getFrauField001() { return frauField001; }
    public void setFrauField001(BigDecimal frauField001) { this.frauField001 = frauField001; }

    public Integer getFrauField002() { return frauField002; }
    public void setFrauField002(Integer frauField002) { this.frauField002 = frauField002; }

    public String getFrauField003() { return frauField003; }
    public void setFrauField003(String frauField003) { this.frauField003 = frauField003; }

    public LocalDate getFrauField004() { return frauField004; }
    public void setFrauField004(LocalDate frauField004) { this.frauField004 = frauField004; }

    public String getFrauField005() { return frauField005; }
    public void setFrauField005(String frauField005) { this.frauField005 = frauField005; }

    public BigDecimal getFrauField006() { return frauField006; }
    public void setFrauField006(BigDecimal frauField006) { this.frauField006 = frauField006; }

    public LocalDate getFrauField007() { return frauField007; }
    public void setFrauField007(LocalDate frauField007) { this.frauField007 = frauField007; }

    public Long getFrauField008() { return frauField008; }
    public void setFrauField008(Long frauField008) { this.frauField008 = frauField008; }

    public Long getFrauField009() { return frauField009; }
    public void setFrauField009(Long frauField009) { this.frauField009 = frauField009; }

    public String getFrauField010() { return frauField010; }
    public void setFrauField010(String frauField010) { this.frauField010 = frauField010; }

    public Boolean getFrauField011() { return frauField011; }
    public void setFrauField011(Boolean frauField011) { this.frauField011 = frauField011; }

    public Double getFrauField012() { return frauField012; }
    public void setFrauField012(Double frauField012) { this.frauField012 = frauField012; }

    public BigDecimal getFrauField013() { return frauField013; }
    public void setFrauField013(BigDecimal frauField013) { this.frauField013 = frauField013; }

    public LocalDate getFrauField014() { return frauField014; }
    public void setFrauField014(LocalDate frauField014) { this.frauField014 = frauField014; }

    public Boolean getFrauField015() { return frauField015; }
    public void setFrauField015(Boolean frauField015) { this.frauField015 = frauField015; }

    public Integer getFrauField016() { return frauField016; }
    public void setFrauField016(Integer frauField016) { this.frauField016 = frauField016; }

    public Double getFrauField017() { return frauField017; }
    public void setFrauField017(Double frauField017) { this.frauField017 = frauField017; }

    @Override
    public String toString() {
        return "FraudDto058{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
