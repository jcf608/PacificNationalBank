package com.pnb.ach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AchDto040 — Data Transfer Object for ach operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchDto040 {

    @JsonProperty("achField000")
    private Boolean achField000;

    @JsonProperty("achField001")
    private Integer achField001;

    @JsonProperty("achField002")
    private LocalDate achField002;

    @JsonProperty("achField003")
    private Integer achField003;

    @JsonProperty("achField004")
    private Integer achField004;

    @JsonProperty("achField005")
    private Integer achField005;

    @JsonProperty("achField006")
    private Boolean achField006;

    @JsonProperty("achField007")
    private Integer achField007;

    @JsonProperty("achField008")
    private Long achField008;

    @JsonProperty("achField009")
    private Integer achField009;

    @JsonProperty("achField010")
    private LocalDate achField010;

    @JsonProperty("achField011")
    private LocalDate achField011;

    public AchDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AchDto040 instance = new AchDto040();

        public Builder achField000(Boolean val) { instance.achField000 = val; return this; }
        public Builder achField001(Integer val) { instance.achField001 = val; return this; }
        public Builder achField002(LocalDate val) { instance.achField002 = val; return this; }
        public Builder achField003(Integer val) { instance.achField003 = val; return this; }
        public Builder achField004(Integer val) { instance.achField004 = val; return this; }
        public Builder achField005(Integer val) { instance.achField005 = val; return this; }
        public Builder achField006(Boolean val) { instance.achField006 = val; return this; }
        public Builder achField007(Integer val) { instance.achField007 = val; return this; }
        public Builder achField008(Long val) { instance.achField008 = val; return this; }
        public Builder achField009(Integer val) { instance.achField009 = val; return this; }
        public Builder achField010(LocalDate val) { instance.achField010 = val; return this; }
        public Builder achField011(LocalDate val) { instance.achField011 = val; return this; }
        public AchDto040 build() { return instance; }
    }

    public Boolean getAchField000() { return achField000; }
    public void setAchField000(Boolean achField000) { this.achField000 = achField000; }

    public Integer getAchField001() { return achField001; }
    public void setAchField001(Integer achField001) { this.achField001 = achField001; }

    public LocalDate getAchField002() { return achField002; }
    public void setAchField002(LocalDate achField002) { this.achField002 = achField002; }

    public Integer getAchField003() { return achField003; }
    public void setAchField003(Integer achField003) { this.achField003 = achField003; }

    public Integer getAchField004() { return achField004; }
    public void setAchField004(Integer achField004) { this.achField004 = achField004; }

    public Integer getAchField005() { return achField005; }
    public void setAchField005(Integer achField005) { this.achField005 = achField005; }

    public Boolean getAchField006() { return achField006; }
    public void setAchField006(Boolean achField006) { this.achField006 = achField006; }

    public Integer getAchField007() { return achField007; }
    public void setAchField007(Integer achField007) { this.achField007 = achField007; }

    public Long getAchField008() { return achField008; }
    public void setAchField008(Long achField008) { this.achField008 = achField008; }

    public Integer getAchField009() { return achField009; }
    public void setAchField009(Integer achField009) { this.achField009 = achField009; }

    public LocalDate getAchField010() { return achField010; }
    public void setAchField010(LocalDate achField010) { this.achField010 = achField010; }

    public LocalDate getAchField011() { return achField011; }
    public void setAchField011(LocalDate achField011) { this.achField011 = achField011; }

    @Override
    public String toString() {
        return "AchDto040{" +
            "achField000=" + achField000 + ", " +
            "achField001=" + achField001 + ", " +
            "achField002=" + achField002 + ", " +
            "achField003=" + achField003 + ", " +
            "achField004=" + achField004 + ", " +
            "}";
    }
}
