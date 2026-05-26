package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto033 — Data Transfer Object for alert operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto033 {

    @JsonProperty("alerField000")
    private Double alerField000;

    @Size(max = 60)
    @JsonProperty("alerField001")
    private String alerField001;

    @JsonProperty("alerField002")
    private LocalDate alerField002;

    @Size(max = 60)
    @JsonProperty("alerField003")
    private String alerField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField004")
    private BigDecimal alerField004;

    @Size(max = 20)
    @JsonProperty("alerField005")
    private String alerField005;

    @Size(max = 200)
    @JsonProperty("alerField006")
    private String alerField006;

    @JsonProperty("alerField007")
    private Integer alerField007;

    @JsonProperty("alerField008")
    private Double alerField008;

    @Size(max = 100)
    @JsonProperty("alerField009")
    private String alerField009;

    @JsonProperty("alerField010")
    private LocalDate alerField010;

    @JsonProperty("alerField011")
    private Integer alerField011;

    @JsonProperty("alerField012")
    private Double alerField012;

    @JsonProperty("alerField013")
    private Long alerField013;

    @JsonProperty("alerField014")
    private Integer alerField014;

    @JsonProperty("alerField015")
    private Long alerField015;

    @JsonProperty("alerField016")
    private Boolean alerField016;

    public AlertDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto033 instance = new AlertDto033();

        public Builder alerField000(Double val) { instance.alerField000 = val; return this; }
        public Builder alerField001(String val) { instance.alerField001 = val; return this; }
        public Builder alerField002(LocalDate val) { instance.alerField002 = val; return this; }
        public Builder alerField003(String val) { instance.alerField003 = val; return this; }
        public Builder alerField004(BigDecimal val) { instance.alerField004 = val; return this; }
        public Builder alerField005(String val) { instance.alerField005 = val; return this; }
        public Builder alerField006(String val) { instance.alerField006 = val; return this; }
        public Builder alerField007(Integer val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Double val) { instance.alerField008 = val; return this; }
        public Builder alerField009(String val) { instance.alerField009 = val; return this; }
        public Builder alerField010(LocalDate val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Integer val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Double val) { instance.alerField012 = val; return this; }
        public Builder alerField013(Long val) { instance.alerField013 = val; return this; }
        public Builder alerField014(Integer val) { instance.alerField014 = val; return this; }
        public Builder alerField015(Long val) { instance.alerField015 = val; return this; }
        public Builder alerField016(Boolean val) { instance.alerField016 = val; return this; }
        public AlertDto033 build() { return instance; }
    }

    public Double getAlerField000() { return alerField000; }
    public void setAlerField000(Double alerField000) { this.alerField000 = alerField000; }

    public String getAlerField001() { return alerField001; }
    public void setAlerField001(String alerField001) { this.alerField001 = alerField001; }

    public LocalDate getAlerField002() { return alerField002; }
    public void setAlerField002(LocalDate alerField002) { this.alerField002 = alerField002; }

    public String getAlerField003() { return alerField003; }
    public void setAlerField003(String alerField003) { this.alerField003 = alerField003; }

    public BigDecimal getAlerField004() { return alerField004; }
    public void setAlerField004(BigDecimal alerField004) { this.alerField004 = alerField004; }

    public String getAlerField005() { return alerField005; }
    public void setAlerField005(String alerField005) { this.alerField005 = alerField005; }

    public String getAlerField006() { return alerField006; }
    public void setAlerField006(String alerField006) { this.alerField006 = alerField006; }

    public Integer getAlerField007() { return alerField007; }
    public void setAlerField007(Integer alerField007) { this.alerField007 = alerField007; }

    public Double getAlerField008() { return alerField008; }
    public void setAlerField008(Double alerField008) { this.alerField008 = alerField008; }

    public String getAlerField009() { return alerField009; }
    public void setAlerField009(String alerField009) { this.alerField009 = alerField009; }

    public LocalDate getAlerField010() { return alerField010; }
    public void setAlerField010(LocalDate alerField010) { this.alerField010 = alerField010; }

    public Integer getAlerField011() { return alerField011; }
    public void setAlerField011(Integer alerField011) { this.alerField011 = alerField011; }

    public Double getAlerField012() { return alerField012; }
    public void setAlerField012(Double alerField012) { this.alerField012 = alerField012; }

    public Long getAlerField013() { return alerField013; }
    public void setAlerField013(Long alerField013) { this.alerField013 = alerField013; }

    public Integer getAlerField014() { return alerField014; }
    public void setAlerField014(Integer alerField014) { this.alerField014 = alerField014; }

    public Long getAlerField015() { return alerField015; }
    public void setAlerField015(Long alerField015) { this.alerField015 = alerField015; }

    public Boolean getAlerField016() { return alerField016; }
    public void setAlerField016(Boolean alerField016) { this.alerField016 = alerField016; }

    @Override
    public String toString() {
        return "AlertDto033{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
