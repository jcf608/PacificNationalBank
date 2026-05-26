package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto021 — Data Transfer Object for alert operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto021 {

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField000")
    private BigDecimal alerField000;

    @Size(max = 40)
    @JsonProperty("alerField001")
    private String alerField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField002")
    private BigDecimal alerField002;

    @JsonProperty("alerField003")
    private Integer alerField003;

    @JsonProperty("alerField004")
    private Long alerField004;

    @Size(max = 20)
    @JsonProperty("alerField005")
    private String alerField005;

    @JsonProperty("alerField006")
    private Integer alerField006;

    @JsonProperty("alerField007")
    private Double alerField007;

    @JsonProperty("alerField008")
    private Boolean alerField008;

    @JsonProperty("alerField009")
    private Boolean alerField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField010")
    private BigDecimal alerField010;

    @JsonProperty("alerField011")
    private Integer alerField011;

    @JsonProperty("alerField012")
    private Boolean alerField012;

    @JsonProperty("alerField013")
    private LocalDate alerField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField014")
    private BigDecimal alerField014;

    @JsonProperty("alerField015")
    private Double alerField015;

    @JsonProperty("alerField016")
    private LocalDate alerField016;

    public AlertDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto021 instance = new AlertDto021();

        public Builder alerField000(BigDecimal val) { instance.alerField000 = val; return this; }
        public Builder alerField001(String val) { instance.alerField001 = val; return this; }
        public Builder alerField002(BigDecimal val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Integer val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Long val) { instance.alerField004 = val; return this; }
        public Builder alerField005(String val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Integer val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Double val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Boolean val) { instance.alerField008 = val; return this; }
        public Builder alerField009(Boolean val) { instance.alerField009 = val; return this; }
        public Builder alerField010(BigDecimal val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Integer val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Boolean val) { instance.alerField012 = val; return this; }
        public Builder alerField013(LocalDate val) { instance.alerField013 = val; return this; }
        public Builder alerField014(BigDecimal val) { instance.alerField014 = val; return this; }
        public Builder alerField015(Double val) { instance.alerField015 = val; return this; }
        public Builder alerField016(LocalDate val) { instance.alerField016 = val; return this; }
        public AlertDto021 build() { return instance; }
    }

    public BigDecimal getAlerField000() { return alerField000; }
    public void setAlerField000(BigDecimal alerField000) { this.alerField000 = alerField000; }

    public String getAlerField001() { return alerField001; }
    public void setAlerField001(String alerField001) { this.alerField001 = alerField001; }

    public BigDecimal getAlerField002() { return alerField002; }
    public void setAlerField002(BigDecimal alerField002) { this.alerField002 = alerField002; }

    public Integer getAlerField003() { return alerField003; }
    public void setAlerField003(Integer alerField003) { this.alerField003 = alerField003; }

    public Long getAlerField004() { return alerField004; }
    public void setAlerField004(Long alerField004) { this.alerField004 = alerField004; }

    public String getAlerField005() { return alerField005; }
    public void setAlerField005(String alerField005) { this.alerField005 = alerField005; }

    public Integer getAlerField006() { return alerField006; }
    public void setAlerField006(Integer alerField006) { this.alerField006 = alerField006; }

    public Double getAlerField007() { return alerField007; }
    public void setAlerField007(Double alerField007) { this.alerField007 = alerField007; }

    public Boolean getAlerField008() { return alerField008; }
    public void setAlerField008(Boolean alerField008) { this.alerField008 = alerField008; }

    public Boolean getAlerField009() { return alerField009; }
    public void setAlerField009(Boolean alerField009) { this.alerField009 = alerField009; }

    public BigDecimal getAlerField010() { return alerField010; }
    public void setAlerField010(BigDecimal alerField010) { this.alerField010 = alerField010; }

    public Integer getAlerField011() { return alerField011; }
    public void setAlerField011(Integer alerField011) { this.alerField011 = alerField011; }

    public Boolean getAlerField012() { return alerField012; }
    public void setAlerField012(Boolean alerField012) { this.alerField012 = alerField012; }

    public LocalDate getAlerField013() { return alerField013; }
    public void setAlerField013(LocalDate alerField013) { this.alerField013 = alerField013; }

    public BigDecimal getAlerField014() { return alerField014; }
    public void setAlerField014(BigDecimal alerField014) { this.alerField014 = alerField014; }

    public Double getAlerField015() { return alerField015; }
    public void setAlerField015(Double alerField015) { this.alerField015 = alerField015; }

    public LocalDate getAlerField016() { return alerField016; }
    public void setAlerField016(LocalDate alerField016) { this.alerField016 = alerField016; }

    @Override
    public String toString() {
        return "AlertDto021{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
