package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto023 — Data Transfer Object for ach operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto023 {

    @JsonProperty("achField000")
    private Long achField000;

    @JsonProperty("achField001")
    private LocalDate achField001;

    @JsonProperty("achField002")
    private Integer achField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField003")
    private BigDecimal achField003;

    @JsonProperty("achField004")
    private Boolean achField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField005")
    private BigDecimal achField005;

    @JsonProperty("achField006")
    private LocalDate achField006;

    @Size(max = 20)
    @JsonProperty("achField007")
    private String achField007;

    @Size(max = 100)
    @JsonProperty("achField008")
    private String achField008;

    @JsonProperty("achField009")
    private Integer achField009;

    @JsonProperty("achField010")
    private Integer achField010;

    @JsonProperty("achField011")
    private Boolean achField011;

    @JsonProperty("achField012")
    private LocalDate achField012;

    @JsonProperty("achField013")
    private Long achField013;

    @JsonProperty("achField014")
    private Boolean achField014;

    @JsonProperty("achField015")
    private LocalDate achField015;

    @JsonProperty("achField016")
    private Boolean achField016;

    @JsonProperty("achField017")
    private Long achField017;

    @JsonProperty("achField018")
    private Double achField018;

    public AchDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto023 instance = new AchDto023();

        public Builder achField000(Long val) { instance.achField000 = val; return this; }
        public Builder achField001(LocalDate val) { instance.achField001 = val; return this; }
        public Builder achField002(Integer val) { instance.achField002 = val; return this; }
        public Builder achField003(BigDecimal val) { instance.achField003 = val; return this; }
        public Builder achField004(Boolean val) { instance.achField004 = val; return this; }
        public Builder achField005(BigDecimal val) { instance.achField005 = val; return this; }
        public Builder achField006(LocalDate val) { instance.achField006 = val; return this; }
        public Builder achField007(String val) { instance.achField007 = val; return this; }
        public Builder achField008(String val) { instance.achField008 = val; return this; }
        public Builder achField009(Integer val) { instance.achField009 = val; return this; }
        public Builder achField010(Integer val) { instance.achField010 = val; return this; }
        public Builder achField011(Boolean val) { instance.achField011 = val; return this; }
        public Builder achField012(LocalDate val) { instance.achField012 = val; return this; }
        public Builder achField013(Long val) { instance.achField013 = val; return this; }
        public Builder achField014(Boolean val) { instance.achField014 = val; return this; }
        public Builder achField015(LocalDate val) { instance.achField015 = val; return this; }
        public Builder achField016(Boolean val) { instance.achField016 = val; return this; }
        public Builder achField017(Long val) { instance.achField017 = val; return this; }
        public Builder achField018(Double val) { instance.achField018 = val; return this; }
        public AchDto023 build() { return instance; }
    }

    public Long getAchField000() { return achField000; }
    public void setAchField000(Long achField000) { this.achField000 = achField000; }

    public LocalDate getAchField001() { return achField001; }
    public void setAchField001(LocalDate achField001) { this.achField001 = achField001; }

    public Integer getAchField002() { return achField002; }
    public void setAchField002(Integer achField002) { this.achField002 = achField002; }

    public BigDecimal getAchField003() { return achField003; }
    public void setAchField003(BigDecimal achField003) { this.achField003 = achField003; }

    public Boolean getAchField004() { return achField004; }
    public void setAchField004(Boolean achField004) { this.achField004 = achField004; }

    public BigDecimal getAchField005() { return achField005; }
    public void setAchField005(BigDecimal achField005) { this.achField005 = achField005; }

    public LocalDate getAchField006() { return achField006; }
    public void setAchField006(LocalDate achField006) { this.achField006 = achField006; }

    public String getAchField007() { return achField007; }
    public void setAchField007(String achField007) { this.achField007 = achField007; }

    public String getAchField008() { return achField008; }
    public void setAchField008(String achField008) { this.achField008 = achField008; }

    public Integer getAchField009() { return achField009; }
    public void setAchField009(Integer achField009) { this.achField009 = achField009; }

    public Integer getAchField010() { return achField010; }
    public void setAchField010(Integer achField010) { this.achField010 = achField010; }

    public Boolean getAchField011() { return achField011; }
    public void setAchField011(Boolean achField011) { this.achField011 = achField011; }

    public LocalDate getAchField012() { return achField012; }
    public void setAchField012(LocalDate achField012) { this.achField012 = achField012; }

    public Long getAchField013() { return achField013; }
    public void setAchField013(Long achField013) { this.achField013 = achField013; }

    public Boolean getAchField014() { return achField014; }
    public void setAchField014(Boolean achField014) { this.achField014 = achField014; }

    public LocalDate getAchField015() { return achField015; }
    public void setAchField015(LocalDate achField015) { this.achField015 = achField015; }

    public Boolean getAchField016() { return achField016; }
    public void setAchField016(Boolean achField016) { this.achField016 = achField016; }

    public Long getAchField017() { return achField017; }
    public void setAchField017(Long achField017) { this.achField017 = achField017; }

    public Double getAchField018() { return achField018; }
    public void setAchField018(Double achField018) { this.achField018 = achField018; }

    @Override
    public String toString() {
        return "AchDto023{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
