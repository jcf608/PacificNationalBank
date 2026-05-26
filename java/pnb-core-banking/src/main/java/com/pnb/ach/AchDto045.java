package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto045 — Data Transfer Object for ach operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto045 {

    @JsonProperty("achField000")
    private Long achField000;

    @JsonProperty("achField001")
    private Integer achField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField002")
    private BigDecimal achField002;

    @JsonProperty("achField003")
    private Boolean achField003;

    @JsonProperty("achField004")
    private Double achField004;

    @JsonProperty("achField005")
    private LocalDate achField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField006")
    private BigDecimal achField006;

    @JsonProperty("achField007")
    private Integer achField007;

    @Size(max = 40)
    @JsonProperty("achField008")
    private String achField008;

    @JsonProperty("achField009")
    private Long achField009;

    @JsonProperty("achField010")
    private Double achField010;

    @JsonProperty("achField011")
    private Boolean achField011;

    @JsonProperty("achField012")
    private Integer achField012;

    @JsonProperty("achField013")
    private Long achField013;

    @JsonProperty("achField014")
    private Integer achField014;

    @Size(max = 100)
    @JsonProperty("achField015")
    private String achField015;

    @JsonProperty("achField016")
    private Double achField016;

    public AchDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto045 instance = new AchDto045();

        public Builder achField000(Long val) { instance.achField000 = val; return this; }
        public Builder achField001(Integer val) { instance.achField001 = val; return this; }
        public Builder achField002(BigDecimal val) { instance.achField002 = val; return this; }
        public Builder achField003(Boolean val) { instance.achField003 = val; return this; }
        public Builder achField004(Double val) { instance.achField004 = val; return this; }
        public Builder achField005(LocalDate val) { instance.achField005 = val; return this; }
        public Builder achField006(BigDecimal val) { instance.achField006 = val; return this; }
        public Builder achField007(Integer val) { instance.achField007 = val; return this; }
        public Builder achField008(String val) { instance.achField008 = val; return this; }
        public Builder achField009(Long val) { instance.achField009 = val; return this; }
        public Builder achField010(Double val) { instance.achField010 = val; return this; }
        public Builder achField011(Boolean val) { instance.achField011 = val; return this; }
        public Builder achField012(Integer val) { instance.achField012 = val; return this; }
        public Builder achField013(Long val) { instance.achField013 = val; return this; }
        public Builder achField014(Integer val) { instance.achField014 = val; return this; }
        public Builder achField015(String val) { instance.achField015 = val; return this; }
        public Builder achField016(Double val) { instance.achField016 = val; return this; }
        public AchDto045 build() { return instance; }
    }

    public Long getAchField000() { return achField000; }
    public void setAchField000(Long achField000) { this.achField000 = achField000; }

    public Integer getAchField001() { return achField001; }
    public void setAchField001(Integer achField001) { this.achField001 = achField001; }

    public BigDecimal getAchField002() { return achField002; }
    public void setAchField002(BigDecimal achField002) { this.achField002 = achField002; }

    public Boolean getAchField003() { return achField003; }
    public void setAchField003(Boolean achField003) { this.achField003 = achField003; }

    public Double getAchField004() { return achField004; }
    public void setAchField004(Double achField004) { this.achField004 = achField004; }

    public LocalDate getAchField005() { return achField005; }
    public void setAchField005(LocalDate achField005) { this.achField005 = achField005; }

    public BigDecimal getAchField006() { return achField006; }
    public void setAchField006(BigDecimal achField006) { this.achField006 = achField006; }

    public Integer getAchField007() { return achField007; }
    public void setAchField007(Integer achField007) { this.achField007 = achField007; }

    public String getAchField008() { return achField008; }
    public void setAchField008(String achField008) { this.achField008 = achField008; }

    public Long getAchField009() { return achField009; }
    public void setAchField009(Long achField009) { this.achField009 = achField009; }

    public Double getAchField010() { return achField010; }
    public void setAchField010(Double achField010) { this.achField010 = achField010; }

    public Boolean getAchField011() { return achField011; }
    public void setAchField011(Boolean achField011) { this.achField011 = achField011; }

    public Integer getAchField012() { return achField012; }
    public void setAchField012(Integer achField012) { this.achField012 = achField012; }

    public Long getAchField013() { return achField013; }
    public void setAchField013(Long achField013) { this.achField013 = achField013; }

    public Integer getAchField014() { return achField014; }
    public void setAchField014(Integer achField014) { this.achField014 = achField014; }

    public String getAchField015() { return achField015; }
    public void setAchField015(String achField015) { this.achField015 = achField015; }

    public Double getAchField016() { return achField016; }
    public void setAchField016(Double achField016) { this.achField016 = achField016; }

    @Override
    public String toString() {
        return "AchDto045{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
