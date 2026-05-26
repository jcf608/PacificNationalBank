package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto046 — Data Transfer Object for fraud operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto046 {

    @Size(max = 200)
    @JsonProperty("frauField000")
    private String frauField000;

    @JsonProperty("frauField001")
    private Double frauField001;

    @JsonProperty("frauField002")
    private Long frauField002;

    @JsonProperty("frauField003")
    private Double frauField003;

    @JsonProperty("frauField004")
    private Integer frauField004;

    @JsonProperty("frauField005")
    private Long frauField005;

    @JsonProperty("frauField006")
    private Double frauField006;

    @JsonProperty("frauField007")
    private Long frauField007;

    @JsonProperty("frauField008")
    private Integer frauField008;

    @JsonProperty("frauField009")
    private Double frauField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField010")
    private BigDecimal frauField010;

    @JsonProperty("frauField011")
    private LocalDate frauField011;

    @JsonProperty("frauField012")
    private Long frauField012;

    @Size(max = 100)
    @JsonProperty("frauField013")
    private String frauField013;

    @JsonProperty("frauField014")
    private LocalDate frauField014;

    @Size(max = 100)
    @JsonProperty("frauField015")
    private String frauField015;

    @JsonProperty("frauField016")
    private Boolean frauField016;

    @JsonProperty("frauField017")
    private Long frauField017;

    public FraudDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto046 instance = new FraudDto046();

        public Builder frauField000(String val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Double val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Long val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Double val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Integer val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Long val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Double val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Long val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Integer val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Double val) { instance.frauField009 = val; return this; }
        public Builder frauField010(BigDecimal val) { instance.frauField010 = val; return this; }
        public Builder frauField011(LocalDate val) { instance.frauField011 = val; return this; }
        public Builder frauField012(Long val) { instance.frauField012 = val; return this; }
        public Builder frauField013(String val) { instance.frauField013 = val; return this; }
        public Builder frauField014(LocalDate val) { instance.frauField014 = val; return this; }
        public Builder frauField015(String val) { instance.frauField015 = val; return this; }
        public Builder frauField016(Boolean val) { instance.frauField016 = val; return this; }
        public Builder frauField017(Long val) { instance.frauField017 = val; return this; }
        public FraudDto046 build() { return instance; }
    }

    public String getFrauField000() { return frauField000; }
    public void setFrauField000(String frauField000) { this.frauField000 = frauField000; }

    public Double getFrauField001() { return frauField001; }
    public void setFrauField001(Double frauField001) { this.frauField001 = frauField001; }

    public Long getFrauField002() { return frauField002; }
    public void setFrauField002(Long frauField002) { this.frauField002 = frauField002; }

    public Double getFrauField003() { return frauField003; }
    public void setFrauField003(Double frauField003) { this.frauField003 = frauField003; }

    public Integer getFrauField004() { return frauField004; }
    public void setFrauField004(Integer frauField004) { this.frauField004 = frauField004; }

    public Long getFrauField005() { return frauField005; }
    public void setFrauField005(Long frauField005) { this.frauField005 = frauField005; }

    public Double getFrauField006() { return frauField006; }
    public void setFrauField006(Double frauField006) { this.frauField006 = frauField006; }

    public Long getFrauField007() { return frauField007; }
    public void setFrauField007(Long frauField007) { this.frauField007 = frauField007; }

    public Integer getFrauField008() { return frauField008; }
    public void setFrauField008(Integer frauField008) { this.frauField008 = frauField008; }

    public Double getFrauField009() { return frauField009; }
    public void setFrauField009(Double frauField009) { this.frauField009 = frauField009; }

    public BigDecimal getFrauField010() { return frauField010; }
    public void setFrauField010(BigDecimal frauField010) { this.frauField010 = frauField010; }

    public LocalDate getFrauField011() { return frauField011; }
    public void setFrauField011(LocalDate frauField011) { this.frauField011 = frauField011; }

    public Long getFrauField012() { return frauField012; }
    public void setFrauField012(Long frauField012) { this.frauField012 = frauField012; }

    public String getFrauField013() { return frauField013; }
    public void setFrauField013(String frauField013) { this.frauField013 = frauField013; }

    public LocalDate getFrauField014() { return frauField014; }
    public void setFrauField014(LocalDate frauField014) { this.frauField014 = frauField014; }

    public String getFrauField015() { return frauField015; }
    public void setFrauField015(String frauField015) { this.frauField015 = frauField015; }

    public Boolean getFrauField016() { return frauField016; }
    public void setFrauField016(Boolean frauField016) { this.frauField016 = frauField016; }

    public Long getFrauField017() { return frauField017; }
    public void setFrauField017(Long frauField017) { this.frauField017 = frauField017; }

    @Override
    public String toString() {
        return "FraudDto046{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
