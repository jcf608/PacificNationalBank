package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto029 — Data Transfer Object for fraud operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto029 {

    @JsonProperty("frauField000")
    private Integer frauField000;

    @Size(max = 40)
    @JsonProperty("frauField001")
    private String frauField001;

    @JsonProperty("frauField002")
    private Boolean frauField002;

    @JsonProperty("frauField003")
    private Double frauField003;

    @JsonProperty("frauField004")
    private Double frauField004;

    @JsonProperty("frauField005")
    private Boolean frauField005;

    @JsonProperty("frauField006")
    private Integer frauField006;

    @JsonProperty("frauField007")
    private Double frauField007;

    @JsonProperty("frauField008")
    private Long frauField008;

    @JsonProperty("frauField009")
    private Integer frauField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField010")
    private BigDecimal frauField010;

    @JsonProperty("frauField011")
    private Double frauField011;

    @Size(max = 20)
    @JsonProperty("frauField012")
    private String frauField012;

    public FraudDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto029 instance = new FraudDto029();

        public Builder frauField000(Integer val) { instance.frauField000 = val; return this; }
        public Builder frauField001(String val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Boolean val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Double val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Double val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Boolean val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Integer val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Double val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Long val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Integer val) { instance.frauField009 = val; return this; }
        public Builder frauField010(BigDecimal val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Double val) { instance.frauField011 = val; return this; }
        public Builder frauField012(String val) { instance.frauField012 = val; return this; }
        public FraudDto029 build() { return instance; }
    }

    public Integer getFrauField000() { return frauField000; }
    public void setFrauField000(Integer frauField000) { this.frauField000 = frauField000; }

    public String getFrauField001() { return frauField001; }
    public void setFrauField001(String frauField001) { this.frauField001 = frauField001; }

    public Boolean getFrauField002() { return frauField002; }
    public void setFrauField002(Boolean frauField002) { this.frauField002 = frauField002; }

    public Double getFrauField003() { return frauField003; }
    public void setFrauField003(Double frauField003) { this.frauField003 = frauField003; }

    public Double getFrauField004() { return frauField004; }
    public void setFrauField004(Double frauField004) { this.frauField004 = frauField004; }

    public Boolean getFrauField005() { return frauField005; }
    public void setFrauField005(Boolean frauField005) { this.frauField005 = frauField005; }

    public Integer getFrauField006() { return frauField006; }
    public void setFrauField006(Integer frauField006) { this.frauField006 = frauField006; }

    public Double getFrauField007() { return frauField007; }
    public void setFrauField007(Double frauField007) { this.frauField007 = frauField007; }

    public Long getFrauField008() { return frauField008; }
    public void setFrauField008(Long frauField008) { this.frauField008 = frauField008; }

    public Integer getFrauField009() { return frauField009; }
    public void setFrauField009(Integer frauField009) { this.frauField009 = frauField009; }

    public BigDecimal getFrauField010() { return frauField010; }
    public void setFrauField010(BigDecimal frauField010) { this.frauField010 = frauField010; }

    public Double getFrauField011() { return frauField011; }
    public void setFrauField011(Double frauField011) { this.frauField011 = frauField011; }

    public String getFrauField012() { return frauField012; }
    public void setFrauField012(String frauField012) { this.frauField012 = frauField012; }

    @Override
    public String toString() {
        return "FraudDto029{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
