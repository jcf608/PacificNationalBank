package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto043 — Data Transfer Object for alert operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto043 {

    @JsonProperty("alerField000")
    private Boolean alerField000;

    @JsonProperty("alerField001")
    private Boolean alerField001;

    @JsonProperty("alerField002")
    private Long alerField002;

    @JsonProperty("alerField003")
    private Boolean alerField003;

    @JsonProperty("alerField004")
    private Boolean alerField004;

    @JsonProperty("alerField005")
    private LocalDate alerField005;

    @JsonProperty("alerField006")
    private Boolean alerField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField007")
    private BigDecimal alerField007;

    @JsonProperty("alerField008")
    private Boolean alerField008;

    @JsonProperty("alerField009")
    private LocalDate alerField009;

    @Size(max = 200)
    @JsonProperty("alerField010")
    private String alerField010;

    @JsonProperty("alerField011")
    private LocalDate alerField011;

    @JsonProperty("alerField012")
    private Long alerField012;

    @JsonProperty("alerField013")
    private Long alerField013;

    @JsonProperty("alerField014")
    private Boolean alerField014;

    public AlertDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto043 instance = new AlertDto043();

        public Builder alerField000(Boolean val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Boolean val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Long val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Boolean val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Boolean val) { instance.alerField004 = val; return this; }
        public Builder alerField005(LocalDate val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Boolean val) { instance.alerField006 = val; return this; }
        public Builder alerField007(BigDecimal val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Boolean val) { instance.alerField008 = val; return this; }
        public Builder alerField009(LocalDate val) { instance.alerField009 = val; return this; }
        public Builder alerField010(String val) { instance.alerField010 = val; return this; }
        public Builder alerField011(LocalDate val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Long val) { instance.alerField012 = val; return this; }
        public Builder alerField013(Long val) { instance.alerField013 = val; return this; }
        public Builder alerField014(Boolean val) { instance.alerField014 = val; return this; }
        public AlertDto043 build() { return instance; }
    }

    public Boolean getAlerField000() { return alerField000; }
    public void setAlerField000(Boolean alerField000) { this.alerField000 = alerField000; }

    public Boolean getAlerField001() { return alerField001; }
    public void setAlerField001(Boolean alerField001) { this.alerField001 = alerField001; }

    public Long getAlerField002() { return alerField002; }
    public void setAlerField002(Long alerField002) { this.alerField002 = alerField002; }

    public Boolean getAlerField003() { return alerField003; }
    public void setAlerField003(Boolean alerField003) { this.alerField003 = alerField003; }

    public Boolean getAlerField004() { return alerField004; }
    public void setAlerField004(Boolean alerField004) { this.alerField004 = alerField004; }

    public LocalDate getAlerField005() { return alerField005; }
    public void setAlerField005(LocalDate alerField005) { this.alerField005 = alerField005; }

    public Boolean getAlerField006() { return alerField006; }
    public void setAlerField006(Boolean alerField006) { this.alerField006 = alerField006; }

    public BigDecimal getAlerField007() { return alerField007; }
    public void setAlerField007(BigDecimal alerField007) { this.alerField007 = alerField007; }

    public Boolean getAlerField008() { return alerField008; }
    public void setAlerField008(Boolean alerField008) { this.alerField008 = alerField008; }

    public LocalDate getAlerField009() { return alerField009; }
    public void setAlerField009(LocalDate alerField009) { this.alerField009 = alerField009; }

    public String getAlerField010() { return alerField010; }
    public void setAlerField010(String alerField010) { this.alerField010 = alerField010; }

    public LocalDate getAlerField011() { return alerField011; }
    public void setAlerField011(LocalDate alerField011) { this.alerField011 = alerField011; }

    public Long getAlerField012() { return alerField012; }
    public void setAlerField012(Long alerField012) { this.alerField012 = alerField012; }

    public Long getAlerField013() { return alerField013; }
    public void setAlerField013(Long alerField013) { this.alerField013 = alerField013; }

    public Boolean getAlerField014() { return alerField014; }
    public void setAlerField014(Boolean alerField014) { this.alerField014 = alerField014; }

    @Override
    public String toString() {
        return "AlertDto043{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
