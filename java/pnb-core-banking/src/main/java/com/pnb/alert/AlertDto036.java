package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto036 — Data Transfer Object for alert operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto036 {

    @JsonProperty("alerField000")
    private LocalDate alerField000;

    @JsonProperty("alerField001")
    private Integer alerField001;

    @Size(max = 60)
    @JsonProperty("alerField002")
    private String alerField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField003")
    private BigDecimal alerField003;

    @JsonProperty("alerField004")
    private Long alerField004;

    @Size(max = 60)
    @JsonProperty("alerField005")
    private String alerField005;

    @JsonProperty("alerField006")
    private Boolean alerField006;

    @JsonProperty("alerField007")
    private Integer alerField007;

    public AlertDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto036 instance = new AlertDto036();

        public Builder alerField000(LocalDate val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Integer val) { instance.alerField001 = val; return this; }
        public Builder alerField002(String val) { instance.alerField002 = val; return this; }
        public Builder alerField003(BigDecimal val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Long val) { instance.alerField004 = val; return this; }
        public Builder alerField005(String val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Boolean val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Integer val) { instance.alerField007 = val; return this; }
        public AlertDto036 build() { return instance; }
    }

    public LocalDate getAlerField000() { return alerField000; }
    public void setAlerField000(LocalDate alerField000) { this.alerField000 = alerField000; }

    public Integer getAlerField001() { return alerField001; }
    public void setAlerField001(Integer alerField001) { this.alerField001 = alerField001; }

    public String getAlerField002() { return alerField002; }
    public void setAlerField002(String alerField002) { this.alerField002 = alerField002; }

    public BigDecimal getAlerField003() { return alerField003; }
    public void setAlerField003(BigDecimal alerField003) { this.alerField003 = alerField003; }

    public Long getAlerField004() { return alerField004; }
    public void setAlerField004(Long alerField004) { this.alerField004 = alerField004; }

    public String getAlerField005() { return alerField005; }
    public void setAlerField005(String alerField005) { this.alerField005 = alerField005; }

    public Boolean getAlerField006() { return alerField006; }
    public void setAlerField006(Boolean alerField006) { this.alerField006 = alerField006; }

    public Integer getAlerField007() { return alerField007; }
    public void setAlerField007(Integer alerField007) { this.alerField007 = alerField007; }

    @Override
    public String toString() {
        return "AlertDto036{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
