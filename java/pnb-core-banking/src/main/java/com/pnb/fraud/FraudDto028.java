package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto028 — Data Transfer Object for fraud operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto028 {

    @Size(max = 60)
    @JsonProperty("frauField000")
    private String frauField000;

    @JsonProperty("frauField001")
    private Integer frauField001;

    @Size(max = 20)
    @JsonProperty("frauField002")
    private String frauField002;

    @JsonProperty("frauField003")
    private Double frauField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField004")
    private BigDecimal frauField004;

    @JsonProperty("frauField005")
    private Long frauField005;

    @JsonProperty("frauField006")
    private Integer frauField006;

    @JsonProperty("frauField007")
    private Integer frauField007;

    @JsonProperty("frauField008")
    private Boolean frauField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField009")
    private BigDecimal frauField009;

    @JsonProperty("frauField010")
    private Long frauField010;

    @JsonProperty("frauField011")
    private Integer frauField011;

    public FraudDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto028 instance = new FraudDto028();

        public Builder frauField000(String val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Integer val) { instance.frauField001 = val; return this; }
        public Builder frauField002(String val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Double val) { instance.frauField003 = val; return this; }
        public Builder frauField004(BigDecimal val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Long val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Integer val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Integer val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Boolean val) { instance.frauField008 = val; return this; }
        public Builder frauField009(BigDecimal val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Long val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Integer val) { instance.frauField011 = val; return this; }
        public FraudDto028 build() { return instance; }
    }

    public String getFrauField000() { return frauField000; }
    public void setFrauField000(String frauField000) { this.frauField000 = frauField000; }

    public Integer getFrauField001() { return frauField001; }
    public void setFrauField001(Integer frauField001) { this.frauField001 = frauField001; }

    public String getFrauField002() { return frauField002; }
    public void setFrauField002(String frauField002) { this.frauField002 = frauField002; }

    public Double getFrauField003() { return frauField003; }
    public void setFrauField003(Double frauField003) { this.frauField003 = frauField003; }

    public BigDecimal getFrauField004() { return frauField004; }
    public void setFrauField004(BigDecimal frauField004) { this.frauField004 = frauField004; }

    public Long getFrauField005() { return frauField005; }
    public void setFrauField005(Long frauField005) { this.frauField005 = frauField005; }

    public Integer getFrauField006() { return frauField006; }
    public void setFrauField006(Integer frauField006) { this.frauField006 = frauField006; }

    public Integer getFrauField007() { return frauField007; }
    public void setFrauField007(Integer frauField007) { this.frauField007 = frauField007; }

    public Boolean getFrauField008() { return frauField008; }
    public void setFrauField008(Boolean frauField008) { this.frauField008 = frauField008; }

    public BigDecimal getFrauField009() { return frauField009; }
    public void setFrauField009(BigDecimal frauField009) { this.frauField009 = frauField009; }

    public Long getFrauField010() { return frauField010; }
    public void setFrauField010(Long frauField010) { this.frauField010 = frauField010; }

    public Integer getFrauField011() { return frauField011; }
    public void setFrauField011(Integer frauField011) { this.frauField011 = frauField011; }

    @Override
    public String toString() {
        return "FraudDto028{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
