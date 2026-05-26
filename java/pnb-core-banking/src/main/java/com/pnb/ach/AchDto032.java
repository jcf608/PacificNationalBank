package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto032 — Data Transfer Object for ach operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto032 {

    @Size(max = 60)
    @JsonProperty("achField000")
    private String achField000;

    @JsonProperty("achField001")
    private Boolean achField001;

    @JsonProperty("achField002")
    private Long achField002;

    @JsonProperty("achField003")
    private Double achField003;

    @JsonProperty("achField004")
    private Integer achField004;

    @JsonProperty("achField005")
    private Double achField005;

    @JsonProperty("achField006")
    private Boolean achField006;

    @JsonProperty("achField007")
    private Long achField007;

    @JsonProperty("achField008")
    private Integer achField008;

    @JsonProperty("achField009")
    private Double achField009;

    @Size(max = 200)
    @JsonProperty("achField010")
    private String achField010;

    @JsonProperty("achField011")
    private Integer achField011;

    @Size(max = 60)
    @JsonProperty("achField012")
    private String achField012;

    @JsonProperty("achField013")
    private Long achField013;

    @JsonProperty("achField014")
    private Double achField014;

    @JsonProperty("achField015")
    private Integer achField015;

    public AchDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto032 instance = new AchDto032();

        public Builder achField000(String val) { instance.achField000 = val; return this; }
        public Builder achField001(Boolean val) { instance.achField001 = val; return this; }
        public Builder achField002(Long val) { instance.achField002 = val; return this; }
        public Builder achField003(Double val) { instance.achField003 = val; return this; }
        public Builder achField004(Integer val) { instance.achField004 = val; return this; }
        public Builder achField005(Double val) { instance.achField005 = val; return this; }
        public Builder achField006(Boolean val) { instance.achField006 = val; return this; }
        public Builder achField007(Long val) { instance.achField007 = val; return this; }
        public Builder achField008(Integer val) { instance.achField008 = val; return this; }
        public Builder achField009(Double val) { instance.achField009 = val; return this; }
        public Builder achField010(String val) { instance.achField010 = val; return this; }
        public Builder achField011(Integer val) { instance.achField011 = val; return this; }
        public Builder achField012(String val) { instance.achField012 = val; return this; }
        public Builder achField013(Long val) { instance.achField013 = val; return this; }
        public Builder achField014(Double val) { instance.achField014 = val; return this; }
        public Builder achField015(Integer val) { instance.achField015 = val; return this; }
        public AchDto032 build() { return instance; }
    }

    public String getAchField000() { return achField000; }
    public void setAchField000(String achField000) { this.achField000 = achField000; }

    public Boolean getAchField001() { return achField001; }
    public void setAchField001(Boolean achField001) { this.achField001 = achField001; }

    public Long getAchField002() { return achField002; }
    public void setAchField002(Long achField002) { this.achField002 = achField002; }

    public Double getAchField003() { return achField003; }
    public void setAchField003(Double achField003) { this.achField003 = achField003; }

    public Integer getAchField004() { return achField004; }
    public void setAchField004(Integer achField004) { this.achField004 = achField004; }

    public Double getAchField005() { return achField005; }
    public void setAchField005(Double achField005) { this.achField005 = achField005; }

    public Boolean getAchField006() { return achField006; }
    public void setAchField006(Boolean achField006) { this.achField006 = achField006; }

    public Long getAchField007() { return achField007; }
    public void setAchField007(Long achField007) { this.achField007 = achField007; }

    public Integer getAchField008() { return achField008; }
    public void setAchField008(Integer achField008) { this.achField008 = achField008; }

    public Double getAchField009() { return achField009; }
    public void setAchField009(Double achField009) { this.achField009 = achField009; }

    public String getAchField010() { return achField010; }
    public void setAchField010(String achField010) { this.achField010 = achField010; }

    public Integer getAchField011() { return achField011; }
    public void setAchField011(Integer achField011) { this.achField011 = achField011; }

    public String getAchField012() { return achField012; }
    public void setAchField012(String achField012) { this.achField012 = achField012; }

    public Long getAchField013() { return achField013; }
    public void setAchField013(Long achField013) { this.achField013 = achField013; }

    public Double getAchField014() { return achField014; }
    public void setAchField014(Double achField014) { this.achField014 = achField014; }

    public Integer getAchField015() { return achField015; }
    public void setAchField015(Integer achField015) { this.achField015 = achField015; }

    @Override
    public String toString() {
        return "AchDto032{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
