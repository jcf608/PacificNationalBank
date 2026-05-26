package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto026 — Data Transfer Object for alert operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto026 {

    @Size(max = 40)
    @JsonProperty("alerField000")
    private String alerField000;

    @Size(max = 40)
    @JsonProperty("alerField001")
    private String alerField001;

    @JsonProperty("alerField002")
    private Integer alerField002;

    @Size(max = 100)
    @JsonProperty("alerField003")
    private String alerField003;

    @JsonProperty("alerField004")
    private Boolean alerField004;

    @JsonProperty("alerField005")
    private Long alerField005;

    @JsonProperty("alerField006")
    private LocalDate alerField006;

    @JsonProperty("alerField007")
    private Long alerField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField008")
    private BigDecimal alerField008;

    @JsonProperty("alerField009")
    private Integer alerField009;

    public AlertDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto026 instance = new AlertDto026();

        public Builder alerField000(String val) { instance.alerField000 = val; return this; }
        public Builder alerField001(String val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Integer val) { instance.alerField002 = val; return this; }
        public Builder alerField003(String val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Boolean val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Long val) { instance.alerField005 = val; return this; }
        public Builder alerField006(LocalDate val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Long val) { instance.alerField007 = val; return this; }
        public Builder alerField008(BigDecimal val) { instance.alerField008 = val; return this; }
        public Builder alerField009(Integer val) { instance.alerField009 = val; return this; }
        public AlertDto026 build() { return instance; }
    }

    public String getAlerField000() { return alerField000; }
    public void setAlerField000(String alerField000) { this.alerField000 = alerField000; }

    public String getAlerField001() { return alerField001; }
    public void setAlerField001(String alerField001) { this.alerField001 = alerField001; }

    public Integer getAlerField002() { return alerField002; }
    public void setAlerField002(Integer alerField002) { this.alerField002 = alerField002; }

    public String getAlerField003() { return alerField003; }
    public void setAlerField003(String alerField003) { this.alerField003 = alerField003; }

    public Boolean getAlerField004() { return alerField004; }
    public void setAlerField004(Boolean alerField004) { this.alerField004 = alerField004; }

    public Long getAlerField005() { return alerField005; }
    public void setAlerField005(Long alerField005) { this.alerField005 = alerField005; }

    public LocalDate getAlerField006() { return alerField006; }
    public void setAlerField006(LocalDate alerField006) { this.alerField006 = alerField006; }

    public Long getAlerField007() { return alerField007; }
    public void setAlerField007(Long alerField007) { this.alerField007 = alerField007; }

    public BigDecimal getAlerField008() { return alerField008; }
    public void setAlerField008(BigDecimal alerField008) { this.alerField008 = alerField008; }

    public Integer getAlerField009() { return alerField009; }
    public void setAlerField009(Integer alerField009) { this.alerField009 = alerField009; }

    @Override
    public String toString() {
        return "AlertDto026{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
