package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto050 — Data Transfer Object for alert operations.
 * Variant 50 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto050 {

    @JsonProperty("alerField000")
    private Integer alerField000;

    @JsonProperty("alerField001")
    private Boolean alerField001;

    @Size(max = 20)
    @JsonProperty("alerField002")
    private String alerField002;

    @JsonProperty("alerField003")
    private Integer alerField003;

    @JsonProperty("alerField004")
    private Double alerField004;

    @JsonProperty("alerField005")
    private LocalDate alerField005;

    @JsonProperty("alerField006")
    private Boolean alerField006;

    @JsonProperty("alerField007")
    private Long alerField007;

    @JsonProperty("alerField008")
    private Long alerField008;

    @Size(max = 40)
    @JsonProperty("alerField009")
    private String alerField009;

    public AlertDto050() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto050 instance = new AlertDto050();

        public Builder alerField000(Integer val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Boolean val) { instance.alerField001 = val; return this; }
        public Builder alerField002(String val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Integer val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Double val) { instance.alerField004 = val; return this; }
        public Builder alerField005(LocalDate val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Boolean val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Long val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Long val) { instance.alerField008 = val; return this; }
        public Builder alerField009(String val) { instance.alerField009 = val; return this; }
        public AlertDto050 build() { return instance; }
    }

    public Integer getAlerField000() { return alerField000; }
    public void setAlerField000(Integer alerField000) { this.alerField000 = alerField000; }

    public Boolean getAlerField001() { return alerField001; }
    public void setAlerField001(Boolean alerField001) { this.alerField001 = alerField001; }

    public String getAlerField002() { return alerField002; }
    public void setAlerField002(String alerField002) { this.alerField002 = alerField002; }

    public Integer getAlerField003() { return alerField003; }
    public void setAlerField003(Integer alerField003) { this.alerField003 = alerField003; }

    public Double getAlerField004() { return alerField004; }
    public void setAlerField004(Double alerField004) { this.alerField004 = alerField004; }

    public LocalDate getAlerField005() { return alerField005; }
    public void setAlerField005(LocalDate alerField005) { this.alerField005 = alerField005; }

    public Boolean getAlerField006() { return alerField006; }
    public void setAlerField006(Boolean alerField006) { this.alerField006 = alerField006; }

    public Long getAlerField007() { return alerField007; }
    public void setAlerField007(Long alerField007) { this.alerField007 = alerField007; }

    public Long getAlerField008() { return alerField008; }
    public void setAlerField008(Long alerField008) { this.alerField008 = alerField008; }

    public String getAlerField009() { return alerField009; }
    public void setAlerField009(String alerField009) { this.alerField009 = alerField009; }

    @Override
    public String toString() {
        return "AlertDto050{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
