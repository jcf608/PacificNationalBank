package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto052 — Data Transfer Object for ach operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto052 {

    @JsonProperty("achField000")
    private Long achField000;

    @JsonProperty("achField001")
    private Long achField001;

    @Size(max = 20)
    @JsonProperty("achField002")
    private String achField002;

    @Size(max = 60)
    @JsonProperty("achField003")
    private String achField003;

    @JsonProperty("achField004")
    private Double achField004;

    @JsonProperty("achField005")
    private Integer achField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField006")
    private BigDecimal achField006;

    @Size(max = 40)
    @JsonProperty("achField007")
    private String achField007;

    @JsonProperty("achField008")
    private Long achField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField009")
    private BigDecimal achField009;

    @JsonProperty("achField010")
    private Integer achField010;

    @JsonProperty("achField011")
    private Boolean achField011;

    public AchDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto052 instance = new AchDto052();

        public Builder achField000(Long val) { instance.achField000 = val; return this; }
        public Builder achField001(Long val) { instance.achField001 = val; return this; }
        public Builder achField002(String val) { instance.achField002 = val; return this; }
        public Builder achField003(String val) { instance.achField003 = val; return this; }
        public Builder achField004(Double val) { instance.achField004 = val; return this; }
        public Builder achField005(Integer val) { instance.achField005 = val; return this; }
        public Builder achField006(BigDecimal val) { instance.achField006 = val; return this; }
        public Builder achField007(String val) { instance.achField007 = val; return this; }
        public Builder achField008(Long val) { instance.achField008 = val; return this; }
        public Builder achField009(BigDecimal val) { instance.achField009 = val; return this; }
        public Builder achField010(Integer val) { instance.achField010 = val; return this; }
        public Builder achField011(Boolean val) { instance.achField011 = val; return this; }
        public AchDto052 build() { return instance; }
    }

    public Long getAchField000() { return achField000; }
    public void setAchField000(Long achField000) { this.achField000 = achField000; }

    public Long getAchField001() { return achField001; }
    public void setAchField001(Long achField001) { this.achField001 = achField001; }

    public String getAchField002() { return achField002; }
    public void setAchField002(String achField002) { this.achField002 = achField002; }

    public String getAchField003() { return achField003; }
    public void setAchField003(String achField003) { this.achField003 = achField003; }

    public Double getAchField004() { return achField004; }
    public void setAchField004(Double achField004) { this.achField004 = achField004; }

    public Integer getAchField005() { return achField005; }
    public void setAchField005(Integer achField005) { this.achField005 = achField005; }

    public BigDecimal getAchField006() { return achField006; }
    public void setAchField006(BigDecimal achField006) { this.achField006 = achField006; }

    public String getAchField007() { return achField007; }
    public void setAchField007(String achField007) { this.achField007 = achField007; }

    public Long getAchField008() { return achField008; }
    public void setAchField008(Long achField008) { this.achField008 = achField008; }

    public BigDecimal getAchField009() { return achField009; }
    public void setAchField009(BigDecimal achField009) { this.achField009 = achField009; }

    public Integer getAchField010() { return achField010; }
    public void setAchField010(Integer achField010) { this.achField010 = achField010; }

    public Boolean getAchField011() { return achField011; }
    public void setAchField011(Boolean achField011) { this.achField011 = achField011; }

    @Override
    public String toString() {
        return "AchDto052{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
