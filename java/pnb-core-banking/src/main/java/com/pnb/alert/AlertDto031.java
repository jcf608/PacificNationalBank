package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto031 — Data Transfer Object for alert operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto031 {

    @JsonProperty("alerField000")
    private Integer alerField000;

    @Size(max = 100)
    @JsonProperty("alerField001")
    private String alerField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField002")
    private BigDecimal alerField002;

    @JsonProperty("alerField003")
    private Integer alerField003;

    @JsonProperty("alerField004")
    private Double alerField004;

    @JsonProperty("alerField005")
    private Boolean alerField005;

    @Size(max = 200)
    @JsonProperty("alerField006")
    private String alerField006;

    @Size(max = 20)
    @JsonProperty("alerField007")
    private String alerField007;

    @JsonProperty("alerField008")
    private Boolean alerField008;

    @JsonProperty("alerField009")
    private Integer alerField009;

    @JsonProperty("alerField010")
    private Double alerField010;

    @JsonProperty("alerField011")
    private Double alerField011;

    @JsonProperty("alerField012")
    private Integer alerField012;

    @JsonProperty("alerField013")
    private Double alerField013;

    @JsonProperty("alerField014")
    private LocalDate alerField014;

    public AlertDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto031 instance = new AlertDto031();

        public Builder alerField000(Integer val) { instance.alerField000 = val; return this; }
        public Builder alerField001(String val) { instance.alerField001 = val; return this; }
        public Builder alerField002(BigDecimal val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Integer val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Double val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Boolean val) { instance.alerField005 = val; return this; }
        public Builder alerField006(String val) { instance.alerField006 = val; return this; }
        public Builder alerField007(String val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Boolean val) { instance.alerField008 = val; return this; }
        public Builder alerField009(Integer val) { instance.alerField009 = val; return this; }
        public Builder alerField010(Double val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Double val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Integer val) { instance.alerField012 = val; return this; }
        public Builder alerField013(Double val) { instance.alerField013 = val; return this; }
        public Builder alerField014(LocalDate val) { instance.alerField014 = val; return this; }
        public AlertDto031 build() { return instance; }
    }

    public Integer getAlerField000() { return alerField000; }
    public void setAlerField000(Integer alerField000) { this.alerField000 = alerField000; }

    public String getAlerField001() { return alerField001; }
    public void setAlerField001(String alerField001) { this.alerField001 = alerField001; }

    public BigDecimal getAlerField002() { return alerField002; }
    public void setAlerField002(BigDecimal alerField002) { this.alerField002 = alerField002; }

    public Integer getAlerField003() { return alerField003; }
    public void setAlerField003(Integer alerField003) { this.alerField003 = alerField003; }

    public Double getAlerField004() { return alerField004; }
    public void setAlerField004(Double alerField004) { this.alerField004 = alerField004; }

    public Boolean getAlerField005() { return alerField005; }
    public void setAlerField005(Boolean alerField005) { this.alerField005 = alerField005; }

    public String getAlerField006() { return alerField006; }
    public void setAlerField006(String alerField006) { this.alerField006 = alerField006; }

    public String getAlerField007() { return alerField007; }
    public void setAlerField007(String alerField007) { this.alerField007 = alerField007; }

    public Boolean getAlerField008() { return alerField008; }
    public void setAlerField008(Boolean alerField008) { this.alerField008 = alerField008; }

    public Integer getAlerField009() { return alerField009; }
    public void setAlerField009(Integer alerField009) { this.alerField009 = alerField009; }

    public Double getAlerField010() { return alerField010; }
    public void setAlerField010(Double alerField010) { this.alerField010 = alerField010; }

    public Double getAlerField011() { return alerField011; }
    public void setAlerField011(Double alerField011) { this.alerField011 = alerField011; }

    public Integer getAlerField012() { return alerField012; }
    public void setAlerField012(Integer alerField012) { this.alerField012 = alerField012; }

    public Double getAlerField013() { return alerField013; }
    public void setAlerField013(Double alerField013) { this.alerField013 = alerField013; }

    public LocalDate getAlerField014() { return alerField014; }
    public void setAlerField014(LocalDate alerField014) { this.alerField014 = alerField014; }

    @Override
    public String toString() {
        return "AlertDto031{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
