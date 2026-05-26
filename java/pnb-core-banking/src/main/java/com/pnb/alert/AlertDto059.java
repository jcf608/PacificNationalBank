package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto059 — Data Transfer Object for alert operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto059 {

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField000")
    private BigDecimal alerField000;

    @JsonProperty("alerField001")
    private LocalDate alerField001;

    @JsonProperty("alerField002")
    private Integer alerField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField003")
    private BigDecimal alerField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField004")
    private BigDecimal alerField004;

    @JsonProperty("alerField005")
    private Integer alerField005;

    @JsonProperty("alerField006")
    private Double alerField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField007")
    private BigDecimal alerField007;

    @JsonProperty("alerField008")
    private Double alerField008;

    @JsonProperty("alerField009")
    private Long alerField009;

    @JsonProperty("alerField010")
    private Integer alerField010;

    @Size(max = 20)
    @JsonProperty("alerField011")
    private String alerField011;

    @JsonProperty("alerField012")
    private Integer alerField012;

    @Size(max = 60)
    @JsonProperty("alerField013")
    private String alerField013;

    @JsonProperty("alerField014")
    private Integer alerField014;

    @JsonProperty("alerField015")
    private Double alerField015;

    @JsonProperty("alerField016")
    private Boolean alerField016;

    @Size(max = 20)
    @JsonProperty("alerField017")
    private String alerField017;

    @JsonProperty("alerField018")
    private Double alerField018;

    public AlertDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto059 instance = new AlertDto059();

        public Builder alerField000(BigDecimal val) { instance.alerField000 = val; return this; }
        public Builder alerField001(LocalDate val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Integer val) { instance.alerField002 = val; return this; }
        public Builder alerField003(BigDecimal val) { instance.alerField003 = val; return this; }
        public Builder alerField004(BigDecimal val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Integer val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Double val) { instance.alerField006 = val; return this; }
        public Builder alerField007(BigDecimal val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Double val) { instance.alerField008 = val; return this; }
        public Builder alerField009(Long val) { instance.alerField009 = val; return this; }
        public Builder alerField010(Integer val) { instance.alerField010 = val; return this; }
        public Builder alerField011(String val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Integer val) { instance.alerField012 = val; return this; }
        public Builder alerField013(String val) { instance.alerField013 = val; return this; }
        public Builder alerField014(Integer val) { instance.alerField014 = val; return this; }
        public Builder alerField015(Double val) { instance.alerField015 = val; return this; }
        public Builder alerField016(Boolean val) { instance.alerField016 = val; return this; }
        public Builder alerField017(String val) { instance.alerField017 = val; return this; }
        public Builder alerField018(Double val) { instance.alerField018 = val; return this; }
        public AlertDto059 build() { return instance; }
    }

    public BigDecimal getAlerField000() { return alerField000; }
    public void setAlerField000(BigDecimal alerField000) { this.alerField000 = alerField000; }

    public LocalDate getAlerField001() { return alerField001; }
    public void setAlerField001(LocalDate alerField001) { this.alerField001 = alerField001; }

    public Integer getAlerField002() { return alerField002; }
    public void setAlerField002(Integer alerField002) { this.alerField002 = alerField002; }

    public BigDecimal getAlerField003() { return alerField003; }
    public void setAlerField003(BigDecimal alerField003) { this.alerField003 = alerField003; }

    public BigDecimal getAlerField004() { return alerField004; }
    public void setAlerField004(BigDecimal alerField004) { this.alerField004 = alerField004; }

    public Integer getAlerField005() { return alerField005; }
    public void setAlerField005(Integer alerField005) { this.alerField005 = alerField005; }

    public Double getAlerField006() { return alerField006; }
    public void setAlerField006(Double alerField006) { this.alerField006 = alerField006; }

    public BigDecimal getAlerField007() { return alerField007; }
    public void setAlerField007(BigDecimal alerField007) { this.alerField007 = alerField007; }

    public Double getAlerField008() { return alerField008; }
    public void setAlerField008(Double alerField008) { this.alerField008 = alerField008; }

    public Long getAlerField009() { return alerField009; }
    public void setAlerField009(Long alerField009) { this.alerField009 = alerField009; }

    public Integer getAlerField010() { return alerField010; }
    public void setAlerField010(Integer alerField010) { this.alerField010 = alerField010; }

    public String getAlerField011() { return alerField011; }
    public void setAlerField011(String alerField011) { this.alerField011 = alerField011; }

    public Integer getAlerField012() { return alerField012; }
    public void setAlerField012(Integer alerField012) { this.alerField012 = alerField012; }

    public String getAlerField013() { return alerField013; }
    public void setAlerField013(String alerField013) { this.alerField013 = alerField013; }

    public Integer getAlerField014() { return alerField014; }
    public void setAlerField014(Integer alerField014) { this.alerField014 = alerField014; }

    public Double getAlerField015() { return alerField015; }
    public void setAlerField015(Double alerField015) { this.alerField015 = alerField015; }

    public Boolean getAlerField016() { return alerField016; }
    public void setAlerField016(Boolean alerField016) { this.alerField016 = alerField016; }

    public String getAlerField017() { return alerField017; }
    public void setAlerField017(String alerField017) { this.alerField017 = alerField017; }

    public Double getAlerField018() { return alerField018; }
    public void setAlerField018(Double alerField018) { this.alerField018 = alerField018; }

    @Override
    public String toString() {
        return "AlertDto059{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
