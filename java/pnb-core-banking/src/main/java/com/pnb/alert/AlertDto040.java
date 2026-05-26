package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto040 — Data Transfer Object for alert operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto040 {

    @JsonProperty("alerField000")
    private LocalDate alerField000;

    @JsonProperty("alerField001")
    private Double alerField001;

    @JsonProperty("alerField002")
    private LocalDate alerField002;

    @JsonProperty("alerField003")
    private Long alerField003;

    @JsonProperty("alerField004")
    private Boolean alerField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("alerField005")
    private BigDecimal alerField005;

    @JsonProperty("alerField006")
    private Boolean alerField006;

    @JsonProperty("alerField007")
    private LocalDate alerField007;

    @JsonProperty("alerField008")
    private Double alerField008;

    @JsonProperty("alerField009")
    private LocalDate alerField009;

    @Size(max = 20)
    @JsonProperty("alerField010")
    private String alerField010;

    @JsonProperty("alerField011")
    private Integer alerField011;

    public AlertDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto040 instance = new AlertDto040();

        public Builder alerField000(LocalDate val) { instance.alerField000 = val; return this; }
        public Builder alerField001(Double val) { instance.alerField001 = val; return this; }
        public Builder alerField002(LocalDate val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Long val) { instance.alerField003 = val; return this; }
        public Builder alerField004(Boolean val) { instance.alerField004 = val; return this; }
        public Builder alerField005(BigDecimal val) { instance.alerField005 = val; return this; }
        public Builder alerField006(Boolean val) { instance.alerField006 = val; return this; }
        public Builder alerField007(LocalDate val) { instance.alerField007 = val; return this; }
        public Builder alerField008(Double val) { instance.alerField008 = val; return this; }
        public Builder alerField009(LocalDate val) { instance.alerField009 = val; return this; }
        public Builder alerField010(String val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Integer val) { instance.alerField011 = val; return this; }
        public AlertDto040 build() { return instance; }
    }

    public LocalDate getAlerField000() { return alerField000; }
    public void setAlerField000(LocalDate alerField000) { this.alerField000 = alerField000; }

    public Double getAlerField001() { return alerField001; }
    public void setAlerField001(Double alerField001) { this.alerField001 = alerField001; }

    public LocalDate getAlerField002() { return alerField002; }
    public void setAlerField002(LocalDate alerField002) { this.alerField002 = alerField002; }

    public Long getAlerField003() { return alerField003; }
    public void setAlerField003(Long alerField003) { this.alerField003 = alerField003; }

    public Boolean getAlerField004() { return alerField004; }
    public void setAlerField004(Boolean alerField004) { this.alerField004 = alerField004; }

    public BigDecimal getAlerField005() { return alerField005; }
    public void setAlerField005(BigDecimal alerField005) { this.alerField005 = alerField005; }

    public Boolean getAlerField006() { return alerField006; }
    public void setAlerField006(Boolean alerField006) { this.alerField006 = alerField006; }

    public LocalDate getAlerField007() { return alerField007; }
    public void setAlerField007(LocalDate alerField007) { this.alerField007 = alerField007; }

    public Double getAlerField008() { return alerField008; }
    public void setAlerField008(Double alerField008) { this.alerField008 = alerField008; }

    public LocalDate getAlerField009() { return alerField009; }
    public void setAlerField009(LocalDate alerField009) { this.alerField009 = alerField009; }

    public String getAlerField010() { return alerField010; }
    public void setAlerField010(String alerField010) { this.alerField010 = alerField010; }

    public Integer getAlerField011() { return alerField011; }
    public void setAlerField011(Integer alerField011) { this.alerField011 = alerField011; }

    @Override
    public String toString() {
        return "AlertDto040{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
