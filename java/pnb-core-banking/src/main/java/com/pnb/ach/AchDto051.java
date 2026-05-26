package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto051 — Data Transfer Object for ach operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto051 {

    @JsonProperty("achField000")
    private Boolean achField000;

    @Size(max = 200)
    @JsonProperty("achField001")
    private String achField001;

    @JsonProperty("achField002")
    private Long achField002;

    @JsonProperty("achField003")
    private LocalDate achField003;

    @JsonProperty("achField004")
    private Double achField004;

    @JsonProperty("achField005")
    private Boolean achField005;

    @JsonProperty("achField006")
    private Double achField006;

    @Size(max = 20)
    @JsonProperty("achField007")
    private String achField007;

    @JsonProperty("achField008")
    private Integer achField008;

    @JsonProperty("achField009")
    private Long achField009;

    @JsonProperty("achField010")
    private LocalDate achField010;

    public AchDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto051 instance = new AchDto051();

        public Builder achField000(Boolean val) { instance.achField000 = val; return this; }
        public Builder achField001(String val) { instance.achField001 = val; return this; }
        public Builder achField002(Long val) { instance.achField002 = val; return this; }
        public Builder achField003(LocalDate val) { instance.achField003 = val; return this; }
        public Builder achField004(Double val) { instance.achField004 = val; return this; }
        public Builder achField005(Boolean val) { instance.achField005 = val; return this; }
        public Builder achField006(Double val) { instance.achField006 = val; return this; }
        public Builder achField007(String val) { instance.achField007 = val; return this; }
        public Builder achField008(Integer val) { instance.achField008 = val; return this; }
        public Builder achField009(Long val) { instance.achField009 = val; return this; }
        public Builder achField010(LocalDate val) { instance.achField010 = val; return this; }
        public AchDto051 build() { return instance; }
    }

    public Boolean getAchField000() { return achField000; }
    public void setAchField000(Boolean achField000) { this.achField000 = achField000; }

    public String getAchField001() { return achField001; }
    public void setAchField001(String achField001) { this.achField001 = achField001; }

    public Long getAchField002() { return achField002; }
    public void setAchField002(Long achField002) { this.achField002 = achField002; }

    public LocalDate getAchField003() { return achField003; }
    public void setAchField003(LocalDate achField003) { this.achField003 = achField003; }

    public Double getAchField004() { return achField004; }
    public void setAchField004(Double achField004) { this.achField004 = achField004; }

    public Boolean getAchField005() { return achField005; }
    public void setAchField005(Boolean achField005) { this.achField005 = achField005; }

    public Double getAchField006() { return achField006; }
    public void setAchField006(Double achField006) { this.achField006 = achField006; }

    public String getAchField007() { return achField007; }
    public void setAchField007(String achField007) { this.achField007 = achField007; }

    public Integer getAchField008() { return achField008; }
    public void setAchField008(Integer achField008) { this.achField008 = achField008; }

    public Long getAchField009() { return achField009; }
    public void setAchField009(Long achField009) { this.achField009 = achField009; }

    public LocalDate getAchField010() { return achField010; }
    public void setAchField010(LocalDate achField010) { this.achField010 = achField010; }

    @Override
    public String toString() {
        return "AchDto051{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
