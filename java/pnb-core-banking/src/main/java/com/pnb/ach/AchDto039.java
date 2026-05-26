package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto039 — Data Transfer Object for ach operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto039 {

    @JsonProperty("achField000")
    private Double achField000;

    @JsonProperty("achField001")
    private LocalDate achField001;

    @JsonProperty("achField002")
    private Boolean achField002;

    @JsonProperty("achField003")
    private Integer achField003;

    @Size(max = 20)
    @JsonProperty("achField004")
    private String achField004;

    @Size(max = 40)
    @JsonProperty("achField005")
    private String achField005;

    @JsonProperty("achField006")
    private Integer achField006;

    @JsonProperty("achField007")
    private Long achField007;

    @JsonProperty("achField008")
    private Long achField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField009")
    private BigDecimal achField009;

    @JsonProperty("achField010")
    private Long achField010;

    public AchDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto039 instance = new AchDto039();

        public Builder achField000(Double val) { instance.achField000 = val; return this; }
        public Builder achField001(LocalDate val) { instance.achField001 = val; return this; }
        public Builder achField002(Boolean val) { instance.achField002 = val; return this; }
        public Builder achField003(Integer val) { instance.achField003 = val; return this; }
        public Builder achField004(String val) { instance.achField004 = val; return this; }
        public Builder achField005(String val) { instance.achField005 = val; return this; }
        public Builder achField006(Integer val) { instance.achField006 = val; return this; }
        public Builder achField007(Long val) { instance.achField007 = val; return this; }
        public Builder achField008(Long val) { instance.achField008 = val; return this; }
        public Builder achField009(BigDecimal val) { instance.achField009 = val; return this; }
        public Builder achField010(Long val) { instance.achField010 = val; return this; }
        public AchDto039 build() { return instance; }
    }

    public Double getAchField000() { return achField000; }
    public void setAchField000(Double achField000) { this.achField000 = achField000; }

    public LocalDate getAchField001() { return achField001; }
    public void setAchField001(LocalDate achField001) { this.achField001 = achField001; }

    public Boolean getAchField002() { return achField002; }
    public void setAchField002(Boolean achField002) { this.achField002 = achField002; }

    public Integer getAchField003() { return achField003; }
    public void setAchField003(Integer achField003) { this.achField003 = achField003; }

    public String getAchField004() { return achField004; }
    public void setAchField004(String achField004) { this.achField004 = achField004; }

    public String getAchField005() { return achField005; }
    public void setAchField005(String achField005) { this.achField005 = achField005; }

    public Integer getAchField006() { return achField006; }
    public void setAchField006(Integer achField006) { this.achField006 = achField006; }

    public Long getAchField007() { return achField007; }
    public void setAchField007(Long achField007) { this.achField007 = achField007; }

    public Long getAchField008() { return achField008; }
    public void setAchField008(Long achField008) { this.achField008 = achField008; }

    public BigDecimal getAchField009() { return achField009; }
    public void setAchField009(BigDecimal achField009) { this.achField009 = achField009; }

    public Long getAchField010() { return achField010; }
    public void setAchField010(Long achField010) { this.achField010 = achField010; }

    @Override
    public String toString() {
        return "AchDto039{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
