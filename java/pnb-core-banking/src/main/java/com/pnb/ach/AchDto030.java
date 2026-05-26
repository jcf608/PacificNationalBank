package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto030 — Data Transfer Object for ach operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto030 {

    @JsonProperty("achField000")
    private Integer achField000;

    @JsonProperty("achField001")
    private Long achField001;

    @JsonProperty("achField002")
    private Boolean achField002;

    @JsonProperty("achField003")
    private Double achField003;

    @Size(max = 40)
    @JsonProperty("achField004")
    private String achField004;

    @Size(max = 40)
    @JsonProperty("achField005")
    private String achField005;

    @JsonProperty("achField006")
    private LocalDate achField006;

    @JsonProperty("achField007")
    private Boolean achField007;

    @JsonProperty("achField008")
    private Boolean achField008;

    @JsonProperty("achField009")
    private Integer achField009;

    @Size(max = 40)
    @JsonProperty("achField010")
    private String achField010;

    @Size(max = 100)
    @JsonProperty("achField011")
    private String achField011;

    @JsonProperty("achField012")
    private LocalDate achField012;

    @JsonProperty("achField013")
    private LocalDate achField013;

    public AchDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto030 instance = new AchDto030();

        public Builder achField000(Integer val) { instance.achField000 = val; return this; }
        public Builder achField001(Long val) { instance.achField001 = val; return this; }
        public Builder achField002(Boolean val) { instance.achField002 = val; return this; }
        public Builder achField003(Double val) { instance.achField003 = val; return this; }
        public Builder achField004(String val) { instance.achField004 = val; return this; }
        public Builder achField005(String val) { instance.achField005 = val; return this; }
        public Builder achField006(LocalDate val) { instance.achField006 = val; return this; }
        public Builder achField007(Boolean val) { instance.achField007 = val; return this; }
        public Builder achField008(Boolean val) { instance.achField008 = val; return this; }
        public Builder achField009(Integer val) { instance.achField009 = val; return this; }
        public Builder achField010(String val) { instance.achField010 = val; return this; }
        public Builder achField011(String val) { instance.achField011 = val; return this; }
        public Builder achField012(LocalDate val) { instance.achField012 = val; return this; }
        public Builder achField013(LocalDate val) { instance.achField013 = val; return this; }
        public AchDto030 build() { return instance; }
    }

    public Integer getAchField000() { return achField000; }
    public void setAchField000(Integer achField000) { this.achField000 = achField000; }

    public Long getAchField001() { return achField001; }
    public void setAchField001(Long achField001) { this.achField001 = achField001; }

    public Boolean getAchField002() { return achField002; }
    public void setAchField002(Boolean achField002) { this.achField002 = achField002; }

    public Double getAchField003() { return achField003; }
    public void setAchField003(Double achField003) { this.achField003 = achField003; }

    public String getAchField004() { return achField004; }
    public void setAchField004(String achField004) { this.achField004 = achField004; }

    public String getAchField005() { return achField005; }
    public void setAchField005(String achField005) { this.achField005 = achField005; }

    public LocalDate getAchField006() { return achField006; }
    public void setAchField006(LocalDate achField006) { this.achField006 = achField006; }

    public Boolean getAchField007() { return achField007; }
    public void setAchField007(Boolean achField007) { this.achField007 = achField007; }

    public Boolean getAchField008() { return achField008; }
    public void setAchField008(Boolean achField008) { this.achField008 = achField008; }

    public Integer getAchField009() { return achField009; }
    public void setAchField009(Integer achField009) { this.achField009 = achField009; }

    public String getAchField010() { return achField010; }
    public void setAchField010(String achField010) { this.achField010 = achField010; }

    public String getAchField011() { return achField011; }
    public void setAchField011(String achField011) { this.achField011 = achField011; }

    public LocalDate getAchField012() { return achField012; }
    public void setAchField012(LocalDate achField012) { this.achField012 = achField012; }

    public LocalDate getAchField013() { return achField013; }
    public void setAchField013(LocalDate achField013) { this.achField013 = achField013; }

    @Override
    public String toString() {
        return "AchDto030{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
