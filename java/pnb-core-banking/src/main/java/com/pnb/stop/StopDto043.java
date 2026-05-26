package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto043 — Data Transfer Object for stop operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto043 {

    @JsonProperty("stopField000")
    private Double stopField000;

    @JsonProperty("stopField001")
    private Long stopField001;

    @JsonProperty("stopField002")
    private Boolean stopField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField003")
    private BigDecimal stopField003;

    @JsonProperty("stopField004")
    private Long stopField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField005")
    private BigDecimal stopField005;

    @JsonProperty("stopField006")
    private Boolean stopField006;

    @JsonProperty("stopField007")
    private Integer stopField007;

    @JsonProperty("stopField008")
    private Double stopField008;

    @JsonProperty("stopField009")
    private Boolean stopField009;

    @Size(max = 100)
    @JsonProperty("stopField010")
    private String stopField010;

    @JsonProperty("stopField011")
    private LocalDate stopField011;

    @JsonProperty("stopField012")
    private Integer stopField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField013")
    private BigDecimal stopField013;

    @Size(max = 100)
    @JsonProperty("stopField014")
    private String stopField014;

    public StopDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto043 instance = new StopDto043();

        public Builder stopField000(Double val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Long val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Boolean val) { instance.stopField002 = val; return this; }
        public Builder stopField003(BigDecimal val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Long val) { instance.stopField004 = val; return this; }
        public Builder stopField005(BigDecimal val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Boolean val) { instance.stopField006 = val; return this; }
        public Builder stopField007(Integer val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Double val) { instance.stopField008 = val; return this; }
        public Builder stopField009(Boolean val) { instance.stopField009 = val; return this; }
        public Builder stopField010(String val) { instance.stopField010 = val; return this; }
        public Builder stopField011(LocalDate val) { instance.stopField011 = val; return this; }
        public Builder stopField012(Integer val) { instance.stopField012 = val; return this; }
        public Builder stopField013(BigDecimal val) { instance.stopField013 = val; return this; }
        public Builder stopField014(String val) { instance.stopField014 = val; return this; }
        public StopDto043 build() { return instance; }
    }

    public Double getStopField000() { return stopField000; }
    public void setStopField000(Double stopField000) { this.stopField000 = stopField000; }

    public Long getStopField001() { return stopField001; }
    public void setStopField001(Long stopField001) { this.stopField001 = stopField001; }

    public Boolean getStopField002() { return stopField002; }
    public void setStopField002(Boolean stopField002) { this.stopField002 = stopField002; }

    public BigDecimal getStopField003() { return stopField003; }
    public void setStopField003(BigDecimal stopField003) { this.stopField003 = stopField003; }

    public Long getStopField004() { return stopField004; }
    public void setStopField004(Long stopField004) { this.stopField004 = stopField004; }

    public BigDecimal getStopField005() { return stopField005; }
    public void setStopField005(BigDecimal stopField005) { this.stopField005 = stopField005; }

    public Boolean getStopField006() { return stopField006; }
    public void setStopField006(Boolean stopField006) { this.stopField006 = stopField006; }

    public Integer getStopField007() { return stopField007; }
    public void setStopField007(Integer stopField007) { this.stopField007 = stopField007; }

    public Double getStopField008() { return stopField008; }
    public void setStopField008(Double stopField008) { this.stopField008 = stopField008; }

    public Boolean getStopField009() { return stopField009; }
    public void setStopField009(Boolean stopField009) { this.stopField009 = stopField009; }

    public String getStopField010() { return stopField010; }
    public void setStopField010(String stopField010) { this.stopField010 = stopField010; }

    public LocalDate getStopField011() { return stopField011; }
    public void setStopField011(LocalDate stopField011) { this.stopField011 = stopField011; }

    public Integer getStopField012() { return stopField012; }
    public void setStopField012(Integer stopField012) { this.stopField012 = stopField012; }

    public BigDecimal getStopField013() { return stopField013; }
    public void setStopField013(BigDecimal stopField013) { this.stopField013 = stopField013; }

    public String getStopField014() { return stopField014; }
    public void setStopField014(String stopField014) { this.stopField014 = stopField014; }

    @Override
    public String toString() {
        return "StopDto043{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
