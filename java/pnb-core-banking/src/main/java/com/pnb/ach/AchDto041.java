package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto041 — Data Transfer Object for ach operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto041 {

    @JsonProperty("achField000")
    private Integer achField000;

    @Size(max = 60)
    @JsonProperty("achField001")
    private String achField001;

    @JsonProperty("achField002")
    private Integer achField002;

    @JsonProperty("achField003")
    private Double achField003;

    @JsonProperty("achField004")
    private Long achField004;

    @JsonProperty("achField005")
    private Long achField005;

    @JsonProperty("achField006")
    private LocalDate achField006;

    @JsonProperty("achField007")
    private Double achField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField008")
    private BigDecimal achField008;

    @JsonProperty("achField009")
    private Boolean achField009;

    @JsonProperty("achField010")
    private LocalDate achField010;

    @JsonProperty("achField011")
    private Integer achField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField012")
    private BigDecimal achField012;

    public AchDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto041 instance = new AchDto041();

        public Builder achField000(Integer val) { instance.achField000 = val; return this; }
        public Builder achField001(String val) { instance.achField001 = val; return this; }
        public Builder achField002(Integer val) { instance.achField002 = val; return this; }
        public Builder achField003(Double val) { instance.achField003 = val; return this; }
        public Builder achField004(Long val) { instance.achField004 = val; return this; }
        public Builder achField005(Long val) { instance.achField005 = val; return this; }
        public Builder achField006(LocalDate val) { instance.achField006 = val; return this; }
        public Builder achField007(Double val) { instance.achField007 = val; return this; }
        public Builder achField008(BigDecimal val) { instance.achField008 = val; return this; }
        public Builder achField009(Boolean val) { instance.achField009 = val; return this; }
        public Builder achField010(LocalDate val) { instance.achField010 = val; return this; }
        public Builder achField011(Integer val) { instance.achField011 = val; return this; }
        public Builder achField012(BigDecimal val) { instance.achField012 = val; return this; }
        public AchDto041 build() { return instance; }
    }

    public Integer getAchField000() { return achField000; }
    public void setAchField000(Integer achField000) { this.achField000 = achField000; }

    public String getAchField001() { return achField001; }
    public void setAchField001(String achField001) { this.achField001 = achField001; }

    public Integer getAchField002() { return achField002; }
    public void setAchField002(Integer achField002) { this.achField002 = achField002; }

    public Double getAchField003() { return achField003; }
    public void setAchField003(Double achField003) { this.achField003 = achField003; }

    public Long getAchField004() { return achField004; }
    public void setAchField004(Long achField004) { this.achField004 = achField004; }

    public Long getAchField005() { return achField005; }
    public void setAchField005(Long achField005) { this.achField005 = achField005; }

    public LocalDate getAchField006() { return achField006; }
    public void setAchField006(LocalDate achField006) { this.achField006 = achField006; }

    public Double getAchField007() { return achField007; }
    public void setAchField007(Double achField007) { this.achField007 = achField007; }

    public BigDecimal getAchField008() { return achField008; }
    public void setAchField008(BigDecimal achField008) { this.achField008 = achField008; }

    public Boolean getAchField009() { return achField009; }
    public void setAchField009(Boolean achField009) { this.achField009 = achField009; }

    public LocalDate getAchField010() { return achField010; }
    public void setAchField010(LocalDate achField010) { this.achField010 = achField010; }

    public Integer getAchField011() { return achField011; }
    public void setAchField011(Integer achField011) { this.achField011 = achField011; }

    public BigDecimal getAchField012() { return achField012; }
    public void setAchField012(BigDecimal achField012) { this.achField012 = achField012; }

    @Override
    public String toString() {
        return "AchDto041{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
