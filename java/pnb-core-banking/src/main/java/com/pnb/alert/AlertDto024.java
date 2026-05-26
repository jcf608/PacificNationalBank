package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto024 — Data Transfer Object for alert operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto024 {

    @JsonProperty("alerField000")
    private Double alerField000;

    @JsonProperty("alerField001")
    private Boolean alerField001;

    @JsonProperty("alerField002")
    private LocalDate alerField002;

    @JsonProperty("alerField003")
    private LocalDate alerField003;

    @JsonProperty("alerField004")
    private Double alerField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField005")
    private BigDecimal alerField005;

    @JsonProperty("alerField006")
    private Double alerField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField007")
    private BigDecimal alerField007;

    public AlertDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto024 instance = new AlertDto024();

        public Builder alerField000(Double val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Boolean val) { instance.alerField001 = val; return this; }
        public Builder alerField002(LocalDate val) { instance.alerField002 = val; return this; }
        public Builder alerField003(LocalDate val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Double val) { instance.alerField004 = val; return this; }
        public Builder alerField005(BigDecimal val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Double val) { instance.alerField006 = val; return this; }
        public Builder alerField007(BigDecimal val) { instance.alerField007 = val; return this; }
        public AlertDto024 build() { return instance; }
    }

    public Double getAlerField000() { return alerField000; }
    public void setAlerField000(Double alerField000) { this.alerField000 = alerField000; }

    public Boolean getAlerField001() { return alerField001; }
    public void setAlerField001(Boolean alerField001) { this.alerField001 = alerField001; }

    public LocalDate getAlerField002() { return alerField002; }
    public void setAlerField002(LocalDate alerField002) { this.alerField002 = alerField002; }

    public LocalDate getAlerField003() { return alerField003; }
    public void setAlerField003(LocalDate alerField003) { this.alerField003 = alerField003; }

    public Double getAlerField004() { return alerField004; }
    public void setAlerField004(Double alerField004) { this.alerField004 = alerField004; }

    public BigDecimal getAlerField005() { return alerField005; }
    public void setAlerField005(BigDecimal alerField005) { this.alerField005 = alerField005; }

    public Double getAlerField006() { return alerField006; }
    public void setAlerField006(Double alerField006) { this.alerField006 = alerField006; }

    public BigDecimal getAlerField007() { return alerField007; }
    public void setAlerField007(BigDecimal alerField007) { this.alerField007 = alerField007; }

    @Override
    public String toString() {
        return "AlertDto024{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
