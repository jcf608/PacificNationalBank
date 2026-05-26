package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto021 — Data Transfer Object for ach operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto021 {

    @JsonProperty("achField000")
    private Boolean achField000;

    @JsonProperty("achField001")
    private Boolean achField001;

    @JsonProperty("achField002")
    private Long achField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField003")
    private BigDecimal achField003;

    @Size(max = 200)
    @JsonProperty("achField004")
    private String achField004;

    @JsonProperty("achField005")
    private LocalDate achField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField006")
    private BigDecimal achField006;

    @JsonProperty("achField007")
    private Boolean achField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField008")
    private BigDecimal achField008;

    @JsonProperty("achField009")
    private LocalDate achField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField010")
    private BigDecimal achField010;

    @Size(max = 20)
    @JsonProperty("achField011")
    private String achField011;

    @Size(max = 60)
    @JsonProperty("achField012")
    private String achField012;

    @JsonProperty("achField013")
    private Double achField013;

    @JsonProperty("achField014")
    private Integer achField014;

    @Size(max = 60)
    @JsonProperty("achField015")
    private String achField015;

    @JsonProperty("achField016")
    private Integer achField016;

    public AchDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto021 instance = new AchDto021();

        public Builder achField000(Boolean val) { instance.achField000 = val; return this; }
        public Builder achField001(Boolean val) { instance.achField001 = val; return this; }
        public Builder achField002(Long val) { instance.achField002 = val; return this; }
        public Builder achField003(BigDecimal val) { instance.achField003 = val; return this; }
        public Builder achField004(String val) { instance.achField004 = val; return this; }
        public Builder achField005(LocalDate val) { instance.achField005 = val; return this; }
        public Builder achField006(BigDecimal val) { instance.achField006 = val; return this; }
        public Builder achField007(Boolean val) { instance.achField007 = val; return this; }
        public Builder achField008(BigDecimal val) { instance.achField008 = val; return this; }
        public Builder achField009(LocalDate val) { instance.achField009 = val; return this; }
        public Builder achField010(BigDecimal val) { instance.achField010 = val; return this; }
        public Builder achField011(String val) { instance.achField011 = val; return this; }
        public Builder achField012(String val) { instance.achField012 = val; return this; }
        public Builder achField013(Double val) { instance.achField013 = val; return this; }
        public Builder achField014(Integer val) { instance.achField014 = val; return this; }
        public Builder achField015(String val) { instance.achField015 = val; return this; }
        public Builder achField016(Integer val) { instance.achField016 = val; return this; }
        public AchDto021 build() { return instance; }
    }

    public Boolean getAchField000() { return achField000; }
    public void setAchField000(Boolean achField000) { this.achField000 = achField000; }

    public Boolean getAchField001() { return achField001; }
    public void setAchField001(Boolean achField001) { this.achField001 = achField001; }

    public Long getAchField002() { return achField002; }
    public void setAchField002(Long achField002) { this.achField002 = achField002; }

    public BigDecimal getAchField003() { return achField003; }
    public void setAchField003(BigDecimal achField003) { this.achField003 = achField003; }

    public String getAchField004() { return achField004; }
    public void setAchField004(String achField004) { this.achField004 = achField004; }

    public LocalDate getAchField005() { return achField005; }
    public void setAchField005(LocalDate achField005) { this.achField005 = achField005; }

    public BigDecimal getAchField006() { return achField006; }
    public void setAchField006(BigDecimal achField006) { this.achField006 = achField006; }

    public Boolean getAchField007() { return achField007; }
    public void setAchField007(Boolean achField007) { this.achField007 = achField007; }

    public BigDecimal getAchField008() { return achField008; }
    public void setAchField008(BigDecimal achField008) { this.achField008 = achField008; }

    public LocalDate getAchField009() { return achField009; }
    public void setAchField009(LocalDate achField009) { this.achField009 = achField009; }

    public BigDecimal getAchField010() { return achField010; }
    public void setAchField010(BigDecimal achField010) { this.achField010 = achField010; }

    public String getAchField011() { return achField011; }
    public void setAchField011(String achField011) { this.achField011 = achField011; }

    public String getAchField012() { return achField012; }
    public void setAchField012(String achField012) { this.achField012 = achField012; }

    public Double getAchField013() { return achField013; }
    public void setAchField013(Double achField013) { this.achField013 = achField013; }

    public Integer getAchField014() { return achField014; }
    public void setAchField014(Integer achField014) { this.achField014 = achField014; }

    public String getAchField015() { return achField015; }
    public void setAchField015(String achField015) { this.achField015 = achField015; }

    public Integer getAchField016() { return achField016; }
    public void setAchField016(Integer achField016) { this.achField016 = achField016; }

    @Override
    public String toString() {
        return "AchDto021{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
