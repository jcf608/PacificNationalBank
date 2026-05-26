package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto048 — Data Transfer Object for alert operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto048 {

    @Size(max = 200)
    @JsonProperty("alerField000")
    private String alerField000;

    @JsonProperty("alerField001")
    private Double alerField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField002")
    private BigDecimal alerField002;

    @Size(max = 100)
    @JsonProperty("alerField003")
    private String alerField003;

    @JsonProperty("alerField004")
    private Integer alerField004;

    @JsonProperty("alerField005")
    private Boolean alerField005;

    @JsonProperty("alerField006")
    private Integer alerField006;

    @JsonProperty("alerField007")
    private Long alerField007;

    public AlertDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto048 instance = new AlertDto048();

        public Builder alerField000(String val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Double val) { instance.alerField001 = val; return this; }
        public Builder alerField002(BigDecimal val) { instance.alerField002 = val; return this; }
        public Builder alerField003(String val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Integer val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Boolean val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Integer val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Long val) { instance.alerField007 = val; return this; }
        public AlertDto048 build() { return instance; }
    }

    public String getAlerField000() { return alerField000; }
    public void setAlerField000(String alerField000) { this.alerField000 = alerField000; }

    public Double getAlerField001() { return alerField001; }
    public void setAlerField001(Double alerField001) { this.alerField001 = alerField001; }

    public BigDecimal getAlerField002() { return alerField002; }
    public void setAlerField002(BigDecimal alerField002) { this.alerField002 = alerField002; }

    public String getAlerField003() { return alerField003; }
    public void setAlerField003(String alerField003) { this.alerField003 = alerField003; }

    public Integer getAlerField004() { return alerField004; }
    public void setAlerField004(Integer alerField004) { this.alerField004 = alerField004; }

    public Boolean getAlerField005() { return alerField005; }
    public void setAlerField005(Boolean alerField005) { this.alerField005 = alerField005; }

    public Integer getAlerField006() { return alerField006; }
    public void setAlerField006(Integer alerField006) { this.alerField006 = alerField006; }

    public Long getAlerField007() { return alerField007; }
    public void setAlerField007(Long alerField007) { this.alerField007 = alerField007; }

    @Override
    public String toString() {
        return "AlertDto048{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
