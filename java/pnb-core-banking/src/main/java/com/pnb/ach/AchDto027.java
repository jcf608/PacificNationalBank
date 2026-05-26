package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto027 — Data Transfer Object for ach operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto027 {

    @JsonProperty("achField000")
    private Long achField000;

    @JsonProperty("achField001")
    private Integer achField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField002")
    private BigDecimal achField002;

    @JsonProperty("achField003")
    private Long achField003;

    @JsonProperty("achField004")
    private Double achField004;

    @Size(max = 60)
    @JsonProperty("achField005")
    private String achField005;

    @JsonProperty("achField006")
    private Double achField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField007")
    private BigDecimal achField007;

    @JsonProperty("achField008")
    private Long achField008;

    @JsonProperty("achField009")
    private Long achField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField010")
    private BigDecimal achField010;

    public AchDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto027 instance = new AchDto027();

        public Builder achField000(Long val) { instance.achField000 = val; return this; }
        public Builder achField001(Integer val) { instance.achField001 = val; return this; }
        public Builder achField002(BigDecimal val) { instance.achField002 = val; return this; }
        public Builder achField003(Long val) { instance.achField003 = val; return this; }
        public Builder achField004(Double val) { instance.achField004 = val; return this; }
        public Builder achField005(String val) { instance.achField005 = val; return this; }
        public Builder achField006(Double val) { instance.achField006 = val; return this; }
        public Builder achField007(BigDecimal val) { instance.achField007 = val; return this; }
        public Builder achField008(Long val) { instance.achField008 = val; return this; }
        public Builder achField009(Long val) { instance.achField009 = val; return this; }
        public Builder achField010(BigDecimal val) { instance.achField010 = val; return this; }
        public AchDto027 build() { return instance; }
    }

    public Long getAchField000() { return achField000; }
    public void setAchField000(Long achField000) { this.achField000 = achField000; }

    public Integer getAchField001() { return achField001; }
    public void setAchField001(Integer achField001) { this.achField001 = achField001; }

    public BigDecimal getAchField002() { return achField002; }
    public void setAchField002(BigDecimal achField002) { this.achField002 = achField002; }

    public Long getAchField003() { return achField003; }
    public void setAchField003(Long achField003) { this.achField003 = achField003; }

    public Double getAchField004() { return achField004; }
    public void setAchField004(Double achField004) { this.achField004 = achField004; }

    public String getAchField005() { return achField005; }
    public void setAchField005(String achField005) { this.achField005 = achField005; }

    public Double getAchField006() { return achField006; }
    public void setAchField006(Double achField006) { this.achField006 = achField006; }

    public BigDecimal getAchField007() { return achField007; }
    public void setAchField007(BigDecimal achField007) { this.achField007 = achField007; }

    public Long getAchField008() { return achField008; }
    public void setAchField008(Long achField008) { this.achField008 = achField008; }

    public Long getAchField009() { return achField009; }
    public void setAchField009(Long achField009) { this.achField009 = achField009; }

    public BigDecimal getAchField010() { return achField010; }
    public void setAchField010(BigDecimal achField010) { this.achField010 = achField010; }

    @Override
    public String toString() {
        return "AchDto027{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
