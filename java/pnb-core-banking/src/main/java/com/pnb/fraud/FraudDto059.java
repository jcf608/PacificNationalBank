package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto059 — Data Transfer Object for fraud operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto059 {

    @JsonProperty("frauField000")
    private Double frauField000;

    @JsonProperty("frauField001")
    private LocalDate frauField001;

    @Size(max = 20)
    @JsonProperty("frauField002")
    private String frauField002;

    @JsonProperty("frauField003")
    private Integer frauField003;

    @JsonProperty("frauField004")
    private Boolean frauField004;

    @JsonProperty("frauField005")
    private LocalDate frauField005;

    @JsonProperty("frauField006")
    private Boolean frauField006;

    @JsonProperty("frauField007")
    private Boolean frauField007;

    @Size(max = 20)
    @JsonProperty("frauField008")
    private String frauField008;

    @JsonProperty("frauField009")
    private Boolean frauField009;

    @JsonProperty("frauField010")
    private Long frauField010;

    @JsonProperty("frauField011")
    private Integer frauField011;

    @JsonProperty("frauField012")
    private Boolean frauField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField013")
    private BigDecimal frauField013;

    @JsonProperty("frauField014")
    private Integer frauField014;

    @Size(max = 100)
    @JsonProperty("frauField015")
    private String frauField015;

    @JsonProperty("frauField016")
    private Double frauField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField017")
    private BigDecimal frauField017;

    @JsonProperty("frauField018")
    private Long frauField018;

    public FraudDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto059 instance = new FraudDto059();

        public Builder frauField000(Double val) { instance.frauField000 = val; return this; }
        public Builder frauField001(LocalDate val) { instance.frauField001 = val; return this; }
        public Builder frauField002(String val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Integer val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Boolean val) { instance.frauField004 = val; return this; }
        public Builder frauField005(LocalDate val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Boolean val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Boolean val) { instance.frauField007 = val; return this; }
        public Builder frauField008(String val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Boolean val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Long val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Integer val) { instance.frauField011 = val; return this; }
        public Builder frauField012(Boolean val) { instance.frauField012 = val; return this; }
        public Builder frauField013(BigDecimal val) { instance.frauField013 = val; return this; }
        public Builder frauField014(Integer val) { instance.frauField014 = val; return this; }
        public Builder frauField015(String val) { instance.frauField015 = val; return this; }
        public Builder frauField016(Double val) { instance.frauField016 = val; return this; }
        public Builder frauField017(BigDecimal val) { instance.frauField017 = val; return this; }
        public Builder frauField018(Long val) { instance.frauField018 = val; return this; }
        public FraudDto059 build() { return instance; }
    }

    public Double getFrauField000() { return frauField000; }
    public void setFrauField000(Double frauField000) { this.frauField000 = frauField000; }

    public LocalDate getFrauField001() { return frauField001; }
    public void setFrauField001(LocalDate frauField001) { this.frauField001 = frauField001; }

    public String getFrauField002() { return frauField002; }
    public void setFrauField002(String frauField002) { this.frauField002 = frauField002; }

    public Integer getFrauField003() { return frauField003; }
    public void setFrauField003(Integer frauField003) { this.frauField003 = frauField003; }

    public Boolean getFrauField004() { return frauField004; }
    public void setFrauField004(Boolean frauField004) { this.frauField004 = frauField004; }

    public LocalDate getFrauField005() { return frauField005; }
    public void setFrauField005(LocalDate frauField005) { this.frauField005 = frauField005; }

    public Boolean getFrauField006() { return frauField006; }
    public void setFrauField006(Boolean frauField006) { this.frauField006 = frauField006; }

    public Boolean getFrauField007() { return frauField007; }
    public void setFrauField007(Boolean frauField007) { this.frauField007 = frauField007; }

    public String getFrauField008() { return frauField008; }
    public void setFrauField008(String frauField008) { this.frauField008 = frauField008; }

    public Boolean getFrauField009() { return frauField009; }
    public void setFrauField009(Boolean frauField009) { this.frauField009 = frauField009; }

    public Long getFrauField010() { return frauField010; }
    public void setFrauField010(Long frauField010) { this.frauField010 = frauField010; }

    public Integer getFrauField011() { return frauField011; }
    public void setFrauField011(Integer frauField011) { this.frauField011 = frauField011; }

    public Boolean getFrauField012() { return frauField012; }
    public void setFrauField012(Boolean frauField012) { this.frauField012 = frauField012; }

    public BigDecimal getFrauField013() { return frauField013; }
    public void setFrauField013(BigDecimal frauField013) { this.frauField013 = frauField013; }

    public Integer getFrauField014() { return frauField014; }
    public void setFrauField014(Integer frauField014) { this.frauField014 = frauField014; }

    public String getFrauField015() { return frauField015; }
    public void setFrauField015(String frauField015) { this.frauField015 = frauField015; }

    public Double getFrauField016() { return frauField016; }
    public void setFrauField016(Double frauField016) { this.frauField016 = frauField016; }

    public BigDecimal getFrauField017() { return frauField017; }
    public void setFrauField017(BigDecimal frauField017) { this.frauField017 = frauField017; }

    public Long getFrauField018() { return frauField018; }
    public void setFrauField018(Long frauField018) { this.frauField018 = frauField018; }

    @Override
    public String toString() {
        return "FraudDto059{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
