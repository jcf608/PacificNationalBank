package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto055 — Data Transfer Object for alert operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto055 {

    @JsonProperty("alerField000")
    private Double alerField000;

    @JsonProperty("alerField001")
    private Integer alerField001;

    @JsonProperty("alerField002")
    private Long alerField002;

    @JsonProperty("alerField003")
    private Boolean alerField003;

    @JsonProperty("alerField004")
    private Boolean alerField004;

    @JsonProperty("alerField005")
    private LocalDate alerField005;

    @JsonProperty("alerField006")
    private Integer alerField006;

    @JsonProperty("alerField007")
    private Integer alerField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField008")
    private BigDecimal alerField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField009")
    private BigDecimal alerField009;

    @JsonProperty("alerField010")
    private LocalDate alerField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField011")
    private BigDecimal alerField011;

    @JsonProperty("alerField012")
    private LocalDate alerField012;

    @Size(max = 200)
    @JsonProperty("alerField013")
    private String alerField013;

    @JsonProperty("alerField014")
    private Double alerField014;

    public AlertDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto055 instance = new AlertDto055();

        public Builder alerField000(Double val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Integer val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Long val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Boolean val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Boolean val) { instance.alerField004 = val; return this; }
        public Builder alerField005(LocalDate val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Integer val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Integer val) { instance.alerField007 = val; return this; }
        public Builder alerField008(BigDecimal val) { instance.alerField008 = val; return this; }
        public Builder alerField009(BigDecimal val) { instance.alerField009 = val; return this; }
        public Builder alerField010(LocalDate val) { instance.alerField010 = val; return this; }
        public Builder alerField011(BigDecimal val) { instance.alerField011 = val; return this; }
        public Builder alerField012(LocalDate val) { instance.alerField012 = val; return this; }
        public Builder alerField013(String val) { instance.alerField013 = val; return this; }
        public Builder alerField014(Double val) { instance.alerField014 = val; return this; }
        public AlertDto055 build() { return instance; }
    }

    public Double getAlerField000() { return alerField000; }
    public void setAlerField000(Double alerField000) { this.alerField000 = alerField000; }

    public Integer getAlerField001() { return alerField001; }
    public void setAlerField001(Integer alerField001) { this.alerField001 = alerField001; }

    public Long getAlerField002() { return alerField002; }
    public void setAlerField002(Long alerField002) { this.alerField002 = alerField002; }

    public Boolean getAlerField003() { return alerField003; }
    public void setAlerField003(Boolean alerField003) { this.alerField003 = alerField003; }

    public Boolean getAlerField004() { return alerField004; }
    public void setAlerField004(Boolean alerField004) { this.alerField004 = alerField004; }

    public LocalDate getAlerField005() { return alerField005; }
    public void setAlerField005(LocalDate alerField005) { this.alerField005 = alerField005; }

    public Integer getAlerField006() { return alerField006; }
    public void setAlerField006(Integer alerField006) { this.alerField006 = alerField006; }

    public Integer getAlerField007() { return alerField007; }
    public void setAlerField007(Integer alerField007) { this.alerField007 = alerField007; }

    public BigDecimal getAlerField008() { return alerField008; }
    public void setAlerField008(BigDecimal alerField008) { this.alerField008 = alerField008; }

    public BigDecimal getAlerField009() { return alerField009; }
    public void setAlerField009(BigDecimal alerField009) { this.alerField009 = alerField009; }

    public LocalDate getAlerField010() { return alerField010; }
    public void setAlerField010(LocalDate alerField010) { this.alerField010 = alerField010; }

    public BigDecimal getAlerField011() { return alerField011; }
    public void setAlerField011(BigDecimal alerField011) { this.alerField011 = alerField011; }

    public LocalDate getAlerField012() { return alerField012; }
    public void setAlerField012(LocalDate alerField012) { this.alerField012 = alerField012; }

    public String getAlerField013() { return alerField013; }
    public void setAlerField013(String alerField013) { this.alerField013 = alerField013; }

    public Double getAlerField014() { return alerField014; }
    public void setAlerField014(Double alerField014) { this.alerField014 = alerField014; }

    @Override
    public String toString() {
        return "AlertDto055{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
