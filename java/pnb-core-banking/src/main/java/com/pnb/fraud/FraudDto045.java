package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto045 — Data Transfer Object for fraud operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto045 {

    @JsonProperty("frauField000")
    private LocalDate frauField000;

    @Size(max = 20)
    @JsonProperty("frauField001")
    private String frauField001;

    @Size(max = 60)
    @JsonProperty("frauField002")
    private String frauField002;

    @JsonProperty("frauField003")
    private Long frauField003;

    @JsonProperty("frauField004")
    private Double frauField004;

    @JsonProperty("frauField005")
    private Boolean frauField005;

    @JsonProperty("frauField006")
    private LocalDate frauField006;

    @JsonProperty("frauField007")
    private Integer frauField007;

    @JsonProperty("frauField008")
    private Long frauField008;

    @JsonProperty("frauField009")
    private Integer frauField009;

    @JsonProperty("frauField010")
    private LocalDate frauField010;

    @JsonProperty("frauField011")
    private Boolean frauField011;

    @JsonProperty("frauField012")
    private Boolean frauField012;

    @Size(max = 200)
    @JsonProperty("frauField013")
    private String frauField013;

    @JsonProperty("frauField014")
    private Long frauField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField015")
    private BigDecimal frauField015;

    @Size(max = 100)
    @JsonProperty("frauField016")
    private String frauField016;

    public FraudDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto045 instance = new FraudDto045();

        public Builder frauField000(LocalDate val) { instance.frauField000 = val; return this; }
        public Builder frauField001(String val) { instance.frauField001 = val; return this; }
        public Builder frauField002(String val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Long val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Double val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Boolean val) { instance.frauField005 = val; return this; }
        public Builder frauField006(LocalDate val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Integer val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Long val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Integer val) { instance.frauField009 = val; return this; }
        public Builder frauField010(LocalDate val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Boolean val) { instance.frauField011 = val; return this; }
        public Builder frauField012(Boolean val) { instance.frauField012 = val; return this; }
        public Builder frauField013(String val) { instance.frauField013 = val; return this; }
        public Builder frauField014(Long val) { instance.frauField014 = val; return this; }
        public Builder frauField015(BigDecimal val) { instance.frauField015 = val; return this; }
        public Builder frauField016(String val) { instance.frauField016 = val; return this; }
        public FraudDto045 build() { return instance; }
    }

    public LocalDate getFrauField000() { return frauField000; }
    public void setFrauField000(LocalDate frauField000) { this.frauField000 = frauField000; }

    public String getFrauField001() { return frauField001; }
    public void setFrauField001(String frauField001) { this.frauField001 = frauField001; }

    public String getFrauField002() { return frauField002; }
    public void setFrauField002(String frauField002) { this.frauField002 = frauField002; }

    public Long getFrauField003() { return frauField003; }
    public void setFrauField003(Long frauField003) { this.frauField003 = frauField003; }

    public Double getFrauField004() { return frauField004; }
    public void setFrauField004(Double frauField004) { this.frauField004 = frauField004; }

    public Boolean getFrauField005() { return frauField005; }
    public void setFrauField005(Boolean frauField005) { this.frauField005 = frauField005; }

    public LocalDate getFrauField006() { return frauField006; }
    public void setFrauField006(LocalDate frauField006) { this.frauField006 = frauField006; }

    public Integer getFrauField007() { return frauField007; }
    public void setFrauField007(Integer frauField007) { this.frauField007 = frauField007; }

    public Long getFrauField008() { return frauField008; }
    public void setFrauField008(Long frauField008) { this.frauField008 = frauField008; }

    public Integer getFrauField009() { return frauField009; }
    public void setFrauField009(Integer frauField009) { this.frauField009 = frauField009; }

    public LocalDate getFrauField010() { return frauField010; }
    public void setFrauField010(LocalDate frauField010) { this.frauField010 = frauField010; }

    public Boolean getFrauField011() { return frauField011; }
    public void setFrauField011(Boolean frauField011) { this.frauField011 = frauField011; }

    public Boolean getFrauField012() { return frauField012; }
    public void setFrauField012(Boolean frauField012) { this.frauField012 = frauField012; }

    public String getFrauField013() { return frauField013; }
    public void setFrauField013(String frauField013) { this.frauField013 = frauField013; }

    public Long getFrauField014() { return frauField014; }
    public void setFrauField014(Long frauField014) { this.frauField014 = frauField014; }

    public BigDecimal getFrauField015() { return frauField015; }
    public void setFrauField015(BigDecimal frauField015) { this.frauField015 = frauField015; }

    public String getFrauField016() { return frauField016; }
    public void setFrauField016(String frauField016) { this.frauField016 = frauField016; }

    @Override
    public String toString() {
        return "FraudDto045{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
