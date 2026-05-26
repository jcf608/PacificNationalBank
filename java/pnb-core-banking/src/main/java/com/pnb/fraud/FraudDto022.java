package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto022 — Data Transfer Object for fraud operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto022 {

    @JsonProperty("frauField000")
    private Boolean frauField000;

    @JsonProperty("frauField001")
    private Long frauField001;

    @JsonProperty("frauField002")
    private Long frauField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField003")
    private BigDecimal frauField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField004")
    private BigDecimal frauField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField005")
    private BigDecimal frauField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField006")
    private BigDecimal frauField006;

    @JsonProperty("frauField007")
    private Double frauField007;

    @JsonProperty("frauField008")
    private Double frauField008;

    @Size(max = 20)
    @JsonProperty("frauField009")
    private String frauField009;

    @Size(max = 200)
    @JsonProperty("frauField010")
    private String frauField010;

    @Size(max = 100)
    @JsonProperty("frauField011")
    private String frauField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField012")
    private BigDecimal frauField012;

    @JsonProperty("frauField013")
    private Boolean frauField013;

    @JsonProperty("frauField014")
    private Double frauField014;

    @Size(max = 200)
    @JsonProperty("frauField015")
    private String frauField015;

    @JsonProperty("frauField016")
    private Long frauField016;

    @JsonProperty("frauField017")
    private Integer frauField017;

    public FraudDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto022 instance = new FraudDto022();

        public Builder frauField000(Boolean val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Long val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Long val) { instance.frauField002 = val; return this; }
        public Builder frauField003(BigDecimal val) { instance.frauField003 = val; return this; }
        public Builder frauField004(BigDecimal val) { instance.frauField004 = val; return this; }
        public Builder frauField005(BigDecimal val) { instance.frauField005 = val; return this; }
        public Builder frauField006(BigDecimal val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Double val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Double val) { instance.frauField008 = val; return this; }
        public Builder frauField009(String val) { instance.frauField009 = val; return this; }
        public Builder frauField010(String val) { instance.frauField010 = val; return this; }
        public Builder frauField011(String val) { instance.frauField011 = val; return this; }
        public Builder frauField012(BigDecimal val) { instance.frauField012 = val; return this; }
        public Builder frauField013(Boolean val) { instance.frauField013 = val; return this; }
        public Builder frauField014(Double val) { instance.frauField014 = val; return this; }
        public Builder frauField015(String val) { instance.frauField015 = val; return this; }
        public Builder frauField016(Long val) { instance.frauField016 = val; return this; }
        public Builder frauField017(Integer val) { instance.frauField017 = val; return this; }
        public FraudDto022 build() { return instance; }
    }

    public Boolean getFrauField000() { return frauField000; }
    public void setFrauField000(Boolean frauField000) { this.frauField000 = frauField000; }

    public Long getFrauField001() { return frauField001; }
    public void setFrauField001(Long frauField001) { this.frauField001 = frauField001; }

    public Long getFrauField002() { return frauField002; }
    public void setFrauField002(Long frauField002) { this.frauField002 = frauField002; }

    public BigDecimal getFrauField003() { return frauField003; }
    public void setFrauField003(BigDecimal frauField003) { this.frauField003 = frauField003; }

    public BigDecimal getFrauField004() { return frauField004; }
    public void setFrauField004(BigDecimal frauField004) { this.frauField004 = frauField004; }

    public BigDecimal getFrauField005() { return frauField005; }
    public void setFrauField005(BigDecimal frauField005) { this.frauField005 = frauField005; }

    public BigDecimal getFrauField006() { return frauField006; }
    public void setFrauField006(BigDecimal frauField006) { this.frauField006 = frauField006; }

    public Double getFrauField007() { return frauField007; }
    public void setFrauField007(Double frauField007) { this.frauField007 = frauField007; }

    public Double getFrauField008() { return frauField008; }
    public void setFrauField008(Double frauField008) { this.frauField008 = frauField008; }

    public String getFrauField009() { return frauField009; }
    public void setFrauField009(String frauField009) { this.frauField009 = frauField009; }

    public String getFrauField010() { return frauField010; }
    public void setFrauField010(String frauField010) { this.frauField010 = frauField010; }

    public String getFrauField011() { return frauField011; }
    public void setFrauField011(String frauField011) { this.frauField011 = frauField011; }

    public BigDecimal getFrauField012() { return frauField012; }
    public void setFrauField012(BigDecimal frauField012) { this.frauField012 = frauField012; }

    public Boolean getFrauField013() { return frauField013; }
    public void setFrauField013(Boolean frauField013) { this.frauField013 = frauField013; }

    public Double getFrauField014() { return frauField014; }
    public void setFrauField014(Double frauField014) { this.frauField014 = frauField014; }

    public String getFrauField015() { return frauField015; }
    public void setFrauField015(String frauField015) { this.frauField015 = frauField015; }

    public Long getFrauField016() { return frauField016; }
    public void setFrauField016(Long frauField016) { this.frauField016 = frauField016; }

    public Integer getFrauField017() { return frauField017; }
    public void setFrauField017(Integer frauField017) { this.frauField017 = frauField017; }

    @Override
    public String toString() {
        return "FraudDto022{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
