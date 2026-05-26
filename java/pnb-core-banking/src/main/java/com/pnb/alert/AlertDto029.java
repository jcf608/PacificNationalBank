package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto029 — Data Transfer Object for alert operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto029 {

    @Size(max = 40)
    @JsonProperty("alerField000")
    private String alerField000;

    @JsonProperty("alerField001")
    private Long alerField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField002")
    private BigDecimal alerField002;

    @JsonProperty("alerField003")
    private LocalDate alerField003;

    @JsonProperty("alerField004")
    private Boolean alerField004;

    @Size(max = 100)
    @JsonProperty("alerField005")
    private String alerField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField006")
    private BigDecimal alerField006;

    @JsonProperty("alerField007")
    private LocalDate alerField007;

    @JsonProperty("alerField008")
    private Integer alerField008;

    @JsonProperty("alerField009")
    private LocalDate alerField009;

    @JsonProperty("alerField010")
    private LocalDate alerField010;

    @JsonProperty("alerField011")
    private Double alerField011;

    @JsonProperty("alerField012")
    private Double alerField012;

    public AlertDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto029 instance = new AlertDto029();

        public Builder alerField000(String val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Long val) { instance.alerField001 = val; return this; }
        public Builder alerField002(BigDecimal val) { instance.alerField002 = val; return this; }
        public Builder alerField003(LocalDate val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Boolean val) { instance.alerField004 = val; return this; }
        public Builder alerField005(String val) { instance.alerField005 = val; return this; }
        public Builder alerField006(BigDecimal val) { instance.alerField006 = val; return this; }
        public Builder alerField007(LocalDate val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Integer val) { instance.alerField008 = val; return this; }
        public Builder alerField009(LocalDate val) { instance.alerField009 = val; return this; }
        public Builder alerField010(LocalDate val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Double val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Double val) { instance.alerField012 = val; return this; }
        public AlertDto029 build() { return instance; }
    }

    public String getAlerField000() { return alerField000; }
    public void setAlerField000(String alerField000) { this.alerField000 = alerField000; }

    public Long getAlerField001() { return alerField001; }
    public void setAlerField001(Long alerField001) { this.alerField001 = alerField001; }

    public BigDecimal getAlerField002() { return alerField002; }
    public void setAlerField002(BigDecimal alerField002) { this.alerField002 = alerField002; }

    public LocalDate getAlerField003() { return alerField003; }
    public void setAlerField003(LocalDate alerField003) { this.alerField003 = alerField003; }

    public Boolean getAlerField004() { return alerField004; }
    public void setAlerField004(Boolean alerField004) { this.alerField004 = alerField004; }

    public String getAlerField005() { return alerField005; }
    public void setAlerField005(String alerField005) { this.alerField005 = alerField005; }

    public BigDecimal getAlerField006() { return alerField006; }
    public void setAlerField006(BigDecimal alerField006) { this.alerField006 = alerField006; }

    public LocalDate getAlerField007() { return alerField007; }
    public void setAlerField007(LocalDate alerField007) { this.alerField007 = alerField007; }

    public Integer getAlerField008() { return alerField008; }
    public void setAlerField008(Integer alerField008) { this.alerField008 = alerField008; }

    public LocalDate getAlerField009() { return alerField009; }
    public void setAlerField009(LocalDate alerField009) { this.alerField009 = alerField009; }

    public LocalDate getAlerField010() { return alerField010; }
    public void setAlerField010(LocalDate alerField010) { this.alerField010 = alerField010; }

    public Double getAlerField011() { return alerField011; }
    public void setAlerField011(Double alerField011) { this.alerField011 = alerField011; }

    public Double getAlerField012() { return alerField012; }
    public void setAlerField012(Double alerField012) { this.alerField012 = alerField012; }

    @Override
    public String toString() {
        return "AlertDto029{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
