package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto052 — Data Transfer Object for alert operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto052 {

    @JsonProperty("alerField000")
    private Boolean alerField000;

    @JsonProperty("alerField001")
    private Double alerField001;

    @JsonProperty("alerField002")
    private Integer alerField002;

    @JsonProperty("alerField003")
    private Boolean alerField003;

    @JsonProperty("alerField004")
    private Double alerField004;

    @JsonProperty("alerField005")
    private Long alerField005;

    @JsonProperty("alerField006")
    private LocalDate alerField006;

    @Size(max = 100)
    @JsonProperty("alerField007")
    private String alerField007;

    @JsonProperty("alerField008")
    private Integer alerField008;

    @JsonProperty("alerField009")
    private LocalDate alerField009;

    @Size(max = 100)
    @JsonProperty("alerField010")
    private String alerField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField011")
    private BigDecimal alerField011;

    public AlertDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto052 instance = new AlertDto052();

        public Builder alerField000(Boolean val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Double val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Integer val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Boolean val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Double val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Long val) { instance.alerField005 = val; return this; }
        public Builder alerField006(LocalDate val) { instance.alerField006 = val; return this; }
        public Builder alerField007(String val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Integer val) { instance.alerField008 = val; return this; }
        public Builder alerField009(LocalDate val) { instance.alerField009 = val; return this; }
        public Builder alerField010(String val) { instance.alerField010 = val; return this; }
        public Builder alerField011(BigDecimal val) { instance.alerField011 = val; return this; }
        public AlertDto052 build() { return instance; }
    }

    public Boolean getAlerField000() { return alerField000; }
    public void setAlerField000(Boolean alerField000) { this.alerField000 = alerField000; }

    public Double getAlerField001() { return alerField001; }
    public void setAlerField001(Double alerField001) { this.alerField001 = alerField001; }

    public Integer getAlerField002() { return alerField002; }
    public void setAlerField002(Integer alerField002) { this.alerField002 = alerField002; }

    public Boolean getAlerField003() { return alerField003; }
    public void setAlerField003(Boolean alerField003) { this.alerField003 = alerField003; }

    public Double getAlerField004() { return alerField004; }
    public void setAlerField004(Double alerField004) { this.alerField004 = alerField004; }

    public Long getAlerField005() { return alerField005; }
    public void setAlerField005(Long alerField005) { this.alerField005 = alerField005; }

    public LocalDate getAlerField006() { return alerField006; }
    public void setAlerField006(LocalDate alerField006) { this.alerField006 = alerField006; }

    public String getAlerField007() { return alerField007; }
    public void setAlerField007(String alerField007) { this.alerField007 = alerField007; }

    public Integer getAlerField008() { return alerField008; }
    public void setAlerField008(Integer alerField008) { this.alerField008 = alerField008; }

    public LocalDate getAlerField009() { return alerField009; }
    public void setAlerField009(LocalDate alerField009) { this.alerField009 = alerField009; }

    public String getAlerField010() { return alerField010; }
    public void setAlerField010(String alerField010) { this.alerField010 = alerField010; }

    public BigDecimal getAlerField011() { return alerField011; }
    public void setAlerField011(BigDecimal alerField011) { this.alerField011 = alerField011; }

    @Override
    public String toString() {
        return "AlertDto052{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
