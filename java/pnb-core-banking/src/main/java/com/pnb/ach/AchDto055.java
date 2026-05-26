package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto055 — Data Transfer Object for ach operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto055 {

    @JsonProperty("achField000")
    private Boolean achField000;

    @JsonProperty("achField001")
    private Boolean achField001;

    @JsonProperty("achField002")
    private LocalDate achField002;

    @JsonProperty("achField003")
    private LocalDate achField003;

    @JsonProperty("achField004")
    private Double achField004;

    @JsonProperty("achField005")
    private Integer achField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField006")
    private BigDecimal achField006;

    @JsonProperty("achField007")
    private Long achField007;

    @Size(max = 60)
    @JsonProperty("achField008")
    private String achField008;

    @JsonProperty("achField009")
    private Double achField009;

    @JsonProperty("achField010")
    private Integer achField010;

    @JsonProperty("achField011")
    private LocalDate achField011;

    @JsonProperty("achField012")
    private LocalDate achField012;

    @JsonProperty("achField013")
    private Boolean achField013;

    @JsonProperty("achField014")
    private Double achField014;

    public AchDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto055 instance = new AchDto055();

        public Builder achField000(Boolean val) { instance.achField000 = val; return this; }
        public Builder achField001(Boolean val) { instance.achField001 = val; return this; }
        public Builder achField002(LocalDate val) { instance.achField002 = val; return this; }
        public Builder achField003(LocalDate val) { instance.achField003 = val; return this; }
        public Builder achField004(Double val) { instance.achField004 = val; return this; }
        public Builder achField005(Integer val) { instance.achField005 = val; return this; }
        public Builder achField006(BigDecimal val) { instance.achField006 = val; return this; }
        public Builder achField007(Long val) { instance.achField007 = val; return this; }
        public Builder achField008(String val) { instance.achField008 = val; return this; }
        public Builder achField009(Double val) { instance.achField009 = val; return this; }
        public Builder achField010(Integer val) { instance.achField010 = val; return this; }
        public Builder achField011(LocalDate val) { instance.achField011 = val; return this; }
        public Builder achField012(LocalDate val) { instance.achField012 = val; return this; }
        public Builder achField013(Boolean val) { instance.achField013 = val; return this; }
        public Builder achField014(Double val) { instance.achField014 = val; return this; }
        public AchDto055 build() { return instance; }
    }

    public Boolean getAchField000() { return achField000; }
    public void setAchField000(Boolean achField000) { this.achField000 = achField000; }

    public Boolean getAchField001() { return achField001; }
    public void setAchField001(Boolean achField001) { this.achField001 = achField001; }

    public LocalDate getAchField002() { return achField002; }
    public void setAchField002(LocalDate achField002) { this.achField002 = achField002; }

    public LocalDate getAchField003() { return achField003; }
    public void setAchField003(LocalDate achField003) { this.achField003 = achField003; }

    public Double getAchField004() { return achField004; }
    public void setAchField004(Double achField004) { this.achField004 = achField004; }

    public Integer getAchField005() { return achField005; }
    public void setAchField005(Integer achField005) { this.achField005 = achField005; }

    public BigDecimal getAchField006() { return achField006; }
    public void setAchField006(BigDecimal achField006) { this.achField006 = achField006; }

    public Long getAchField007() { return achField007; }
    public void setAchField007(Long achField007) { this.achField007 = achField007; }

    public String getAchField008() { return achField008; }
    public void setAchField008(String achField008) { this.achField008 = achField008; }

    public Double getAchField009() { return achField009; }
    public void setAchField009(Double achField009) { this.achField009 = achField009; }

    public Integer getAchField010() { return achField010; }
    public void setAchField010(Integer achField010) { this.achField010 = achField010; }

    public LocalDate getAchField011() { return achField011; }
    public void setAchField011(LocalDate achField011) { this.achField011 = achField011; }

    public LocalDate getAchField012() { return achField012; }
    public void setAchField012(LocalDate achField012) { this.achField012 = achField012; }

    public Boolean getAchField013() { return achField013; }
    public void setAchField013(Boolean achField013) { this.achField013 = achField013; }

    public Double getAchField014() { return achField014; }
    public void setAchField014(Double achField014) { this.achField014 = achField014; }

    @Override
    public String toString() {
        return "AchDto055{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
