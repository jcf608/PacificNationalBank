package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto026 — Data Transfer Object for ach operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto026 {

    @JsonProperty("achField000")
    private Boolean achField000;

    @JsonProperty("achField001")
    private Integer achField001;

    @JsonProperty("achField002")
    private Boolean achField002;

    @JsonProperty("achField003")
    private LocalDate achField003;

    @Size(max = 40)
    @JsonProperty("achField004")
    private String achField004;

    @JsonProperty("achField005")
    private LocalDate achField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField006")
    private BigDecimal achField006;

    @JsonProperty("achField007")
    private Long achField007;

    @JsonProperty("achField008")
    private Double achField008;

    @JsonProperty("achField009")
    private Boolean achField009;

    public AchDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto026 instance = new AchDto026();

        public Builder achField000(Boolean val) { instance.achField000 = val; return this; }
        public Builder achField001(Integer val) { instance.achField001 = val; return this; }
        public Builder achField002(Boolean val) { instance.achField002 = val; return this; }
        public Builder achField003(LocalDate val) { instance.achField003 = val; return this; }
        public Builder achField004(String val) { instance.achField004 = val; return this; }
        public Builder achField005(LocalDate val) { instance.achField005 = val; return this; }
        public Builder achField006(BigDecimal val) { instance.achField006 = val; return this; }
        public Builder achField007(Long val) { instance.achField007 = val; return this; }
        public Builder achField008(Double val) { instance.achField008 = val; return this; }
        public Builder achField009(Boolean val) { instance.achField009 = val; return this; }
        public AchDto026 build() { return instance; }
    }

    public Boolean getAchField000() { return achField000; }
    public void setAchField000(Boolean achField000) { this.achField000 = achField000; }

    public Integer getAchField001() { return achField001; }
    public void setAchField001(Integer achField001) { this.achField001 = achField001; }

    public Boolean getAchField002() { return achField002; }
    public void setAchField002(Boolean achField002) { this.achField002 = achField002; }

    public LocalDate getAchField003() { return achField003; }
    public void setAchField003(LocalDate achField003) { this.achField003 = achField003; }

    public String getAchField004() { return achField004; }
    public void setAchField004(String achField004) { this.achField004 = achField004; }

    public LocalDate getAchField005() { return achField005; }
    public void setAchField005(LocalDate achField005) { this.achField005 = achField005; }

    public BigDecimal getAchField006() { return achField006; }
    public void setAchField006(BigDecimal achField006) { this.achField006 = achField006; }

    public Long getAchField007() { return achField007; }
    public void setAchField007(Long achField007) { this.achField007 = achField007; }

    public Double getAchField008() { return achField008; }
    public void setAchField008(Double achField008) { this.achField008 = achField008; }

    public Boolean getAchField009() { return achField009; }
    public void setAchField009(Boolean achField009) { this.achField009 = achField009; }

    @Override
    public String toString() {
        return "AchDto026{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
