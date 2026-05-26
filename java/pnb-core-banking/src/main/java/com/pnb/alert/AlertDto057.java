package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto057 — Data Transfer Object for alert operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto057 {

    @JsonProperty("alerField000")
    private LocalDate alerField000;

    @JsonProperty("alerField001")
    private Double alerField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField002")
    private BigDecimal alerField002;

    @JsonProperty("alerField003")
    private Integer alerField003;

    @JsonProperty("alerField004")
    private Integer alerField004;

    @JsonProperty("alerField005")
    private Double alerField005;

    @JsonProperty("alerField006")
    private Boolean alerField006;

    @JsonProperty("alerField007")
    private Boolean alerField007;

    @JsonProperty("alerField008")
    private LocalDate alerField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField009")
    private BigDecimal alerField009;

    @JsonProperty("alerField010")
    private Double alerField010;

    @JsonProperty("alerField011")
    private Boolean alerField011;

    @JsonProperty("alerField012")
    private LocalDate alerField012;

    @JsonProperty("alerField013")
    private Integer alerField013;

    @JsonProperty("alerField014")
    private Integer alerField014;

    @JsonProperty("alerField015")
    private Double alerField015;

    @JsonProperty("alerField016")
    private Double alerField016;

    public AlertDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto057 instance = new AlertDto057();

        public Builder alerField000(LocalDate val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Double val) { instance.alerField001 = val; return this; }
        public Builder alerField002(BigDecimal val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Integer val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Integer val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Double val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Boolean val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Boolean val) { instance.alerField007 = val; return this; }
        public Builder alerField008(LocalDate val) { instance.alerField008 = val; return this; }
        public Builder alerField009(BigDecimal val) { instance.alerField009 = val; return this; }
        public Builder alerField010(Double val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Boolean val) { instance.alerField011 = val; return this; }
        public Builder alerField012(LocalDate val) { instance.alerField012 = val; return this; }
        public Builder alerField013(Integer val) { instance.alerField013 = val; return this; }
        public Builder alerField014(Integer val) { instance.alerField014 = val; return this; }
        public Builder alerField015(Double val) { instance.alerField015 = val; return this; }
        public Builder alerField016(Double val) { instance.alerField016 = val; return this; }
        public AlertDto057 build() { return instance; }
    }

    public LocalDate getAlerField000() { return alerField000; }
    public void setAlerField000(LocalDate alerField000) { this.alerField000 = alerField000; }

    public Double getAlerField001() { return alerField001; }
    public void setAlerField001(Double alerField001) { this.alerField001 = alerField001; }

    public BigDecimal getAlerField002() { return alerField002; }
    public void setAlerField002(BigDecimal alerField002) { this.alerField002 = alerField002; }

    public Integer getAlerField003() { return alerField003; }
    public void setAlerField003(Integer alerField003) { this.alerField003 = alerField003; }

    public Integer getAlerField004() { return alerField004; }
    public void setAlerField004(Integer alerField004) { this.alerField004 = alerField004; }

    public Double getAlerField005() { return alerField005; }
    public void setAlerField005(Double alerField005) { this.alerField005 = alerField005; }

    public Boolean getAlerField006() { return alerField006; }
    public void setAlerField006(Boolean alerField006) { this.alerField006 = alerField006; }

    public Boolean getAlerField007() { return alerField007; }
    public void setAlerField007(Boolean alerField007) { this.alerField007 = alerField007; }

    public LocalDate getAlerField008() { return alerField008; }
    public void setAlerField008(LocalDate alerField008) { this.alerField008 = alerField008; }

    public BigDecimal getAlerField009() { return alerField009; }
    public void setAlerField009(BigDecimal alerField009) { this.alerField009 = alerField009; }

    public Double getAlerField010() { return alerField010; }
    public void setAlerField010(Double alerField010) { this.alerField010 = alerField010; }

    public Boolean getAlerField011() { return alerField011; }
    public void setAlerField011(Boolean alerField011) { this.alerField011 = alerField011; }

    public LocalDate getAlerField012() { return alerField012; }
    public void setAlerField012(LocalDate alerField012) { this.alerField012 = alerField012; }

    public Integer getAlerField013() { return alerField013; }
    public void setAlerField013(Integer alerField013) { this.alerField013 = alerField013; }

    public Integer getAlerField014() { return alerField014; }
    public void setAlerField014(Integer alerField014) { this.alerField014 = alerField014; }

    public Double getAlerField015() { return alerField015; }
    public void setAlerField015(Double alerField015) { this.alerField015 = alerField015; }

    public Double getAlerField016() { return alerField016; }
    public void setAlerField016(Double alerField016) { this.alerField016 = alerField016; }

    @Override
    public String toString() {
        return "AlertDto057{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
