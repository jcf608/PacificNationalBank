package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto059 — Data Transfer Object for ach operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto059 {

    @JsonProperty("achField000")
    private Double achField000;

    @JsonProperty("achField001")
    private LocalDate achField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField002")
    private BigDecimal achField002;

    @JsonProperty("achField003")
    private Double achField003;

    @Size(max = 40)
    @JsonProperty("achField004")
    private String achField004;

    @JsonProperty("achField005")
    private Long achField005;

    @JsonProperty("achField006")
    private LocalDate achField006;

    @Size(max = 60)
    @JsonProperty("achField007")
    private String achField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField008")
    private BigDecimal achField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField009")
    private BigDecimal achField009;

    @JsonProperty("achField010")
    private Long achField010;

    @JsonProperty("achField011")
    private Double achField011;

    @JsonProperty("achField012")
    private Boolean achField012;

    @JsonProperty("achField013")
    private Double achField013;

    @JsonProperty("achField014")
    private Integer achField014;

    @JsonProperty("achField015")
    private Integer achField015;

    @Size(max = 20)
    @JsonProperty("achField016")
    private String achField016;

    @Size(max = 20)
    @JsonProperty("achField017")
    private String achField017;

    @JsonProperty("achField018")
    private Boolean achField018;

    public AchDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto059 instance = new AchDto059();

        public Builder achField000(Double val) { instance.achField000 = val; return this; }
        public Builder achField001(LocalDate val) { instance.achField001 = val; return this; }
        public Builder achField002(BigDecimal val) { instance.achField002 = val; return this; }
        public Builder achField003(Double val) { instance.achField003 = val; return this; }
        public Builder achField004(String val) { instance.achField004 = val; return this; }
        public Builder achField005(Long val) { instance.achField005 = val; return this; }
        public Builder achField006(LocalDate val) { instance.achField006 = val; return this; }
        public Builder achField007(String val) { instance.achField007 = val; return this; }
        public Builder achField008(BigDecimal val) { instance.achField008 = val; return this; }
        public Builder achField009(BigDecimal val) { instance.achField009 = val; return this; }
        public Builder achField010(Long val) { instance.achField010 = val; return this; }
        public Builder achField011(Double val) { instance.achField011 = val; return this; }
        public Builder achField012(Boolean val) { instance.achField012 = val; return this; }
        public Builder achField013(Double val) { instance.achField013 = val; return this; }
        public Builder achField014(Integer val) { instance.achField014 = val; return this; }
        public Builder achField015(Integer val) { instance.achField015 = val; return this; }
        public Builder achField016(String val) { instance.achField016 = val; return this; }
        public Builder achField017(String val) { instance.achField017 = val; return this; }
        public Builder achField018(Boolean val) { instance.achField018 = val; return this; }
        public AchDto059 build() { return instance; }
    }

    public Double getAchField000() { return achField000; }
    public void setAchField000(Double achField000) { this.achField000 = achField000; }

    public LocalDate getAchField001() { return achField001; }
    public void setAchField001(LocalDate achField001) { this.achField001 = achField001; }

    public BigDecimal getAchField002() { return achField002; }
    public void setAchField002(BigDecimal achField002) { this.achField002 = achField002; }

    public Double getAchField003() { return achField003; }
    public void setAchField003(Double achField003) { this.achField003 = achField003; }

    public String getAchField004() { return achField004; }
    public void setAchField004(String achField004) { this.achField004 = achField004; }

    public Long getAchField005() { return achField005; }
    public void setAchField005(Long achField005) { this.achField005 = achField005; }

    public LocalDate getAchField006() { return achField006; }
    public void setAchField006(LocalDate achField006) { this.achField006 = achField006; }

    public String getAchField007() { return achField007; }
    public void setAchField007(String achField007) { this.achField007 = achField007; }

    public BigDecimal getAchField008() { return achField008; }
    public void setAchField008(BigDecimal achField008) { this.achField008 = achField008; }

    public BigDecimal getAchField009() { return achField009; }
    public void setAchField009(BigDecimal achField009) { this.achField009 = achField009; }

    public Long getAchField010() { return achField010; }
    public void setAchField010(Long achField010) { this.achField010 = achField010; }

    public Double getAchField011() { return achField011; }
    public void setAchField011(Double achField011) { this.achField011 = achField011; }

    public Boolean getAchField012() { return achField012; }
    public void setAchField012(Boolean achField012) { this.achField012 = achField012; }

    public Double getAchField013() { return achField013; }
    public void setAchField013(Double achField013) { this.achField013 = achField013; }

    public Integer getAchField014() { return achField014; }
    public void setAchField014(Integer achField014) { this.achField014 = achField014; }

    public Integer getAchField015() { return achField015; }
    public void setAchField015(Integer achField015) { this.achField015 = achField015; }

    public String getAchField016() { return achField016; }
    public void setAchField016(String achField016) { this.achField016 = achField016; }

    public String getAchField017() { return achField017; }
    public void setAchField017(String achField017) { this.achField017 = achField017; }

    public Boolean getAchField018() { return achField018; }
    public void setAchField018(Boolean achField018) { this.achField018 = achField018; }

    @Override
    public String toString() {
        return "AchDto059{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
