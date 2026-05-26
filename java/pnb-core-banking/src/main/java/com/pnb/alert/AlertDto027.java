package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto027 — Data Transfer Object for alert operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto027 {

    @JsonProperty("alerField000")
    private Long alerField000;

    @JsonProperty("alerField001")
    private Boolean alerField001;

    @JsonProperty("alerField002")
    private LocalDate alerField002;

    @JsonProperty("alerField003")
    private Integer alerField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField004")
    private BigDecimal alerField004;

    @JsonProperty("alerField005")
    private Double alerField005;

    @JsonProperty("alerField006")
    private Boolean alerField006;

    @Size(max = 20)
    @JsonProperty("alerField007")
    private String alerField007;

    @JsonProperty("alerField008")
    private Long alerField008;

    @Size(max = 40)
    @JsonProperty("alerField009")
    private String alerField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField010")
    private BigDecimal alerField010;

    public AlertDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto027 instance = new AlertDto027();

        public Builder alerField000(Long val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Boolean val) { instance.alerField001 = val; return this; }
        public Builder alerField002(LocalDate val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Integer val) { instance.alerField003 = val; return this; }
        public Builder alerField004(BigDecimal val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Double val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Boolean val) { instance.alerField006 = val; return this; }
        public Builder alerField007(String val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Long val) { instance.alerField008 = val; return this; }
        public Builder alerField009(String val) { instance.alerField009 = val; return this; }
        public Builder alerField010(BigDecimal val) { instance.alerField010 = val; return this; }
        public AlertDto027 build() { return instance; }
    }

    public Long getAlerField000() { return alerField000; }
    public void setAlerField000(Long alerField000) { this.alerField000 = alerField000; }

    public Boolean getAlerField001() { return alerField001; }
    public void setAlerField001(Boolean alerField001) { this.alerField001 = alerField001; }

    public LocalDate getAlerField002() { return alerField002; }
    public void setAlerField002(LocalDate alerField002) { this.alerField002 = alerField002; }

    public Integer getAlerField003() { return alerField003; }
    public void setAlerField003(Integer alerField003) { this.alerField003 = alerField003; }

    public BigDecimal getAlerField004() { return alerField004; }
    public void setAlerField004(BigDecimal alerField004) { this.alerField004 = alerField004; }

    public Double getAlerField005() { return alerField005; }
    public void setAlerField005(Double alerField005) { this.alerField005 = alerField005; }

    public Boolean getAlerField006() { return alerField006; }
    public void setAlerField006(Boolean alerField006) { this.alerField006 = alerField006; }

    public String getAlerField007() { return alerField007; }
    public void setAlerField007(String alerField007) { this.alerField007 = alerField007; }

    public Long getAlerField008() { return alerField008; }
    public void setAlerField008(Long alerField008) { this.alerField008 = alerField008; }

    public String getAlerField009() { return alerField009; }
    public void setAlerField009(String alerField009) { this.alerField009 = alerField009; }

    public BigDecimal getAlerField010() { return alerField010; }
    public void setAlerField010(BigDecimal alerField010) { this.alerField010 = alerField010; }

    @Override
    public String toString() {
        return "AlertDto027{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
