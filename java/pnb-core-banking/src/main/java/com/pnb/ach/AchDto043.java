package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto043 — Data Transfer Object for ach operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto043 {

    @DecimalMin(value = "0.00")
    @JsonProperty("achField000")
    private BigDecimal achField000;

    @JsonProperty("achField001")
    private Double achField001;

    @JsonProperty("achField002")
    private Long achField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField003")
    private BigDecimal achField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField004")
    private BigDecimal achField004;

    @JsonProperty("achField005")
    private Boolean achField005;

    @JsonProperty("achField006")
    private LocalDate achField006;

    @Size(max = 60)
    @JsonProperty("achField007")
    private String achField007;

    @JsonProperty("achField008")
    private Long achField008;

    @JsonProperty("achField009")
    private LocalDate achField009;

    @JsonProperty("achField010")
    private LocalDate achField010;

    @JsonProperty("achField011")
    private LocalDate achField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField012")
    private BigDecimal achField012;

    @JsonProperty("achField013")
    private Long achField013;

    @Size(max = 20)
    @JsonProperty("achField014")
    private String achField014;

    public AchDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto043 instance = new AchDto043();

        public Builder achField000(BigDecimal val) { instance.achField000 = val; return this; }
        public Builder achField001(Double val) { instance.achField001 = val; return this; }
        public Builder achField002(Long val) { instance.achField002 = val; return this; }
        public Builder achField003(BigDecimal val) { instance.achField003 = val; return this; }
        public Builder achField004(BigDecimal val) { instance.achField004 = val; return this; }
        public Builder achField005(Boolean val) { instance.achField005 = val; return this; }
        public Builder achField006(LocalDate val) { instance.achField006 = val; return this; }
        public Builder achField007(String val) { instance.achField007 = val; return this; }
        public Builder achField008(Long val) { instance.achField008 = val; return this; }
        public Builder achField009(LocalDate val) { instance.achField009 = val; return this; }
        public Builder achField010(LocalDate val) { instance.achField010 = val; return this; }
        public Builder achField011(LocalDate val) { instance.achField011 = val; return this; }
        public Builder achField012(BigDecimal val) { instance.achField012 = val; return this; }
        public Builder achField013(Long val) { instance.achField013 = val; return this; }
        public Builder achField014(String val) { instance.achField014 = val; return this; }
        public AchDto043 build() { return instance; }
    }

    public BigDecimal getAchField000() { return achField000; }
    public void setAchField000(BigDecimal achField000) { this.achField000 = achField000; }

    public Double getAchField001() { return achField001; }
    public void setAchField001(Double achField001) { this.achField001 = achField001; }

    public Long getAchField002() { return achField002; }
    public void setAchField002(Long achField002) { this.achField002 = achField002; }

    public BigDecimal getAchField003() { return achField003; }
    public void setAchField003(BigDecimal achField003) { this.achField003 = achField003; }

    public BigDecimal getAchField004() { return achField004; }
    public void setAchField004(BigDecimal achField004) { this.achField004 = achField004; }

    public Boolean getAchField005() { return achField005; }
    public void setAchField005(Boolean achField005) { this.achField005 = achField005; }

    public LocalDate getAchField006() { return achField006; }
    public void setAchField006(LocalDate achField006) { this.achField006 = achField006; }

    public String getAchField007() { return achField007; }
    public void setAchField007(String achField007) { this.achField007 = achField007; }

    public Long getAchField008() { return achField008; }
    public void setAchField008(Long achField008) { this.achField008 = achField008; }

    public LocalDate getAchField009() { return achField009; }
    public void setAchField009(LocalDate achField009) { this.achField009 = achField009; }

    public LocalDate getAchField010() { return achField010; }
    public void setAchField010(LocalDate achField010) { this.achField010 = achField010; }

    public LocalDate getAchField011() { return achField011; }
    public void setAchField011(LocalDate achField011) { this.achField011 = achField011; }

    public BigDecimal getAchField012() { return achField012; }
    public void setAchField012(BigDecimal achField012) { this.achField012 = achField012; }

    public Long getAchField013() { return achField013; }
    public void setAchField013(Long achField013) { this.achField013 = achField013; }

    public String getAchField014() { return achField014; }
    public void setAchField014(String achField014) { this.achField014 = achField014; }

    @Override
    public String toString() {
        return "AchDto043{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
