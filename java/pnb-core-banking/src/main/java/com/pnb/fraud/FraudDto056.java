package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto056 — Data Transfer Object for fraud operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto056 {

    @JsonProperty("frauField000")
    private Long frauField000;

    @JsonProperty("frauField001")
    private Long frauField001;

    @Size(max = 40)
    @JsonProperty("frauField002")
    private String frauField002;

    @JsonProperty("frauField003")
    private Boolean frauField003;

    @JsonProperty("frauField004")
    private Long frauField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField005")
    private BigDecimal frauField005;

    @JsonProperty("frauField006")
    private Integer frauField006;

    @JsonProperty("frauField007")
    private Boolean frauField007;

    @JsonProperty("frauField008")
    private Double frauField008;

    @Size(max = 200)
    @JsonProperty("frauField009")
    private String frauField009;

    @JsonProperty("frauField010")
    private Double frauField010;

    @JsonProperty("frauField011")
    private Long frauField011;

    @Size(max = 40)
    @JsonProperty("frauField012")
    private String frauField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField013")
    private BigDecimal frauField013;

    @Size(max = 60)
    @JsonProperty("frauField014")
    private String frauField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField015")
    private BigDecimal frauField015;

    public FraudDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto056 instance = new FraudDto056();

        public Builder frauField000(Long val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Long val) { instance.frauField001 = val; return this; }
        public Builder frauField002(String val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Boolean val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Long val) { instance.frauField004 = val; return this; }
        public Builder frauField005(BigDecimal val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Integer val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Boolean val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Double val) { instance.frauField008 = val; return this; }
        public Builder frauField009(String val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Double val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Long val) { instance.frauField011 = val; return this; }
        public Builder frauField012(String val) { instance.frauField012 = val; return this; }
        public Builder frauField013(BigDecimal val) { instance.frauField013 = val; return this; }
        public Builder frauField014(String val) { instance.frauField014 = val; return this; }
        public Builder frauField015(BigDecimal val) { instance.frauField015 = val; return this; }
        public FraudDto056 build() { return instance; }
    }

    public Long getFrauField000() { return frauField000; }
    public void setFrauField000(Long frauField000) { this.frauField000 = frauField000; }

    public Long getFrauField001() { return frauField001; }
    public void setFrauField001(Long frauField001) { this.frauField001 = frauField001; }

    public String getFrauField002() { return frauField002; }
    public void setFrauField002(String frauField002) { this.frauField002 = frauField002; }

    public Boolean getFrauField003() { return frauField003; }
    public void setFrauField003(Boolean frauField003) { this.frauField003 = frauField003; }

    public Long getFrauField004() { return frauField004; }
    public void setFrauField004(Long frauField004) { this.frauField004 = frauField004; }

    public BigDecimal getFrauField005() { return frauField005; }
    public void setFrauField005(BigDecimal frauField005) { this.frauField005 = frauField005; }

    public Integer getFrauField006() { return frauField006; }
    public void setFrauField006(Integer frauField006) { this.frauField006 = frauField006; }

    public Boolean getFrauField007() { return frauField007; }
    public void setFrauField007(Boolean frauField007) { this.frauField007 = frauField007; }

    public Double getFrauField008() { return frauField008; }
    public void setFrauField008(Double frauField008) { this.frauField008 = frauField008; }

    public String getFrauField009() { return frauField009; }
    public void setFrauField009(String frauField009) { this.frauField009 = frauField009; }

    public Double getFrauField010() { return frauField010; }
    public void setFrauField010(Double frauField010) { this.frauField010 = frauField010; }

    public Long getFrauField011() { return frauField011; }
    public void setFrauField011(Long frauField011) { this.frauField011 = frauField011; }

    public String getFrauField012() { return frauField012; }
    public void setFrauField012(String frauField012) { this.frauField012 = frauField012; }

    public BigDecimal getFrauField013() { return frauField013; }
    public void setFrauField013(BigDecimal frauField013) { this.frauField013 = frauField013; }

    public String getFrauField014() { return frauField014; }
    public void setFrauField014(String frauField014) { this.frauField014 = frauField014; }

    public BigDecimal getFrauField015() { return frauField015; }
    public void setFrauField015(BigDecimal frauField015) { this.frauField015 = frauField015; }

    @Override
    public String toString() {
        return "FraudDto056{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
