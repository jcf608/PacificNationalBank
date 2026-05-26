package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto045 — Data Transfer Object for alert operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto045 {

    @JsonProperty("alerField000")
    private Boolean alerField000;

    @JsonProperty("alerField001")
    private Long alerField001;

    @JsonProperty("alerField002")
    private Long alerField002;

    @JsonProperty("alerField003")
    private LocalDate alerField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField004")
    private BigDecimal alerField004;

    @JsonProperty("alerField005")
    private Double alerField005;

    @JsonProperty("alerField006")
    private Integer alerField006;

    @JsonProperty("alerField007")
    private Boolean alerField007;

    @JsonProperty("alerField008")
    private Double alerField008;

    @JsonProperty("alerField009")
    private Boolean alerField009;

    @JsonProperty("alerField010")
    private Long alerField010;

    @JsonProperty("alerField011")
    private Boolean alerField011;

    @JsonProperty("alerField012")
    private Long alerField012;

    @Size(max = 20)
    @JsonProperty("alerField013")
    private String alerField013;

    @JsonProperty("alerField014")
    private LocalDate alerField014;

    @JsonProperty("alerField015")
    private Boolean alerField015;

    @JsonProperty("alerField016")
    private LocalDate alerField016;

    public AlertDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto045 instance = new AlertDto045();

        public Builder alerField000(Boolean val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Long val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Long val) { instance.alerField002 = val; return this; }
        public Builder alerField003(LocalDate val) { instance.alerField003 = val; return this; }
        public Builder alerField004(BigDecimal val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Double val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Integer val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Boolean val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Double val) { instance.alerField008 = val; return this; }
        public Builder alerField009(Boolean val) { instance.alerField009 = val; return this; }
        public Builder alerField010(Long val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Boolean val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Long val) { instance.alerField012 = val; return this; }
        public Builder alerField013(String val) { instance.alerField013 = val; return this; }
        public Builder alerField014(LocalDate val) { instance.alerField014 = val; return this; }
        public Builder alerField015(Boolean val) { instance.alerField015 = val; return this; }
        public Builder alerField016(LocalDate val) { instance.alerField016 = val; return this; }
        public AlertDto045 build() { return instance; }
    }

    public Boolean getAlerField000() { return alerField000; }
    public void setAlerField000(Boolean alerField000) { this.alerField000 = alerField000; }

    public Long getAlerField001() { return alerField001; }
    public void setAlerField001(Long alerField001) { this.alerField001 = alerField001; }

    public Long getAlerField002() { return alerField002; }
    public void setAlerField002(Long alerField002) { this.alerField002 = alerField002; }

    public LocalDate getAlerField003() { return alerField003; }
    public void setAlerField003(LocalDate alerField003) { this.alerField003 = alerField003; }

    public BigDecimal getAlerField004() { return alerField004; }
    public void setAlerField004(BigDecimal alerField004) { this.alerField004 = alerField004; }

    public Double getAlerField005() { return alerField005; }
    public void setAlerField005(Double alerField005) { this.alerField005 = alerField005; }

    public Integer getAlerField006() { return alerField006; }
    public void setAlerField006(Integer alerField006) { this.alerField006 = alerField006; }

    public Boolean getAlerField007() { return alerField007; }
    public void setAlerField007(Boolean alerField007) { this.alerField007 = alerField007; }

    public Double getAlerField008() { return alerField008; }
    public void setAlerField008(Double alerField008) { this.alerField008 = alerField008; }

    public Boolean getAlerField009() { return alerField009; }
    public void setAlerField009(Boolean alerField009) { this.alerField009 = alerField009; }

    public Long getAlerField010() { return alerField010; }
    public void setAlerField010(Long alerField010) { this.alerField010 = alerField010; }

    public Boolean getAlerField011() { return alerField011; }
    public void setAlerField011(Boolean alerField011) { this.alerField011 = alerField011; }

    public Long getAlerField012() { return alerField012; }
    public void setAlerField012(Long alerField012) { this.alerField012 = alerField012; }

    public String getAlerField013() { return alerField013; }
    public void setAlerField013(String alerField013) { this.alerField013 = alerField013; }

    public LocalDate getAlerField014() { return alerField014; }
    public void setAlerField014(LocalDate alerField014) { this.alerField014 = alerField014; }

    public Boolean getAlerField015() { return alerField015; }
    public void setAlerField015(Boolean alerField015) { this.alerField015 = alerField015; }

    public LocalDate getAlerField016() { return alerField016; }
    public void setAlerField016(LocalDate alerField016) { this.alerField016 = alerField016; }

    @Override
    public String toString() {
        return "AlertDto045{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
