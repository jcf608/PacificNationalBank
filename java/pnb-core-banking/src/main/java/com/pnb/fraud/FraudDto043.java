package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto043 — Data Transfer Object for fraud operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto043 {

    @Size(max = 200)
    @JsonProperty("frauField000")
    private String frauField000;

    @JsonProperty("frauField001")
    private Boolean frauField001;

    @Size(max = 60)
    @JsonProperty("frauField002")
    private String frauField002;

    @JsonProperty("frauField003")
    private Integer frauField003;

    @JsonProperty("frauField004")
    private Long frauField004;

    @JsonProperty("frauField005")
    private Long frauField005;

    @JsonProperty("frauField006")
    private LocalDate frauField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField007")
    private BigDecimal frauField007;

    @JsonProperty("frauField008")
    private Boolean frauField008;

    @JsonProperty("frauField009")
    private Long frauField009;

    @JsonProperty("frauField010")
    private Boolean frauField010;

    @JsonProperty("frauField011")
    private Boolean frauField011;

    @JsonProperty("frauField012")
    private Long frauField012;

    @JsonProperty("frauField013")
    private Double frauField013;

    @JsonProperty("frauField014")
    private Boolean frauField014;

    public FraudDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto043 instance = new FraudDto043();

        public Builder frauField000(String val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Boolean val) { instance.frauField001 = val; return this; }
        public Builder frauField002(String val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Integer val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Long val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Long val) { instance.frauField005 = val; return this; }
        public Builder frauField006(LocalDate val) { instance.frauField006 = val; return this; }
        public Builder frauField007(BigDecimal val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Boolean val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Long val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Boolean val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Boolean val) { instance.frauField011 = val; return this; }
        public Builder frauField012(Long val) { instance.frauField012 = val; return this; }
        public Builder frauField013(Double val) { instance.frauField013 = val; return this; }
        public Builder frauField014(Boolean val) { instance.frauField014 = val; return this; }
        public FraudDto043 build() { return instance; }
    }

    public String getFrauField000() { return frauField000; }
    public void setFrauField000(String frauField000) { this.frauField000 = frauField000; }

    public Boolean getFrauField001() { return frauField001; }
    public void setFrauField001(Boolean frauField001) { this.frauField001 = frauField001; }

    public String getFrauField002() { return frauField002; }
    public void setFrauField002(String frauField002) { this.frauField002 = frauField002; }

    public Integer getFrauField003() { return frauField003; }
    public void setFrauField003(Integer frauField003) { this.frauField003 = frauField003; }

    public Long getFrauField004() { return frauField004; }
    public void setFrauField004(Long frauField004) { this.frauField004 = frauField004; }

    public Long getFrauField005() { return frauField005; }
    public void setFrauField005(Long frauField005) { this.frauField005 = frauField005; }

    public LocalDate getFrauField006() { return frauField006; }
    public void setFrauField006(LocalDate frauField006) { this.frauField006 = frauField006; }

    public BigDecimal getFrauField007() { return frauField007; }
    public void setFrauField007(BigDecimal frauField007) { this.frauField007 = frauField007; }

    public Boolean getFrauField008() { return frauField008; }
    public void setFrauField008(Boolean frauField008) { this.frauField008 = frauField008; }

    public Long getFrauField009() { return frauField009; }
    public void setFrauField009(Long frauField009) { this.frauField009 = frauField009; }

    public Boolean getFrauField010() { return frauField010; }
    public void setFrauField010(Boolean frauField010) { this.frauField010 = frauField010; }

    public Boolean getFrauField011() { return frauField011; }
    public void setFrauField011(Boolean frauField011) { this.frauField011 = frauField011; }

    public Long getFrauField012() { return frauField012; }
    public void setFrauField012(Long frauField012) { this.frauField012 = frauField012; }

    public Double getFrauField013() { return frauField013; }
    public void setFrauField013(Double frauField013) { this.frauField013 = frauField013; }

    public Boolean getFrauField014() { return frauField014; }
    public void setFrauField014(Boolean frauField014) { this.frauField014 = frauField014; }

    @Override
    public String toString() {
        return "FraudDto043{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
