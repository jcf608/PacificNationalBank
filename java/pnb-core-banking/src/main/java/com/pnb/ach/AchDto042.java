package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto042 — Data Transfer Object for ach operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto042 {

    @JsonProperty("achField000")
    private Double achField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField001")
    private BigDecimal achField001;

    @JsonProperty("achField002")
    private Long achField002;

    @JsonProperty("achField003")
    private LocalDate achField003;

    @JsonProperty("achField004")
    private Double achField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField005")
    private BigDecimal achField005;

    @JsonProperty("achField006")
    private LocalDate achField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField007")
    private BigDecimal achField007;

    @JsonProperty("achField008")
    private LocalDate achField008;

    @JsonProperty("achField009")
    private Double achField009;

    @JsonProperty("achField010")
    private Long achField010;

    @JsonProperty("achField011")
    private LocalDate achField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField012")
    private BigDecimal achField012;

    @JsonProperty("achField013")
    private Long achField013;

    public AchDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto042 instance = new AchDto042();

        public Builder achField000(Double val) { instance.achField000 = val; return this; }
        public Builder achField001(BigDecimal val) { instance.achField001 = val; return this; }
        public Builder achField002(Long val) { instance.achField002 = val; return this; }
        public Builder achField003(LocalDate val) { instance.achField003 = val; return this; }
        public Builder achField004(Double val) { instance.achField004 = val; return this; }
        public Builder achField005(BigDecimal val) { instance.achField005 = val; return this; }
        public Builder achField006(LocalDate val) { instance.achField006 = val; return this; }
        public Builder achField007(BigDecimal val) { instance.achField007 = val; return this; }
        public Builder achField008(LocalDate val) { instance.achField008 = val; return this; }
        public Builder achField009(Double val) { instance.achField009 = val; return this; }
        public Builder achField010(Long val) { instance.achField010 = val; return this; }
        public Builder achField011(LocalDate val) { instance.achField011 = val; return this; }
        public Builder achField012(BigDecimal val) { instance.achField012 = val; return this; }
        public Builder achField013(Long val) { instance.achField013 = val; return this; }
        public AchDto042 build() { return instance; }
    }

    public Double getAchField000() { return achField000; }
    public void setAchField000(Double achField000) { this.achField000 = achField000; }

    public BigDecimal getAchField001() { return achField001; }
    public void setAchField001(BigDecimal achField001) { this.achField001 = achField001; }

    public Long getAchField002() { return achField002; }
    public void setAchField002(Long achField002) { this.achField002 = achField002; }

    public LocalDate getAchField003() { return achField003; }
    public void setAchField003(LocalDate achField003) { this.achField003 = achField003; }

    public Double getAchField004() { return achField004; }
    public void setAchField004(Double achField004) { this.achField004 = achField004; }

    public BigDecimal getAchField005() { return achField005; }
    public void setAchField005(BigDecimal achField005) { this.achField005 = achField005; }

    public LocalDate getAchField006() { return achField006; }
    public void setAchField006(LocalDate achField006) { this.achField006 = achField006; }

    public BigDecimal getAchField007() { return achField007; }
    public void setAchField007(BigDecimal achField007) { this.achField007 = achField007; }

    public LocalDate getAchField008() { return achField008; }
    public void setAchField008(LocalDate achField008) { this.achField008 = achField008; }

    public Double getAchField009() { return achField009; }
    public void setAchField009(Double achField009) { this.achField009 = achField009; }

    public Long getAchField010() { return achField010; }
    public void setAchField010(Long achField010) { this.achField010 = achField010; }

    public LocalDate getAchField011() { return achField011; }
    public void setAchField011(LocalDate achField011) { this.achField011 = achField011; }

    public BigDecimal getAchField012() { return achField012; }
    public void setAchField012(BigDecimal achField012) { this.achField012 = achField012; }

    public Long getAchField013() { return achField013; }
    public void setAchField013(Long achField013) { this.achField013 = achField013; }

    @Override
    public String toString() {
        return "AchDto042{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
