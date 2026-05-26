package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto041 — Data Transfer Object for fraud operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto041 {

    @JsonProperty("frauField000")
    private LocalDate frauField000;

    @JsonProperty("frauField001")
    private LocalDate frauField001;

    @JsonProperty("frauField002")
    private LocalDate frauField002;

    @Size(max = 60)
    @JsonProperty("frauField003")
    private String frauField003;

    @JsonProperty("frauField004")
    private Integer frauField004;

    @JsonProperty("frauField005")
    private Long frauField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("frauField006")
    private BigDecimal frauField006;

    @Size(max = 60)
    @JsonProperty("frauField007")
    private String frauField007;

    @JsonProperty("frauField008")
    private Boolean frauField008;

    @Size(max = 200)
    @JsonProperty("frauField009")
    private String frauField009;

    @JsonProperty("frauField010")
    private Double frauField010;

    @JsonProperty("frauField011")
    private Boolean frauField011;

    @JsonProperty("frauField012")
    private Long frauField012;

    public FraudDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto041 instance = new FraudDto041();

        public Builder frauField000(LocalDate val) { instance.frauField000 = val; return this; }
        public Builder frauField001(LocalDate val) { instance.frauField001 = val; return this; }
        public Builder frauField002(LocalDate val) { instance.frauField002 = val; return this; }
        public Builder frauField003(String val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Integer val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Long val) { instance.frauField005 = val; return this; }
        public Builder frauField006(BigDecimal val) { instance.frauField006 = val; return this; }
        public Builder frauField007(String val) { instance.frauField007 = val; return this; }
        public Builder frauField008(Boolean val) { instance.frauField008 = val; return this; }
        public Builder frauField009(String val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Double val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Boolean val) { instance.frauField011 = val; return this; }
        public Builder frauField012(Long val) { instance.frauField012 = val; return this; }
        public FraudDto041 build() { return instance; }
    }

    public LocalDate getFrauField000() { return frauField000; }
    public void setFrauField000(LocalDate frauField000) { this.frauField000 = frauField000; }

    public LocalDate getFrauField001() { return frauField001; }
    public void setFrauField001(LocalDate frauField001) { this.frauField001 = frauField001; }

    public LocalDate getFrauField002() { return frauField002; }
    public void setFrauField002(LocalDate frauField002) { this.frauField002 = frauField002; }

    public String getFrauField003() { return frauField003; }
    public void setFrauField003(String frauField003) { this.frauField003 = frauField003; }

    public Integer getFrauField004() { return frauField004; }
    public void setFrauField004(Integer frauField004) { this.frauField004 = frauField004; }

    public Long getFrauField005() { return frauField005; }
    public void setFrauField005(Long frauField005) { this.frauField005 = frauField005; }

    public BigDecimal getFrauField006() { return frauField006; }
    public void setFrauField006(BigDecimal frauField006) { this.frauField006 = frauField006; }

    public String getFrauField007() { return frauField007; }
    public void setFrauField007(String frauField007) { this.frauField007 = frauField007; }

    public Boolean getFrauField008() { return frauField008; }
    public void setFrauField008(Boolean frauField008) { this.frauField008 = frauField008; }

    public String getFrauField009() { return frauField009; }
    public void setFrauField009(String frauField009) { this.frauField009 = frauField009; }

    public Double getFrauField010() { return frauField010; }
    public void setFrauField010(Double frauField010) { this.frauField010 = frauField010; }

    public Boolean getFrauField011() { return frauField011; }
    public void setFrauField011(Boolean frauField011) { this.frauField011 = frauField011; }

    public Long getFrauField012() { return frauField012; }
    public void setFrauField012(Long frauField012) { this.frauField012 = frauField012; }

    @Override
    public String toString() {
        return "FraudDto041{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
