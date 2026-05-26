package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto041 — Data Transfer Object for alert operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto041 {

    @JsonProperty("alerField000")
    private Long alerField000;

    @JsonProperty("alerField001")
    private Long alerField001;

    @JsonProperty("alerField002")
    private Long alerField002;

    @JsonProperty("alerField003")
    private Boolean alerField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField004")
    private BigDecimal alerField004;

    @Size(max = 100)
    @JsonProperty("alerField005")
    private String alerField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField006")
    private BigDecimal alerField006;

    @JsonProperty("alerField007")
    private Double alerField007;

    @JsonProperty("alerField008")
    private Integer alerField008;

    @JsonProperty("alerField009")
    private Boolean alerField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField010")
    private BigDecimal alerField010;

    @JsonProperty("alerField011")
    private Boolean alerField011;

    @JsonProperty("alerField012")
    private Integer alerField012;

    public AlertDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto041 instance = new AlertDto041();

        public Builder alerField000(Long val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Long val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Long val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Boolean val) { instance.alerField003 = val; return this; }
        public Builder alerField004(BigDecimal val) { instance.alerField004 = val; return this; }
        public Builder alerField005(String val) { instance.alerField005 = val; return this; }
        public Builder alerField006(BigDecimal val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Double val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Integer val) { instance.alerField008 = val; return this; }
        public Builder alerField009(Boolean val) { instance.alerField009 = val; return this; }
        public Builder alerField010(BigDecimal val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Boolean val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Integer val) { instance.alerField012 = val; return this; }
        public AlertDto041 build() { return instance; }
    }

    public Long getAlerField000() { return alerField000; }
    public void setAlerField000(Long alerField000) { this.alerField000 = alerField000; }

    public Long getAlerField001() { return alerField001; }
    public void setAlerField001(Long alerField001) { this.alerField001 = alerField001; }

    public Long getAlerField002() { return alerField002; }
    public void setAlerField002(Long alerField002) { this.alerField002 = alerField002; }

    public Boolean getAlerField003() { return alerField003; }
    public void setAlerField003(Boolean alerField003) { this.alerField003 = alerField003; }

    public BigDecimal getAlerField004() { return alerField004; }
    public void setAlerField004(BigDecimal alerField004) { this.alerField004 = alerField004; }

    public String getAlerField005() { return alerField005; }
    public void setAlerField005(String alerField005) { this.alerField005 = alerField005; }

    public BigDecimal getAlerField006() { return alerField006; }
    public void setAlerField006(BigDecimal alerField006) { this.alerField006 = alerField006; }

    public Double getAlerField007() { return alerField007; }
    public void setAlerField007(Double alerField007) { this.alerField007 = alerField007; }

    public Integer getAlerField008() { return alerField008; }
    public void setAlerField008(Integer alerField008) { this.alerField008 = alerField008; }

    public Boolean getAlerField009() { return alerField009; }
    public void setAlerField009(Boolean alerField009) { this.alerField009 = alerField009; }

    public BigDecimal getAlerField010() { return alerField010; }
    public void setAlerField010(BigDecimal alerField010) { this.alerField010 = alerField010; }

    public Boolean getAlerField011() { return alerField011; }
    public void setAlerField011(Boolean alerField011) { this.alerField011 = alerField011; }

    public Integer getAlerField012() { return alerField012; }
    public void setAlerField012(Integer alerField012) { this.alerField012 = alerField012; }

    @Override
    public String toString() {
        return "AlertDto041{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
