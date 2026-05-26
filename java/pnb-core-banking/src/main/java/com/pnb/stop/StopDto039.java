package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto039 — Data Transfer Object for stop operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto039 {

    @JsonProperty("stopField000")
    private Boolean stopField000;

    @JsonProperty("stopField001")
    private Boolean stopField001;

    @Size(max = 100)
    @JsonProperty("stopField002")
    private String stopField002;

    @JsonProperty("stopField003")
    private LocalDate stopField003;

    @JsonProperty("stopField004")
    private LocalDate stopField004;

    @JsonProperty("stopField005")
    private Integer stopField005;

    @JsonProperty("stopField006")
    private LocalDate stopField006;

    @JsonProperty("stopField007")
    private LocalDate stopField007;

    @Size(max = 200)
    @JsonProperty("stopField008")
    private String stopField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField009")
    private BigDecimal stopField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField010")
    private BigDecimal stopField010;

    public StopDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto039 instance = new StopDto039();

        public Builder stopField000(Boolean val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Boolean val) { instance.stopField001 = val; return this; }
        public Builder stopField002(String val) { instance.stopField002 = val; return this; }
        public Builder stopField003(LocalDate val) { instance.stopField003 = val; return this; }
        public Builder stopField004(LocalDate val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Integer val) { instance.stopField005 = val; return this; }
        public Builder stopField006(LocalDate val) { instance.stopField006 = val; return this; }
        public Builder stopField007(LocalDate val) { instance.stopField007 = val; return this; }
        public Builder stopField008(String val) { instance.stopField008 = val; return this; }
        public Builder stopField009(BigDecimal val) { instance.stopField009 = val; return this; }
        public Builder stopField010(BigDecimal val) { instance.stopField010 = val; return this; }
        public StopDto039 build() { return instance; }
    }

    public Boolean getStopField000() { return stopField000; }
    public void setStopField000(Boolean stopField000) { this.stopField000 = stopField000; }

    public Boolean getStopField001() { return stopField001; }
    public void setStopField001(Boolean stopField001) { this.stopField001 = stopField001; }

    public String getStopField002() { return stopField002; }
    public void setStopField002(String stopField002) { this.stopField002 = stopField002; }

    public LocalDate getStopField003() { return stopField003; }
    public void setStopField003(LocalDate stopField003) { this.stopField003 = stopField003; }

    public LocalDate getStopField004() { return stopField004; }
    public void setStopField004(LocalDate stopField004) { this.stopField004 = stopField004; }

    public Integer getStopField005() { return stopField005; }
    public void setStopField005(Integer stopField005) { this.stopField005 = stopField005; }

    public LocalDate getStopField006() { return stopField006; }
    public void setStopField006(LocalDate stopField006) { this.stopField006 = stopField006; }

    public LocalDate getStopField007() { return stopField007; }
    public void setStopField007(LocalDate stopField007) { this.stopField007 = stopField007; }

    public String getStopField008() { return stopField008; }
    public void setStopField008(String stopField008) { this.stopField008 = stopField008; }

    public BigDecimal getStopField009() { return stopField009; }
    public void setStopField009(BigDecimal stopField009) { this.stopField009 = stopField009; }

    public BigDecimal getStopField010() { return stopField010; }
    public void setStopField010(BigDecimal stopField010) { this.stopField010 = stopField010; }

    @Override
    public String toString() {
        return "StopDto039{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
