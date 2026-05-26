package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto049 — Data Transfer Object for ach operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto049 {

    @DecimalMin(value = "0.00")
    @JsonProperty("achField000")
    private BigDecimal achField000;

    @JsonProperty("achField001")
    private Double achField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField002")
    private BigDecimal achField002;

    @JsonProperty("achField003")
    private LocalDate achField003;

    @JsonProperty("achField004")
    private Double achField004;

    @JsonProperty("achField005")
    private Boolean achField005;

    @JsonProperty("achField006")
    private Boolean achField006;

    @JsonProperty("achField007")
    private LocalDate achField007;

    @JsonProperty("achField008")
    private Double achField008;

    public AchDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto049 instance = new AchDto049();

        public Builder achField000(BigDecimal val) { instance.achField000 = val; return this; }
        public Builder achField001(Double val) { instance.achField001 = val; return this; }
        public Builder achField002(BigDecimal val) { instance.achField002 = val; return this; }
        public Builder achField003(LocalDate val) { instance.achField003 = val; return this; }
        public Builder achField004(Double val) { instance.achField004 = val; return this; }
        public Builder achField005(Boolean val) { instance.achField005 = val; return this; }
        public Builder achField006(Boolean val) { instance.achField006 = val; return this; }
        public Builder achField007(LocalDate val) { instance.achField007 = val; return this; }
        public Builder achField008(Double val) { instance.achField008 = val; return this; }
        public AchDto049 build() { return instance; }
    }

    public BigDecimal getAchField000() { return achField000; }
    public void setAchField000(BigDecimal achField000) { this.achField000 = achField000; }

    public Double getAchField001() { return achField001; }
    public void setAchField001(Double achField001) { this.achField001 = achField001; }

    public BigDecimal getAchField002() { return achField002; }
    public void setAchField002(BigDecimal achField002) { this.achField002 = achField002; }

    public LocalDate getAchField003() { return achField003; }
    public void setAchField003(LocalDate achField003) { this.achField003 = achField003; }

    public Double getAchField004() { return achField004; }
    public void setAchField004(Double achField004) { this.achField004 = achField004; }

    public Boolean getAchField005() { return achField005; }
    public void setAchField005(Boolean achField005) { this.achField005 = achField005; }

    public Boolean getAchField006() { return achField006; }
    public void setAchField006(Boolean achField006) { this.achField006 = achField006; }

    public LocalDate getAchField007() { return achField007; }
    public void setAchField007(LocalDate achField007) { this.achField007 = achField007; }

    public Double getAchField008() { return achField008; }
    public void setAchField008(Double achField008) { this.achField008 = achField008; }

    @Override
    public String toString() {
        return "AchDto049{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
