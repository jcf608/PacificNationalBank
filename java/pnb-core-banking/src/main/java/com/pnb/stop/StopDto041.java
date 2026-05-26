package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto041 — Data Transfer Object for stop operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto041 {

    @JsonProperty("stopField000")
    private Double stopField000;

    @Size(max = 60)
    @JsonProperty("stopField001")
    private String stopField001;

    @JsonProperty("stopField002")
    private Integer stopField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField003")
    private BigDecimal stopField003;

    @Size(max = 40)
    @JsonProperty("stopField004")
    private String stopField004;

    @JsonProperty("stopField005")
    private Integer stopField005;

    @JsonProperty("stopField006")
    private Integer stopField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField007")
    private BigDecimal stopField007;

    @JsonProperty("stopField008")
    private Integer stopField008;

    @JsonProperty("stopField009")
    private LocalDate stopField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField010")
    private BigDecimal stopField010;

    @JsonProperty("stopField011")
    private Double stopField011;

    @Size(max = 100)
    @JsonProperty("stopField012")
    private String stopField012;

    public StopDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto041 instance = new StopDto041();

        public Builder stopField000(Double val) { instance.stopField000 = val; return this; }
        public Builder stopField001(String val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Integer val) { instance.stopField002 = val; return this; }
        public Builder stopField003(BigDecimal val) { instance.stopField003 = val; return this; }
        public Builder stopField004(String val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Integer val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Integer val) { instance.stopField006 = val; return this; }
        public Builder stopField007(BigDecimal val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Integer val) { instance.stopField008 = val; return this; }
        public Builder stopField009(LocalDate val) { instance.stopField009 = val; return this; }
        public Builder stopField010(BigDecimal val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Double val) { instance.stopField011 = val; return this; }
        public Builder stopField012(String val) { instance.stopField012 = val; return this; }
        public StopDto041 build() { return instance; }
    }

    public Double getStopField000() { return stopField000; }
    public void setStopField000(Double stopField000) { this.stopField000 = stopField000; }

    public String getStopField001() { return stopField001; }
    public void setStopField001(String stopField001) { this.stopField001 = stopField001; }

    public Integer getStopField002() { return stopField002; }
    public void setStopField002(Integer stopField002) { this.stopField002 = stopField002; }

    public BigDecimal getStopField003() { return stopField003; }
    public void setStopField003(BigDecimal stopField003) { this.stopField003 = stopField003; }

    public String getStopField004() { return stopField004; }
    public void setStopField004(String stopField004) { this.stopField004 = stopField004; }

    public Integer getStopField005() { return stopField005; }
    public void setStopField005(Integer stopField005) { this.stopField005 = stopField005; }

    public Integer getStopField006() { return stopField006; }
    public void setStopField006(Integer stopField006) { this.stopField006 = stopField006; }

    public BigDecimal getStopField007() { return stopField007; }
    public void setStopField007(BigDecimal stopField007) { this.stopField007 = stopField007; }

    public Integer getStopField008() { return stopField008; }
    public void setStopField008(Integer stopField008) { this.stopField008 = stopField008; }

    public LocalDate getStopField009() { return stopField009; }
    public void setStopField009(LocalDate stopField009) { this.stopField009 = stopField009; }

    public BigDecimal getStopField010() { return stopField010; }
    public void setStopField010(BigDecimal stopField010) { this.stopField010 = stopField010; }

    public Double getStopField011() { return stopField011; }
    public void setStopField011(Double stopField011) { this.stopField011 = stopField011; }

    public String getStopField012() { return stopField012; }
    public void setStopField012(String stopField012) { this.stopField012 = stopField012; }

    @Override
    public String toString() {
        return "StopDto041{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
