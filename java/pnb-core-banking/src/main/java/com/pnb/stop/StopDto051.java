package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto051 — Data Transfer Object for stop operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto051 {

    @JsonProperty("stopField000")
    private LocalDate stopField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField001")
    private BigDecimal stopField001;

    @JsonProperty("stopField002")
    private Long stopField002;

    @JsonProperty("stopField003")
    private Boolean stopField003;

    @JsonProperty("stopField004")
    private Double stopField004;

    @Size(max = 60)
    @JsonProperty("stopField005")
    private String stopField005;

    @JsonProperty("stopField006")
    private Integer stopField006;

    @JsonProperty("stopField007")
    private Boolean stopField007;

    @JsonProperty("stopField008")
    private Double stopField008;

    @JsonProperty("stopField009")
    private Integer stopField009;

    @JsonProperty("stopField010")
    private Double stopField010;

    public StopDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto051 instance = new StopDto051();

        public Builder stopField000(LocalDate val) { instance.stopField000 = val; return this; }
        public Builder stopField001(BigDecimal val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Long val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Boolean val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Double val) { instance.stopField004 = val; return this; }
        public Builder stopField005(String val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Integer val) { instance.stopField006 = val; return this; }
        public Builder stopField007(Boolean val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Double val) { instance.stopField008 = val; return this; }
        public Builder stopField009(Integer val) { instance.stopField009 = val; return this; }
        public Builder stopField010(Double val) { instance.stopField010 = val; return this; }
        public StopDto051 build() { return instance; }
    }

    public LocalDate getStopField000() { return stopField000; }
    public void setStopField000(LocalDate stopField000) { this.stopField000 = stopField000; }

    public BigDecimal getStopField001() { return stopField001; }
    public void setStopField001(BigDecimal stopField001) { this.stopField001 = stopField001; }

    public Long getStopField002() { return stopField002; }
    public void setStopField002(Long stopField002) { this.stopField002 = stopField002; }

    public Boolean getStopField003() { return stopField003; }
    public void setStopField003(Boolean stopField003) { this.stopField003 = stopField003; }

    public Double getStopField004() { return stopField004; }
    public void setStopField004(Double stopField004) { this.stopField004 = stopField004; }

    public String getStopField005() { return stopField005; }
    public void setStopField005(String stopField005) { this.stopField005 = stopField005; }

    public Integer getStopField006() { return stopField006; }
    public void setStopField006(Integer stopField006) { this.stopField006 = stopField006; }

    public Boolean getStopField007() { return stopField007; }
    public void setStopField007(Boolean stopField007) { this.stopField007 = stopField007; }

    public Double getStopField008() { return stopField008; }
    public void setStopField008(Double stopField008) { this.stopField008 = stopField008; }

    public Integer getStopField009() { return stopField009; }
    public void setStopField009(Integer stopField009) { this.stopField009 = stopField009; }

    public Double getStopField010() { return stopField010; }
    public void setStopField010(Double stopField010) { this.stopField010 = stopField010; }

    @Override
    public String toString() {
        return "StopDto051{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
