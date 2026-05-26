package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto054 — Data Transfer Object for ach operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto054 {

    @JsonProperty("achField000")
    private Boolean achField000;

    @JsonProperty("achField001")
    private LocalDate achField001;

    @JsonProperty("achField002")
    private Long achField002;

    @JsonProperty("achField003")
    private Integer achField003;

    @JsonProperty("achField004")
    private Double achField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField005")
    private BigDecimal achField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField006")
    private BigDecimal achField006;

    @JsonProperty("achField007")
    private Long achField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField008")
    private BigDecimal achField008;

    @Size(max = 100)
    @JsonProperty("achField009")
    private String achField009;

    @JsonProperty("achField010")
    private Boolean achField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField011")
    private BigDecimal achField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField012")
    private BigDecimal achField012;

    @Size(max = 200)
    @JsonProperty("achField013")
    private String achField013;

    public AchDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto054 instance = new AchDto054();

        public Builder achField000(Boolean val) { instance.achField000 = val; return this; }
        public Builder achField001(LocalDate val) { instance.achField001 = val; return this; }
        public Builder achField002(Long val) { instance.achField002 = val; return this; }
        public Builder achField003(Integer val) { instance.achField003 = val; return this; }
        public Builder achField004(Double val) { instance.achField004 = val; return this; }
        public Builder achField005(BigDecimal val) { instance.achField005 = val; return this; }
        public Builder achField006(BigDecimal val) { instance.achField006 = val; return this; }
        public Builder achField007(Long val) { instance.achField007 = val; return this; }
        public Builder achField008(BigDecimal val) { instance.achField008 = val; return this; }
        public Builder achField009(String val) { instance.achField009 = val; return this; }
        public Builder achField010(Boolean val) { instance.achField010 = val; return this; }
        public Builder achField011(BigDecimal val) { instance.achField011 = val; return this; }
        public Builder achField012(BigDecimal val) { instance.achField012 = val; return this; }
        public Builder achField013(String val) { instance.achField013 = val; return this; }
        public AchDto054 build() { return instance; }
    }

    public Boolean getAchField000() { return achField000; }
    public void setAchField000(Boolean achField000) { this.achField000 = achField000; }

    public LocalDate getAchField001() { return achField001; }
    public void setAchField001(LocalDate achField001) { this.achField001 = achField001; }

    public Long getAchField002() { return achField002; }
    public void setAchField002(Long achField002) { this.achField002 = achField002; }

    public Integer getAchField003() { return achField003; }
    public void setAchField003(Integer achField003) { this.achField003 = achField003; }

    public Double getAchField004() { return achField004; }
    public void setAchField004(Double achField004) { this.achField004 = achField004; }

    public BigDecimal getAchField005() { return achField005; }
    public void setAchField005(BigDecimal achField005) { this.achField005 = achField005; }

    public BigDecimal getAchField006() { return achField006; }
    public void setAchField006(BigDecimal achField006) { this.achField006 = achField006; }

    public Long getAchField007() { return achField007; }
    public void setAchField007(Long achField007) { this.achField007 = achField007; }

    public BigDecimal getAchField008() { return achField008; }
    public void setAchField008(BigDecimal achField008) { this.achField008 = achField008; }

    public String getAchField009() { return achField009; }
    public void setAchField009(String achField009) { this.achField009 = achField009; }

    public Boolean getAchField010() { return achField010; }
    public void setAchField010(Boolean achField010) { this.achField010 = achField010; }

    public BigDecimal getAchField011() { return achField011; }
    public void setAchField011(BigDecimal achField011) { this.achField011 = achField011; }

    public BigDecimal getAchField012() { return achField012; }
    public void setAchField012(BigDecimal achField012) { this.achField012 = achField012; }

    public String getAchField013() { return achField013; }
    public void setAchField013(String achField013) { this.achField013 = achField013; }

    @Override
    public String toString() {
        return "AchDto054{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
