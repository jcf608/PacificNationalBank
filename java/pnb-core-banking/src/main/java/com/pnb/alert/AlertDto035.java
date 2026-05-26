package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto035 — Data Transfer Object for alert operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto035 {

    @JsonProperty("alerField000")
    private Long alerField000;

    @Size(max = 200)
    @JsonProperty("alerField001")
    private String alerField001;

    @JsonProperty("alerField002")
    private Boolean alerField002;

    @JsonProperty("alerField003")
    private Integer alerField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField004")
    private BigDecimal alerField004;

    @JsonProperty("alerField005")
    private Integer alerField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField006")
    private BigDecimal alerField006;

    @JsonProperty("alerField007")
    private Boolean alerField007;

    @JsonProperty("alerField008")
    private Double alerField008;

    @JsonProperty("alerField009")
    private LocalDate alerField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField010")
    private BigDecimal alerField010;

    @JsonProperty("alerField011")
    private Integer alerField011;

    @JsonProperty("alerField012")
    private Boolean alerField012;

    @Size(max = 20)
    @JsonProperty("alerField013")
    private String alerField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField014")
    private BigDecimal alerField014;

    @JsonProperty("alerField015")
    private Integer alerField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField016")
    private BigDecimal alerField016;

    @Size(max = 40)
    @JsonProperty("alerField017")
    private String alerField017;

    @JsonProperty("alerField018")
    private Long alerField018;

    public AlertDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto035 instance = new AlertDto035();

        public Builder alerField000(Long val) { instance.alerField000 = val; return this; }
        public Builder alerField001(String val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Boolean val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Integer val) { instance.alerField003 = val; return this; }
        public Builder alerField004(BigDecimal val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Integer val) { instance.alerField005 = val; return this; }
        public Builder alerField006(BigDecimal val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Boolean val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Double val) { instance.alerField008 = val; return this; }
        public Builder alerField009(LocalDate val) { instance.alerField009 = val; return this; }
        public Builder alerField010(BigDecimal val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Integer val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Boolean val) { instance.alerField012 = val; return this; }
        public Builder alerField013(String val) { instance.alerField013 = val; return this; }
        public Builder alerField014(BigDecimal val) { instance.alerField014 = val; return this; }
        public Builder alerField015(Integer val) { instance.alerField015 = val; return this; }
        public Builder alerField016(BigDecimal val) { instance.alerField016 = val; return this; }
        public Builder alerField017(String val) { instance.alerField017 = val; return this; }
        public Builder alerField018(Long val) { instance.alerField018 = val; return this; }
        public AlertDto035 build() { return instance; }
    }

    public Long getAlerField000() { return alerField000; }
    public void setAlerField000(Long alerField000) { this.alerField000 = alerField000; }

    public String getAlerField001() { return alerField001; }
    public void setAlerField001(String alerField001) { this.alerField001 = alerField001; }

    public Boolean getAlerField002() { return alerField002; }
    public void setAlerField002(Boolean alerField002) { this.alerField002 = alerField002; }

    public Integer getAlerField003() { return alerField003; }
    public void setAlerField003(Integer alerField003) { this.alerField003 = alerField003; }

    public BigDecimal getAlerField004() { return alerField004; }
    public void setAlerField004(BigDecimal alerField004) { this.alerField004 = alerField004; }

    public Integer getAlerField005() { return alerField005; }
    public void setAlerField005(Integer alerField005) { this.alerField005 = alerField005; }

    public BigDecimal getAlerField006() { return alerField006; }
    public void setAlerField006(BigDecimal alerField006) { this.alerField006 = alerField006; }

    public Boolean getAlerField007() { return alerField007; }
    public void setAlerField007(Boolean alerField007) { this.alerField007 = alerField007; }

    public Double getAlerField008() { return alerField008; }
    public void setAlerField008(Double alerField008) { this.alerField008 = alerField008; }

    public LocalDate getAlerField009() { return alerField009; }
    public void setAlerField009(LocalDate alerField009) { this.alerField009 = alerField009; }

    public BigDecimal getAlerField010() { return alerField010; }
    public void setAlerField010(BigDecimal alerField010) { this.alerField010 = alerField010; }

    public Integer getAlerField011() { return alerField011; }
    public void setAlerField011(Integer alerField011) { this.alerField011 = alerField011; }

    public Boolean getAlerField012() { return alerField012; }
    public void setAlerField012(Boolean alerField012) { this.alerField012 = alerField012; }

    public String getAlerField013() { return alerField013; }
    public void setAlerField013(String alerField013) { this.alerField013 = alerField013; }

    public BigDecimal getAlerField014() { return alerField014; }
    public void setAlerField014(BigDecimal alerField014) { this.alerField014 = alerField014; }

    public Integer getAlerField015() { return alerField015; }
    public void setAlerField015(Integer alerField015) { this.alerField015 = alerField015; }

    public BigDecimal getAlerField016() { return alerField016; }
    public void setAlerField016(BigDecimal alerField016) { this.alerField016 = alerField016; }

    public String getAlerField017() { return alerField017; }
    public void setAlerField017(String alerField017) { this.alerField017 = alerField017; }

    public Long getAlerField018() { return alerField018; }
    public void setAlerField018(Long alerField018) { this.alerField018 = alerField018; }

    @Override
    public String toString() {
        return "AlertDto035{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
