package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto039 — Data Transfer Object for alert operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto039 {

    @JsonProperty("alerField000")
    private Double alerField000;

    @JsonProperty("alerField001")
    private Long alerField001;

    @JsonProperty("alerField002")
    private LocalDate alerField002;

    @JsonProperty("alerField003")
    private LocalDate alerField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField004")
    private BigDecimal alerField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField005")
    private BigDecimal alerField005;

    @JsonProperty("alerField006")
    private LocalDate alerField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField007")
    private BigDecimal alerField007;

    @JsonProperty("alerField008")
    private Long alerField008;

    @JsonProperty("alerField009")
    private Boolean alerField009;

    @JsonProperty("alerField010")
    private Double alerField010;

    public AlertDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto039 instance = new AlertDto039();

        public Builder alerField000(Double val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Long val) { instance.alerField001 = val; return this; }
        public Builder alerField002(LocalDate val) { instance.alerField002 = val; return this; }
        public Builder alerField003(LocalDate val) { instance.alerField003 = val; return this; }
        public Builder alerField004(BigDecimal val) { instance.alerField004 = val; return this; }
        public Builder alerField005(BigDecimal val) { instance.alerField005 = val; return this; }
        public Builder alerField006(LocalDate val) { instance.alerField006 = val; return this; }
        public Builder alerField007(BigDecimal val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Long val) { instance.alerField008 = val; return this; }
        public Builder alerField009(Boolean val) { instance.alerField009 = val; return this; }
        public Builder alerField010(Double val) { instance.alerField010 = val; return this; }
        public AlertDto039 build() { return instance; }
    }

    public Double getAlerField000() { return alerField000; }
    public void setAlerField000(Double alerField000) { this.alerField000 = alerField000; }

    public Long getAlerField001() { return alerField001; }
    public void setAlerField001(Long alerField001) { this.alerField001 = alerField001; }

    public LocalDate getAlerField002() { return alerField002; }
    public void setAlerField002(LocalDate alerField002) { this.alerField002 = alerField002; }

    public LocalDate getAlerField003() { return alerField003; }
    public void setAlerField003(LocalDate alerField003) { this.alerField003 = alerField003; }

    public BigDecimal getAlerField004() { return alerField004; }
    public void setAlerField004(BigDecimal alerField004) { this.alerField004 = alerField004; }

    public BigDecimal getAlerField005() { return alerField005; }
    public void setAlerField005(BigDecimal alerField005) { this.alerField005 = alerField005; }

    public LocalDate getAlerField006() { return alerField006; }
    public void setAlerField006(LocalDate alerField006) { this.alerField006 = alerField006; }

    public BigDecimal getAlerField007() { return alerField007; }
    public void setAlerField007(BigDecimal alerField007) { this.alerField007 = alerField007; }

    public Long getAlerField008() { return alerField008; }
    public void setAlerField008(Long alerField008) { this.alerField008 = alerField008; }

    public Boolean getAlerField009() { return alerField009; }
    public void setAlerField009(Boolean alerField009) { this.alerField009 = alerField009; }

    public Double getAlerField010() { return alerField010; }
    public void setAlerField010(Double alerField010) { this.alerField010 = alerField010; }

    @Override
    public String toString() {
        return "AlertDto039{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
