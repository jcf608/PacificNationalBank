package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto056 — Data Transfer Object for alert operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto056 {

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField000")
    private BigDecimal alerField000;

    @JsonProperty("alerField001")
    private Long alerField001;

    @JsonProperty("alerField002")
    private Boolean alerField002;

    @JsonProperty("alerField003")
    private Integer alerField003;

    @JsonProperty("alerField004")
    private LocalDate alerField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField005")
    private BigDecimal alerField005;

    @JsonProperty("alerField006")
    private Boolean alerField006;

    @JsonProperty("alerField007")
    private Long alerField007;

    @JsonProperty("alerField008")
    private LocalDate alerField008;

    @JsonProperty("alerField009")
    private LocalDate alerField009;

    @JsonProperty("alerField010")
    private Integer alerField010;

    @JsonProperty("alerField011")
    private Integer alerField011;

    @JsonProperty("alerField012")
    private Long alerField012;

    @JsonProperty("alerField013")
    private Double alerField013;

    @JsonProperty("alerField014")
    private Boolean alerField014;

    @JsonProperty("alerField015")
    private Integer alerField015;

    public AlertDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto056 instance = new AlertDto056();

        public Builder alerField000(BigDecimal val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Long val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Boolean val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Integer val) { instance.alerField003 = val; return this; }
        public Builder alerField004(LocalDate val) { instance.alerField004 = val; return this; }
        public Builder alerField005(BigDecimal val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Boolean val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Long val) { instance.alerField007 = val; return this; }
        public Builder alerField008(LocalDate val) { instance.alerField008 = val; return this; }
        public Builder alerField009(LocalDate val) { instance.alerField009 = val; return this; }
        public Builder alerField010(Integer val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Integer val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Long val) { instance.alerField012 = val; return this; }
        public Builder alerField013(Double val) { instance.alerField013 = val; return this; }
        public Builder alerField014(Boolean val) { instance.alerField014 = val; return this; }
        public Builder alerField015(Integer val) { instance.alerField015 = val; return this; }
        public AlertDto056 build() { return instance; }
    }

    public BigDecimal getAlerField000() { return alerField000; }
    public void setAlerField000(BigDecimal alerField000) { this.alerField000 = alerField000; }

    public Long getAlerField001() { return alerField001; }
    public void setAlerField001(Long alerField001) { this.alerField001 = alerField001; }

    public Boolean getAlerField002() { return alerField002; }
    public void setAlerField002(Boolean alerField002) { this.alerField002 = alerField002; }

    public Integer getAlerField003() { return alerField003; }
    public void setAlerField003(Integer alerField003) { this.alerField003 = alerField003; }

    public LocalDate getAlerField004() { return alerField004; }
    public void setAlerField004(LocalDate alerField004) { this.alerField004 = alerField004; }

    public BigDecimal getAlerField005() { return alerField005; }
    public void setAlerField005(BigDecimal alerField005) { this.alerField005 = alerField005; }

    public Boolean getAlerField006() { return alerField006; }
    public void setAlerField006(Boolean alerField006) { this.alerField006 = alerField006; }

    public Long getAlerField007() { return alerField007; }
    public void setAlerField007(Long alerField007) { this.alerField007 = alerField007; }

    public LocalDate getAlerField008() { return alerField008; }
    public void setAlerField008(LocalDate alerField008) { this.alerField008 = alerField008; }

    public LocalDate getAlerField009() { return alerField009; }
    public void setAlerField009(LocalDate alerField009) { this.alerField009 = alerField009; }

    public Integer getAlerField010() { return alerField010; }
    public void setAlerField010(Integer alerField010) { this.alerField010 = alerField010; }

    public Integer getAlerField011() { return alerField011; }
    public void setAlerField011(Integer alerField011) { this.alerField011 = alerField011; }

    public Long getAlerField012() { return alerField012; }
    public void setAlerField012(Long alerField012) { this.alerField012 = alerField012; }

    public Double getAlerField013() { return alerField013; }
    public void setAlerField013(Double alerField013) { this.alerField013 = alerField013; }

    public Boolean getAlerField014() { return alerField014; }
    public void setAlerField014(Boolean alerField014) { this.alerField014 = alerField014; }

    public Integer getAlerField015() { return alerField015; }
    public void setAlerField015(Integer alerField015) { this.alerField015 = alerField015; }

    @Override
    public String toString() {
        return "AlertDto056{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
