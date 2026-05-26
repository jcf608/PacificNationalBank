package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto028 — Data Transfer Object for ach operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto028 {

    @DecimalMin(value = "0.00")
    @JsonProperty("achField000")
    private BigDecimal achField000;

    @JsonProperty("achField001")
    private Long achField001;

    @JsonProperty("achField002")
    private Integer achField002;

    @JsonProperty("achField003")
    private Boolean achField003;

    @Size(max = 100)
    @JsonProperty("achField004")
    private String achField004;

    @Size(max = 60)
    @JsonProperty("achField005")
    private String achField005;

    @Size(max = 100)
    @JsonProperty("achField006")
    private String achField006;

    @JsonProperty("achField007")
    private Integer achField007;

    @JsonProperty("achField008")
    private Integer achField008;

    @Size(max = 100)
    @JsonProperty("achField009")
    private String achField009;

    @JsonProperty("achField010")
    private Long achField010;

    @Size(max = 40)
    @JsonProperty("achField011")
    private String achField011;

    public AchDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto028 instance = new AchDto028();

        public Builder achField000(BigDecimal val) { instance.achField000 = val; return this; }
        public Builder achField001(Long val) { instance.achField001 = val; return this; }
        public Builder achField002(Integer val) { instance.achField002 = val; return this; }
        public Builder achField003(Boolean val) { instance.achField003 = val; return this; }
        public Builder achField004(String val) { instance.achField004 = val; return this; }
        public Builder achField005(String val) { instance.achField005 = val; return this; }
        public Builder achField006(String val) { instance.achField006 = val; return this; }
        public Builder achField007(Integer val) { instance.achField007 = val; return this; }
        public Builder achField008(Integer val) { instance.achField008 = val; return this; }
        public Builder achField009(String val) { instance.achField009 = val; return this; }
        public Builder achField010(Long val) { instance.achField010 = val; return this; }
        public Builder achField011(String val) { instance.achField011 = val; return this; }
        public AchDto028 build() { return instance; }
    }

    public BigDecimal getAchField000() { return achField000; }
    public void setAchField000(BigDecimal achField000) { this.achField000 = achField000; }

    public Long getAchField001() { return achField001; }
    public void setAchField001(Long achField001) { this.achField001 = achField001; }

    public Integer getAchField002() { return achField002; }
    public void setAchField002(Integer achField002) { this.achField002 = achField002; }

    public Boolean getAchField003() { return achField003; }
    public void setAchField003(Boolean achField003) { this.achField003 = achField003; }

    public String getAchField004() { return achField004; }
    public void setAchField004(String achField004) { this.achField004 = achField004; }

    public String getAchField005() { return achField005; }
    public void setAchField005(String achField005) { this.achField005 = achField005; }

    public String getAchField006() { return achField006; }
    public void setAchField006(String achField006) { this.achField006 = achField006; }

    public Integer getAchField007() { return achField007; }
    public void setAchField007(Integer achField007) { this.achField007 = achField007; }

    public Integer getAchField008() { return achField008; }
    public void setAchField008(Integer achField008) { this.achField008 = achField008; }

    public String getAchField009() { return achField009; }
    public void setAchField009(String achField009) { this.achField009 = achField009; }

    public Long getAchField010() { return achField010; }
    public void setAchField010(Long achField010) { this.achField010 = achField010; }

    public String getAchField011() { return achField011; }
    public void setAchField011(String achField011) { this.achField011 = achField011; }

    @Override
    public String toString() {
        return "AchDto028{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
