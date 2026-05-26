package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto024 — Data Transfer Object for stop operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto024 {

    @Size(max = 40)
    @JsonProperty("stopField000")
    private String stopField000;

    @Size(max = 100)
    @JsonProperty("stopField001")
    private String stopField001;

    @JsonProperty("stopField002")
    private Double stopField002;

    @JsonProperty("stopField003")
    private LocalDate stopField003;

    @JsonProperty("stopField004")
    private Double stopField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField005")
    private BigDecimal stopField005;

    @JsonProperty("stopField006")
    private Integer stopField006;

    @JsonProperty("stopField007")
    private LocalDate stopField007;

    public StopDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto024 instance = new StopDto024();

        public Builder stopField000(String val) { instance.stopField000 = val; return this; }
        public Builder stopField001(String val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Double val) { instance.stopField002 = val; return this; }
        public Builder stopField003(LocalDate val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Double val) { instance.stopField004 = val; return this; }
        public Builder stopField005(BigDecimal val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Integer val) { instance.stopField006 = val; return this; }
        public Builder stopField007(LocalDate val) { instance.stopField007 = val; return this; }
        public StopDto024 build() { return instance; }
    }

    public String getStopField000() { return stopField000; }
    public void setStopField000(String stopField000) { this.stopField000 = stopField000; }

    public String getStopField001() { return stopField001; }
    public void setStopField001(String stopField001) { this.stopField001 = stopField001; }

    public Double getStopField002() { return stopField002; }
    public void setStopField002(Double stopField002) { this.stopField002 = stopField002; }

    public LocalDate getStopField003() { return stopField003; }
    public void setStopField003(LocalDate stopField003) { this.stopField003 = stopField003; }

    public Double getStopField004() { return stopField004; }
    public void setStopField004(Double stopField004) { this.stopField004 = stopField004; }

    public BigDecimal getStopField005() { return stopField005; }
    public void setStopField005(BigDecimal stopField005) { this.stopField005 = stopField005; }

    public Integer getStopField006() { return stopField006; }
    public void setStopField006(Integer stopField006) { this.stopField006 = stopField006; }

    public LocalDate getStopField007() { return stopField007; }
    public void setStopField007(LocalDate stopField007) { this.stopField007 = stopField007; }

    @Override
    public String toString() {
        return "StopDto024{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
