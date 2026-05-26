package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto050 — Data Transfer Object for stop operations.
 * Variant 50 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto050 {

    @JsonProperty("stopField000")
    private Integer stopField000;

    @JsonProperty("stopField001")
    private Integer stopField001;

    @JsonProperty("stopField002")
    private LocalDate stopField002;

    @Size(max = 40)
    @JsonProperty("stopField003")
    private String stopField003;

    @JsonProperty("stopField004")
    private Boolean stopField004;

    @JsonProperty("stopField005")
    private Integer stopField005;

    @JsonProperty("stopField006")
    private Long stopField006;

    @Size(max = 200)
    @JsonProperty("stopField007")
    private String stopField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField008")
    private BigDecimal stopField008;

    @Size(max = 40)
    @JsonProperty("stopField009")
    private String stopField009;

    public StopDto050() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto050 instance = new StopDto050();

        public Builder stopField000(Integer val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Integer val) { instance.stopField001 = val; return this; }
        public Builder stopField002(LocalDate val) { instance.stopField002 = val; return this; }
        public Builder stopField003(String val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Boolean val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Integer val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Long val) { instance.stopField006 = val; return this; }
        public Builder stopField007(String val) { instance.stopField007 = val; return this; }
        public Builder stopField008(BigDecimal val) { instance.stopField008 = val; return this; }
        public Builder stopField009(String val) { instance.stopField009 = val; return this; }
        public StopDto050 build() { return instance; }
    }

    public Integer getStopField000() { return stopField000; }
    public void setStopField000(Integer stopField000) { this.stopField000 = stopField000; }

    public Integer getStopField001() { return stopField001; }
    public void setStopField001(Integer stopField001) { this.stopField001 = stopField001; }

    public LocalDate getStopField002() { return stopField002; }
    public void setStopField002(LocalDate stopField002) { this.stopField002 = stopField002; }

    public String getStopField003() { return stopField003; }
    public void setStopField003(String stopField003) { this.stopField003 = stopField003; }

    public Boolean getStopField004() { return stopField004; }
    public void setStopField004(Boolean stopField004) { this.stopField004 = stopField004; }

    public Integer getStopField005() { return stopField005; }
    public void setStopField005(Integer stopField005) { this.stopField005 = stopField005; }

    public Long getStopField006() { return stopField006; }
    public void setStopField006(Long stopField006) { this.stopField006 = stopField006; }

    public String getStopField007() { return stopField007; }
    public void setStopField007(String stopField007) { this.stopField007 = stopField007; }

    public BigDecimal getStopField008() { return stopField008; }
    public void setStopField008(BigDecimal stopField008) { this.stopField008 = stopField008; }

    public String getStopField009() { return stopField009; }
    public void setStopField009(String stopField009) { this.stopField009 = stopField009; }

    @Override
    public String toString() {
        return "StopDto050{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
