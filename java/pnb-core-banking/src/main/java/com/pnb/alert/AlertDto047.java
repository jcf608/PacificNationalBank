package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto047 — Data Transfer Object for alert operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto047 {

    @JsonProperty("alerField000")
    private Double alerField000;

    @JsonProperty("alerField001")
    private Integer alerField001;

    @JsonProperty("alerField002")
    private Integer alerField002;

    @JsonProperty("alerField003")
    private Integer alerField003;

    @JsonProperty("alerField004")
    private Double alerField004;

    @JsonProperty("alerField005")
    private LocalDate alerField005;

    @JsonProperty("alerField006")
    private Long alerField006;

    @JsonProperty("alerField007")
    private Double alerField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField008")
    private BigDecimal alerField008;

    @Size(max = 20)
    @JsonProperty("alerField009")
    private String alerField009;

    @JsonProperty("alerField010")
    private Long alerField010;

    @Size(max = 200)
    @JsonProperty("alerField011")
    private String alerField011;

    @JsonProperty("alerField012")
    private Long alerField012;

    @JsonProperty("alerField013")
    private Double alerField013;

    @JsonProperty("alerField014")
    private Double alerField014;

    @JsonProperty("alerField015")
    private LocalDate alerField015;

    @Size(max = 40)
    @JsonProperty("alerField016")
    private String alerField016;

    @JsonProperty("alerField017")
    private Long alerField017;

    @JsonProperty("alerField018")
    private Integer alerField018;

    public AlertDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto047 instance = new AlertDto047();

        public Builder alerField000(Double val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Integer val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Integer val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Integer val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Double val) { instance.alerField004 = val; return this; }
        public Builder alerField005(LocalDate val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Long val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Double val) { instance.alerField007 = val; return this; }
        public Builder alerField008(BigDecimal val) { instance.alerField008 = val; return this; }
        public Builder alerField009(String val) { instance.alerField009 = val; return this; }
        public Builder alerField010(Long val) { instance.alerField010 = val; return this; }
        public Builder alerField011(String val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Long val) { instance.alerField012 = val; return this; }
        public Builder alerField013(Double val) { instance.alerField013 = val; return this; }
        public Builder alerField014(Double val) { instance.alerField014 = val; return this; }
        public Builder alerField015(LocalDate val) { instance.alerField015 = val; return this; }
        public Builder alerField016(String val) { instance.alerField016 = val; return this; }
        public Builder alerField017(Long val) { instance.alerField017 = val; return this; }
        public Builder alerField018(Integer val) { instance.alerField018 = val; return this; }
        public AlertDto047 build() { return instance; }
    }

    public Double getAlerField000() { return alerField000; }
    public void setAlerField000(Double alerField000) { this.alerField000 = alerField000; }

    public Integer getAlerField001() { return alerField001; }
    public void setAlerField001(Integer alerField001) { this.alerField001 = alerField001; }

    public Integer getAlerField002() { return alerField002; }
    public void setAlerField002(Integer alerField002) { this.alerField002 = alerField002; }

    public Integer getAlerField003() { return alerField003; }
    public void setAlerField003(Integer alerField003) { this.alerField003 = alerField003; }

    public Double getAlerField004() { return alerField004; }
    public void setAlerField004(Double alerField004) { this.alerField004 = alerField004; }

    public LocalDate getAlerField005() { return alerField005; }
    public void setAlerField005(LocalDate alerField005) { this.alerField005 = alerField005; }

    public Long getAlerField006() { return alerField006; }
    public void setAlerField006(Long alerField006) { this.alerField006 = alerField006; }

    public Double getAlerField007() { return alerField007; }
    public void setAlerField007(Double alerField007) { this.alerField007 = alerField007; }

    public BigDecimal getAlerField008() { return alerField008; }
    public void setAlerField008(BigDecimal alerField008) { this.alerField008 = alerField008; }

    public String getAlerField009() { return alerField009; }
    public void setAlerField009(String alerField009) { this.alerField009 = alerField009; }

    public Long getAlerField010() { return alerField010; }
    public void setAlerField010(Long alerField010) { this.alerField010 = alerField010; }

    public String getAlerField011() { return alerField011; }
    public void setAlerField011(String alerField011) { this.alerField011 = alerField011; }

    public Long getAlerField012() { return alerField012; }
    public void setAlerField012(Long alerField012) { this.alerField012 = alerField012; }

    public Double getAlerField013() { return alerField013; }
    public void setAlerField013(Double alerField013) { this.alerField013 = alerField013; }

    public Double getAlerField014() { return alerField014; }
    public void setAlerField014(Double alerField014) { this.alerField014 = alerField014; }

    public LocalDate getAlerField015() { return alerField015; }
    public void setAlerField015(LocalDate alerField015) { this.alerField015 = alerField015; }

    public String getAlerField016() { return alerField016; }
    public void setAlerField016(String alerField016) { this.alerField016 = alerField016; }

    public Long getAlerField017() { return alerField017; }
    public void setAlerField017(Long alerField017) { this.alerField017 = alerField017; }

    public Integer getAlerField018() { return alerField018; }
    public void setAlerField018(Integer alerField018) { this.alerField018 = alerField018; }

    @Override
    public String toString() {
        return "AlertDto047{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
