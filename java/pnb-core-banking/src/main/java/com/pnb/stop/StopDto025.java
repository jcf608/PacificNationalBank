package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto025 — Data Transfer Object for stop operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto025 {

    @Size(max = 100)
    @JsonProperty("stopField000")
    private String stopField000;

    @JsonProperty("stopField001")
    private Long stopField001;

    @JsonProperty("stopField002")
    private Double stopField002;

    @Size(max = 100)
    @JsonProperty("stopField003")
    private String stopField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField004")
    private BigDecimal stopField004;

    @Size(max = 200)
    @JsonProperty("stopField005")
    private String stopField005;

    @JsonProperty("stopField006")
    private Integer stopField006;

    @JsonProperty("stopField007")
    private Double stopField007;

    @Size(max = 40)
    @JsonProperty("stopField008")
    private String stopField008;

    public StopDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto025 instance = new StopDto025();

        public Builder stopField000(String val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Long val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Double val) { instance.stopField002 = val; return this; }
        public Builder stopField003(String val) { instance.stopField003 = val; return this; }
        public Builder stopField004(BigDecimal val) { instance.stopField004 = val; return this; }
        public Builder stopField005(String val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Integer val) { instance.stopField006 = val; return this; }
        public Builder stopField007(Double val) { instance.stopField007 = val; return this; }
        public Builder stopField008(String val) { instance.stopField008 = val; return this; }
        public StopDto025 build() { return instance; }
    }

    public String getStopField000() { return stopField000; }
    public void setStopField000(String stopField000) { this.stopField000 = stopField000; }

    public Long getStopField001() { return stopField001; }
    public void setStopField001(Long stopField001) { this.stopField001 = stopField001; }

    public Double getStopField002() { return stopField002; }
    public void setStopField002(Double stopField002) { this.stopField002 = stopField002; }

    public String getStopField003() { return stopField003; }
    public void setStopField003(String stopField003) { this.stopField003 = stopField003; }

    public BigDecimal getStopField004() { return stopField004; }
    public void setStopField004(BigDecimal stopField004) { this.stopField004 = stopField004; }

    public String getStopField005() { return stopField005; }
    public void setStopField005(String stopField005) { this.stopField005 = stopField005; }

    public Integer getStopField006() { return stopField006; }
    public void setStopField006(Integer stopField006) { this.stopField006 = stopField006; }

    public Double getStopField007() { return stopField007; }
    public void setStopField007(Double stopField007) { this.stopField007 = stopField007; }

    public String getStopField008() { return stopField008; }
    public void setStopField008(String stopField008) { this.stopField008 = stopField008; }

    @Override
    public String toString() {
        return "StopDto025{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
