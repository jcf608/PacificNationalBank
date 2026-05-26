package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto024 — Data Transfer Object for ach operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto024 {

    @JsonProperty("achField000")
    private Long achField000;

    @JsonProperty("achField001")
    private Double achField001;

    @JsonProperty("achField002")
    private Boolean achField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField003")
    private BigDecimal achField003;

    @Size(max = 40)
    @JsonProperty("achField004")
    private String achField004;

    @JsonProperty("achField005")
    private Boolean achField005;

    @JsonProperty("achField006")
    private LocalDate achField006;

    @JsonProperty("achField007")
    private Integer achField007;

    public AchDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto024 instance = new AchDto024();

        public Builder achField000(Long val) { instance.achField000 = val; return this; }
        public Builder achField001(Double val) { instance.achField001 = val; return this; }
        public Builder achField002(Boolean val) { instance.achField002 = val; return this; }
        public Builder achField003(BigDecimal val) { instance.achField003 = val; return this; }
        public Builder achField004(String val) { instance.achField004 = val; return this; }
        public Builder achField005(Boolean val) { instance.achField005 = val; return this; }
        public Builder achField006(LocalDate val) { instance.achField006 = val; return this; }
        public Builder achField007(Integer val) { instance.achField007 = val; return this; }
        public AchDto024 build() { return instance; }
    }

    public Long getAchField000() { return achField000; }
    public void setAchField000(Long achField000) { this.achField000 = achField000; }

    public Double getAchField001() { return achField001; }
    public void setAchField001(Double achField001) { this.achField001 = achField001; }

    public Boolean getAchField002() { return achField002; }
    public void setAchField002(Boolean achField002) { this.achField002 = achField002; }

    public BigDecimal getAchField003() { return achField003; }
    public void setAchField003(BigDecimal achField003) { this.achField003 = achField003; }

    public String getAchField004() { return achField004; }
    public void setAchField004(String achField004) { this.achField004 = achField004; }

    public Boolean getAchField005() { return achField005; }
    public void setAchField005(Boolean achField005) { this.achField005 = achField005; }

    public LocalDate getAchField006() { return achField006; }
    public void setAchField006(LocalDate achField006) { this.achField006 = achField006; }

    public Integer getAchField007() { return achField007; }
    public void setAchField007(Integer achField007) { this.achField007 = achField007; }

    @Override
    public String toString() {
        return "AchDto024{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
