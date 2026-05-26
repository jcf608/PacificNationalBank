package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto033 — Data Transfer Object for ach operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto033 {

    @JsonProperty("achField000")
    private LocalDate achField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField001")
    private BigDecimal achField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField002")
    private BigDecimal achField002;

    @JsonProperty("achField003")
    private Integer achField003;

    @Size(max = 60)
    @JsonProperty("achField004")
    private String achField004;

    @JsonProperty("achField005")
    private Long achField005;

    @JsonProperty("achField006")
    private Integer achField006;

    @Size(max = 100)
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
    private Integer achField012;

    @Size(max = 200)
    @JsonProperty("achField013")
    private String achField013;

    @JsonProperty("achField014")
    private Long achField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField015")
    private BigDecimal achField015;

    @JsonProperty("achField016")
    private Double achField016;

    public AchDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto033 instance = new AchDto033();

        public Builder achField000(LocalDate val) { instance.achField000 = val; return this; }
        public Builder achField001(BigDecimal val) { instance.achField001 = val; return this; }
        public Builder achField002(BigDecimal val) { instance.achField002 = val; return this; }
        public Builder achField003(Integer val) { instance.achField003 = val; return this; }
        public Builder achField004(String val) { instance.achField004 = val; return this; }
        public Builder achField005(Long val) { instance.achField005 = val; return this; }
        public Builder achField006(Integer val) { instance.achField006 = val; return this; }
        public Builder achField007(String val) { instance.achField007 = val; return this; }
        public Builder achField008(BigDecimal val) { instance.achField008 = val; return this; }
        public Builder achField009(BigDecimal val) { instance.achField009 = val; return this; }
        public Builder achField010(Long val) { instance.achField010 = val; return this; }
        public Builder achField011(Double val) { instance.achField011 = val; return this; }
        public Builder achField012(Integer val) { instance.achField012 = val; return this; }
        public Builder achField013(String val) { instance.achField013 = val; return this; }
        public Builder achField014(Long val) { instance.achField014 = val; return this; }
        public Builder achField015(BigDecimal val) { instance.achField015 = val; return this; }
        public Builder achField016(Double val) { instance.achField016 = val; return this; }
        public AchDto033 build() { return instance; }
    }

    public LocalDate getAchField000() { return achField000; }
    public void setAchField000(LocalDate achField000) { this.achField000 = achField000; }

    public BigDecimal getAchField001() { return achField001; }
    public void setAchField001(BigDecimal achField001) { this.achField001 = achField001; }

    public BigDecimal getAchField002() { return achField002; }
    public void setAchField002(BigDecimal achField002) { this.achField002 = achField002; }

    public Integer getAchField003() { return achField003; }
    public void setAchField003(Integer achField003) { this.achField003 = achField003; }

    public String getAchField004() { return achField004; }
    public void setAchField004(String achField004) { this.achField004 = achField004; }

    public Long getAchField005() { return achField005; }
    public void setAchField005(Long achField005) { this.achField005 = achField005; }

    public Integer getAchField006() { return achField006; }
    public void setAchField006(Integer achField006) { this.achField006 = achField006; }

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

    public Integer getAchField012() { return achField012; }
    public void setAchField012(Integer achField012) { this.achField012 = achField012; }

    public String getAchField013() { return achField013; }
    public void setAchField013(String achField013) { this.achField013 = achField013; }

    public Long getAchField014() { return achField014; }
    public void setAchField014(Long achField014) { this.achField014 = achField014; }

    public BigDecimal getAchField015() { return achField015; }
    public void setAchField015(BigDecimal achField015) { this.achField015 = achField015; }

    public Double getAchField016() { return achField016; }
    public void setAchField016(Double achField016) { this.achField016 = achField016; }

    @Override
    public String toString() {
        return "AchDto033{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
