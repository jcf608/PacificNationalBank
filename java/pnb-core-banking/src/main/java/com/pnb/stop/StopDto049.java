package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto049 — Data Transfer Object for stop operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto049 {

    @JsonProperty("stopField000")
    private Double stopField000;

    @JsonProperty("stopField001")
    private Integer stopField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField002")
    private BigDecimal stopField002;

    @JsonProperty("stopField003")
    private Integer stopField003;

    @JsonProperty("stopField004")
    private Boolean stopField004;

    @JsonProperty("stopField005")
    private LocalDate stopField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField006")
    private BigDecimal stopField006;

    @Size(max = 40)
    @JsonProperty("stopField007")
    private String stopField007;

    @JsonProperty("stopField008")
    private Integer stopField008;

    public StopDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto049 instance = new StopDto049();

        public Builder stopField000(Double val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Integer val) { instance.stopField001 = val; return this; }
        public Builder stopField002(BigDecimal val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Integer val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Boolean val) { instance.stopField004 = val; return this; }
        public Builder stopField005(LocalDate val) { instance.stopField005 = val; return this; }
        public Builder stopField006(BigDecimal val) { instance.stopField006 = val; return this; }
        public Builder stopField007(String val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Integer val) { instance.stopField008 = val; return this; }
        public StopDto049 build() { return instance; }
    }

    public Double getStopField000() { return stopField000; }
    public void setStopField000(Double stopField000) { this.stopField000 = stopField000; }

    public Integer getStopField001() { return stopField001; }
    public void setStopField001(Integer stopField001) { this.stopField001 = stopField001; }

    public BigDecimal getStopField002() { return stopField002; }
    public void setStopField002(BigDecimal stopField002) { this.stopField002 = stopField002; }

    public Integer getStopField003() { return stopField003; }
    public void setStopField003(Integer stopField003) { this.stopField003 = stopField003; }

    public Boolean getStopField004() { return stopField004; }
    public void setStopField004(Boolean stopField004) { this.stopField004 = stopField004; }

    public LocalDate getStopField005() { return stopField005; }
    public void setStopField005(LocalDate stopField005) { this.stopField005 = stopField005; }

    public BigDecimal getStopField006() { return stopField006; }
    public void setStopField006(BigDecimal stopField006) { this.stopField006 = stopField006; }

    public String getStopField007() { return stopField007; }
    public void setStopField007(String stopField007) { this.stopField007 = stopField007; }

    public Integer getStopField008() { return stopField008; }
    public void setStopField008(Integer stopField008) { this.stopField008 = stopField008; }

    @Override
    public String toString() {
        return "StopDto049{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
