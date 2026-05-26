package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto029 — Data Transfer Object for ach operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto029 {

    @JsonProperty("achField000")
    private Integer achField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("achField001")
    private BigDecimal achField001;

    @JsonProperty("achField002")
    private LocalDate achField002;

    @JsonProperty("achField003")
    private Integer achField003;

    @Size(max = 60)
    @JsonProperty("achField004")
    private String achField004;

    @JsonProperty("achField005")
    private Boolean achField005;

    @Size(max = 40)
    @JsonProperty("achField006")
    private String achField006;

    @JsonProperty("achField007")
    private Boolean achField007;

    @JsonProperty("achField008")
    private Long achField008;

    @JsonProperty("achField009")
    private Long achField009;

    @JsonProperty("achField010")
    private LocalDate achField010;

    @JsonProperty("achField011")
    private Boolean achField011;

    @Size(max = 40)
    @JsonProperty("achField012")
    private String achField012;

    public AchDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto029 instance = new AchDto029();

        public Builder achField000(Integer val) { instance.achField000 = val; return this; }
        public Builder achField001(BigDecimal val) { instance.achField001 = val; return this; }
        public Builder achField002(LocalDate val) { instance.achField002 = val; return this; }
        public Builder achField003(Integer val) { instance.achField003 = val; return this; }
        public Builder achField004(String val) { instance.achField004 = val; return this; }
        public Builder achField005(Boolean val) { instance.achField005 = val; return this; }
        public Builder achField006(String val) { instance.achField006 = val; return this; }
        public Builder achField007(Boolean val) { instance.achField007 = val; return this; }
        public Builder achField008(Long val) { instance.achField008 = val; return this; }
        public Builder achField009(Long val) { instance.achField009 = val; return this; }
        public Builder achField010(LocalDate val) { instance.achField010 = val; return this; }
        public Builder achField011(Boolean val) { instance.achField011 = val; return this; }
        public Builder achField012(String val) { instance.achField012 = val; return this; }
        public AchDto029 build() { return instance; }
    }

    public Integer getAchField000() { return achField000; }
    public void setAchField000(Integer achField000) { this.achField000 = achField000; }

    public BigDecimal getAchField001() { return achField001; }
    public void setAchField001(BigDecimal achField001) { this.achField001 = achField001; }

    public LocalDate getAchField002() { return achField002; }
    public void setAchField002(LocalDate achField002) { this.achField002 = achField002; }

    public Integer getAchField003() { return achField003; }
    public void setAchField003(Integer achField003) { this.achField003 = achField003; }

    public String getAchField004() { return achField004; }
    public void setAchField004(String achField004) { this.achField004 = achField004; }

    public Boolean getAchField005() { return achField005; }
    public void setAchField005(Boolean achField005) { this.achField005 = achField005; }

    public String getAchField006() { return achField006; }
    public void setAchField006(String achField006) { this.achField006 = achField006; }

    public Boolean getAchField007() { return achField007; }
    public void setAchField007(Boolean achField007) { this.achField007 = achField007; }

    public Long getAchField008() { return achField008; }
    public void setAchField008(Long achField008) { this.achField008 = achField008; }

    public Long getAchField009() { return achField009; }
    public void setAchField009(Long achField009) { this.achField009 = achField009; }

    public LocalDate getAchField010() { return achField010; }
    public void setAchField010(LocalDate achField010) { this.achField010 = achField010; }

    public Boolean getAchField011() { return achField011; }
    public void setAchField011(Boolean achField011) { this.achField011 = achField011; }

    public String getAchField012() { return achField012; }
    public void setAchField012(String achField012) { this.achField012 = achField012; }

    @Override
    public String toString() {
        return "AchDto029{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
