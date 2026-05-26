package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto034 — Data Transfer Object for alert operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto034 {

    @JsonProperty("alerField000")
    private Integer alerField000;

    @JsonProperty("alerField001")
    private Boolean alerField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField002")
    private BigDecimal alerField002;

    @JsonProperty("alerField003")
    private Double alerField003;

    @JsonProperty("alerField004")
    private Long alerField004;

    @JsonProperty("alerField005")
    private Integer alerField005;

    @JsonProperty("alerField006")
    private LocalDate alerField006;

    @JsonProperty("alerField007")
    private Boolean alerField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField008")
    private BigDecimal alerField008;

    @JsonProperty("alerField009")
    private LocalDate alerField009;

    @JsonProperty("alerField010")
    private LocalDate alerField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField011")
    private BigDecimal alerField011;

    @JsonProperty("alerField012")
    private LocalDate alerField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField013")
    private BigDecimal alerField013;

    @Size(max = 40)
    @JsonProperty("alerField014")
    private String alerField014;

    @JsonProperty("alerField015")
    private Boolean alerField015;

    @JsonProperty("alerField016")
    private LocalDate alerField016;

    @JsonProperty("alerField017")
    private LocalDate alerField017;

    public AlertDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto034 instance = new AlertDto034();

        public Builder alerField000(Integer val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Boolean val) { instance.alerField001 = val; return this; }
        public Builder alerField002(BigDecimal val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Double val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Long val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Integer val) { instance.alerField005 = val; return this; }
        public Builder alerField006(LocalDate val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Boolean val) { instance.alerField007 = val; return this; }
        public Builder alerField008(BigDecimal val) { instance.alerField008 = val; return this; }
        public Builder alerField009(LocalDate val) { instance.alerField009 = val; return this; }
        public Builder alerField010(LocalDate val) { instance.alerField010 = val; return this; }
        public Builder alerField011(BigDecimal val) { instance.alerField011 = val; return this; }
        public Builder alerField012(LocalDate val) { instance.alerField012 = val; return this; }
        public Builder alerField013(BigDecimal val) { instance.alerField013 = val; return this; }
        public Builder alerField014(String val) { instance.alerField014 = val; return this; }
        public Builder alerField015(Boolean val) { instance.alerField015 = val; return this; }
        public Builder alerField016(LocalDate val) { instance.alerField016 = val; return this; }
        public Builder alerField017(LocalDate val) { instance.alerField017 = val; return this; }
        public AlertDto034 build() { return instance; }
    }

    public Integer getAlerField000() { return alerField000; }
    public void setAlerField000(Integer alerField000) { this.alerField000 = alerField000; }

    public Boolean getAlerField001() { return alerField001; }
    public void setAlerField001(Boolean alerField001) { this.alerField001 = alerField001; }

    public BigDecimal getAlerField002() { return alerField002; }
    public void setAlerField002(BigDecimal alerField002) { this.alerField002 = alerField002; }

    public Double getAlerField003() { return alerField003; }
    public void setAlerField003(Double alerField003) { this.alerField003 = alerField003; }

    public Long getAlerField004() { return alerField004; }
    public void setAlerField004(Long alerField004) { this.alerField004 = alerField004; }

    public Integer getAlerField005() { return alerField005; }
    public void setAlerField005(Integer alerField005) { this.alerField005 = alerField005; }

    public LocalDate getAlerField006() { return alerField006; }
    public void setAlerField006(LocalDate alerField006) { this.alerField006 = alerField006; }

    public Boolean getAlerField007() { return alerField007; }
    public void setAlerField007(Boolean alerField007) { this.alerField007 = alerField007; }

    public BigDecimal getAlerField008() { return alerField008; }
    public void setAlerField008(BigDecimal alerField008) { this.alerField008 = alerField008; }

    public LocalDate getAlerField009() { return alerField009; }
    public void setAlerField009(LocalDate alerField009) { this.alerField009 = alerField009; }

    public LocalDate getAlerField010() { return alerField010; }
    public void setAlerField010(LocalDate alerField010) { this.alerField010 = alerField010; }

    public BigDecimal getAlerField011() { return alerField011; }
    public void setAlerField011(BigDecimal alerField011) { this.alerField011 = alerField011; }

    public LocalDate getAlerField012() { return alerField012; }
    public void setAlerField012(LocalDate alerField012) { this.alerField012 = alerField012; }

    public BigDecimal getAlerField013() { return alerField013; }
    public void setAlerField013(BigDecimal alerField013) { this.alerField013 = alerField013; }

    public String getAlerField014() { return alerField014; }
    public void setAlerField014(String alerField014) { this.alerField014 = alerField014; }

    public Boolean getAlerField015() { return alerField015; }
    public void setAlerField015(Boolean alerField015) { this.alerField015 = alerField015; }

    public LocalDate getAlerField016() { return alerField016; }
    public void setAlerField016(LocalDate alerField016) { this.alerField016 = alerField016; }

    public LocalDate getAlerField017() { return alerField017; }
    public void setAlerField017(LocalDate alerField017) { this.alerField017 = alerField017; }

    @Override
    public String toString() {
        return "AlertDto034{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
