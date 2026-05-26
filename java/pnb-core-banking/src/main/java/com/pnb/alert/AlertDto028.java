package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto028 — Data Transfer Object for alert operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto028 {

    @JsonProperty("alerField000")
    private Integer alerField000;

    @JsonProperty("alerField001")
    private Long alerField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField002")
    private BigDecimal alerField002;

    @JsonProperty("alerField003")
    private Integer alerField003;

    @Size(max = 20)
    @JsonProperty("alerField004")
    private String alerField004;

    @JsonProperty("alerField005")
    private Integer alerField005;

    @Size(max = 60)
    @JsonProperty("alerField006")
    private String alerField006;

    @JsonProperty("alerField007")
    private LocalDate alerField007;

    @JsonProperty("alerField008")
    private LocalDate alerField008;

    @JsonProperty("alerField009")
    private Long alerField009;

    @JsonProperty("alerField010")
    private Double alerField010;

    @JsonProperty("alerField011")
    private Integer alerField011;

    public AlertDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto028 instance = new AlertDto028();

        public Builder alerField000(Integer val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Long val) { instance.alerField001 = val; return this; }
        public Builder alerField002(BigDecimal val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Integer val) { instance.alerField003 = val; return this; }
        public Builder alerField004(String val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Integer val) { instance.alerField005 = val; return this; }
        public Builder alerField006(String val) { instance.alerField006 = val; return this; }
        public Builder alerField007(LocalDate val) { instance.alerField007 = val; return this; }
        public Builder alerField008(LocalDate val) { instance.alerField008 = val; return this; }
        public Builder alerField009(Long val) { instance.alerField009 = val; return this; }
        public Builder alerField010(Double val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Integer val) { instance.alerField011 = val; return this; }
        public AlertDto028 build() { return instance; }
    }

    public Integer getAlerField000() { return alerField000; }
    public void setAlerField000(Integer alerField000) { this.alerField000 = alerField000; }

    public Long getAlerField001() { return alerField001; }
    public void setAlerField001(Long alerField001) { this.alerField001 = alerField001; }

    public BigDecimal getAlerField002() { return alerField002; }
    public void setAlerField002(BigDecimal alerField002) { this.alerField002 = alerField002; }

    public Integer getAlerField003() { return alerField003; }
    public void setAlerField003(Integer alerField003) { this.alerField003 = alerField003; }

    public String getAlerField004() { return alerField004; }
    public void setAlerField004(String alerField004) { this.alerField004 = alerField004; }

    public Integer getAlerField005() { return alerField005; }
    public void setAlerField005(Integer alerField005) { this.alerField005 = alerField005; }

    public String getAlerField006() { return alerField006; }
    public void setAlerField006(String alerField006) { this.alerField006 = alerField006; }

    public LocalDate getAlerField007() { return alerField007; }
    public void setAlerField007(LocalDate alerField007) { this.alerField007 = alerField007; }

    public LocalDate getAlerField008() { return alerField008; }
    public void setAlerField008(LocalDate alerField008) { this.alerField008 = alerField008; }

    public Long getAlerField009() { return alerField009; }
    public void setAlerField009(Long alerField009) { this.alerField009 = alerField009; }

    public Double getAlerField010() { return alerField010; }
    public void setAlerField010(Double alerField010) { this.alerField010 = alerField010; }

    public Integer getAlerField011() { return alerField011; }
    public void setAlerField011(Integer alerField011) { this.alerField011 = alerField011; }

    @Override
    public String toString() {
        return "AlertDto028{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
