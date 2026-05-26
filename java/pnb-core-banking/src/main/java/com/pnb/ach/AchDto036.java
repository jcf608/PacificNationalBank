package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto036 — Data Transfer Object for ach operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto036 {

    @JsonProperty("achField000")
    private Double achField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField001")
    private BigDecimal achField001;

    @Size(max = 60)
    @JsonProperty("achField002")
    private String achField002;

    @JsonProperty("achField003")
    private Boolean achField003;

    @JsonProperty("achField004")
    private Long achField004;

    @JsonProperty("achField005")
    private LocalDate achField005;

    @JsonProperty("achField006")
    private Double achField006;

    @JsonProperty("achField007")
    private Double achField007;

    public AchDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto036 instance = new AchDto036();

        public Builder achField000(Double val) { instance.achField000 = val; return this; }
        public Builder achField001(BigDecimal val) { instance.achField001 = val; return this; }
        public Builder achField002(String val) { instance.achField002 = val; return this; }
        public Builder achField003(Boolean val) { instance.achField003 = val; return this; }
        public Builder achField004(Long val) { instance.achField004 = val; return this; }
        public Builder achField005(LocalDate val) { instance.achField005 = val; return this; }
        public Builder achField006(Double val) { instance.achField006 = val; return this; }
        public Builder achField007(Double val) { instance.achField007 = val; return this; }
        public AchDto036 build() { return instance; }
    }

    public Double getAchField000() { return achField000; }
    public void setAchField000(Double achField000) { this.achField000 = achField000; }

    public BigDecimal getAchField001() { return achField001; }
    public void setAchField001(BigDecimal achField001) { this.achField001 = achField001; }

    public String getAchField002() { return achField002; }
    public void setAchField002(String achField002) { this.achField002 = achField002; }

    public Boolean getAchField003() { return achField003; }
    public void setAchField003(Boolean achField003) { this.achField003 = achField003; }

    public Long getAchField004() { return achField004; }
    public void setAchField004(Long achField004) { this.achField004 = achField004; }

    public LocalDate getAchField005() { return achField005; }
    public void setAchField005(LocalDate achField005) { this.achField005 = achField005; }

    public Double getAchField006() { return achField006; }
    public void setAchField006(Double achField006) { this.achField006 = achField006; }

    public Double getAchField007() { return achField007; }
    public void setAchField007(Double achField007) { this.achField007 = achField007; }

    @Override
    public String toString() {
        return "AchDto036{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
