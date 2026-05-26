package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto058 — Data Transfer Object for ach operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto058 {

    @JsonProperty("achField000")
    private Double achField000;

    @JsonProperty("achField001")
    private Double achField001;

    @JsonProperty("achField002")
    private LocalDate achField002;

    @Size(max = 100)
    @JsonProperty("achField003")
    private String achField003;

    @JsonProperty("achField004")
    private Boolean achField004;

    @JsonProperty("achField005")
    private Integer achField005;

    @JsonProperty("achField006")
    private Integer achField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField007")
    private BigDecimal achField007;

    @Size(max = 200)
    @JsonProperty("achField008")
    private String achField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField009")
    private BigDecimal achField009;

    @JsonProperty("achField010")
    private Long achField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField011")
    private BigDecimal achField011;

    @JsonProperty("achField012")
    private Integer achField012;

    @JsonProperty("achField013")
    private Long achField013;

    @JsonProperty("achField014")
    private LocalDate achField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField015")
    private BigDecimal achField015;

    @JsonProperty("achField016")
    private Long achField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField017")
    private BigDecimal achField017;

    public AchDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto058 instance = new AchDto058();

        public Builder achField000(Double val) { instance.achField000 = val; return this; }
        public Builder achField001(Double val) { instance.achField001 = val; return this; }
        public Builder achField002(LocalDate val) { instance.achField002 = val; return this; }
        public Builder achField003(String val) { instance.achField003 = val; return this; }
        public Builder achField004(Boolean val) { instance.achField004 = val; return this; }
        public Builder achField005(Integer val) { instance.achField005 = val; return this; }
        public Builder achField006(Integer val) { instance.achField006 = val; return this; }
        public Builder achField007(BigDecimal val) { instance.achField007 = val; return this; }
        public Builder achField008(String val) { instance.achField008 = val; return this; }
        public Builder achField009(BigDecimal val) { instance.achField009 = val; return this; }
        public Builder achField010(Long val) { instance.achField010 = val; return this; }
        public Builder achField011(BigDecimal val) { instance.achField011 = val; return this; }
        public Builder achField012(Integer val) { instance.achField012 = val; return this; }
        public Builder achField013(Long val) { instance.achField013 = val; return this; }
        public Builder achField014(LocalDate val) { instance.achField014 = val; return this; }
        public Builder achField015(BigDecimal val) { instance.achField015 = val; return this; }
        public Builder achField016(Long val) { instance.achField016 = val; return this; }
        public Builder achField017(BigDecimal val) { instance.achField017 = val; return this; }
        public AchDto058 build() { return instance; }
    }

    public Double getAchField000() { return achField000; }
    public void setAchField000(Double achField000) { this.achField000 = achField000; }

    public Double getAchField001() { return achField001; }
    public void setAchField001(Double achField001) { this.achField001 = achField001; }

    public LocalDate getAchField002() { return achField002; }
    public void setAchField002(LocalDate achField002) { this.achField002 = achField002; }

    public String getAchField003() { return achField003; }
    public void setAchField003(String achField003) { this.achField003 = achField003; }

    public Boolean getAchField004() { return achField004; }
    public void setAchField004(Boolean achField004) { this.achField004 = achField004; }

    public Integer getAchField005() { return achField005; }
    public void setAchField005(Integer achField005) { this.achField005 = achField005; }

    public Integer getAchField006() { return achField006; }
    public void setAchField006(Integer achField006) { this.achField006 = achField006; }

    public BigDecimal getAchField007() { return achField007; }
    public void setAchField007(BigDecimal achField007) { this.achField007 = achField007; }

    public String getAchField008() { return achField008; }
    public void setAchField008(String achField008) { this.achField008 = achField008; }

    public BigDecimal getAchField009() { return achField009; }
    public void setAchField009(BigDecimal achField009) { this.achField009 = achField009; }

    public Long getAchField010() { return achField010; }
    public void setAchField010(Long achField010) { this.achField010 = achField010; }

    public BigDecimal getAchField011() { return achField011; }
    public void setAchField011(BigDecimal achField011) { this.achField011 = achField011; }

    public Integer getAchField012() { return achField012; }
    public void setAchField012(Integer achField012) { this.achField012 = achField012; }

    public Long getAchField013() { return achField013; }
    public void setAchField013(Long achField013) { this.achField013 = achField013; }

    public LocalDate getAchField014() { return achField014; }
    public void setAchField014(LocalDate achField014) { this.achField014 = achField014; }

    public BigDecimal getAchField015() { return achField015; }
    public void setAchField015(BigDecimal achField015) { this.achField015 = achField015; }

    public Long getAchField016() { return achField016; }
    public void setAchField016(Long achField016) { this.achField016 = achField016; }

    public BigDecimal getAchField017() { return achField017; }
    public void setAchField017(BigDecimal achField017) { this.achField017 = achField017; }

    @Override
    public String toString() {
        return "AchDto058{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
