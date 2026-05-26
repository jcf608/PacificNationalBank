package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto037 — Data Transfer Object for stop operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto037 {

    @JsonProperty("stopField000")
    private Double stopField000;

    @JsonProperty("stopField001")
    private Double stopField001;

    @JsonProperty("stopField002")
    private Boolean stopField002;

    @JsonProperty("stopField003")
    private Long stopField003;

    @JsonProperty("stopField004")
    private Boolean stopField004;

    @JsonProperty("stopField005")
    private Long stopField005;

    @Size(max = 40)
    @JsonProperty("stopField006")
    private String stopField006;

    @JsonProperty("stopField007")
    private LocalDate stopField007;

    @JsonProperty("stopField008")
    private Boolean stopField008;

    public StopDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto037 instance = new StopDto037();

        public Builder stopField000(Double val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Double val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Boolean val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Long val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Boolean val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Long val) { instance.stopField005 = val; return this; }
        public Builder stopField006(String val) { instance.stopField006 = val; return this; }
        public Builder stopField007(LocalDate val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Boolean val) { instance.stopField008 = val; return this; }
        public StopDto037 build() { return instance; }
    }

    public Double getStopField000() { return stopField000; }
    public void setStopField000(Double stopField000) { this.stopField000 = stopField000; }

    public Double getStopField001() { return stopField001; }
    public void setStopField001(Double stopField001) { this.stopField001 = stopField001; }

    public Boolean getStopField002() { return stopField002; }
    public void setStopField002(Boolean stopField002) { this.stopField002 = stopField002; }

    public Long getStopField003() { return stopField003; }
    public void setStopField003(Long stopField003) { this.stopField003 = stopField003; }

    public Boolean getStopField004() { return stopField004; }
    public void setStopField004(Boolean stopField004) { this.stopField004 = stopField004; }

    public Long getStopField005() { return stopField005; }
    public void setStopField005(Long stopField005) { this.stopField005 = stopField005; }

    public String getStopField006() { return stopField006; }
    public void setStopField006(String stopField006) { this.stopField006 = stopField006; }

    public LocalDate getStopField007() { return stopField007; }
    public void setStopField007(LocalDate stopField007) { this.stopField007 = stopField007; }

    public Boolean getStopField008() { return stopField008; }
    public void setStopField008(Boolean stopField008) { this.stopField008 = stopField008; }

    @Override
    public String toString() {
        return "StopDto037{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
