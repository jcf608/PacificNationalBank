package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto020 — Data Transfer Object for alert operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto020 {

    @JsonProperty("alerField000")
    private Integer alerField000;

    @JsonProperty("alerField001")
    private Integer alerField001;

    @JsonProperty("alerField002")
    private LocalDate alerField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField003")
    private BigDecimal alerField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField004")
    private BigDecimal alerField004;

    @JsonProperty("alerField005")
    private LocalDate alerField005;

    @JsonProperty("alerField006")
    private Boolean alerField006;

    @JsonProperty("alerField007")
    private Double alerField007;

    @Size(max = 200)
    @JsonProperty("alerField008")
    private String alerField008;

    @JsonProperty("alerField009")
    private Integer alerField009;

    @JsonProperty("alerField010")
    private LocalDate alerField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField011")
    private BigDecimal alerField011;

    @JsonProperty("alerField012")
    private LocalDate alerField012;

    @Size(max = 20)
    @JsonProperty("alerField013")
    private String alerField013;

    @JsonProperty("alerField014")
    private Integer alerField014;

    @Size(max = 20)
    @JsonProperty("alerField015")
    private String alerField015;

    public AlertDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto020 instance = new AlertDto020();

        public Builder alerField000(Integer val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Integer val) { instance.alerField001 = val; return this; }
        public Builder alerField002(LocalDate val) { instance.alerField002 = val; return this; }
        public Builder alerField003(BigDecimal val) { instance.alerField003 = val; return this; }
        public Builder alerField004(BigDecimal val) { instance.alerField004 = val; return this; }
        public Builder alerField005(LocalDate val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Boolean val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Double val) { instance.alerField007 = val; return this; }
        public Builder alerField008(String val) { instance.alerField008 = val; return this; }
        public Builder alerField009(Integer val) { instance.alerField009 = val; return this; }
        public Builder alerField010(LocalDate val) { instance.alerField010 = val; return this; }
        public Builder alerField011(BigDecimal val) { instance.alerField011 = val; return this; }
        public Builder alerField012(LocalDate val) { instance.alerField012 = val; return this; }
        public Builder alerField013(String val) { instance.alerField013 = val; return this; }
        public Builder alerField014(Integer val) { instance.alerField014 = val; return this; }
        public Builder alerField015(String val) { instance.alerField015 = val; return this; }
        public AlertDto020 build() { return instance; }
    }

    public Integer getAlerField000() { return alerField000; }
    public void setAlerField000(Integer alerField000) { this.alerField000 = alerField000; }

    public Integer getAlerField001() { return alerField001; }
    public void setAlerField001(Integer alerField001) { this.alerField001 = alerField001; }

    public LocalDate getAlerField002() { return alerField002; }
    public void setAlerField002(LocalDate alerField002) { this.alerField002 = alerField002; }

    public BigDecimal getAlerField003() { return alerField003; }
    public void setAlerField003(BigDecimal alerField003) { this.alerField003 = alerField003; }

    public BigDecimal getAlerField004() { return alerField004; }
    public void setAlerField004(BigDecimal alerField004) { this.alerField004 = alerField004; }

    public LocalDate getAlerField005() { return alerField005; }
    public void setAlerField005(LocalDate alerField005) { this.alerField005 = alerField005; }

    public Boolean getAlerField006() { return alerField006; }
    public void setAlerField006(Boolean alerField006) { this.alerField006 = alerField006; }

    public Double getAlerField007() { return alerField007; }
    public void setAlerField007(Double alerField007) { this.alerField007 = alerField007; }

    public String getAlerField008() { return alerField008; }
    public void setAlerField008(String alerField008) { this.alerField008 = alerField008; }

    public Integer getAlerField009() { return alerField009; }
    public void setAlerField009(Integer alerField009) { this.alerField009 = alerField009; }

    public LocalDate getAlerField010() { return alerField010; }
    public void setAlerField010(LocalDate alerField010) { this.alerField010 = alerField010; }

    public BigDecimal getAlerField011() { return alerField011; }
    public void setAlerField011(BigDecimal alerField011) { this.alerField011 = alerField011; }

    public LocalDate getAlerField012() { return alerField012; }
    public void setAlerField012(LocalDate alerField012) { this.alerField012 = alerField012; }

    public String getAlerField013() { return alerField013; }
    public void setAlerField013(String alerField013) { this.alerField013 = alerField013; }

    public Integer getAlerField014() { return alerField014; }
    public void setAlerField014(Integer alerField014) { this.alerField014 = alerField014; }

    public String getAlerField015() { return alerField015; }
    public void setAlerField015(String alerField015) { this.alerField015 = alerField015; }

    @Override
    public String toString() {
        return "AlertDto020{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
