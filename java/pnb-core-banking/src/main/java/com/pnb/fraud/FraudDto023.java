package com.pnb.fraud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FraudDto023 — Data Transfer Object for fraud operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDto023 {

    @JsonProperty("frauField000")
    private Long frauField000;

    @JsonProperty("frauField001")
    private Integer frauField001;

    @JsonProperty("frauField002")
    private Boolean frauField002;

    @Size(max = 200)
    @JsonProperty("frauField003")
    private String frauField003;

    @Size(max = 60)
    @JsonProperty("frauField004")
    private String frauField004;

    @JsonProperty("frauField005")
    private LocalDate frauField005;

    @JsonProperty("frauField006")
    private Integer frauField006;

    @JsonProperty("frauField007")
    private LocalDate frauField007;

    @Size(max = 200)
    @JsonProperty("frauField008")
    private String frauField008;

    @JsonProperty("frauField009")
    private Double frauField009;

    @JsonProperty("frauField010")
    private Integer frauField010;

    @JsonProperty("frauField011")
    private LocalDate frauField011;

    @JsonProperty("frauField012")
    private Integer frauField012;

    @JsonProperty("frauField013")
    private Boolean frauField013;

    @Size(max = 200)
    @JsonProperty("frauField014")
    private String frauField014;

    @Size(max = 20)
    @JsonProperty("frauField015")
    private String frauField015;

    @Size(max = 200)
    @JsonProperty("frauField016")
    private String frauField016;

    @JsonProperty("frauField017")
    private Long frauField017;

    @JsonProperty("frauField018")
    private Long frauField018;

    public FraudDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FraudDto023 instance = new FraudDto023();

        public Builder frauField000(Long val) { instance.frauField000 = val; return this; }
        public Builder frauField001(Integer val) { instance.frauField001 = val; return this; }
        public Builder frauField002(Boolean val) { instance.frauField002 = val; return this; }
        public Builder frauField003(String val) { instance.frauField003 = val; return this; }
        public Builder frauField004(String val) { instance.frauField004 = val; return this; }
        public Builder frauField005(LocalDate val) { instance.frauField005 = val; return this; }
        public Builder frauField006(Integer val) { instance.frauField006 = val; return this; }
        public Builder frauField007(LocalDate val) { instance.frauField007 = val; return this; }
        public Builder frauField008(String val) { instance.frauField008 = val; return this; }
        public Builder frauField009(Double val) { instance.frauField009 = val; return this; }
        public Builder frauField010(Integer val) { instance.frauField010 = val; return this; }
        public Builder frauField011(LocalDate val) { instance.frauField011 = val; return this; }
        public Builder frauField012(Integer val) { instance.frauField012 = val; return this; }
        public Builder frauField013(Boolean val) { instance.frauField013 = val; return this; }
        public Builder frauField014(String val) { instance.frauField014 = val; return this; }
        public Builder frauField015(String val) { instance.frauField015 = val; return this; }
        public Builder frauField016(String val) { instance.frauField016 = val; return this; }
        public Builder frauField017(Long val) { instance.frauField017 = val; return this; }
        public Builder frauField018(Long val) { instance.frauField018 = val; return this; }
        public FraudDto023 build() { return instance; }
    }

    public Long getFrauField000() { return frauField000; }
    public void setFrauField000(Long frauField000) { this.frauField000 = frauField000; }

    public Integer getFrauField001() { return frauField001; }
    public void setFrauField001(Integer frauField001) { this.frauField001 = frauField001; }

    public Boolean getFrauField002() { return frauField002; }
    public void setFrauField002(Boolean frauField002) { this.frauField002 = frauField002; }

    public String getFrauField003() { return frauField003; }
    public void setFrauField003(String frauField003) { this.frauField003 = frauField003; }

    public String getFrauField004() { return frauField004; }
    public void setFrauField004(String frauField004) { this.frauField004 = frauField004; }

    public LocalDate getFrauField005() { return frauField005; }
    public void setFrauField005(LocalDate frauField005) { this.frauField005 = frauField005; }

    public Integer getFrauField006() { return frauField006; }
    public void setFrauField006(Integer frauField006) { this.frauField006 = frauField006; }

    public LocalDate getFrauField007() { return frauField007; }
    public void setFrauField007(LocalDate frauField007) { this.frauField007 = frauField007; }

    public String getFrauField008() { return frauField008; }
    public void setFrauField008(String frauField008) { this.frauField008 = frauField008; }

    public Double getFrauField009() { return frauField009; }
    public void setFrauField009(Double frauField009) { this.frauField009 = frauField009; }

    public Integer getFrauField010() { return frauField010; }
    public void setFrauField010(Integer frauField010) { this.frauField010 = frauField010; }

    public LocalDate getFrauField011() { return frauField011; }
    public void setFrauField011(LocalDate frauField011) { this.frauField011 = frauField011; }

    public Integer getFrauField012() { return frauField012; }
    public void setFrauField012(Integer frauField012) { this.frauField012 = frauField012; }

    public Boolean getFrauField013() { return frauField013; }
    public void setFrauField013(Boolean frauField013) { this.frauField013 = frauField013; }

    public String getFrauField014() { return frauField014; }
    public void setFrauField014(String frauField014) { this.frauField014 = frauField014; }

    public String getFrauField015() { return frauField015; }
    public void setFrauField015(String frauField015) { this.frauField015 = frauField015; }

    public String getFrauField016() { return frauField016; }
    public void setFrauField016(String frauField016) { this.frauField016 = frauField016; }

    public Long getFrauField017() { return frauField017; }
    public void setFrauField017(Long frauField017) { this.frauField017 = frauField017; }

    public Long getFrauField018() { return frauField018; }
    public void setFrauField018(Long frauField018) { this.frauField018 = frauField018; }

    @Override
    public String toString() {
        return "FraudDto023{" +
            "frauField000=" + frauField000 + ", " +
            "frauField001=" + frauField001 + ", " +
            "frauField002=" + frauField002 + ", " +
            "frauField003=" + frauField003 + ", " +
            "frauField004=" + frauField004 + ", " +
            "}";
    }
}
