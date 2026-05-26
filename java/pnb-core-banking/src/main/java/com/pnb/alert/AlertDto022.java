package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto022 — Data Transfer Object for alert operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto022 {

    @Size(max = 200)
    @JsonProperty("alerField000")
    private String alerField000;

    @JsonProperty("alerField001")
    private Double alerField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField002")
    private BigDecimal alerField002;

    @Size(max = 200)
    @JsonProperty("alerField003")
    private String alerField003;

    @JsonProperty("alerField004")
    private Double alerField004;

    @JsonProperty("alerField005")
    private Long alerField005;

    @JsonProperty("alerField006")
    private LocalDate alerField006;

    @JsonProperty("alerField007")
    private LocalDate alerField007;

    @Size(max = 200)
    @JsonProperty("alerField008")
    private String alerField008;

    @JsonProperty("alerField009")
    private Long alerField009;

    @JsonProperty("alerField010")
    private LocalDate alerField010;

    @JsonProperty("alerField011")
    private Integer alerField011;

    @JsonProperty("alerField012")
    private Double alerField012;

    @JsonProperty("alerField013")
    private LocalDate alerField013;

    @JsonProperty("alerField014")
    private Boolean alerField014;

    @Size(max = 200)
    @JsonProperty("alerField015")
    private String alerField015;

    @Size(max = 60)
    @JsonProperty("alerField016")
    private String alerField016;

    @Size(max = 60)
    @JsonProperty("alerField017")
    private String alerField017;

    public AlertDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto022 instance = new AlertDto022();

        public Builder alerField000(String val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Double val) { instance.alerField001 = val; return this; }
        public Builder alerField002(BigDecimal val) { instance.alerField002 = val; return this; }
        public Builder alerField003(String val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Double val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Long val) { instance.alerField005 = val; return this; }
        public Builder alerField006(LocalDate val) { instance.alerField006 = val; return this; }
        public Builder alerField007(LocalDate val) { instance.alerField007 = val; return this; }
        public Builder alerField008(String val) { instance.alerField008 = val; return this; }
        public Builder alerField009(Long val) { instance.alerField009 = val; return this; }
        public Builder alerField010(LocalDate val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Integer val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Double val) { instance.alerField012 = val; return this; }
        public Builder alerField013(LocalDate val) { instance.alerField013 = val; return this; }
        public Builder alerField014(Boolean val) { instance.alerField014 = val; return this; }
        public Builder alerField015(String val) { instance.alerField015 = val; return this; }
        public Builder alerField016(String val) { instance.alerField016 = val; return this; }
        public Builder alerField017(String val) { instance.alerField017 = val; return this; }
        public AlertDto022 build() { return instance; }
    }

    public String getAlerField000() { return alerField000; }
    public void setAlerField000(String alerField000) { this.alerField000 = alerField000; }

    public Double getAlerField001() { return alerField001; }
    public void setAlerField001(Double alerField001) { this.alerField001 = alerField001; }

    public BigDecimal getAlerField002() { return alerField002; }
    public void setAlerField002(BigDecimal alerField002) { this.alerField002 = alerField002; }

    public String getAlerField003() { return alerField003; }
    public void setAlerField003(String alerField003) { this.alerField003 = alerField003; }

    public Double getAlerField004() { return alerField004; }
    public void setAlerField004(Double alerField004) { this.alerField004 = alerField004; }

    public Long getAlerField005() { return alerField005; }
    public void setAlerField005(Long alerField005) { this.alerField005 = alerField005; }

    public LocalDate getAlerField006() { return alerField006; }
    public void setAlerField006(LocalDate alerField006) { this.alerField006 = alerField006; }

    public LocalDate getAlerField007() { return alerField007; }
    public void setAlerField007(LocalDate alerField007) { this.alerField007 = alerField007; }

    public String getAlerField008() { return alerField008; }
    public void setAlerField008(String alerField008) { this.alerField008 = alerField008; }

    public Long getAlerField009() { return alerField009; }
    public void setAlerField009(Long alerField009) { this.alerField009 = alerField009; }

    public LocalDate getAlerField010() { return alerField010; }
    public void setAlerField010(LocalDate alerField010) { this.alerField010 = alerField010; }

    public Integer getAlerField011() { return alerField011; }
    public void setAlerField011(Integer alerField011) { this.alerField011 = alerField011; }

    public Double getAlerField012() { return alerField012; }
    public void setAlerField012(Double alerField012) { this.alerField012 = alerField012; }

    public LocalDate getAlerField013() { return alerField013; }
    public void setAlerField013(LocalDate alerField013) { this.alerField013 = alerField013; }

    public Boolean getAlerField014() { return alerField014; }
    public void setAlerField014(Boolean alerField014) { this.alerField014 = alerField014; }

    public String getAlerField015() { return alerField015; }
    public void setAlerField015(String alerField015) { this.alerField015 = alerField015; }

    public String getAlerField016() { return alerField016; }
    public void setAlerField016(String alerField016) { this.alerField016 = alerField016; }

    public String getAlerField017() { return alerField017; }
    public void setAlerField017(String alerField017) { this.alerField017 = alerField017; }

    @Override
    public String toString() {
        return "AlertDto022{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
