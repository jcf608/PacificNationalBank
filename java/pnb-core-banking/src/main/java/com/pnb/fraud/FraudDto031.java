package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto031 — Data Transfer Object for fraud operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto031 {

    @JsonProperty("frauField000")
    private Long frauField000;

    @JsonProperty("frauField001")
    private Boolean frauField001;

    @JsonProperty("frauField002")
    private Boolean frauField002;

    @JsonProperty("frauField003")
    private Integer frauField003;

    @Size(max = 100)
    @JsonProperty("frauField004")
    private String frauField004;

    @JsonProperty("frauField005")
    private Long frauField005;

    @Size(max = 100)
    @JsonProperty("frauField006")
    private String frauField006;

    @JsonProperty("frauField007")
    private LocalDate frauField007;

    @Size(max = 40)
    @JsonProperty("frauField008")
    private String frauField008;

    @JsonProperty("frauField009")
    private Integer frauField009;

    @JsonProperty("frauField010")
    private Integer frauField010;

    @JsonProperty("frauField011")
    private Integer frauField011;

    @JsonProperty("frauField012")
    private Long frauField012;

    @JsonProperty("frauField013")
    private Integer frauField013;

    @JsonProperty("frauField014")
    private LocalDate frauField014;

    public FraudDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto031 instance = new FraudDto031();

        public Builder frauField000(Long val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Boolean val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Boolean val) { instance.frauField002 = val; return this; }
        public Builder frauField003(Integer val) { instance.frauField003 = val; return this; }
        public Builder frauField004(String val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Long val) { instance.frauField005 = val; return this; }
        public Builder frauField006(String val) { instance.frauField006 = val; return this; }
        public Builder frauField007(LocalDate val) { instance.frauField007 = val; return this; }
        public Builder frauField008(String val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Integer val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Integer val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Integer val) { instance.frauField011 = val; return this; }
        public Builder frauField012(Long val) { instance.frauField012 = val; return this; }
        public Builder frauField013(Integer val) { instance.frauField013 = val; return this; }
        public Builder frauField014(LocalDate val) { instance.frauField014 = val; return this; }
        public FraudDto031 build() { return instance; }
    }

    public Long getFrauField000() { return frauField000; }
    public void setFrauField000(Long frauField000) { this.frauField000 = frauField000; }

    public Boolean getFrauField001() { return frauField001; }
    public void setFrauField001(Boolean frauField001) { this.frauField001 = frauField001; }

    public Boolean getFrauField002() { return frauField002; }
    public void setFrauField002(Boolean frauField002) { this.frauField002 = frauField002; }

    public Integer getFrauField003() { return frauField003; }
    public void setFrauField003(Integer frauField003) { this.frauField003 = frauField003; }

    public String getFrauField004() { return frauField004; }
    public void setFrauField004(String frauField004) { this.frauField004 = frauField004; }

    public Long getFrauField005() { return frauField005; }
    public void setFrauField005(Long frauField005) { this.frauField005 = frauField005; }

    public String getFrauField006() { return frauField006; }
    public void setFrauField006(String frauField006) { this.frauField006 = frauField006; }

    public LocalDate getFrauField007() { return frauField007; }
    public void setFrauField007(LocalDate frauField007) { this.frauField007 = frauField007; }

    public String getFrauField008() { return frauField008; }
    public void setFrauField008(String frauField008) { this.frauField008 = frauField008; }

    public Integer getFrauField009() { return frauField009; }
    public void setFrauField009(Integer frauField009) { this.frauField009 = frauField009; }

    public Integer getFrauField010() { return frauField010; }
    public void setFrauField010(Integer frauField010) { this.frauField010 = frauField010; }

    public Integer getFrauField011() { return frauField011; }
    public void setFrauField011(Integer frauField011) { this.frauField011 = frauField011; }

    public Long getFrauField012() { return frauField012; }
    public void setFrauField012(Long frauField012) { this.frauField012 = frauField012; }

    public Integer getFrauField013() { return frauField013; }
    public void setFrauField013(Integer frauField013) { this.frauField013 = frauField013; }

    public LocalDate getFrauField014() { return frauField014; }
    public void setFrauField014(LocalDate frauField014) { this.frauField014 = frauField014; }

    @Override
    public String toString() {
        return "FraudDto031{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
