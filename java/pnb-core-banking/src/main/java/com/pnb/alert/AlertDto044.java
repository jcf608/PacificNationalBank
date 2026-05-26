package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto044 — Data Transfer Object for alert operations.
 * Variant 44 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto044 {

    @JsonProperty("alerField000")
    private LocalDate alerField000;

    @Size(max = 200)
    @JsonProperty("alerField001")
    private String alerField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField002")
    private BigDecimal alerField002;

    @JsonProperty("alerField003")
    private Double alerField003;

    @JsonProperty("alerField004")
    private Integer alerField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField005")
    private BigDecimal alerField005;

    @JsonProperty("alerField006")
    private Long alerField006;

    @JsonProperty("alerField007")
    private Integer alerField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField008")
    private BigDecimal alerField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField009")
    private BigDecimal alerField009;

    @JsonProperty("alerField010")
    private Boolean alerField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField011")
    private BigDecimal alerField011;

    @Size(max = 40)
    @JsonProperty("alerField012")
    private String alerField012;

    @JsonProperty("alerField013")
    private Long alerField013;

    @JsonProperty("alerField014")
    private Double alerField014;

    @JsonProperty("alerField015")
    private Double alerField015;

    public AlertDto044() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto044 instance = new AlertDto044();

        public Builder alerField000(LocalDate val) { instance.alerField000 = val; return this; }
        public Builder alerField001(String val) { instance.alerField001 = val; return this; }
        public Builder alerField002(BigDecimal val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Double val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Integer val) { instance.alerField004 = val; return this; }
        public Builder alerField005(BigDecimal val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Long val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Integer val) { instance.alerField007 = val; return this; }
        public Builder alerField008(BigDecimal val) { instance.alerField008 = val; return this; }
        public Builder alerField009(BigDecimal val) { instance.alerField009 = val; return this; }
        public Builder alerField010(Boolean val) { instance.alerField010 = val; return this; }
        public Builder alerField011(BigDecimal val) { instance.alerField011 = val; return this; }
        public Builder alerField012(String val) { instance.alerField012 = val; return this; }
        public Builder alerField013(Long val) { instance.alerField013 = val; return this; }
        public Builder alerField014(Double val) { instance.alerField014 = val; return this; }
        public Builder alerField015(Double val) { instance.alerField015 = val; return this; }
        public AlertDto044 build() { return instance; }
    }

    public LocalDate getAlerField000() { return alerField000; }
    public void setAlerField000(LocalDate alerField000) { this.alerField000 = alerField000; }

    public String getAlerField001() { return alerField001; }
    public void setAlerField001(String alerField001) { this.alerField001 = alerField001; }

    public BigDecimal getAlerField002() { return alerField002; }
    public void setAlerField002(BigDecimal alerField002) { this.alerField002 = alerField002; }

    public Double getAlerField003() { return alerField003; }
    public void setAlerField003(Double alerField003) { this.alerField003 = alerField003; }

    public Integer getAlerField004() { return alerField004; }
    public void setAlerField004(Integer alerField004) { this.alerField004 = alerField004; }

    public BigDecimal getAlerField005() { return alerField005; }
    public void setAlerField005(BigDecimal alerField005) { this.alerField005 = alerField005; }

    public Long getAlerField006() { return alerField006; }
    public void setAlerField006(Long alerField006) { this.alerField006 = alerField006; }

    public Integer getAlerField007() { return alerField007; }
    public void setAlerField007(Integer alerField007) { this.alerField007 = alerField007; }

    public BigDecimal getAlerField008() { return alerField008; }
    public void setAlerField008(BigDecimal alerField008) { this.alerField008 = alerField008; }

    public BigDecimal getAlerField009() { return alerField009; }
    public void setAlerField009(BigDecimal alerField009) { this.alerField009 = alerField009; }

    public Boolean getAlerField010() { return alerField010; }
    public void setAlerField010(Boolean alerField010) { this.alerField010 = alerField010; }

    public BigDecimal getAlerField011() { return alerField011; }
    public void setAlerField011(BigDecimal alerField011) { this.alerField011 = alerField011; }

    public String getAlerField012() { return alerField012; }
    public void setAlerField012(String alerField012) { this.alerField012 = alerField012; }

    public Long getAlerField013() { return alerField013; }
    public void setAlerField013(Long alerField013) { this.alerField013 = alerField013; }

    public Double getAlerField014() { return alerField014; }
    public void setAlerField014(Double alerField014) { this.alerField014 = alerField014; }

    public Double getAlerField015() { return alerField015; }
    public void setAlerField015(Double alerField015) { this.alerField015 = alerField015; }

    @Override
    public String toString() {
        return "AlertDto044{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
