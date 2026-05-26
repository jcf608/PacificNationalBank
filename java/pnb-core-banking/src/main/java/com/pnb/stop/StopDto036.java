package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto036 — Data Transfer Object for stop operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto036 {

    @JsonProperty("stopField000")
    private Double stopField000;

    @JsonProperty("stopField001")
    private Long stopField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField002")
    private BigDecimal stopField002;

    @JsonProperty("stopField003")
    private Boolean stopField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField004")
    private BigDecimal stopField004;

    @JsonProperty("stopField005")
    private Boolean stopField005;

    @JsonProperty("stopField006")
    private Boolean stopField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField007")
    private BigDecimal stopField007;

    public StopDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto036 instance = new StopDto036();

        public Builder stopField000(Double val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Long val) { instance.stopField001 = val; return this; }
        public Builder stopField002(BigDecimal val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Boolean val) { instance.stopField003 = val; return this; }
        public Builder stopField004(BigDecimal val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Boolean val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Boolean val) { instance.stopField006 = val; return this; }
        public Builder stopField007(BigDecimal val) { instance.stopField007 = val; return this; }
        public StopDto036 build() { return instance; }
    }

    public Double getStopField000() { return stopField000; }
    public void setStopField000(Double stopField000) { this.stopField000 = stopField000; }

    public Long getStopField001() { return stopField001; }
    public void setStopField001(Long stopField001) { this.stopField001 = stopField001; }

    public BigDecimal getStopField002() { return stopField002; }
    public void setStopField002(BigDecimal stopField002) { this.stopField002 = stopField002; }

    public Boolean getStopField003() { return stopField003; }
    public void setStopField003(Boolean stopField003) { this.stopField003 = stopField003; }

    public BigDecimal getStopField004() { return stopField004; }
    public void setStopField004(BigDecimal stopField004) { this.stopField004 = stopField004; }

    public Boolean getStopField005() { return stopField005; }
    public void setStopField005(Boolean stopField005) { this.stopField005 = stopField005; }

    public Boolean getStopField006() { return stopField006; }
    public void setStopField006(Boolean stopField006) { this.stopField006 = stopField006; }

    public BigDecimal getStopField007() { return stopField007; }
    public void setStopField007(BigDecimal stopField007) { this.stopField007 = stopField007; }

    @Override
    public String toString() {
        return "StopDto036{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
