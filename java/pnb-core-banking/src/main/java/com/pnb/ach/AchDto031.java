package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto031 — Data Transfer Object for ach operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto031 {

    @DecimalMin(value = "0.00")
    @JsonProperty("achField000")
    private BigDecimal achField000;

    @JsonProperty("achField001")
    private Double achField001;

    @Size(max = 40)
    @JsonProperty("achField002")
    private String achField002;

    @JsonProperty("achField003")
    private Double achField003;

    @JsonProperty("achField004")
    private Boolean achField004;

    @JsonProperty("achField005")
    private Boolean achField005;

    @Size(max = 100)
    @JsonProperty("achField006")
    private String achField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField007")
    private BigDecimal achField007;

    @Size(max = 20)
    @JsonProperty("achField008")
    private String achField008;

    @JsonProperty("achField009")
    private Integer achField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField010")
    private BigDecimal achField010;

    @JsonProperty("achField011")
    private LocalDate achField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField012")
    private BigDecimal achField012;

    @JsonProperty("achField013")
    private Integer achField013;

    @JsonProperty("achField014")
    private Long achField014;

    public AchDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto031 instance = new AchDto031();

        public Builder achField000(BigDecimal val) { instance.achField000 = val; return this; }
        public Builder achField001(Double val) { instance.achField001 = val; return this; }
        public Builder achField002(String val) { instance.achField002 = val; return this; }
        public Builder achField003(Double val) { instance.achField003 = val; return this; }
        public Builder achField004(Boolean val) { instance.achField004 = val; return this; }
        public Builder achField005(Boolean val) { instance.achField005 = val; return this; }
        public Builder achField006(String val) { instance.achField006 = val; return this; }
        public Builder achField007(BigDecimal val) { instance.achField007 = val; return this; }
        public Builder achField008(String val) { instance.achField008 = val; return this; }
        public Builder achField009(Integer val) { instance.achField009 = val; return this; }
        public Builder achField010(BigDecimal val) { instance.achField010 = val; return this; }
        public Builder achField011(LocalDate val) { instance.achField011 = val; return this; }
        public Builder achField012(BigDecimal val) { instance.achField012 = val; return this; }
        public Builder achField013(Integer val) { instance.achField013 = val; return this; }
        public Builder achField014(Long val) { instance.achField014 = val; return this; }
        public AchDto031 build() { return instance; }
    }

    public BigDecimal getAchField000() { return achField000; }
    public void setAchField000(BigDecimal achField000) { this.achField000 = achField000; }

    public Double getAchField001() { return achField001; }
    public void setAchField001(Double achField001) { this.achField001 = achField001; }

    public String getAchField002() { return achField002; }
    public void setAchField002(String achField002) { this.achField002 = achField002; }

    public Double getAchField003() { return achField003; }
    public void setAchField003(Double achField003) { this.achField003 = achField003; }

    public Boolean getAchField004() { return achField004; }
    public void setAchField004(Boolean achField004) { this.achField004 = achField004; }

    public Boolean getAchField005() { return achField005; }
    public void setAchField005(Boolean achField005) { this.achField005 = achField005; }

    public String getAchField006() { return achField006; }
    public void setAchField006(String achField006) { this.achField006 = achField006; }

    public BigDecimal getAchField007() { return achField007; }
    public void setAchField007(BigDecimal achField007) { this.achField007 = achField007; }

    public String getAchField008() { return achField008; }
    public void setAchField008(String achField008) { this.achField008 = achField008; }

    public Integer getAchField009() { return achField009; }
    public void setAchField009(Integer achField009) { this.achField009 = achField009; }

    public BigDecimal getAchField010() { return achField010; }
    public void setAchField010(BigDecimal achField010) { this.achField010 = achField010; }

    public LocalDate getAchField011() { return achField011; }
    public void setAchField011(LocalDate achField011) { this.achField011 = achField011; }

    public BigDecimal getAchField012() { return achField012; }
    public void setAchField012(BigDecimal achField012) { this.achField012 = achField012; }

    public Integer getAchField013() { return achField013; }
    public void setAchField013(Integer achField013) { this.achField013 = achField013; }

    public Long getAchField014() { return achField014; }
    public void setAchField014(Long achField014) { this.achField014 = achField014; }

    @Override
    public String toString() {
        return "AchDto031{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
