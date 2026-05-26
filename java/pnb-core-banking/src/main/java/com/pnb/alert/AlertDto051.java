package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto051 — Data Transfer Object for alert operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto051 {

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField000")
    private BigDecimal alerField000;

    @JsonProperty("alerField001")
    private Double alerField001;

    @JsonProperty("alerField002")
    private Boolean alerField002;

    @JsonProperty("alerField003")
    private Long alerField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField004")
    private BigDecimal alerField004;

    @JsonProperty("alerField005")
    private Integer alerField005;

    @JsonProperty("alerField006")
    private Integer alerField006;

    @JsonProperty("alerField007")
    private Boolean alerField007;

    @JsonProperty("alerField008")
    private Boolean alerField008;

    @JsonProperty("alerField009")
    private Long alerField009;

    @Size(max = 20)
    @JsonProperty("alerField010")
    private String alerField010;

    public AlertDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto051 instance = new AlertDto051();

        public Builder alerField000(BigDecimal val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Double val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Boolean val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Long val) { instance.alerField003 = val; return this; }
        public Builder alerField004(BigDecimal val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Integer val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Integer val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Boolean val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Boolean val) { instance.alerField008 = val; return this; }
        public Builder alerField009(Long val) { instance.alerField009 = val; return this; }
        public Builder alerField010(String val) { instance.alerField010 = val; return this; }
        public AlertDto051 build() { return instance; }
    }

    public BigDecimal getAlerField000() { return alerField000; }
    public void setAlerField000(BigDecimal alerField000) { this.alerField000 = alerField000; }

    public Double getAlerField001() { return alerField001; }
    public void setAlerField001(Double alerField001) { this.alerField001 = alerField001; }

    public Boolean getAlerField002() { return alerField002; }
    public void setAlerField002(Boolean alerField002) { this.alerField002 = alerField002; }

    public Long getAlerField003() { return alerField003; }
    public void setAlerField003(Long alerField003) { this.alerField003 = alerField003; }

    public BigDecimal getAlerField004() { return alerField004; }
    public void setAlerField004(BigDecimal alerField004) { this.alerField004 = alerField004; }

    public Integer getAlerField005() { return alerField005; }
    public void setAlerField005(Integer alerField005) { this.alerField005 = alerField005; }

    public Integer getAlerField006() { return alerField006; }
    public void setAlerField006(Integer alerField006) { this.alerField006 = alerField006; }

    public Boolean getAlerField007() { return alerField007; }
    public void setAlerField007(Boolean alerField007) { this.alerField007 = alerField007; }

    public Boolean getAlerField008() { return alerField008; }
    public void setAlerField008(Boolean alerField008) { this.alerField008 = alerField008; }

    public Long getAlerField009() { return alerField009; }
    public void setAlerField009(Long alerField009) { this.alerField009 = alerField009; }

    public String getAlerField010() { return alerField010; }
    public void setAlerField010(String alerField010) { this.alerField010 = alerField010; }

    @Override
    public String toString() {
        return "AlertDto051{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
