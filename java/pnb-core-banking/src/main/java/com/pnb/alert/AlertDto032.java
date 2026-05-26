package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto032 — Data Transfer Object for alert operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto032 {

    @JsonProperty("alerField000")
    private Boolean alerField000;

    @JsonProperty("alerField001")
    private Boolean alerField001;

    @JsonProperty("alerField002")
    private Long alerField002;

    @Size(max = 60)
    @JsonProperty("alerField003")
    private String alerField003;

    @JsonProperty("alerField004")
    private Boolean alerField004;

    @JsonProperty("alerField005")
    private LocalDate alerField005;

    @JsonProperty("alerField006")
    private Integer alerField006;

    @JsonProperty("alerField007")
    private Double alerField007;

    @JsonProperty("alerField008")
    private LocalDate alerField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField009")
    private BigDecimal alerField009;

    @JsonProperty("alerField010")
    private Integer alerField010;

    @JsonProperty("alerField011")
    private Boolean alerField011;

    @JsonProperty("alerField012")
    private LocalDate alerField012;

    @JsonProperty("alerField013")
    private LocalDate alerField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField014")
    private BigDecimal alerField014;

    @Size(max = 200)
    @JsonProperty("alerField015")
    private String alerField015;

    public AlertDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto032 instance = new AlertDto032();

        public Builder alerField000(Boolean val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Boolean val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Long val) { instance.alerField002 = val; return this; }
        public Builder alerField003(String val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Boolean val) { instance.alerField004 = val; return this; }
        public Builder alerField005(LocalDate val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Integer val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Double val) { instance.alerField007 = val; return this; }
        public Builder alerField008(LocalDate val) { instance.alerField008 = val; return this; }
        public Builder alerField009(BigDecimal val) { instance.alerField009 = val; return this; }
        public Builder alerField010(Integer val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Boolean val) { instance.alerField011 = val; return this; }
        public Builder alerField012(LocalDate val) { instance.alerField012 = val; return this; }
        public Builder alerField013(LocalDate val) { instance.alerField013 = val; return this; }
        public Builder alerField014(BigDecimal val) { instance.alerField014 = val; return this; }
        public Builder alerField015(String val) { instance.alerField015 = val; return this; }
        public AlertDto032 build() { return instance; }
    }

    public Boolean getAlerField000() { return alerField000; }
    public void setAlerField000(Boolean alerField000) { this.alerField000 = alerField000; }

    public Boolean getAlerField001() { return alerField001; }
    public void setAlerField001(Boolean alerField001) { this.alerField001 = alerField001; }

    public Long getAlerField002() { return alerField002; }
    public void setAlerField002(Long alerField002) { this.alerField002 = alerField002; }

    public String getAlerField003() { return alerField003; }
    public void setAlerField003(String alerField003) { this.alerField003 = alerField003; }

    public Boolean getAlerField004() { return alerField004; }
    public void setAlerField004(Boolean alerField004) { this.alerField004 = alerField004; }

    public LocalDate getAlerField005() { return alerField005; }
    public void setAlerField005(LocalDate alerField005) { this.alerField005 = alerField005; }

    public Integer getAlerField006() { return alerField006; }
    public void setAlerField006(Integer alerField006) { this.alerField006 = alerField006; }

    public Double getAlerField007() { return alerField007; }
    public void setAlerField007(Double alerField007) { this.alerField007 = alerField007; }

    public LocalDate getAlerField008() { return alerField008; }
    public void setAlerField008(LocalDate alerField008) { this.alerField008 = alerField008; }

    public BigDecimal getAlerField009() { return alerField009; }
    public void setAlerField009(BigDecimal alerField009) { this.alerField009 = alerField009; }

    public Integer getAlerField010() { return alerField010; }
    public void setAlerField010(Integer alerField010) { this.alerField010 = alerField010; }

    public Boolean getAlerField011() { return alerField011; }
    public void setAlerField011(Boolean alerField011) { this.alerField011 = alerField011; }

    public LocalDate getAlerField012() { return alerField012; }
    public void setAlerField012(LocalDate alerField012) { this.alerField012 = alerField012; }

    public LocalDate getAlerField013() { return alerField013; }
    public void setAlerField013(LocalDate alerField013) { this.alerField013 = alerField013; }

    public BigDecimal getAlerField014() { return alerField014; }
    public void setAlerField014(BigDecimal alerField014) { this.alerField014 = alerField014; }

    public String getAlerField015() { return alerField015; }
    public void setAlerField015(String alerField015) { this.alerField015 = alerField015; }

    @Override
    public String toString() {
        return "AlertDto032{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
