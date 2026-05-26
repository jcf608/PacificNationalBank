package com.pnb.alert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AlertDto053 — Data Transfer Object for alert operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertDto053 {

    @JsonProperty("alerField000")
    private Double alerField000;

    @Size(max = 40)
    @JsonProperty("alerField001")
    private String alerField001;

    @JsonProperty("alerField002")
    private Integer alerField002;

    @JsonProperty("alerField003")
    private Integer alerField003;

    @Size(max = 40)
    @JsonProperty("alerField004")
    private String alerField004;

    @JsonProperty("alerField005")
    private Double alerField005;

    @JsonProperty("alerField006")
    private LocalDate alerField006;

    @JsonProperty("alerField007")
    private LocalDate alerField007;

    @Size(max = 20)
    @JsonProperty("alerField008")
    private String alerField008;

    @JsonProperty("alerField009")
    private LocalDate alerField009;

    @JsonProperty("alerField010")
    private Double alerField010;

    @JsonProperty("alerField011")
    private Long alerField011;

    @JsonProperty("alerField012")
    private Boolean alerField012;

    public AlertDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AlertDto053 instance = new AlertDto053();

        public Builder alerField000(Double val) { instance.alerField000 = val; return this; }
        public Builder alerField001(String val) { instance.alerField001 = val; return this; }
        public Builder alerField002(Integer val) { instance.alerField002 = val; return this; }
        public Builder alerField003(Integer val) { instance.alerField003 = val; return this; }
        public Builder alerField004(String val) { instance.alerField004 = val; return this; }
        public Builder alerField005(Double val) { instance.alerField005 = val; return this; }
        public Builder alerField006(LocalDate val) { instance.alerField006 = val; return this; }
        public Builder alerField007(LocalDate val) { instance.alerField007 = val; return this; }
        public Builder alerField008(String val) { instance.alerField008 = val; return this; }
        public Builder alerField009(LocalDate val) { instance.alerField009 = val; return this; }
        public Builder alerField010(Double val) { instance.alerField010 = val; return this; }
        public Builder alerField011(Long val) { instance.alerField011 = val; return this; }
        public Builder alerField012(Boolean val) { instance.alerField012 = val; return this; }
        public AlertDto053 build() { return instance; }
    }

    public Double getAlerField000() { return alerField000; }
    public void setAlerField000(Double alerField000) { this.alerField000 = alerField000; }

    public String getAlerField001() { return alerField001; }
    public void setAlerField001(String alerField001) { this.alerField001 = alerField001; }

    public Integer getAlerField002() { return alerField002; }
    public void setAlerField002(Integer alerField002) { this.alerField002 = alerField002; }

    public Integer getAlerField003() { return alerField003; }
    public void setAlerField003(Integer alerField003) { this.alerField003 = alerField003; }

    public String getAlerField004() { return alerField004; }
    public void setAlerField004(String alerField004) { this.alerField004 = alerField004; }

    public Double getAlerField005() { return alerField005; }
    public void setAlerField005(Double alerField005) { this.alerField005 = alerField005; }

    public LocalDate getAlerField006() { return alerField006; }
    public void setAlerField006(LocalDate alerField006) { this.alerField006 = alerField006; }

    public LocalDate getAlerField007() { return alerField007; }
    public void setAlerField007(LocalDate alerField007) { this.alerField007 = alerField007; }

    public String getAlerField008() { return alerField008; }
    public void setAlerField008(String alerField008) { this.alerField008 = alerField008; }

    public LocalDate getAlerField009() { return alerField009; }
    public void setAlerField009(LocalDate alerField009) { this.alerField009 = alerField009; }

    public Double getAlerField010() { return alerField010; }
    public void setAlerField010(Double alerField010) { this.alerField010 = alerField010; }

    public Long getAlerField011() { return alerField011; }
    public void setAlerField011(Long alerField011) { this.alerField011 = alerField011; }

    public Boolean getAlerField012() { return alerField012; }
    public void setAlerField012(Boolean alerField012) { this.alerField012 = alerField012; }

    @Override
    public String toString() {
        return "AlertDto053{" +
            "alerField000=" + alerField000 + ", " +
            "alerField001=" + alerField001 + ", " +
            "alerField002=" + alerField002 + ", " +
            "alerField003=" + alerField003 + ", " +
            "alerField004=" + alerField004 + ", " +
            "}";
    }
}
