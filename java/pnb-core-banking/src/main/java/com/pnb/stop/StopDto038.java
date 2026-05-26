package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto038 — Data Transfer Object for stop operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto038 {

    @JsonProperty("stopField000")
    private LocalDate stopField000;

    @JsonProperty("stopField001")
    private Integer stopField001;

    @JsonProperty("stopField002")
    private Boolean stopField002;

    @JsonProperty("stopField003")
    private Long stopField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField004")
    private BigDecimal stopField004;

    @JsonProperty("stopField005")
    private Boolean stopField005;

    @JsonProperty("stopField006")
    private Boolean stopField006;

    @JsonProperty("stopField007")
    private Boolean stopField007;

    @JsonProperty("stopField008")
    private Double stopField008;

    @JsonProperty("stopField009")
    private LocalDate stopField009;

    public StopDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto038 instance = new StopDto038();

        public Builder stopField000(LocalDate val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Integer val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Boolean val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Long val) { instance.stopField003 = val; return this; }
        public Builder stopField004(BigDecimal val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Boolean val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Boolean val) { instance.stopField006 = val; return this; }
        public Builder stopField007(Boolean val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Double val) { instance.stopField008 = val; return this; }
        public Builder stopField009(LocalDate val) { instance.stopField009 = val; return this; }
        public StopDto038 build() { return instance; }
    }

    public LocalDate getStopField000() { return stopField000; }
    public void setStopField000(LocalDate stopField000) { this.stopField000 = stopField000; }

    public Integer getStopField001() { return stopField001; }
    public void setStopField001(Integer stopField001) { this.stopField001 = stopField001; }

    public Boolean getStopField002() { return stopField002; }
    public void setStopField002(Boolean stopField002) { this.stopField002 = stopField002; }

    public Long getStopField003() { return stopField003; }
    public void setStopField003(Long stopField003) { this.stopField003 = stopField003; }

    public BigDecimal getStopField004() { return stopField004; }
    public void setStopField004(BigDecimal stopField004) { this.stopField004 = stopField004; }

    public Boolean getStopField005() { return stopField005; }
    public void setStopField005(Boolean stopField005) { this.stopField005 = stopField005; }

    public Boolean getStopField006() { return stopField006; }
    public void setStopField006(Boolean stopField006) { this.stopField006 = stopField006; }

    public Boolean getStopField007() { return stopField007; }
    public void setStopField007(Boolean stopField007) { this.stopField007 = stopField007; }

    public Double getStopField008() { return stopField008; }
    public void setStopField008(Double stopField008) { this.stopField008 = stopField008; }

    public LocalDate getStopField009() { return stopField009; }
    public void setStopField009(LocalDate stopField009) { this.stopField009 = stopField009; }

    @Override
    public String toString() {
        return "StopDto038{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
