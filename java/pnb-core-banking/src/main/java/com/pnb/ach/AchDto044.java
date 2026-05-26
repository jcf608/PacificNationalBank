package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto044 — Data Transfer Object for ach operations.
 * Variant 44 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto044 {

    @JsonProperty("achField000")
    private Long achField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField001")
    private BigDecimal achField001;

    @JsonProperty("achField002")
    private LocalDate achField002;

    @JsonProperty("achField003")
    private Double achField003;

    @JsonProperty("achField004")
    private Long achField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField005")
    private BigDecimal achField005;

    @JsonProperty("achField006")
    private Double achField006;

    @JsonProperty("achField007")
    private Long achField007;

    @JsonProperty("achField008")
    private Long achField008;

    @JsonProperty("achField009")
    private Long achField009;

    @JsonProperty("achField010")
    private Double achField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField011")
    private BigDecimal achField011;

    @Size(max = 20)
    @JsonProperty("achField012")
    private String achField012;

    @Size(max = 20)
    @JsonProperty("achField013")
    private String achField013;

    @JsonProperty("achField014")
    private LocalDate achField014;

    @JsonProperty("achField015")
    private Integer achField015;

    public AchDto044() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto044 instance = new AchDto044();

        public Builder achField000(Long val) { instance.achField000 = val; return this; }
        public Builder achField001(BigDecimal val) { instance.achField001 = val; return this; }
        public Builder achField002(LocalDate val) { instance.achField002 = val; return this; }
        public Builder achField003(Double val) { instance.achField003 = val; return this; }
        public Builder achField004(Long val) { instance.achField004 = val; return this; }
        public Builder achField005(BigDecimal val) { instance.achField005 = val; return this; }
        public Builder achField006(Double val) { instance.achField006 = val; return this; }
        public Builder achField007(Long val) { instance.achField007 = val; return this; }
        public Builder achField008(Long val) { instance.achField008 = val; return this; }
        public Builder achField009(Long val) { instance.achField009 = val; return this; }
        public Builder achField010(Double val) { instance.achField010 = val; return this; }
        public Builder achField011(BigDecimal val) { instance.achField011 = val; return this; }
        public Builder achField012(String val) { instance.achField012 = val; return this; }
        public Builder achField013(String val) { instance.achField013 = val; return this; }
        public Builder achField014(LocalDate val) { instance.achField014 = val; return this; }
        public Builder achField015(Integer val) { instance.achField015 = val; return this; }
        public AchDto044 build() { return instance; }
    }

    public Long getAchField000() { return achField000; }
    public void setAchField000(Long achField000) { this.achField000 = achField000; }

    public BigDecimal getAchField001() { return achField001; }
    public void setAchField001(BigDecimal achField001) { this.achField001 = achField001; }

    public LocalDate getAchField002() { return achField002; }
    public void setAchField002(LocalDate achField002) { this.achField002 = achField002; }

    public Double getAchField003() { return achField003; }
    public void setAchField003(Double achField003) { this.achField003 = achField003; }

    public Long getAchField004() { return achField004; }
    public void setAchField004(Long achField004) { this.achField004 = achField004; }

    public BigDecimal getAchField005() { return achField005; }
    public void setAchField005(BigDecimal achField005) { this.achField005 = achField005; }

    public Double getAchField006() { return achField006; }
    public void setAchField006(Double achField006) { this.achField006 = achField006; }

    public Long getAchField007() { return achField007; }
    public void setAchField007(Long achField007) { this.achField007 = achField007; }

    public Long getAchField008() { return achField008; }
    public void setAchField008(Long achField008) { this.achField008 = achField008; }

    public Long getAchField009() { return achField009; }
    public void setAchField009(Long achField009) { this.achField009 = achField009; }

    public Double getAchField010() { return achField010; }
    public void setAchField010(Double achField010) { this.achField010 = achField010; }

    public BigDecimal getAchField011() { return achField011; }
    public void setAchField011(BigDecimal achField011) { this.achField011 = achField011; }

    public String getAchField012() { return achField012; }
    public void setAchField012(String achField012) { this.achField012 = achField012; }

    public String getAchField013() { return achField013; }
    public void setAchField013(String achField013) { this.achField013 = achField013; }

    public LocalDate getAchField014() { return achField014; }
    public void setAchField014(LocalDate achField014) { this.achField014 = achField014; }

    public Integer getAchField015() { return achField015; }
    public void setAchField015(Integer achField015) { this.achField015 = achField015; }

    @Override
    public String toString() {
        return "AchDto044{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
