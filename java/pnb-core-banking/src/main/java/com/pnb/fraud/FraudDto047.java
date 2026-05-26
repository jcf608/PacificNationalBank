package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto047 — Data Transfer Object for fraud operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto047 {

    @Size(max = 20)
    @JsonProperty("frauField000")
    private String frauField000;

    @JsonProperty("frauField001")
    private Boolean frauField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField002")
    private BigDecimal frauField002;

    @JsonProperty("frauField003")
    private LocalDate frauField003;

    @JsonProperty("frauField004")
    private LocalDate frauField004;

    @JsonProperty("frauField005")
    private LocalDate frauField005;

    @Size(max = 100)
    @JsonProperty("frauField006")
    private String frauField006;

    @JsonProperty("frauField007")
    private Long frauField007;

    @Size(max = 20)
    @JsonProperty("frauField008")
    private String frauField008;

    @JsonProperty("frauField009")
    private Double frauField009;

    @JsonProperty("frauField010")
    private LocalDate frauField010;

    @JsonProperty("frauField011")
    private Integer frauField011;

    @JsonProperty("frauField012")
    private Integer frauField012;

    @JsonProperty("frauField013")
    private Boolean frauField013;

    @JsonProperty("frauField014")
    private LocalDate frauField014;

    @JsonProperty("frauField015")
    private Integer frauField015;

    @JsonProperty("frauField016")
    private Long frauField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField017")
    private BigDecimal frauField017;

    @JsonProperty("frauField018")
    private Boolean frauField018;

    public FraudDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto047 instance = new FraudDto047();

        public Builder frauField000(String val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Boolean val) { instance.frauField001 = val; return this; }
        public Builder frauField002(BigDecimal val) { instance.frauField002 = val; return this; }
        public Builder frauField003(LocalDate val) { instance.frauField003 = val; return this; }
        public Builder frauField004(LocalDate val) { instance.frauField004 = val; return this; }
        public Builder frauField005(LocalDate val) { instance.frauField005 = val; return this; }
        public Builder frauField006(String val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Long val) { instance.frauField007 = val; return this; }
        public Builder frauField008(String val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Double val) { instance.frauField009 = val; return this; }
        public Builder frauField010(LocalDate val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Integer val) { instance.frauField011 = val; return this; }
        public Builder frauField012(Integer val) { instance.frauField012 = val; return this; }
        public Builder frauField013(Boolean val) { instance.frauField013 = val; return this; }
        public Builder frauField014(LocalDate val) { instance.frauField014 = val; return this; }
        public Builder frauField015(Integer val) { instance.frauField015 = val; return this; }
        public Builder frauField016(Long val) { instance.frauField016 = val; return this; }
        public Builder frauField017(BigDecimal val) { instance.frauField017 = val; return this; }
        public Builder frauField018(Boolean val) { instance.frauField018 = val; return this; }
        public FraudDto047 build() { return instance; }
    }

    public String getFrauField000() { return frauField000; }
    public void setFrauField000(String frauField000) { this.frauField000 = frauField000; }

    public Boolean getFrauField001() { return frauField001; }
    public void setFrauField001(Boolean frauField001) { this.frauField001 = frauField001; }

    public BigDecimal getFrauField002() { return frauField002; }
    public void setFrauField002(BigDecimal frauField002) { this.frauField002 = frauField002; }

    public LocalDate getFrauField003() { return frauField003; }
    public void setFrauField003(LocalDate frauField003) { this.frauField003 = frauField003; }

    public LocalDate getFrauField004() { return frauField004; }
    public void setFrauField004(LocalDate frauField004) { this.frauField004 = frauField004; }

    public LocalDate getFrauField005() { return frauField005; }
    public void setFrauField005(LocalDate frauField005) { this.frauField005 = frauField005; }

    public String getFrauField006() { return frauField006; }
    public void setFrauField006(String frauField006) { this.frauField006 = frauField006; }

    public Long getFrauField007() { return frauField007; }
    public void setFrauField007(Long frauField007) { this.frauField007 = frauField007; }

    public String getFrauField008() { return frauField008; }
    public void setFrauField008(String frauField008) { this.frauField008 = frauField008; }

    public Double getFrauField009() { return frauField009; }
    public void setFrauField009(Double frauField009) { this.frauField009 = frauField009; }

    public LocalDate getFrauField010() { return frauField010; }
    public void setFrauField010(LocalDate frauField010) { this.frauField010 = frauField010; }

    public Integer getFrauField011() { return frauField011; }
    public void setFrauField011(Integer frauField011) { this.frauField011 = frauField011; }

    public Integer getFrauField012() { return frauField012; }
    public void setFrauField012(Integer frauField012) { this.frauField012 = frauField012; }

    public Boolean getFrauField013() { return frauField013; }
    public void setFrauField013(Boolean frauField013) { this.frauField013 = frauField013; }

    public LocalDate getFrauField014() { return frauField014; }
    public void setFrauField014(LocalDate frauField014) { this.frauField014 = frauField014; }

    public Integer getFrauField015() { return frauField015; }
    public void setFrauField015(Integer frauField015) { this.frauField015 = frauField015; }

    public Long getFrauField016() { return frauField016; }
    public void setFrauField016(Long frauField016) { this.frauField016 = frauField016; }

    public BigDecimal getFrauField017() { return frauField017; }
    public void setFrauField017(BigDecimal frauField017) { this.frauField017 = frauField017; }

    public Boolean getFrauField018() { return frauField018; }
    public void setFrauField018(Boolean frauField018) { this.frauField018 = frauField018; }

    @Override
    public String toString() {
        return "FraudDto047{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
