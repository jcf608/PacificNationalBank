package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto053 — Data Transfer Object for ach operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto053 {

    @DecimalMin(value = "0.00")
    @JsonProperty("achField000")
    private BigDecimal achField000;

    @JsonProperty("achField001")
    private Integer achField001;

    @JsonProperty("achField002")
    private Boolean achField002;

    @JsonProperty("achField003")
    private Double achField003;

    @JsonProperty("achField004")
    private LocalDate achField004;

    @JsonProperty("achField005")
    private Integer achField005;

    @JsonProperty("achField006")
    private Boolean achField006;

    @JsonProperty("achField007")
    private Double achField007;

    @JsonProperty("achField008")
    private Long achField008;

    @Size(max = 20)
    @JsonProperty("achField009")
    private String achField009;

    @JsonProperty("achField010")
    private Long achField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField011")
    private BigDecimal achField011;

    @JsonProperty("achField012")
    private Double achField012;

    public AchDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto053 instance = new AchDto053();

        public Builder achField000(BigDecimal val) { instance.achField000 = val; return this; }
        public Builder achField001(Integer val) { instance.achField001 = val; return this; }
        public Builder achField002(Boolean val) { instance.achField002 = val; return this; }
        public Builder achField003(Double val) { instance.achField003 = val; return this; }
        public Builder achField004(LocalDate val) { instance.achField004 = val; return this; }
        public Builder achField005(Integer val) { instance.achField005 = val; return this; }
        public Builder achField006(Boolean val) { instance.achField006 = val; return this; }
        public Builder achField007(Double val) { instance.achField007 = val; return this; }
        public Builder achField008(Long val) { instance.achField008 = val; return this; }
        public Builder achField009(String val) { instance.achField009 = val; return this; }
        public Builder achField010(Long val) { instance.achField010 = val; return this; }
        public Builder achField011(BigDecimal val) { instance.achField011 = val; return this; }
        public Builder achField012(Double val) { instance.achField012 = val; return this; }
        public AchDto053 build() { return instance; }
    }

    public BigDecimal getAchField000() { return achField000; }
    public void setAchField000(BigDecimal achField000) { this.achField000 = achField000; }

    public Integer getAchField001() { return achField001; }
    public void setAchField001(Integer achField001) { this.achField001 = achField001; }

    public Boolean getAchField002() { return achField002; }
    public void setAchField002(Boolean achField002) { this.achField002 = achField002; }

    public Double getAchField003() { return achField003; }
    public void setAchField003(Double achField003) { this.achField003 = achField003; }

    public LocalDate getAchField004() { return achField004; }
    public void setAchField004(LocalDate achField004) { this.achField004 = achField004; }

    public Integer getAchField005() { return achField005; }
    public void setAchField005(Integer achField005) { this.achField005 = achField005; }

    public Boolean getAchField006() { return achField006; }
    public void setAchField006(Boolean achField006) { this.achField006 = achField006; }

    public Double getAchField007() { return achField007; }
    public void setAchField007(Double achField007) { this.achField007 = achField007; }

    public Long getAchField008() { return achField008; }
    public void setAchField008(Long achField008) { this.achField008 = achField008; }

    public String getAchField009() { return achField009; }
    public void setAchField009(String achField009) { this.achField009 = achField009; }

    public Long getAchField010() { return achField010; }
    public void setAchField010(Long achField010) { this.achField010 = achField010; }

    public BigDecimal getAchField011() { return achField011; }
    public void setAchField011(BigDecimal achField011) { this.achField011 = achField011; }

    public Double getAchField012() { return achField012; }
    public void setAchField012(Double achField012) { this.achField012 = achField012; }

    @Override
    public String toString() {
        return "AchDto053{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
