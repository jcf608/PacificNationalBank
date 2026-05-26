package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto037 — Data Transfer Object for alert operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto037 {

    @Size(max = 100)
    @JsonProperty("alerField000")
    private String alerField000;

    @JsonProperty("alerField001")
    private Integer alerField001;

    @JsonProperty("alerField002")
    private LocalDate alerField002;

    @Size(max = 40)
    @JsonProperty("alerField003")
    private String alerField003;

    @Size(max = 60)
    @JsonProperty("alerField004")
    private String alerField004;

    @JsonProperty("alerField005")
    private Integer alerField005;

    @JsonProperty("alerField006")
    private Double alerField006;

    @JsonProperty("alerField007")
    private Boolean alerField007;

    @JsonProperty("alerField008")
    private Long alerField008;

    public AlertDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto037 instance = new AlertDto037();

        public Builder alerField000(String val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Integer val) { instance.alerField001 = val; return this; }
        public Builder alerField002(LocalDate val) { instance.alerField002 = val; return this; }
        public Builder alerField003(String val) { instance.alerField003 = val; return this; }
        public Builder alerField004(String val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Integer val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Double val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Boolean val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Long val) { instance.alerField008 = val; return this; }
        public AlertDto037 build() { return instance; }
    }

    public String getAlerField000() { return alerField000; }
    public void setAlerField000(String alerField000) { this.alerField000 = alerField000; }

    public Integer getAlerField001() { return alerField001; }
    public void setAlerField001(Integer alerField001) { this.alerField001 = alerField001; }

    public LocalDate getAlerField002() { return alerField002; }
    public void setAlerField002(LocalDate alerField002) { this.alerField002 = alerField002; }

    public String getAlerField003() { return alerField003; }
    public void setAlerField003(String alerField003) { this.alerField003 = alerField003; }

    public String getAlerField004() { return alerField004; }
    public void setAlerField004(String alerField004) { this.alerField004 = alerField004; }

    public Integer getAlerField005() { return alerField005; }
    public void setAlerField005(Integer alerField005) { this.alerField005 = alerField005; }

    public Double getAlerField006() { return alerField006; }
    public void setAlerField006(Double alerField006) { this.alerField006 = alerField006; }

    public Boolean getAlerField007() { return alerField007; }
    public void setAlerField007(Boolean alerField007) { this.alerField007 = alerField007; }

    public Long getAlerField008() { return alerField008; }
    public void setAlerField008(Long alerField008) { this.alerField008 = alerField008; }

    @Override
    public String toString() {
        return "AlertDto037{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
