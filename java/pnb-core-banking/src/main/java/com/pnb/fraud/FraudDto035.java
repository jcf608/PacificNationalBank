package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto035 — Data Transfer Object for fraud operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto035 {

    @JsonProperty("frauField000")
    private Double frauField000;

    @JsonProperty("frauField001")
    private Double frauField001;

    @JsonProperty("frauField002")
    private Boolean frauField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField003")
    private BigDecimal frauField003;

    @JsonProperty("frauField004")
    private LocalDate frauField004;

    @Size(max = 40)
    @JsonProperty("frauField005")
    private String frauField005;

    @JsonProperty("frauField006")
    private LocalDate frauField006;

    @Size(max = 60)
    @JsonProperty("frauField007")
    private String frauField007;

    @JsonProperty("frauField008")
    private LocalDate frauField008;

    @JsonProperty("frauField009")
    private LocalDate frauField009;

    @JsonProperty("frauField010")
    private Integer frauField010;

    @JsonProperty("frauField011")
    private Boolean frauField011;

    @JsonProperty("frauField012")
    private LocalDate frauField012;

    @JsonProperty("frauField013")
    private Double frauField013;

    @JsonProperty("frauField014")
    private Integer frauField014;

    @JsonProperty("frauField015")
    private LocalDate frauField015;

    @JsonProperty("frauField016")
    private Long frauField016;

    @JsonProperty("frauField017")
    private Boolean frauField017;

    @JsonProperty("frauField018")
    private Boolean frauField018;

    public FraudDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto035 instance = new FraudDto035();

        public Builder frauField000(Double val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Double val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Boolean val) { instance.frauField002 = val; return this; }
        public Builder frauField003(BigDecimal val) { instance.frauField003 = val; return this; }
        public Builder frauField004(LocalDate val) { instance.frauField004 = val; return this; }
        public Builder frauField005(String val) { instance.frauField005 = val; return this; }
        public Builder frauField006(LocalDate val) { instance.frauField006 = val; return this; }
        public Builder frauField007(String val) { instance.frauField007 = val; return this; }
        public Builder frauField008(LocalDate val) { instance.frauField008 = val; return this; }
        public Builder frauField009(LocalDate val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Integer val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Boolean val) { instance.frauField011 = val; return this; }
        public Builder frauField012(LocalDate val) { instance.frauField012 = val; return this; }
        public Builder frauField013(Double val) { instance.frauField013 = val; return this; }
        public Builder frauField014(Integer val) { instance.frauField014 = val; return this; }
        public Builder frauField015(LocalDate val) { instance.frauField015 = val; return this; }
        public Builder frauField016(Long val) { instance.frauField016 = val; return this; }
        public Builder frauField017(Boolean val) { instance.frauField017 = val; return this; }
        public Builder frauField018(Boolean val) { instance.frauField018 = val; return this; }
        public FraudDto035 build() { return instance; }
    }

    public Double getFrauField000() { return frauField000; }
    public void setFrauField000(Double frauField000) { this.frauField000 = frauField000; }

    public Double getFrauField001() { return frauField001; }
    public void setFrauField001(Double frauField001) { this.frauField001 = frauField001; }

    public Boolean getFrauField002() { return frauField002; }
    public void setFrauField002(Boolean frauField002) { this.frauField002 = frauField002; }

    public BigDecimal getFrauField003() { return frauField003; }
    public void setFrauField003(BigDecimal frauField003) { this.frauField003 = frauField003; }

    public LocalDate getFrauField004() { return frauField004; }
    public void setFrauField004(LocalDate frauField004) { this.frauField004 = frauField004; }

    public String getFrauField005() { return frauField005; }
    public void setFrauField005(String frauField005) { this.frauField005 = frauField005; }

    public LocalDate getFrauField006() { return frauField006; }
    public void setFrauField006(LocalDate frauField006) { this.frauField006 = frauField006; }

    public String getFrauField007() { return frauField007; }
    public void setFrauField007(String frauField007) { this.frauField007 = frauField007; }

    public LocalDate getFrauField008() { return frauField008; }
    public void setFrauField008(LocalDate frauField008) { this.frauField008 = frauField008; }

    public LocalDate getFrauField009() { return frauField009; }
    public void setFrauField009(LocalDate frauField009) { this.frauField009 = frauField009; }

    public Integer getFrauField010() { return frauField010; }
    public void setFrauField010(Integer frauField010) { this.frauField010 = frauField010; }

    public Boolean getFrauField011() { return frauField011; }
    public void setFrauField011(Boolean frauField011) { this.frauField011 = frauField011; }

    public LocalDate getFrauField012() { return frauField012; }
    public void setFrauField012(LocalDate frauField012) { this.frauField012 = frauField012; }

    public Double getFrauField013() { return frauField013; }
    public void setFrauField013(Double frauField013) { this.frauField013 = frauField013; }

    public Integer getFrauField014() { return frauField014; }
    public void setFrauField014(Integer frauField014) { this.frauField014 = frauField014; }

    public LocalDate getFrauField015() { return frauField015; }
    public void setFrauField015(LocalDate frauField015) { this.frauField015 = frauField015; }

    public Long getFrauField016() { return frauField016; }
    public void setFrauField016(Long frauField016) { this.frauField016 = frauField016; }

    public Boolean getFrauField017() { return frauField017; }
    public void setFrauField017(Boolean frauField017) { this.frauField017 = frauField017; }

    public Boolean getFrauField018() { return frauField018; }
    public void setFrauField018(Boolean frauField018) { this.frauField018 = frauField018; }

    @Override
    public String toString() {
        return "FraudDto035{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
