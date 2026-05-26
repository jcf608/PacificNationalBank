package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto027 — Data Transfer Object for stop operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto027 {

    @JsonProperty("stopField000")
    private Long stopField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField001")
    private BigDecimal stopField001;

    @JsonProperty("stopField002")
    private Double stopField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField003")
    private BigDecimal stopField003;

    @JsonProperty("stopField004")
    private Double stopField004;

    @JsonProperty("stopField005")
    private Integer stopField005;

    @JsonProperty("stopField006")
    private Integer stopField006;

    @JsonProperty("stopField007")
    private Boolean stopField007;

    @JsonProperty("stopField008")
    private Long stopField008;

    @JsonProperty("stopField009")
    private Boolean stopField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField010")
    private BigDecimal stopField010;

    public StopDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto027 instance = new StopDto027();

        public Builder stopField000(Long val) { instance.stopField000 = val; return this; }
        public Builder stopField001(BigDecimal val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Double val) { instance.stopField002 = val; return this; }
        public Builder stopField003(BigDecimal val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Double val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Integer val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Integer val) { instance.stopField006 = val; return this; }
        public Builder stopField007(Boolean val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Long val) { instance.stopField008 = val; return this; }
        public Builder stopField009(Boolean val) { instance.stopField009 = val; return this; }
        public Builder stopField010(BigDecimal val) { instance.stopField010 = val; return this; }
        public StopDto027 build() { return instance; }
    }

    public Long getStopField000() { return stopField000; }
    public void setStopField000(Long stopField000) { this.stopField000 = stopField000; }

    public BigDecimal getStopField001() { return stopField001; }
    public void setStopField001(BigDecimal stopField001) { this.stopField001 = stopField001; }

    public Double getStopField002() { return stopField002; }
    public void setStopField002(Double stopField002) { this.stopField002 = stopField002; }

    public BigDecimal getStopField003() { return stopField003; }
    public void setStopField003(BigDecimal stopField003) { this.stopField003 = stopField003; }

    public Double getStopField004() { return stopField004; }
    public void setStopField004(Double stopField004) { this.stopField004 = stopField004; }

    public Integer getStopField005() { return stopField005; }
    public void setStopField005(Integer stopField005) { this.stopField005 = stopField005; }

    public Integer getStopField006() { return stopField006; }
    public void setStopField006(Integer stopField006) { this.stopField006 = stopField006; }

    public Boolean getStopField007() { return stopField007; }
    public void setStopField007(Boolean stopField007) { this.stopField007 = stopField007; }

    public Long getStopField008() { return stopField008; }
    public void setStopField008(Long stopField008) { this.stopField008 = stopField008; }

    public Boolean getStopField009() { return stopField009; }
    public void setStopField009(Boolean stopField009) { this.stopField009 = stopField009; }

    public BigDecimal getStopField010() { return stopField010; }
    public void setStopField010(BigDecimal stopField010) { this.stopField010 = stopField010; }

    @Override
    public String toString() {
        return "StopDto027{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
