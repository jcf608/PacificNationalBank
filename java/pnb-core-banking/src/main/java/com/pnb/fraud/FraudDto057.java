package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto057 — Data Transfer Object for fraud operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto057 {

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField000")
    private BigDecimal frauField000;

    @JsonProperty("frauField001")
    private Boolean frauField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField002")
    private BigDecimal frauField002;

    @JsonProperty("frauField003")
    private Long frauField003;

    @JsonProperty("frauField004")
    private Integer frauField004;

    @JsonProperty("frauField005")
    private LocalDate frauField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField006")
    private BigDecimal frauField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField007")
    private BigDecimal frauField007;

    @Size(max = 20)
    @JsonProperty("frauField008")
    private String frauField008;

    @JsonProperty("frauField009")
    private Integer frauField009;

    @JsonProperty("frauField010")
    private Boolean frauField010;

    @JsonProperty("frauField011")
    private Double frauField011;

    @JsonProperty("frauField012")
    private Boolean frauField012;

    @Size(max = 100)
    @JsonProperty("frauField013")
    private String frauField013;

    @JsonProperty("frauField014")
    private LocalDate frauField014;

    @JsonProperty("frauField015")
    private Boolean frauField015;

    @Size(max = 40)
    @JsonProperty("frauField016")
    private String frauField016;

    public FraudDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto057 instance = new FraudDto057();

        public Builder frauField000(BigDecimal val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Boolean val) { instance.frauField001 = val; return this; }
        public Builder frauField002(BigDecimal val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Long val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Integer val) { instance.frauField004 = val; return this; }
        public Builder frauField005(LocalDate val) { instance.frauField005 = val; return this; }
        public Builder frauField006(BigDecimal val) { instance.frauField006 = val; return this; }
        public Builder frauField007(BigDecimal val) { instance.frauField007 = val; return this; }
        public Builder frauField008(String val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Integer val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Boolean val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Double val) { instance.frauField011 = val; return this; }
        public Builder frauField012(Boolean val) { instance.frauField012 = val; return this; }
        public Builder frauField013(String val) { instance.frauField013 = val; return this; }
        public Builder frauField014(LocalDate val) { instance.frauField014 = val; return this; }
        public Builder frauField015(Boolean val) { instance.frauField015 = val; return this; }
        public Builder frauField016(String val) { instance.frauField016 = val; return this; }
        public FraudDto057 build() { return instance; }
    }

    public BigDecimal getFrauField000() { return frauField000; }
    public void setFrauField000(BigDecimal frauField000) { this.frauField000 = frauField000; }

    public Boolean getFrauField001() { return frauField001; }
    public void setFrauField001(Boolean frauField001) { this.frauField001 = frauField001; }

    public BigDecimal getFrauField002() { return frauField002; }
    public void setFrauField002(BigDecimal frauField002) { this.frauField002 = frauField002; }

    public Long getFrauField003() { return frauField003; }
    public void setFrauField003(Long frauField003) { this.frauField003 = frauField003; }

    public Integer getFrauField004() { return frauField004; }
    public void setFrauField004(Integer frauField004) { this.frauField004 = frauField004; }

    public LocalDate getFrauField005() { return frauField005; }
    public void setFrauField005(LocalDate frauField005) { this.frauField005 = frauField005; }

    public BigDecimal getFrauField006() { return frauField006; }
    public void setFrauField006(BigDecimal frauField006) { this.frauField006 = frauField006; }

    public BigDecimal getFrauField007() { return frauField007; }
    public void setFrauField007(BigDecimal frauField007) { this.frauField007 = frauField007; }

    public String getFrauField008() { return frauField008; }
    public void setFrauField008(String frauField008) { this.frauField008 = frauField008; }

    public Integer getFrauField009() { return frauField009; }
    public void setFrauField009(Integer frauField009) { this.frauField009 = frauField009; }

    public Boolean getFrauField010() { return frauField010; }
    public void setFrauField010(Boolean frauField010) { this.frauField010 = frauField010; }

    public Double getFrauField011() { return frauField011; }
    public void setFrauField011(Double frauField011) { this.frauField011 = frauField011; }

    public Boolean getFrauField012() { return frauField012; }
    public void setFrauField012(Boolean frauField012) { this.frauField012 = frauField012; }

    public String getFrauField013() { return frauField013; }
    public void setFrauField013(String frauField013) { this.frauField013 = frauField013; }

    public LocalDate getFrauField014() { return frauField014; }
    public void setFrauField014(LocalDate frauField014) { this.frauField014 = frauField014; }

    public Boolean getFrauField015() { return frauField015; }
    public void setFrauField015(Boolean frauField015) { this.frauField015 = frauField015; }

    public String getFrauField016() { return frauField016; }
    public void setFrauField016(String frauField016) { this.frauField016 = frauField016; }

    @Override
    public String toString() {
        return "FraudDto057{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
