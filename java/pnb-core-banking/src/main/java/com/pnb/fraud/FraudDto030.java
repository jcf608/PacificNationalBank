package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto030 — Data Transfer Object for fraud operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto030 {

    @JsonProperty("frauField000")
    private LocalDate frauField000;

    @JsonProperty("frauField001")
    private LocalDate frauField001;

    @JsonProperty("frauField002")
    private LocalDate frauField002;

    @JsonProperty("frauField003")
    private Long frauField003;

    @JsonProperty("frauField004")
    private Long frauField004;

    @JsonProperty("frauField005")
    private Boolean frauField005;

    @JsonProperty("frauField006")
    private Long frauField006;

    @Size(max = 60)
    @JsonProperty("frauField007")
    private String frauField007;

    @JsonProperty("frauField008")
    private Double frauField008;

    @JsonProperty("frauField009")
    private Integer frauField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField010")
    private BigDecimal frauField010;

    @Size(max = 100)
    @JsonProperty("frauField011")
    private String frauField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField012")
    private BigDecimal frauField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField013")
    private BigDecimal frauField013;

    public FraudDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto030 instance = new FraudDto030();

        public Builder frauField000(LocalDate val) { instance.frauField000 = val; return this; }
        public Builder frauField001(LocalDate val) { instance.frauField001 = val; return this; }
        public Builder frauField002(LocalDate val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Long val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Long val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Boolean val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Long val) { instance.frauField006 = val; return this; }
        public Builder frauField007(String val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Double val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Integer val) { instance.frauField009 = val; return this; }
        public Builder frauField010(BigDecimal val) { instance.frauField010 = val; return this; }
        public Builder frauField011(String val) { instance.frauField011 = val; return this; }
        public Builder frauField012(BigDecimal val) { instance.frauField012 = val; return this; }
        public Builder frauField013(BigDecimal val) { instance.frauField013 = val; return this; }
        public FraudDto030 build() { return instance; }
    }

    public LocalDate getFrauField000() { return frauField000; }
    public void setFrauField000(LocalDate frauField000) { this.frauField000 = frauField000; }

    public LocalDate getFrauField001() { return frauField001; }
    public void setFrauField001(LocalDate frauField001) { this.frauField001 = frauField001; }

    public LocalDate getFrauField002() { return frauField002; }
    public void setFrauField002(LocalDate frauField002) { this.frauField002 = frauField002; }

    public Long getFrauField003() { return frauField003; }
    public void setFrauField003(Long frauField003) { this.frauField003 = frauField003; }

    public Long getFrauField004() { return frauField004; }
    public void setFrauField004(Long frauField004) { this.frauField004 = frauField004; }

    public Boolean getFrauField005() { return frauField005; }
    public void setFrauField005(Boolean frauField005) { this.frauField005 = frauField005; }

    public Long getFrauField006() { return frauField006; }
    public void setFrauField006(Long frauField006) { this.frauField006 = frauField006; }

    public String getFrauField007() { return frauField007; }
    public void setFrauField007(String frauField007) { this.frauField007 = frauField007; }

    public Double getFrauField008() { return frauField008; }
    public void setFrauField008(Double frauField008) { this.frauField008 = frauField008; }

    public Integer getFrauField009() { return frauField009; }
    public void setFrauField009(Integer frauField009) { this.frauField009 = frauField009; }

    public BigDecimal getFrauField010() { return frauField010; }
    public void setFrauField010(BigDecimal frauField010) { this.frauField010 = frauField010; }

    public String getFrauField011() { return frauField011; }
    public void setFrauField011(String frauField011) { this.frauField011 = frauField011; }

    public BigDecimal getFrauField012() { return frauField012; }
    public void setFrauField012(BigDecimal frauField012) { this.frauField012 = frauField012; }

    public BigDecimal getFrauField013() { return frauField013; }
    public void setFrauField013(BigDecimal frauField013) { this.frauField013 = frauField013; }

    @Override
    public String toString() {
        return "FraudDto030{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
