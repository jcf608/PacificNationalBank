package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto050 — Data Transfer Object for ach operations.
 * Variant 50 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto050 {

    @Size(max = 40)
    @JsonProperty("achField000")
    private String achField000;

    @Size(max = 100)
    @JsonProperty("achField001")
    private String achField001;

    @Size(max = 20)
    @JsonProperty("achField002")
    private String achField002;

    @JsonProperty("achField003")
    private Boolean achField003;

    @JsonProperty("achField004")
    private Boolean achField004;

    @JsonProperty("achField005")
    private Long achField005;

    @JsonProperty("achField006")
    private Long achField006;

    @JsonProperty("achField007")
    private Boolean achField007;

    @JsonProperty("achField008")
    private Long achField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField009")
    private BigDecimal achField009;

    public AchDto050() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto050 instance = new AchDto050();

        public Builder achField000(String val) { instance.achField000 = val; return this; }
        public Builder achField001(String val) { instance.achField001 = val; return this; }
        public Builder achField002(String val) { instance.achField002 = val; return this; }
        public Builder achField003(Boolean val) { instance.achField003 = val; return this; }
        public Builder achField004(Boolean val) { instance.achField004 = val; return this; }
        public Builder achField005(Long val) { instance.achField005 = val; return this; }
        public Builder achField006(Long val) { instance.achField006 = val; return this; }
        public Builder achField007(Boolean val) { instance.achField007 = val; return this; }
        public Builder achField008(Long val) { instance.achField008 = val; return this; }
        public Builder achField009(BigDecimal val) { instance.achField009 = val; return this; }
        public AchDto050 build() { return instance; }
    }

    public String getAchField000() { return achField000; }
    public void setAchField000(String achField000) { this.achField000 = achField000; }

    public String getAchField001() { return achField001; }
    public void setAchField001(String achField001) { this.achField001 = achField001; }

    public String getAchField002() { return achField002; }
    public void setAchField002(String achField002) { this.achField002 = achField002; }

    public Boolean getAchField003() { return achField003; }
    public void setAchField003(Boolean achField003) { this.achField003 = achField003; }

    public Boolean getAchField004() { return achField004; }
    public void setAchField004(Boolean achField004) { this.achField004 = achField004; }

    public Long getAchField005() { return achField005; }
    public void setAchField005(Long achField005) { this.achField005 = achField005; }

    public Long getAchField006() { return achField006; }
    public void setAchField006(Long achField006) { this.achField006 = achField006; }

    public Boolean getAchField007() { return achField007; }
    public void setAchField007(Boolean achField007) { this.achField007 = achField007; }

    public Long getAchField008() { return achField008; }
    public void setAchField008(Long achField008) { this.achField008 = achField008; }

    public BigDecimal getAchField009() { return achField009; }
    public void setAchField009(BigDecimal achField009) { this.achField009 = achField009; }

    @Override
    public String toString() {
        return "AchDto050{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
