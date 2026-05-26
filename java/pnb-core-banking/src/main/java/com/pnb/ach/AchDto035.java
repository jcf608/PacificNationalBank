package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto035 — Data Transfer Object for ach operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto035 {

    @DecimalMin(value = "0.00")
    @JsonProperty("achField000")
    private BigDecimal achField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField001")
    private BigDecimal achField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField002")
    private BigDecimal achField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField003")
    private BigDecimal achField003;

    @JsonProperty("achField004")
    private Integer achField004;

    @JsonProperty("achField005")
    private Boolean achField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField006")
    private BigDecimal achField006;

    @JsonProperty("achField007")
    private LocalDate achField007;

    @JsonProperty("achField008")
    private Double achField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField009")
    private BigDecimal achField009;

    @JsonProperty("achField010")
    private Boolean achField010;

    @JsonProperty("achField011")
    private Integer achField011;

    @JsonProperty("achField012")
    private Boolean achField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField013")
    private BigDecimal achField013;

    @JsonProperty("achField014")
    private Double achField014;

    @Size(max = 60)
    @JsonProperty("achField015")
    private String achField015;

    @JsonProperty("achField016")
    private Double achField016;

    @JsonProperty("achField017")
    private Integer achField017;

    @JsonProperty("achField018")
    private LocalDate achField018;

    public AchDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto035 instance = new AchDto035();

        public Builder achField000(BigDecimal val) { instance.achField000 = val; return this; }
        public Builder achField001(BigDecimal val) { instance.achField001 = val; return this; }
        public Builder achField002(BigDecimal val) { instance.achField002 = val; return this; }
        public Builder achField003(BigDecimal val) { instance.achField003 = val; return this; }
        public Builder achField004(Integer val) { instance.achField004 = val; return this; }
        public Builder achField005(Boolean val) { instance.achField005 = val; return this; }
        public Builder achField006(BigDecimal val) { instance.achField006 = val; return this; }
        public Builder achField007(LocalDate val) { instance.achField007 = val; return this; }
        public Builder achField008(Double val) { instance.achField008 = val; return this; }
        public Builder achField009(BigDecimal val) { instance.achField009 = val; return this; }
        public Builder achField010(Boolean val) { instance.achField010 = val; return this; }
        public Builder achField011(Integer val) { instance.achField011 = val; return this; }
        public Builder achField012(Boolean val) { instance.achField012 = val; return this; }
        public Builder achField013(BigDecimal val) { instance.achField013 = val; return this; }
        public Builder achField014(Double val) { instance.achField014 = val; return this; }
        public Builder achField015(String val) { instance.achField015 = val; return this; }
        public Builder achField016(Double val) { instance.achField016 = val; return this; }
        public Builder achField017(Integer val) { instance.achField017 = val; return this; }
        public Builder achField018(LocalDate val) { instance.achField018 = val; return this; }
        public AchDto035 build() { return instance; }
    }

    public BigDecimal getAchField000() { return achField000; }
    public void setAchField000(BigDecimal achField000) { this.achField000 = achField000; }

    public BigDecimal getAchField001() { return achField001; }
    public void setAchField001(BigDecimal achField001) { this.achField001 = achField001; }

    public BigDecimal getAchField002() { return achField002; }
    public void setAchField002(BigDecimal achField002) { this.achField002 = achField002; }

    public BigDecimal getAchField003() { return achField003; }
    public void setAchField003(BigDecimal achField003) { this.achField003 = achField003; }

    public Integer getAchField004() { return achField004; }
    public void setAchField004(Integer achField004) { this.achField004 = achField004; }

    public Boolean getAchField005() { return achField005; }
    public void setAchField005(Boolean achField005) { this.achField005 = achField005; }

    public BigDecimal getAchField006() { return achField006; }
    public void setAchField006(BigDecimal achField006) { this.achField006 = achField006; }

    public LocalDate getAchField007() { return achField007; }
    public void setAchField007(LocalDate achField007) { this.achField007 = achField007; }

    public Double getAchField008() { return achField008; }
    public void setAchField008(Double achField008) { this.achField008 = achField008; }

    public BigDecimal getAchField009() { return achField009; }
    public void setAchField009(BigDecimal achField009) { this.achField009 = achField009; }

    public Boolean getAchField010() { return achField010; }
    public void setAchField010(Boolean achField010) { this.achField010 = achField010; }

    public Integer getAchField011() { return achField011; }
    public void setAchField011(Integer achField011) { this.achField011 = achField011; }

    public Boolean getAchField012() { return achField012; }
    public void setAchField012(Boolean achField012) { this.achField012 = achField012; }

    public BigDecimal getAchField013() { return achField013; }
    public void setAchField013(BigDecimal achField013) { this.achField013 = achField013; }

    public Double getAchField014() { return achField014; }
    public void setAchField014(Double achField014) { this.achField014 = achField014; }

    public String getAchField015() { return achField015; }
    public void setAchField015(String achField015) { this.achField015 = achField015; }

    public Double getAchField016() { return achField016; }
    public void setAchField016(Double achField016) { this.achField016 = achField016; }

    public Integer getAchField017() { return achField017; }
    public void setAchField017(Integer achField017) { this.achField017 = achField017; }

    public LocalDate getAchField018() { return achField018; }
    public void setAchField018(LocalDate achField018) { this.achField018 = achField018; }

    @Override
    public String toString() {
        return "AchDto035{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
