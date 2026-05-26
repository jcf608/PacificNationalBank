package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto053 — Data Transfer Object for fraud operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto053 {

    @Size(max = 100)
    @JsonProperty("frauField000")
    private String frauField000;

    @Size(max = 100)
    @JsonProperty("frauField001")
    private String frauField001;

    @JsonProperty("frauField002")
    private Boolean frauField002;

    @Size(max = 40)
    @JsonProperty("frauField003")
    private String frauField003;

    @JsonProperty("frauField004")
    private Double frauField004;

    @JsonProperty("frauField005")
    private Boolean frauField005;

    @JsonProperty("frauField006")
    private Integer frauField006;

    @JsonProperty("frauField007")
    private Long frauField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField008")
    private BigDecimal frauField008;

    @Size(max = 40)
    @JsonProperty("frauField009")
    private String frauField009;

    @JsonProperty("frauField010")
    private LocalDate frauField010;

    @JsonProperty("frauField011")
    private Double frauField011;

    @Size(max = 100)
    @JsonProperty("frauField012")
    private String frauField012;

    public FraudDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto053 instance = new FraudDto053();

        public Builder frauField000(String val) { instance.frauField000 = val; return this; }
        public Builder frauField001(String val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Boolean val) { instance.frauField002 = val; return this; }
        public Builder frauField003(String val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Double val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Boolean val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Integer val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Long val) { instance.frauField007 = val; return this; }
        public Builder frauField008(BigDecimal val) { instance.frauField008 = val; return this; }
        public Builder frauField009(String val) { instance.frauField009 = val; return this; }
        public Builder frauField010(LocalDate val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Double val) { instance.frauField011 = val; return this; }
        public Builder frauField012(String val) { instance.frauField012 = val; return this; }
        public FraudDto053 build() { return instance; }
    }

    public String getFrauField000() { return frauField000; }
    public void setFrauField000(String frauField000) { this.frauField000 = frauField000; }

    public String getFrauField001() { return frauField001; }
    public void setFrauField001(String frauField001) { this.frauField001 = frauField001; }

    public Boolean getFrauField002() { return frauField002; }
    public void setFrauField002(Boolean frauField002) { this.frauField002 = frauField002; }

    public String getFrauField003() { return frauField003; }
    public void setFrauField003(String frauField003) { this.frauField003 = frauField003; }

    public Double getFrauField004() { return frauField004; }
    public void setFrauField004(Double frauField004) { this.frauField004 = frauField004; }

    public Boolean getFrauField005() { return frauField005; }
    public void setFrauField005(Boolean frauField005) { this.frauField005 = frauField005; }

    public Integer getFrauField006() { return frauField006; }
    public void setFrauField006(Integer frauField006) { this.frauField006 = frauField006; }

    public Long getFrauField007() { return frauField007; }
    public void setFrauField007(Long frauField007) { this.frauField007 = frauField007; }

    public BigDecimal getFrauField008() { return frauField008; }
    public void setFrauField008(BigDecimal frauField008) { this.frauField008 = frauField008; }

    public String getFrauField009() { return frauField009; }
    public void setFrauField009(String frauField009) { this.frauField009 = frauField009; }

    public LocalDate getFrauField010() { return frauField010; }
    public void setFrauField010(LocalDate frauField010) { this.frauField010 = frauField010; }

    public Double getFrauField011() { return frauField011; }
    public void setFrauField011(Double frauField011) { this.frauField011 = frauField011; }

    public String getFrauField012() { return frauField012; }
    public void setFrauField012(String frauField012) { this.frauField012 = frauField012; }

    @Override
    public String toString() {
        return "FraudDto053{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
