package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto032 — Data Transfer Object for fraud operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto032 {

    @Size(max = 20)
    @JsonProperty("frauField000")
    private String frauField000;

    @JsonProperty("frauField001")
    private Boolean frauField001;

    @Size(max = 200)
    @JsonProperty("frauField002")
    private String frauField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField003")
    private BigDecimal frauField003;

    @JsonProperty("frauField004")
    private Double frauField004;

    @JsonProperty("frauField005")
    private Boolean frauField005;

    @Size(max = 60)
    @JsonProperty("frauField006")
    private String frauField006;

    @JsonProperty("frauField007")
    private Long frauField007;

    @Size(max = 60)
    @JsonProperty("frauField008")
    private String frauField008;

    @JsonProperty("frauField009")
    private LocalDate frauField009;

    @JsonProperty("frauField010")
    private Long frauField010;

    @JsonProperty("frauField011")
    private Integer frauField011;

    @JsonProperty("frauField012")
    private Long frauField012;

    @JsonProperty("frauField013")
    private Long frauField013;

    @JsonProperty("frauField014")
    private Long frauField014;

    @JsonProperty("frauField015")
    private LocalDate frauField015;

    public FraudDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto032 instance = new FraudDto032();

        public Builder frauField000(String val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Boolean val) { instance.frauField001 = val; return this; }
        public Builder frauField002(String val) { instance.frauField002 = val; return this; }
        public Builder frauField003(BigDecimal val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Double val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Boolean val) { instance.frauField005 = val; return this; }
        public Builder frauField006(String val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Long val) { instance.frauField007 = val; return this; }
        public Builder frauField008(String val) { instance.frauField008 = val; return this; }
        public Builder frauField009(LocalDate val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Long val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Integer val) { instance.frauField011 = val; return this; }
        public Builder frauField012(Long val) { instance.frauField012 = val; return this; }
        public Builder frauField013(Long val) { instance.frauField013 = val; return this; }
        public Builder frauField014(Long val) { instance.frauField014 = val; return this; }
        public Builder frauField015(LocalDate val) { instance.frauField015 = val; return this; }
        public FraudDto032 build() { return instance; }
    }

    public String getFrauField000() { return frauField000; }
    public void setFrauField000(String frauField000) { this.frauField000 = frauField000; }

    public Boolean getFrauField001() { return frauField001; }
    public void setFrauField001(Boolean frauField001) { this.frauField001 = frauField001; }

    public String getFrauField002() { return frauField002; }
    public void setFrauField002(String frauField002) { this.frauField002 = frauField002; }

    public BigDecimal getFrauField003() { return frauField003; }
    public void setFrauField003(BigDecimal frauField003) { this.frauField003 = frauField003; }

    public Double getFrauField004() { return frauField004; }
    public void setFrauField004(Double frauField004) { this.frauField004 = frauField004; }

    public Boolean getFrauField005() { return frauField005; }
    public void setFrauField005(Boolean frauField005) { this.frauField005 = frauField005; }

    public String getFrauField006() { return frauField006; }
    public void setFrauField006(String frauField006) { this.frauField006 = frauField006; }

    public Long getFrauField007() { return frauField007; }
    public void setFrauField007(Long frauField007) { this.frauField007 = frauField007; }

    public String getFrauField008() { return frauField008; }
    public void setFrauField008(String frauField008) { this.frauField008 = frauField008; }

    public LocalDate getFrauField009() { return frauField009; }
    public void setFrauField009(LocalDate frauField009) { this.frauField009 = frauField009; }

    public Long getFrauField010() { return frauField010; }
    public void setFrauField010(Long frauField010) { this.frauField010 = frauField010; }

    public Integer getFrauField011() { return frauField011; }
    public void setFrauField011(Integer frauField011) { this.frauField011 = frauField011; }

    public Long getFrauField012() { return frauField012; }
    public void setFrauField012(Long frauField012) { this.frauField012 = frauField012; }

    public Long getFrauField013() { return frauField013; }
    public void setFrauField013(Long frauField013) { this.frauField013 = frauField013; }

    public Long getFrauField014() { return frauField014; }
    public void setFrauField014(Long frauField014) { this.frauField014 = frauField014; }

    public LocalDate getFrauField015() { return frauField015; }
    public void setFrauField015(LocalDate frauField015) { this.frauField015 = frauField015; }

    @Override
    public String toString() {
        return "FraudDto032{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
