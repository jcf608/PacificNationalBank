package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto042 — Data Transfer Object for fraud operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto042 {

    @Size(max = 20)
    @JsonProperty("frauField000")
    private String frauField000;

    @JsonProperty("frauField001")
    private Double frauField001;

    @JsonProperty("frauField002")
    private Integer frauField002;

    @JsonProperty("frauField003")
    private LocalDate frauField003;

    @JsonProperty("frauField004")
    private LocalDate frauField004;

    @JsonProperty("frauField005")
    private Double frauField005;

    @JsonProperty("frauField006")
    private Boolean frauField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField007")
    private BigDecimal frauField007;

    @Size(max = 60)
    @JsonProperty("frauField008")
    private String frauField008;

    @JsonProperty("frauField009")
    private Double frauField009;

    @JsonProperty("frauField010")
    private Integer frauField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField011")
    private BigDecimal frauField011;

    @Size(max = 60)
    @JsonProperty("frauField012")
    private String frauField012;

    @JsonProperty("frauField013")
    private Integer frauField013;

    public FraudDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto042 instance = new FraudDto042();

        public Builder frauField000(String val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Double val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Integer val) { instance.frauField002 = val; return this; }
        public Builder frauField003(LocalDate val) { instance.frauField003 = val; return this; }
        public Builder frauField004(LocalDate val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Double val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Boolean val) { instance.frauField006 = val; return this; }
        public Builder frauField007(BigDecimal val) { instance.frauField007 = val; return this; }
        public Builder frauField008(String val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Double val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Integer val) { instance.frauField010 = val; return this; }
        public Builder frauField011(BigDecimal val) { instance.frauField011 = val; return this; }
        public Builder frauField012(String val) { instance.frauField012 = val; return this; }
        public Builder frauField013(Integer val) { instance.frauField013 = val; return this; }
        public FraudDto042 build() { return instance; }
    }

    public String getFrauField000() { return frauField000; }
    public void setFrauField000(String frauField000) { this.frauField000 = frauField000; }

    public Double getFrauField001() { return frauField001; }
    public void setFrauField001(Double frauField001) { this.frauField001 = frauField001; }

    public Integer getFrauField002() { return frauField002; }
    public void setFrauField002(Integer frauField002) { this.frauField002 = frauField002; }

    public LocalDate getFrauField003() { return frauField003; }
    public void setFrauField003(LocalDate frauField003) { this.frauField003 = frauField003; }

    public LocalDate getFrauField004() { return frauField004; }
    public void setFrauField004(LocalDate frauField004) { this.frauField004 = frauField004; }

    public Double getFrauField005() { return frauField005; }
    public void setFrauField005(Double frauField005) { this.frauField005 = frauField005; }

    public Boolean getFrauField006() { return frauField006; }
    public void setFrauField006(Boolean frauField006) { this.frauField006 = frauField006; }

    public BigDecimal getFrauField007() { return frauField007; }
    public void setFrauField007(BigDecimal frauField007) { this.frauField007 = frauField007; }

    public String getFrauField008() { return frauField008; }
    public void setFrauField008(String frauField008) { this.frauField008 = frauField008; }

    public Double getFrauField009() { return frauField009; }
    public void setFrauField009(Double frauField009) { this.frauField009 = frauField009; }

    public Integer getFrauField010() { return frauField010; }
    public void setFrauField010(Integer frauField010) { this.frauField010 = frauField010; }

    public BigDecimal getFrauField011() { return frauField011; }
    public void setFrauField011(BigDecimal frauField011) { this.frauField011 = frauField011; }

    public String getFrauField012() { return frauField012; }
    public void setFrauField012(String frauField012) { this.frauField012 = frauField012; }

    public Integer getFrauField013() { return frauField013; }
    public void setFrauField013(Integer frauField013) { this.frauField013 = frauField013; }

    @Override
    public String toString() {
        return "FraudDto042{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
