package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto058 — Data Transfer Object for alert operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto058 {

    @JsonProperty("alerField000")
    private Long alerField000;

    @JsonProperty("alerField001")
    private Integer alerField001;

    @JsonProperty("alerField002")
    private Long alerField002;

    @JsonProperty("alerField003")
    private Double alerField003;

    @JsonProperty("alerField004")
    private Integer alerField004;

    @JsonProperty("alerField005")
    private Integer alerField005;

    @JsonProperty("alerField006")
    private Double alerField006;

    @JsonProperty("alerField007")
    private Double alerField007;

    @JsonProperty("alerField008")
    private Boolean alerField008;

    @Size(max = 100)
    @JsonProperty("alerField009")
    private String alerField009;

    @JsonProperty("alerField010")
    private Long alerField010;

    @JsonProperty("alerField011")
    private Boolean alerField011;

    @JsonProperty("alerField012")
    private Long alerField012;

    @JsonProperty("alerField013")
    private Double alerField013;

    @JsonProperty("alerField014")
    private Double alerField014;

    @JsonProperty("alerField015")
    private Integer alerField015;

    @Size(max = 200)
    @JsonProperty("alerField016")
    private String alerField016;

    @JsonProperty("alerField017")
    private Integer alerField017;

    public AlertDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto058 instance = new AlertDto058();

        public Builder alerField000(Long val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Integer val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Long val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Double val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Integer val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Integer val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Double val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Double val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Boolean val) { instance.alerField008 = val; return this; }
        public Builder alerField009(String val) { instance.alerField009 = val; return this; }
        public Builder alerField010(Long val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Boolean val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Long val) { instance.alerField012 = val; return this; }
        public Builder alerField013(Double val) { instance.alerField013 = val; return this; }
        public Builder alerField014(Double val) { instance.alerField014 = val; return this; }
        public Builder alerField015(Integer val) { instance.alerField015 = val; return this; }
        public Builder alerField016(String val) { instance.alerField016 = val; return this; }
        public Builder alerField017(Integer val) { instance.alerField017 = val; return this; }
        public AlertDto058 build() { return instance; }
    }

    public Long getAlerField000() { return alerField000; }
    public void setAlerField000(Long alerField000) { this.alerField000 = alerField000; }

    public Integer getAlerField001() { return alerField001; }
    public void setAlerField001(Integer alerField001) { this.alerField001 = alerField001; }

    public Long getAlerField002() { return alerField002; }
    public void setAlerField002(Long alerField002) { this.alerField002 = alerField002; }

    public Double getAlerField003() { return alerField003; }
    public void setAlerField003(Double alerField003) { this.alerField003 = alerField003; }

    public Integer getAlerField004() { return alerField004; }
    public void setAlerField004(Integer alerField004) { this.alerField004 = alerField004; }

    public Integer getAlerField005() { return alerField005; }
    public void setAlerField005(Integer alerField005) { this.alerField005 = alerField005; }

    public Double getAlerField006() { return alerField006; }
    public void setAlerField006(Double alerField006) { this.alerField006 = alerField006; }

    public Double getAlerField007() { return alerField007; }
    public void setAlerField007(Double alerField007) { this.alerField007 = alerField007; }

    public Boolean getAlerField008() { return alerField008; }
    public void setAlerField008(Boolean alerField008) { this.alerField008 = alerField008; }

    public String getAlerField009() { return alerField009; }
    public void setAlerField009(String alerField009) { this.alerField009 = alerField009; }

    public Long getAlerField010() { return alerField010; }
    public void setAlerField010(Long alerField010) { this.alerField010 = alerField010; }

    public Boolean getAlerField011() { return alerField011; }
    public void setAlerField011(Boolean alerField011) { this.alerField011 = alerField011; }

    public Long getAlerField012() { return alerField012; }
    public void setAlerField012(Long alerField012) { this.alerField012 = alerField012; }

    public Double getAlerField013() { return alerField013; }
    public void setAlerField013(Double alerField013) { this.alerField013 = alerField013; }

    public Double getAlerField014() { return alerField014; }
    public void setAlerField014(Double alerField014) { this.alerField014 = alerField014; }

    public Integer getAlerField015() { return alerField015; }
    public void setAlerField015(Integer alerField015) { this.alerField015 = alerField015; }

    public String getAlerField016() { return alerField016; }
    public void setAlerField016(String alerField016) { this.alerField016 = alerField016; }

    public Integer getAlerField017() { return alerField017; }
    public void setAlerField017(Integer alerField017) { this.alerField017 = alerField017; }

    @Override
    public String toString() {
        return "AlertDto058{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
