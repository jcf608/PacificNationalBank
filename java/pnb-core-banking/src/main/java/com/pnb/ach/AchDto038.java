package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto038 — Data Transfer Object for ach operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto038 {

    @JsonProperty("achField000")
    private Double achField000;

    @Size(max = 40)
    @JsonProperty("achField001")
    private String achField001;

    @JsonProperty("achField002")
    private Double achField002;

    @Size(max = 40)
    @JsonProperty("achField003")
    private String achField003;

    @JsonProperty("achField004")
    private Double achField004;

    @JsonProperty("achField005")
    private Boolean achField005;

    @JsonProperty("achField006")
    private Long achField006;

    @JsonProperty("achField007")
    private Long achField007;

    @JsonProperty("achField008")
    private LocalDate achField008;

    @JsonProperty("achField009")
    private LocalDate achField009;

    public AchDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto038 instance = new AchDto038();

        public Builder achField000(Double val) { instance.achField000 = val; return this; }
        public Builder achField001(String val) { instance.achField001 = val; return this; }
        public Builder achField002(Double val) { instance.achField002 = val; return this; }
        public Builder achField003(String val) { instance.achField003 = val; return this; }
        public Builder achField004(Double val) { instance.achField004 = val; return this; }
        public Builder achField005(Boolean val) { instance.achField005 = val; return this; }
        public Builder achField006(Long val) { instance.achField006 = val; return this; }
        public Builder achField007(Long val) { instance.achField007 = val; return this; }
        public Builder achField008(LocalDate val) { instance.achField008 = val; return this; }
        public Builder achField009(LocalDate val) { instance.achField009 = val; return this; }
        public AchDto038 build() { return instance; }
    }

    public Double getAchField000() { return achField000; }
    public void setAchField000(Double achField000) { this.achField000 = achField000; }

    public String getAchField001() { return achField001; }
    public void setAchField001(String achField001) { this.achField001 = achField001; }

    public Double getAchField002() { return achField002; }
    public void setAchField002(Double achField002) { this.achField002 = achField002; }

    public String getAchField003() { return achField003; }
    public void setAchField003(String achField003) { this.achField003 = achField003; }

    public Double getAchField004() { return achField004; }
    public void setAchField004(Double achField004) { this.achField004 = achField004; }

    public Boolean getAchField005() { return achField005; }
    public void setAchField005(Boolean achField005) { this.achField005 = achField005; }

    public Long getAchField006() { return achField006; }
    public void setAchField006(Long achField006) { this.achField006 = achField006; }

    public Long getAchField007() { return achField007; }
    public void setAchField007(Long achField007) { this.achField007 = achField007; }

    public LocalDate getAchField008() { return achField008; }
    public void setAchField008(LocalDate achField008) { this.achField008 = achField008; }

    public LocalDate getAchField009() { return achField009; }
    public void setAchField009(LocalDate achField009) { this.achField009 = achField009; }

    @Override
    public String toString() {
        return "AchDto038{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
