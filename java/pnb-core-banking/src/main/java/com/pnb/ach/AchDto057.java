package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto057 — Data Transfer Object for ach operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto057 {

    @JsonProperty("achField000")
    private Long achField000;

    @JsonProperty("achField001")
    private Long achField001;

    @JsonProperty("achField002")
    private Integer achField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField003")
    private BigDecimal achField003;

    @JsonProperty("achField004")
    private Integer achField004;

    @Size(max = 60)
    @JsonProperty("achField005")
    private String achField005;

    @JsonProperty("achField006")
    private Boolean achField006;

    @JsonProperty("achField007")
    private Long achField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField008")
    private BigDecimal achField008;

    @JsonProperty("achField009")
    private Double achField009;

    @JsonProperty("achField010")
    private Double achField010;

    @JsonProperty("achField011")
    private Boolean achField011;

    @JsonProperty("achField012")
    private Double achField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField013")
    private BigDecimal achField013;

    @Size(max = 40)
    @JsonProperty("achField014")
    private String achField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField015")
    private BigDecimal achField015;

    @JsonProperty("achField016")
    private LocalDate achField016;

    public AchDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto057 instance = new AchDto057();

        public Builder achField000(Long val) { instance.achField000 = val; return this; }
        public Builder achField001(Long val) { instance.achField001 = val; return this; }
        public Builder achField002(Integer val) { instance.achField002 = val; return this; }
        public Builder achField003(BigDecimal val) { instance.achField003 = val; return this; }
        public Builder achField004(Integer val) { instance.achField004 = val; return this; }
        public Builder achField005(String val) { instance.achField005 = val; return this; }
        public Builder achField006(Boolean val) { instance.achField006 = val; return this; }
        public Builder achField007(Long val) { instance.achField007 = val; return this; }
        public Builder achField008(BigDecimal val) { instance.achField008 = val; return this; }
        public Builder achField009(Double val) { instance.achField009 = val; return this; }
        public Builder achField010(Double val) { instance.achField010 = val; return this; }
        public Builder achField011(Boolean val) { instance.achField011 = val; return this; }
        public Builder achField012(Double val) { instance.achField012 = val; return this; }
        public Builder achField013(BigDecimal val) { instance.achField013 = val; return this; }
        public Builder achField014(String val) { instance.achField014 = val; return this; }
        public Builder achField015(BigDecimal val) { instance.achField015 = val; return this; }
        public Builder achField016(LocalDate val) { instance.achField016 = val; return this; }
        public AchDto057 build() { return instance; }
    }

    public Long getAchField000() { return achField000; }
    public void setAchField000(Long achField000) { this.achField000 = achField000; }

    public Long getAchField001() { return achField001; }
    public void setAchField001(Long achField001) { this.achField001 = achField001; }

    public Integer getAchField002() { return achField002; }
    public void setAchField002(Integer achField002) { this.achField002 = achField002; }

    public BigDecimal getAchField003() { return achField003; }
    public void setAchField003(BigDecimal achField003) { this.achField003 = achField003; }

    public Integer getAchField004() { return achField004; }
    public void setAchField004(Integer achField004) { this.achField004 = achField004; }

    public String getAchField005() { return achField005; }
    public void setAchField005(String achField005) { this.achField005 = achField005; }

    public Boolean getAchField006() { return achField006; }
    public void setAchField006(Boolean achField006) { this.achField006 = achField006; }

    public Long getAchField007() { return achField007; }
    public void setAchField007(Long achField007) { this.achField007 = achField007; }

    public BigDecimal getAchField008() { return achField008; }
    public void setAchField008(BigDecimal achField008) { this.achField008 = achField008; }

    public Double getAchField009() { return achField009; }
    public void setAchField009(Double achField009) { this.achField009 = achField009; }

    public Double getAchField010() { return achField010; }
    public void setAchField010(Double achField010) { this.achField010 = achField010; }

    public Boolean getAchField011() { return achField011; }
    public void setAchField011(Boolean achField011) { this.achField011 = achField011; }

    public Double getAchField012() { return achField012; }
    public void setAchField012(Double achField012) { this.achField012 = achField012; }

    public BigDecimal getAchField013() { return achField013; }
    public void setAchField013(BigDecimal achField013) { this.achField013 = achField013; }

    public String getAchField014() { return achField014; }
    public void setAchField014(String achField014) { this.achField014 = achField014; }

    public BigDecimal getAchField015() { return achField015; }
    public void setAchField015(BigDecimal achField015) { this.achField015 = achField015; }

    public LocalDate getAchField016() { return achField016; }
    public void setAchField016(LocalDate achField016) { this.achField016 = achField016; }

    @Override
    public String toString() {
        return "AchDto057{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
