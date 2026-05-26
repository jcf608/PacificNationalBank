package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto030 — Data Transfer Object for alert operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto030 {

    @Size(max = 200)
    @JsonProperty("alerField000")
    private String alerField000;

    @JsonProperty("alerField001")
    private Integer alerField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField002")
    private BigDecimal alerField002;

    @JsonProperty("alerField003")
    private LocalDate alerField003;

    @JsonProperty("alerField004")
    private Long alerField004;

    @JsonProperty("alerField005")
    private Boolean alerField005;

    @Size(max = 100)
    @JsonProperty("alerField006")
    private String alerField006;

    @JsonProperty("alerField007")
    private Boolean alerField007;

    @JsonProperty("alerField008")
    private Long alerField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField009")
    private BigDecimal alerField009;

    @Size(max = 60)
    @JsonProperty("alerField010")
    private String alerField010;

    @JsonProperty("alerField011")
    private Double alerField011;

    @Size(max = 60)
    @JsonProperty("alerField012")
    private String alerField012;

    @JsonProperty("alerField013")
    private Integer alerField013;

    public AlertDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto030 instance = new AlertDto030();

        public Builder alerField000(String val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Integer val) { instance.alerField001 = val; return this; }
        public Builder alerField002(BigDecimal val) { instance.alerField002 = val; return this; }
        public Builder alerField003(LocalDate val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Long val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Boolean val) { instance.alerField005 = val; return this; }
        public Builder alerField006(String val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Boolean val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Long val) { instance.alerField008 = val; return this; }
        public Builder alerField009(BigDecimal val) { instance.alerField009 = val; return this; }
        public Builder alerField010(String val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Double val) { instance.alerField011 = val; return this; }
        public Builder alerField012(String val) { instance.alerField012 = val; return this; }
        public Builder alerField013(Integer val) { instance.alerField013 = val; return this; }
        public AlertDto030 build() { return instance; }
    }

    public String getAlerField000() { return alerField000; }
    public void setAlerField000(String alerField000) { this.alerField000 = alerField000; }

    public Integer getAlerField001() { return alerField001; }
    public void setAlerField001(Integer alerField001) { this.alerField001 = alerField001; }

    public BigDecimal getAlerField002() { return alerField002; }
    public void setAlerField002(BigDecimal alerField002) { this.alerField002 = alerField002; }

    public LocalDate getAlerField003() { return alerField003; }
    public void setAlerField003(LocalDate alerField003) { this.alerField003 = alerField003; }

    public Long getAlerField004() { return alerField004; }
    public void setAlerField004(Long alerField004) { this.alerField004 = alerField004; }

    public Boolean getAlerField005() { return alerField005; }
    public void setAlerField005(Boolean alerField005) { this.alerField005 = alerField005; }

    public String getAlerField006() { return alerField006; }
    public void setAlerField006(String alerField006) { this.alerField006 = alerField006; }

    public Boolean getAlerField007() { return alerField007; }
    public void setAlerField007(Boolean alerField007) { this.alerField007 = alerField007; }

    public Long getAlerField008() { return alerField008; }
    public void setAlerField008(Long alerField008) { this.alerField008 = alerField008; }

    public BigDecimal getAlerField009() { return alerField009; }
    public void setAlerField009(BigDecimal alerField009) { this.alerField009 = alerField009; }

    public String getAlerField010() { return alerField010; }
    public void setAlerField010(String alerField010) { this.alerField010 = alerField010; }

    public Double getAlerField011() { return alerField011; }
    public void setAlerField011(Double alerField011) { this.alerField011 = alerField011; }

    public String getAlerField012() { return alerField012; }
    public void setAlerField012(String alerField012) { this.alerField012 = alerField012; }

    public Integer getAlerField013() { return alerField013; }
    public void setAlerField013(Integer alerField013) { this.alerField013 = alerField013; }

    @Override
    public String toString() {
        return "AlertDto030{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
