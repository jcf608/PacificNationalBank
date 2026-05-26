package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto049 — Data Transfer Object for alert operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto049 {

    @JsonProperty("alerField000")
    private Boolean alerField000;

    @Size(max = 100)
    @JsonProperty("alerField001")
    private String alerField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField002")
    private BigDecimal alerField002;

    @JsonProperty("alerField003")
    private Integer alerField003;

    @JsonProperty("alerField004")
    private Integer alerField004;

    @JsonProperty("alerField005")
    private Double alerField005;

    @Size(max = 100)
    @JsonProperty("alerField006")
    private String alerField006;

    @JsonProperty("alerField007")
    private Double alerField007;

    @JsonProperty("alerField008")
    private Long alerField008;

    public AlertDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto049 instance = new AlertDto049();

        public Builder alerField000(Boolean val) { instance.alerField000 = val; return this; }
        public Builder alerField001(String val) { instance.alerField001 = val; return this; }
        public Builder alerField002(BigDecimal val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Integer val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Integer val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Double val) { instance.alerField005 = val; return this; }
        public Builder alerField006(String val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Double val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Long val) { instance.alerField008 = val; return this; }
        public AlertDto049 build() { return instance; }
    }

    public Boolean getAlerField000() { return alerField000; }
    public void setAlerField000(Boolean alerField000) { this.alerField000 = alerField000; }

    public String getAlerField001() { return alerField001; }
    public void setAlerField001(String alerField001) { this.alerField001 = alerField001; }

    public BigDecimal getAlerField002() { return alerField002; }
    public void setAlerField002(BigDecimal alerField002) { this.alerField002 = alerField002; }

    public Integer getAlerField003() { return alerField003; }
    public void setAlerField003(Integer alerField003) { this.alerField003 = alerField003; }

    public Integer getAlerField004() { return alerField004; }
    public void setAlerField004(Integer alerField004) { this.alerField004 = alerField004; }

    public Double getAlerField005() { return alerField005; }
    public void setAlerField005(Double alerField005) { this.alerField005 = alerField005; }

    public String getAlerField006() { return alerField006; }
    public void setAlerField006(String alerField006) { this.alerField006 = alerField006; }

    public Double getAlerField007() { return alerField007; }
    public void setAlerField007(Double alerField007) { this.alerField007 = alerField007; }

    public Long getAlerField008() { return alerField008; }
    public void setAlerField008(Long alerField008) { this.alerField008 = alerField008; }

    @Override
    public String toString() {
        return "AlertDto049{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
