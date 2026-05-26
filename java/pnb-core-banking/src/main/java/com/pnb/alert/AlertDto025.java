package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto025 — Data Transfer Object for alert operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto025 {

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField000")
    private BigDecimal alerField000;

    @JsonProperty("alerField001")
    private Boolean alerField001;

    @JsonProperty("alerField002")
    private Long alerField002;

    @Size(max = 20)
    @JsonProperty("alerField003")
    private String alerField003;

    @JsonProperty("alerField004")
    private Long alerField004;

    @JsonProperty("alerField005")
    private Integer alerField005;

    @Size(max = 40)
    @JsonProperty("alerField006")
    private String alerField006;

    @JsonProperty("alerField007")
    private Long alerField007;

    @JsonProperty("alerField008")
    private Long alerField008;

    public AlertDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto025 instance = new AlertDto025();

        public Builder alerField000(BigDecimal val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Boolean val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Long val) { instance.alerField002 = val; return this; }
        public Builder alerField003(String val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Long val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Integer val) { instance.alerField005 = val; return this; }
        public Builder alerField006(String val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Long val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Long val) { instance.alerField008 = val; return this; }
        public AlertDto025 build() { return instance; }
    }

    public BigDecimal getAlerField000() { return alerField000; }
    public void setAlerField000(BigDecimal alerField000) { this.alerField000 = alerField000; }

    public Boolean getAlerField001() { return alerField001; }
    public void setAlerField001(Boolean alerField001) { this.alerField001 = alerField001; }

    public Long getAlerField002() { return alerField002; }
    public void setAlerField002(Long alerField002) { this.alerField002 = alerField002; }

    public String getAlerField003() { return alerField003; }
    public void setAlerField003(String alerField003) { this.alerField003 = alerField003; }

    public Long getAlerField004() { return alerField004; }
    public void setAlerField004(Long alerField004) { this.alerField004 = alerField004; }

    public Integer getAlerField005() { return alerField005; }
    public void setAlerField005(Integer alerField005) { this.alerField005 = alerField005; }

    public String getAlerField006() { return alerField006; }
    public void setAlerField006(String alerField006) { this.alerField006 = alerField006; }

    public Long getAlerField007() { return alerField007; }
    public void setAlerField007(Long alerField007) { this.alerField007 = alerField007; }

    public Long getAlerField008() { return alerField008; }
    public void setAlerField008(Long alerField008) { this.alerField008 = alerField008; }

    @Override
    public String toString() {
        return "AlertDto025{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
