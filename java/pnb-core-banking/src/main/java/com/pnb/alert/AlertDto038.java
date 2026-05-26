package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto038 — Data Transfer Object for alert operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto038 {

    @JsonProperty("alerField000")
    private Boolean alerField000;

    @JsonProperty("alerField001")
    private Integer alerField001;

    @JsonProperty("alerField002")
    private Long alerField002;

    @JsonProperty("alerField003")
    private Double alerField003;

    @JsonProperty("alerField004")
    private Integer alerField004;

    @JsonProperty("alerField005")
    private Long alerField005;

    @JsonProperty("alerField006")
    private Boolean alerField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField007")
    private BigDecimal alerField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField008")
    private BigDecimal alerField008;

    @Size(max = 60)
    @JsonProperty("alerField009")
    private String alerField009;

    public AlertDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto038 instance = new AlertDto038();

        public Builder alerField000(Boolean val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Integer val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Long val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Double val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Integer val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Long val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Boolean val) { instance.alerField006 = val; return this; }
        public Builder alerField007(BigDecimal val) { instance.alerField007 = val; return this; }
        public Builder alerField008(BigDecimal val) { instance.alerField008 = val; return this; }
        public Builder alerField009(String val) { instance.alerField009 = val; return this; }
        public AlertDto038 build() { return instance; }
    }

    public Boolean getAlerField000() { return alerField000; }
    public void setAlerField000(Boolean alerField000) { this.alerField000 = alerField000; }

    public Integer getAlerField001() { return alerField001; }
    public void setAlerField001(Integer alerField001) { this.alerField001 = alerField001; }

    public Long getAlerField002() { return alerField002; }
    public void setAlerField002(Long alerField002) { this.alerField002 = alerField002; }

    public Double getAlerField003() { return alerField003; }
    public void setAlerField003(Double alerField003) { this.alerField003 = alerField003; }

    public Integer getAlerField004() { return alerField004; }
    public void setAlerField004(Integer alerField004) { this.alerField004 = alerField004; }

    public Long getAlerField005() { return alerField005; }
    public void setAlerField005(Long alerField005) { this.alerField005 = alerField005; }

    public Boolean getAlerField006() { return alerField006; }
    public void setAlerField006(Boolean alerField006) { this.alerField006 = alerField006; }

    public BigDecimal getAlerField007() { return alerField007; }
    public void setAlerField007(BigDecimal alerField007) { this.alerField007 = alerField007; }

    public BigDecimal getAlerField008() { return alerField008; }
    public void setAlerField008(BigDecimal alerField008) { this.alerField008 = alerField008; }

    public String getAlerField009() { return alerField009; }
    public void setAlerField009(String alerField009) { this.alerField009 = alerField009; }

    @Override
    public String toString() {
        return "AlertDto038{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
