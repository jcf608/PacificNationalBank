package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto037 — Data Transfer Object for ach operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto037 {

    @DecimalMin(value = "0.00")
    @JsonProperty("achField000")
    private BigDecimal achField000;

    @JsonProperty("achField001")
    private Double achField001;

    @JsonProperty("achField002")
    private Boolean achField002;

    @JsonProperty("achField003")
    private Long achField003;

    @JsonProperty("achField004")
    private Boolean achField004;

    @JsonProperty("achField005")
    private Double achField005;

    @JsonProperty("achField006")
    private LocalDate achField006;

    @JsonProperty("achField007")
    private Long achField007;

    @JsonProperty("achField008")
    private Boolean achField008;

    public AchDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto037 instance = new AchDto037();

        public Builder achField000(BigDecimal val) { instance.achField000 = val; return this; }
        public Builder achField001(Double val) { instance.achField001 = val; return this; }
        public Builder achField002(Boolean val) { instance.achField002 = val; return this; }
        public Builder achField003(Long val) { instance.achField003 = val; return this; }
        public Builder achField004(Boolean val) { instance.achField004 = val; return this; }
        public Builder achField005(Double val) { instance.achField005 = val; return this; }
        public Builder achField006(LocalDate val) { instance.achField006 = val; return this; }
        public Builder achField007(Long val) { instance.achField007 = val; return this; }
        public Builder achField008(Boolean val) { instance.achField008 = val; return this; }
        public AchDto037 build() { return instance; }
    }

    public BigDecimal getAchField000() { return achField000; }
    public void setAchField000(BigDecimal achField000) { this.achField000 = achField000; }

    public Double getAchField001() { return achField001; }
    public void setAchField001(Double achField001) { this.achField001 = achField001; }

    public Boolean getAchField002() { return achField002; }
    public void setAchField002(Boolean achField002) { this.achField002 = achField002; }

    public Long getAchField003() { return achField003; }
    public void setAchField003(Long achField003) { this.achField003 = achField003; }

    public Boolean getAchField004() { return achField004; }
    public void setAchField004(Boolean achField004) { this.achField004 = achField004; }

    public Double getAchField005() { return achField005; }
    public void setAchField005(Double achField005) { this.achField005 = achField005; }

    public LocalDate getAchField006() { return achField006; }
    public void setAchField006(LocalDate achField006) { this.achField006 = achField006; }

    public Long getAchField007() { return achField007; }
    public void setAchField007(Long achField007) { this.achField007 = achField007; }

    public Boolean getAchField008() { return achField008; }
    public void setAchField008(Boolean achField008) { this.achField008 = achField008; }

    @Override
    public String toString() {
        return "AchDto037{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
