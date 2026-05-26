package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto047 — Data Transfer Object for ach operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto047 {

    @JsonProperty("achField000")
    private Boolean achField000;

    @JsonProperty("achField001")
    private Boolean achField001;

    @JsonProperty("achField002")
    private Double achField002;

    @JsonProperty("achField003")
    private Integer achField003;

    @JsonProperty("achField004")
    private LocalDate achField004;

    @JsonProperty("achField005")
    private Integer achField005;

    @Size(max = 100)
    @JsonProperty("achField006")
    private String achField006;

    @JsonProperty("achField007")
    private Integer achField007;

    @Size(max = 40)
    @JsonProperty("achField008")
    private String achField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField009")
    private BigDecimal achField009;

    @Size(max = 100)
    @JsonProperty("achField010")
    private String achField010;

    @JsonProperty("achField011")
    private Boolean achField011;

    @Size(max = 200)
    @JsonProperty("achField012")
    private String achField012;

    @JsonProperty("achField013")
    private Double achField013;

    @Size(max = 200)
    @JsonProperty("achField014")
    private String achField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField015")
    private BigDecimal achField015;

    @JsonProperty("achField016")
    private Boolean achField016;

    @JsonProperty("achField017")
    private Double achField017;

    @JsonProperty("achField018")
    private LocalDate achField018;

    public AchDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto047 instance = new AchDto047();

        public Builder achField000(Boolean val) { instance.achField000 = val; return this; }
        public Builder achField001(Boolean val) { instance.achField001 = val; return this; }
        public Builder achField002(Double val) { instance.achField002 = val; return this; }
        public Builder achField003(Integer val) { instance.achField003 = val; return this; }
        public Builder achField004(LocalDate val) { instance.achField004 = val; return this; }
        public Builder achField005(Integer val) { instance.achField005 = val; return this; }
        public Builder achField006(String val) { instance.achField006 = val; return this; }
        public Builder achField007(Integer val) { instance.achField007 = val; return this; }
        public Builder achField008(String val) { instance.achField008 = val; return this; }
        public Builder achField009(BigDecimal val) { instance.achField009 = val; return this; }
        public Builder achField010(String val) { instance.achField010 = val; return this; }
        public Builder achField011(Boolean val) { instance.achField011 = val; return this; }
        public Builder achField012(String val) { instance.achField012 = val; return this; }
        public Builder achField013(Double val) { instance.achField013 = val; return this; }
        public Builder achField014(String val) { instance.achField014 = val; return this; }
        public Builder achField015(BigDecimal val) { instance.achField015 = val; return this; }
        public Builder achField016(Boolean val) { instance.achField016 = val; return this; }
        public Builder achField017(Double val) { instance.achField017 = val; return this; }
        public Builder achField018(LocalDate val) { instance.achField018 = val; return this; }
        public AchDto047 build() { return instance; }
    }

    public Boolean getAchField000() { return achField000; }
    public void setAchField000(Boolean achField000) { this.achField000 = achField000; }

    public Boolean getAchField001() { return achField001; }
    public void setAchField001(Boolean achField001) { this.achField001 = achField001; }

    public Double getAchField002() { return achField002; }
    public void setAchField002(Double achField002) { this.achField002 = achField002; }

    public Integer getAchField003() { return achField003; }
    public void setAchField003(Integer achField003) { this.achField003 = achField003; }

    public LocalDate getAchField004() { return achField004; }
    public void setAchField004(LocalDate achField004) { this.achField004 = achField004; }

    public Integer getAchField005() { return achField005; }
    public void setAchField005(Integer achField005) { this.achField005 = achField005; }

    public String getAchField006() { return achField006; }
    public void setAchField006(String achField006) { this.achField006 = achField006; }

    public Integer getAchField007() { return achField007; }
    public void setAchField007(Integer achField007) { this.achField007 = achField007; }

    public String getAchField008() { return achField008; }
    public void setAchField008(String achField008) { this.achField008 = achField008; }

    public BigDecimal getAchField009() { return achField009; }
    public void setAchField009(BigDecimal achField009) { this.achField009 = achField009; }

    public String getAchField010() { return achField010; }
    public void setAchField010(String achField010) { this.achField010 = achField010; }

    public Boolean getAchField011() { return achField011; }
    public void setAchField011(Boolean achField011) { this.achField011 = achField011; }

    public String getAchField012() { return achField012; }
    public void setAchField012(String achField012) { this.achField012 = achField012; }

    public Double getAchField013() { return achField013; }
    public void setAchField013(Double achField013) { this.achField013 = achField013; }

    public String getAchField014() { return achField014; }
    public void setAchField014(String achField014) { this.achField014 = achField014; }

    public BigDecimal getAchField015() { return achField015; }
    public void setAchField015(BigDecimal achField015) { this.achField015 = achField015; }

    public Boolean getAchField016() { return achField016; }
    public void setAchField016(Boolean achField016) { this.achField016 = achField016; }

    public Double getAchField017() { return achField017; }
    public void setAchField017(Double achField017) { this.achField017 = achField017; }

    public LocalDate getAchField018() { return achField018; }
    public void setAchField018(LocalDate achField018) { this.achField018 = achField018; }

    @Override
    public String toString() {
        return "AchDto047{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
