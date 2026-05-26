package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto023 — Data Transfer Object for alert operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto023 {

    @Size(max = 200)
    @JsonProperty("alerField000")
    private String alerField000;

    @Size(max = 20)
    @JsonProperty("alerField001")
    private String alerField001;

    @JsonProperty("alerField002")
    private LocalDate alerField002;

    @JsonProperty("alerField003")
    private Boolean alerField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField004")
    private BigDecimal alerField004;

    @JsonProperty("alerField005")
    private Boolean alerField005;

    @JsonProperty("alerField006")
    private LocalDate alerField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField007")
    private BigDecimal alerField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField008")
    private BigDecimal alerField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField009")
    private BigDecimal alerField009;

    @JsonProperty("alerField010")
    private Boolean alerField010;

    @Size(max = 200)
    @JsonProperty("alerField011")
    private String alerField011;

    @JsonProperty("alerField012")
    private Long alerField012;

    @JsonProperty("alerField013")
    private Boolean alerField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField014")
    private BigDecimal alerField014;

    @JsonProperty("alerField015")
    private Long alerField015;

    @JsonProperty("alerField016")
    private Long alerField016;

    @JsonProperty("alerField017")
    private Long alerField017;

    @Size(max = 100)
    @JsonProperty("alerField018")
    private String alerField018;

    public AlertDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto023 instance = new AlertDto023();

        public Builder alerField000(String val) { instance.alerField000 = val; return this; }
        public Builder alerField001(String val) { instance.alerField001 = val; return this; }
        public Builder alerField002(LocalDate val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Boolean val) { instance.alerField003 = val; return this; }
        public Builder alerField004(BigDecimal val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Boolean val) { instance.alerField005 = val; return this; }
        public Builder alerField006(LocalDate val) { instance.alerField006 = val; return this; }
        public Builder alerField007(BigDecimal val) { instance.alerField007 = val; return this; }
        public Builder alerField008(BigDecimal val) { instance.alerField008 = val; return this; }
        public Builder alerField009(BigDecimal val) { instance.alerField009 = val; return this; }
        public Builder alerField010(Boolean val) { instance.alerField010 = val; return this; }
        public Builder alerField011(String val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Long val) { instance.alerField012 = val; return this; }
        public Builder alerField013(Boolean val) { instance.alerField013 = val; return this; }
        public Builder alerField014(BigDecimal val) { instance.alerField014 = val; return this; }
        public Builder alerField015(Long val) { instance.alerField015 = val; return this; }
        public Builder alerField016(Long val) { instance.alerField016 = val; return this; }
        public Builder alerField017(Long val) { instance.alerField017 = val; return this; }
        public Builder alerField018(String val) { instance.alerField018 = val; return this; }
        public AlertDto023 build() { return instance; }
    }

    public String getAlerField000() { return alerField000; }
    public void setAlerField000(String alerField000) { this.alerField000 = alerField000; }

    public String getAlerField001() { return alerField001; }
    public void setAlerField001(String alerField001) { this.alerField001 = alerField001; }

    public LocalDate getAlerField002() { return alerField002; }
    public void setAlerField002(LocalDate alerField002) { this.alerField002 = alerField002; }

    public Boolean getAlerField003() { return alerField003; }
    public void setAlerField003(Boolean alerField003) { this.alerField003 = alerField003; }

    public BigDecimal getAlerField004() { return alerField004; }
    public void setAlerField004(BigDecimal alerField004) { this.alerField004 = alerField004; }

    public Boolean getAlerField005() { return alerField005; }
    public void setAlerField005(Boolean alerField005) { this.alerField005 = alerField005; }

    public LocalDate getAlerField006() { return alerField006; }
    public void setAlerField006(LocalDate alerField006) { this.alerField006 = alerField006; }

    public BigDecimal getAlerField007() { return alerField007; }
    public void setAlerField007(BigDecimal alerField007) { this.alerField007 = alerField007; }

    public BigDecimal getAlerField008() { return alerField008; }
    public void setAlerField008(BigDecimal alerField008) { this.alerField008 = alerField008; }

    public BigDecimal getAlerField009() { return alerField009; }
    public void setAlerField009(BigDecimal alerField009) { this.alerField009 = alerField009; }

    public Boolean getAlerField010() { return alerField010; }
    public void setAlerField010(Boolean alerField010) { this.alerField010 = alerField010; }

    public String getAlerField011() { return alerField011; }
    public void setAlerField011(String alerField011) { this.alerField011 = alerField011; }

    public Long getAlerField012() { return alerField012; }
    public void setAlerField012(Long alerField012) { this.alerField012 = alerField012; }

    public Boolean getAlerField013() { return alerField013; }
    public void setAlerField013(Boolean alerField013) { this.alerField013 = alerField013; }

    public BigDecimal getAlerField014() { return alerField014; }
    public void setAlerField014(BigDecimal alerField014) { this.alerField014 = alerField014; }

    public Long getAlerField015() { return alerField015; }
    public void setAlerField015(Long alerField015) { this.alerField015 = alerField015; }

    public Long getAlerField016() { return alerField016; }
    public void setAlerField016(Long alerField016) { this.alerField016 = alerField016; }

    public Long getAlerField017() { return alerField017; }
    public void setAlerField017(Long alerField017) { this.alerField017 = alerField017; }

    public String getAlerField018() { return alerField018; }
    public void setAlerField018(String alerField018) { this.alerField018 = alerField018; }

    @Override
    public String toString() {
        return "AlertDto023{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
