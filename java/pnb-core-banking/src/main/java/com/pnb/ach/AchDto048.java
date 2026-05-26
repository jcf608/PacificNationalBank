package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto048 — Data Transfer Object for ach operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto048 {

    @JsonProperty("achField000")
    private Integer achField000;

    @JsonProperty("achField001")
    private Integer achField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField002")
    private BigDecimal achField002;

    @JsonProperty("achField003")
    private Integer achField003;

    @Size(max = 100)
    @JsonProperty("achField004")
    private String achField004;

    @JsonProperty("achField005")
    private Double achField005;

    @JsonProperty("achField006")
    private LocalDate achField006;

    @JsonProperty("achField007")
    private LocalDate achField007;

    public AchDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto048 instance = new AchDto048();

        public Builder achField000(Integer val) { instance.achField000 = val; return this; }
        public Builder achField001(Integer val) { instance.achField001 = val; return this; }
        public Builder achField002(BigDecimal val) { instance.achField002 = val; return this; }
        public Builder achField003(Integer val) { instance.achField003 = val; return this; }
        public Builder achField004(String val) { instance.achField004 = val; return this; }
        public Builder achField005(Double val) { instance.achField005 = val; return this; }
        public Builder achField006(LocalDate val) { instance.achField006 = val; return this; }
        public Builder achField007(LocalDate val) { instance.achField007 = val; return this; }
        public AchDto048 build() { return instance; }
    }

    public Integer getAchField000() { return achField000; }
    public void setAchField000(Integer achField000) { this.achField000 = achField000; }

    public Integer getAchField001() { return achField001; }
    public void setAchField001(Integer achField001) { this.achField001 = achField001; }

    public BigDecimal getAchField002() { return achField002; }
    public void setAchField002(BigDecimal achField002) { this.achField002 = achField002; }

    public Integer getAchField003() { return achField003; }
    public void setAchField003(Integer achField003) { this.achField003 = achField003; }

    public String getAchField004() { return achField004; }
    public void setAchField004(String achField004) { this.achField004 = achField004; }

    public Double getAchField005() { return achField005; }
    public void setAchField005(Double achField005) { this.achField005 = achField005; }

    public LocalDate getAchField006() { return achField006; }
    public void setAchField006(LocalDate achField006) { this.achField006 = achField006; }

    public LocalDate getAchField007() { return achField007; }
    public void setAchField007(LocalDate achField007) { this.achField007 = achField007; }

    @Override
    public String toString() {
        return "AchDto048{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
