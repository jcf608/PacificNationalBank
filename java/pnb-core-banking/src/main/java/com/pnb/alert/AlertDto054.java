package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto054 — Data Transfer Object for alert operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto054 {

    @JsonProperty("alerField000")
    private Long alerField000;

    @JsonProperty("alerField001")
    private Boolean alerField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField002")
    private BigDecimal alerField002;

    @JsonProperty("alerField003")
    private Boolean alerField003;

    @JsonProperty("alerField004")
    private Long alerField004;

    @JsonProperty("alerField005")
    private Boolean alerField005;

    @JsonProperty("alerField006")
    private Long alerField006;

    @Size(max = 20)
    @JsonProperty("alerField007")
    private String alerField007;

    @JsonProperty("alerField008")
    private LocalDate alerField008;

    @Size(max = 100)
    @JsonProperty("alerField009")
    private String alerField009;

    @JsonProperty("alerField010")
    private Long alerField010;

    @JsonProperty("alerField011")
    private Integer alerField011;

    @JsonProperty("alerField012")
    private Integer alerField012;

    @JsonProperty("alerField013")
    private Boolean alerField013;

    public AlertDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto054 instance = new AlertDto054();

        public Builder alerField000(Long val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Boolean val) { instance.alerField001 = val; return this; }
        public Builder alerField002(BigDecimal val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Boolean val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Long val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Boolean val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Long val) { instance.alerField006 = val; return this; }
        public Builder alerField007(String val) { instance.alerField007 = val; return this; }
        public Builder alerField008(LocalDate val) { instance.alerField008 = val; return this; }
        public Builder alerField009(String val) { instance.alerField009 = val; return this; }
        public Builder alerField010(Long val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Integer val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Integer val) { instance.alerField012 = val; return this; }
        public Builder alerField013(Boolean val) { instance.alerField013 = val; return this; }
        public AlertDto054 build() { return instance; }
    }

    public Long getAlerField000() { return alerField000; }
    public void setAlerField000(Long alerField000) { this.alerField000 = alerField000; }

    public Boolean getAlerField001() { return alerField001; }
    public void setAlerField001(Boolean alerField001) { this.alerField001 = alerField001; }

    public BigDecimal getAlerField002() { return alerField002; }
    public void setAlerField002(BigDecimal alerField002) { this.alerField002 = alerField002; }

    public Boolean getAlerField003() { return alerField003; }
    public void setAlerField003(Boolean alerField003) { this.alerField003 = alerField003; }

    public Long getAlerField004() { return alerField004; }
    public void setAlerField004(Long alerField004) { this.alerField004 = alerField004; }

    public Boolean getAlerField005() { return alerField005; }
    public void setAlerField005(Boolean alerField005) { this.alerField005 = alerField005; }

    public Long getAlerField006() { return alerField006; }
    public void setAlerField006(Long alerField006) { this.alerField006 = alerField006; }

    public String getAlerField007() { return alerField007; }
    public void setAlerField007(String alerField007) { this.alerField007 = alerField007; }

    public LocalDate getAlerField008() { return alerField008; }
    public void setAlerField008(LocalDate alerField008) { this.alerField008 = alerField008; }

    public String getAlerField009() { return alerField009; }
    public void setAlerField009(String alerField009) { this.alerField009 = alerField009; }

    public Long getAlerField010() { return alerField010; }
    public void setAlerField010(Long alerField010) { this.alerField010 = alerField010; }

    public Integer getAlerField011() { return alerField011; }
    public void setAlerField011(Integer alerField011) { this.alerField011 = alerField011; }

    public Integer getAlerField012() { return alerField012; }
    public void setAlerField012(Integer alerField012) { this.alerField012 = alerField012; }

    public Boolean getAlerField013() { return alerField013; }
    public void setAlerField013(Boolean alerField013) { this.alerField013 = alerField013; }

    @Override
    public String toString() {
        return "AlertDto054{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
