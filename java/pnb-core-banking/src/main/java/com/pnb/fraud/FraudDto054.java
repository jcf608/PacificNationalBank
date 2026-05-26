package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto054 — Data Transfer Object for fraud operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto054 {

    @JsonProperty("frauField000")
    private LocalDate frauField000;

    @JsonProperty("frauField001")
    private LocalDate frauField001;

    @JsonProperty("frauField002")
    private Long frauField002;

    @JsonProperty("frauField003")
    private Integer frauField003;

    @JsonProperty("frauField004")
    private Long frauField004;

    @JsonProperty("frauField005")
    private Long frauField005;

    @JsonProperty("frauField006")
    private Boolean frauField006;

    @Size(max = 60)
    @JsonProperty("frauField007")
    private String frauField007;

    @Size(max = 20)
    @JsonProperty("frauField008")
    private String frauField008;

    @JsonProperty("frauField009")
    private Long frauField009;

    @Size(max = 200)
    @JsonProperty("frauField010")
    private String frauField010;

    @JsonProperty("frauField011")
    private Double frauField011;

    @JsonProperty("frauField012")
    private Long frauField012;

    @Size(max = 200)
    @JsonProperty("frauField013")
    private String frauField013;

    public FraudDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto054 instance = new FraudDto054();

        public Builder frauField000(LocalDate val) { instance.frauField000 = val; return this; }
        public Builder frauField001(LocalDate val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Long val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Integer val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Long val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Long val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Boolean val) { instance.frauField006 = val; return this; }
        public Builder frauField007(String val) { instance.frauField007 = val; return this; }
        public Builder frauField008(String val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Long val) { instance.frauField009 = val; return this; }
        public Builder frauField010(String val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Double val) { instance.frauField011 = val; return this; }
        public Builder frauField012(Long val) { instance.frauField012 = val; return this; }
        public Builder frauField013(String val) { instance.frauField013 = val; return this; }
        public FraudDto054 build() { return instance; }
    }

    public LocalDate getFrauField000() { return frauField000; }
    public void setFrauField000(LocalDate frauField000) { this.frauField000 = frauField000; }

    public LocalDate getFrauField001() { return frauField001; }
    public void setFrauField001(LocalDate frauField001) { this.frauField001 = frauField001; }

    public Long getFrauField002() { return frauField002; }
    public void setFrauField002(Long frauField002) { this.frauField002 = frauField002; }

    public Integer getFrauField003() { return frauField003; }
    public void setFrauField003(Integer frauField003) { this.frauField003 = frauField003; }

    public Long getFrauField004() { return frauField004; }
    public void setFrauField004(Long frauField004) { this.frauField004 = frauField004; }

    public Long getFrauField005() { return frauField005; }
    public void setFrauField005(Long frauField005) { this.frauField005 = frauField005; }

    public Boolean getFrauField006() { return frauField006; }
    public void setFrauField006(Boolean frauField006) { this.frauField006 = frauField006; }

    public String getFrauField007() { return frauField007; }
    public void setFrauField007(String frauField007) { this.frauField007 = frauField007; }

    public String getFrauField008() { return frauField008; }
    public void setFrauField008(String frauField008) { this.frauField008 = frauField008; }

    public Long getFrauField009() { return frauField009; }
    public void setFrauField009(Long frauField009) { this.frauField009 = frauField009; }

    public String getFrauField010() { return frauField010; }
    public void setFrauField010(String frauField010) { this.frauField010 = frauField010; }

    public Double getFrauField011() { return frauField011; }
    public void setFrauField011(Double frauField011) { this.frauField011 = frauField011; }

    public Long getFrauField012() { return frauField012; }
    public void setFrauField012(Long frauField012) { this.frauField012 = frauField012; }

    public String getFrauField013() { return frauField013; }
    public void setFrauField013(String frauField013) { this.frauField013 = frauField013; }

    @Override
    public String toString() {
        return "FraudDto054{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
