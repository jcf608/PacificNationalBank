package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto022 — Data Transfer Object for ach operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto022 {

    @JsonProperty("achField000")
    private LocalDate achField000;

    @Size(max = 60)
    @JsonProperty("achField001")
    private String achField001;

    @JsonProperty("achField002")
    private Long achField002;

    @JsonProperty("achField003")
    private Double achField003;

    @JsonProperty("achField004")
    private Long achField004;

    @JsonProperty("achField005")
    private Boolean achField005;

    @JsonProperty("achField006")
    private Boolean achField006;

    @JsonProperty("achField007")
    private Double achField007;

    @JsonProperty("achField008")
    private Boolean achField008;

    @JsonProperty("achField009")
    private Long achField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField010")
    private BigDecimal achField010;

    @JsonProperty("achField011")
    private LocalDate achField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField012")
    private BigDecimal achField012;

    @JsonProperty("achField013")
    private Double achField013;

    @JsonProperty("achField014")
    private LocalDate achField014;

    @JsonProperty("achField015")
    private Long achField015;

    @Size(max = 100)
    @JsonProperty("achField016")
    private String achField016;

    @JsonProperty("achField017")
    private Double achField017;

    public AchDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto022 instance = new AchDto022();

        public Builder achField000(LocalDate val) { instance.achField000 = val; return this; }
        public Builder achField001(String val) { instance.achField001 = val; return this; }
        public Builder achField002(Long val) { instance.achField002 = val; return this; }
        public Builder achField003(Double val) { instance.achField003 = val; return this; }
        public Builder achField004(Long val) { instance.achField004 = val; return this; }
        public Builder achField005(Boolean val) { instance.achField005 = val; return this; }
        public Builder achField006(Boolean val) { instance.achField006 = val; return this; }
        public Builder achField007(Double val) { instance.achField007 = val; return this; }
        public Builder achField008(Boolean val) { instance.achField008 = val; return this; }
        public Builder achField009(Long val) { instance.achField009 = val; return this; }
        public Builder achField010(BigDecimal val) { instance.achField010 = val; return this; }
        public Builder achField011(LocalDate val) { instance.achField011 = val; return this; }
        public Builder achField012(BigDecimal val) { instance.achField012 = val; return this; }
        public Builder achField013(Double val) { instance.achField013 = val; return this; }
        public Builder achField014(LocalDate val) { instance.achField014 = val; return this; }
        public Builder achField015(Long val) { instance.achField015 = val; return this; }
        public Builder achField016(String val) { instance.achField016 = val; return this; }
        public Builder achField017(Double val) { instance.achField017 = val; return this; }
        public AchDto022 build() { return instance; }
    }

    public LocalDate getAchField000() { return achField000; }
    public void setAchField000(LocalDate achField000) { this.achField000 = achField000; }

    public String getAchField001() { return achField001; }
    public void setAchField001(String achField001) { this.achField001 = achField001; }

    public Long getAchField002() { return achField002; }
    public void setAchField002(Long achField002) { this.achField002 = achField002; }

    public Double getAchField003() { return achField003; }
    public void setAchField003(Double achField003) { this.achField003 = achField003; }

    public Long getAchField004() { return achField004; }
    public void setAchField004(Long achField004) { this.achField004 = achField004; }

    public Boolean getAchField005() { return achField005; }
    public void setAchField005(Boolean achField005) { this.achField005 = achField005; }

    public Boolean getAchField006() { return achField006; }
    public void setAchField006(Boolean achField006) { this.achField006 = achField006; }

    public Double getAchField007() { return achField007; }
    public void setAchField007(Double achField007) { this.achField007 = achField007; }

    public Boolean getAchField008() { return achField008; }
    public void setAchField008(Boolean achField008) { this.achField008 = achField008; }

    public Long getAchField009() { return achField009; }
    public void setAchField009(Long achField009) { this.achField009 = achField009; }

    public BigDecimal getAchField010() { return achField010; }
    public void setAchField010(BigDecimal achField010) { this.achField010 = achField010; }

    public LocalDate getAchField011() { return achField011; }
    public void setAchField011(LocalDate achField011) { this.achField011 = achField011; }

    public BigDecimal getAchField012() { return achField012; }
    public void setAchField012(BigDecimal achField012) { this.achField012 = achField012; }

    public Double getAchField013() { return achField013; }
    public void setAchField013(Double achField013) { this.achField013 = achField013; }

    public LocalDate getAchField014() { return achField014; }
    public void setAchField014(LocalDate achField014) { this.achField014 = achField014; }

    public Long getAchField015() { return achField015; }
    public void setAchField015(Long achField015) { this.achField015 = achField015; }

    public String getAchField016() { return achField016; }
    public void setAchField016(String achField016) { this.achField016 = achField016; }

    public Double getAchField017() { return achField017; }
    public void setAchField017(Double achField017) { this.achField017 = achField017; }

    @Override
    public String toString() {
        return "AchDto022{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
