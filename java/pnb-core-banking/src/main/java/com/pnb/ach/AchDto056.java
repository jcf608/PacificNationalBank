package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto056 — Data Transfer Object for ach operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto056 {

    @DecimalMin(value = "0.00")
    @JsonProperty("achField000")
    private BigDecimal achField000;

    @JsonProperty("achField001")
    private Integer achField001;

    @JsonProperty("achField002")
    private Boolean achField002;

    @JsonProperty("achField003")
    private Long achField003;

    @JsonProperty("achField004")
    private Boolean achField004;

    @Size(max = 40)
    @JsonProperty("achField005")
    private String achField005;

    @Size(max = 100)
    @JsonProperty("achField006")
    private String achField006;

    @JsonProperty("achField007")
    private Long achField007;

    @JsonProperty("achField008")
    private Double achField008;

    @JsonProperty("achField009")
    private Double achField009;

    @JsonProperty("achField010")
    private Boolean achField010;

    @JsonProperty("achField011")
    private LocalDate achField011;

    @JsonProperty("achField012")
    private Integer achField012;

    @JsonProperty("achField013")
    private Double achField013;

    @JsonProperty("achField014")
    private LocalDate achField014;

    @JsonProperty("achField015")
    private Boolean achField015;

    public AchDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto056 instance = new AchDto056();

        public Builder achField000(BigDecimal val) { instance.achField000 = val; return this; }
        public Builder achField001(Integer val) { instance.achField001 = val; return this; }
        public Builder achField002(Boolean val) { instance.achField002 = val; return this; }
        public Builder achField003(Long val) { instance.achField003 = val; return this; }
        public Builder achField004(Boolean val) { instance.achField004 = val; return this; }
        public Builder achField005(String val) { instance.achField005 = val; return this; }
        public Builder achField006(String val) { instance.achField006 = val; return this; }
        public Builder achField007(Long val) { instance.achField007 = val; return this; }
        public Builder achField008(Double val) { instance.achField008 = val; return this; }
        public Builder achField009(Double val) { instance.achField009 = val; return this; }
        public Builder achField010(Boolean val) { instance.achField010 = val; return this; }
        public Builder achField011(LocalDate val) { instance.achField011 = val; return this; }
        public Builder achField012(Integer val) { instance.achField012 = val; return this; }
        public Builder achField013(Double val) { instance.achField013 = val; return this; }
        public Builder achField014(LocalDate val) { instance.achField014 = val; return this; }
        public Builder achField015(Boolean val) { instance.achField015 = val; return this; }
        public AchDto056 build() { return instance; }
    }

    public BigDecimal getAchField000() { return achField000; }
    public void setAchField000(BigDecimal achField000) { this.achField000 = achField000; }

    public Integer getAchField001() { return achField001; }
    public void setAchField001(Integer achField001) { this.achField001 = achField001; }

    public Boolean getAchField002() { return achField002; }
    public void setAchField002(Boolean achField002) { this.achField002 = achField002; }

    public Long getAchField003() { return achField003; }
    public void setAchField003(Long achField003) { this.achField003 = achField003; }

    public Boolean getAchField004() { return achField004; }
    public void setAchField004(Boolean achField004) { this.achField004 = achField004; }

    public String getAchField005() { return achField005; }
    public void setAchField005(String achField005) { this.achField005 = achField005; }

    public String getAchField006() { return achField006; }
    public void setAchField006(String achField006) { this.achField006 = achField006; }

    public Long getAchField007() { return achField007; }
    public void setAchField007(Long achField007) { this.achField007 = achField007; }

    public Double getAchField008() { return achField008; }
    public void setAchField008(Double achField008) { this.achField008 = achField008; }

    public Double getAchField009() { return achField009; }
    public void setAchField009(Double achField009) { this.achField009 = achField009; }

    public Boolean getAchField010() { return achField010; }
    public void setAchField010(Boolean achField010) { this.achField010 = achField010; }

    public LocalDate getAchField011() { return achField011; }
    public void setAchField011(LocalDate achField011) { this.achField011 = achField011; }

    public Integer getAchField012() { return achField012; }
    public void setAchField012(Integer achField012) { this.achField012 = achField012; }

    public Double getAchField013() { return achField013; }
    public void setAchField013(Double achField013) { this.achField013 = achField013; }

    public LocalDate getAchField014() { return achField014; }
    public void setAchField014(LocalDate achField014) { this.achField014 = achField014; }

    public Boolean getAchField015() { return achField015; }
    public void setAchField015(Boolean achField015) { this.achField015 = achField015; }

    @Override
    public String toString() {
        return "AchDto056{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
