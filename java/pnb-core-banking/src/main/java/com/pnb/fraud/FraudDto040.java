package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto040 — Data Transfer Object for fraud operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto040 {

    @JsonProperty("frauField000")
    private Integer frauField000;

    @JsonProperty("frauField001")
    private Integer frauField001;

    @JsonProperty("frauField002")
    private Integer frauField002;

    @JsonProperty("frauField003")
    private LocalDate frauField003;

    @JsonProperty("frauField004")
    private Long frauField004;

    @JsonProperty("frauField005")
    private Integer frauField005;

    @JsonProperty("frauField006")
    private Double frauField006;

    @JsonProperty("frauField007")
    private Boolean frauField007;

    @JsonProperty("frauField008")
    private LocalDate frauField008;

    @JsonProperty("frauField009")
    private Long frauField009;

    @JsonProperty("frauField010")
    private Integer frauField010;

    @JsonProperty("frauField011")
    private Double frauField011;

    public FraudDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto040 instance = new FraudDto040();

        public Builder frauField000(Integer val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Integer val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Integer val) { instance.frauField002 = val; return this; }
        public Builder frauField003(LocalDate val) { instance.frauField003 = val; return this; }
        public Builder frauField004(Long val) { instance.frauField004 = val; return this; }
        public Builder frauField005(Integer val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Double val) { instance.frauField006 = val; return this; }
        public Builder frauField007(Boolean val) { instance.frauField007 = val; return this; }
        public Builder frauField008(LocalDate val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Long val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Integer val) { instance.frauField010 = val; return this; }
        public Builder frauField011(Double val) { instance.frauField011 = val; return this; }
        public FraudDto040 build() { return instance; }
    }

    public Integer getFrauField000() { return frauField000; }
    public void setFrauField000(Integer frauField000) { this.frauField000 = frauField000; }

    public Integer getFrauField001() { return frauField001; }
    public void setFrauField001(Integer frauField001) { this.frauField001 = frauField001; }

    public Integer getFrauField002() { return frauField002; }
    public void setFrauField002(Integer frauField002) { this.frauField002 = frauField002; }

    public LocalDate getFrauField003() { return frauField003; }
    public void setFrauField003(LocalDate frauField003) { this.frauField003 = frauField003; }

    public Long getFrauField004() { return frauField004; }
    public void setFrauField004(Long frauField004) { this.frauField004 = frauField004; }

    public Integer getFrauField005() { return frauField005; }
    public void setFrauField005(Integer frauField005) { this.frauField005 = frauField005; }

    public Double getFrauField006() { return frauField006; }
    public void setFrauField006(Double frauField006) { this.frauField006 = frauField006; }

    public Boolean getFrauField007() { return frauField007; }
    public void setFrauField007(Boolean frauField007) { this.frauField007 = frauField007; }

    public LocalDate getFrauField008() { return frauField008; }
    public void setFrauField008(LocalDate frauField008) { this.frauField008 = frauField008; }

    public Long getFrauField009() { return frauField009; }
    public void setFrauField009(Long frauField009) { this.frauField009 = frauField009; }

    public Integer getFrauField010() { return frauField010; }
    public void setFrauField010(Integer frauField010) { this.frauField010 = frauField010; }

    public Double getFrauField011() { return frauField011; }
    public void setFrauField011(Double frauField011) { this.frauField011 = frauField011; }

    @Override
    public String toString() {
        return "FraudDto040{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
