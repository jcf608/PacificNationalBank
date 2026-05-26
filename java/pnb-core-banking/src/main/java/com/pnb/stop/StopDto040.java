package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto040 — Data Transfer Object for stop operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto040 {

    @JsonProperty("stopField000")
    private Double stopField000;

    @JsonProperty("stopField001")
    private Integer stopField001;

    @JsonProperty("stopField002")
    private Long stopField002;

    @JsonProperty("stopField003")
    private Long stopField003;

    @JsonProperty("stopField004")
    private Long stopField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField005")
    private BigDecimal stopField005;

    @Size(max = 200)
    @JsonProperty("stopField006")
    private String stopField006;

    @JsonProperty("stopField007")
    private Double stopField007;

    @JsonProperty("stopField008")
    private Long stopField008;

    @JsonProperty("stopField009")
    private LocalDate stopField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField010")
    private BigDecimal stopField010;

    @Size(max = 60)
    @JsonProperty("stopField011")
    private String stopField011;

    public StopDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto040 instance = new StopDto040();

        public Builder stopField000(Double val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Integer val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Long val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Long val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Long val) { instance.stopField004 = val; return this; }
        public Builder stopField005(BigDecimal val) { instance.stopField005 = val; return this; }
        public Builder stopField006(String val) { instance.stopField006 = val; return this; }
        public Builder stopField007(Double val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Long val) { instance.stopField008 = val; return this; }
        public Builder stopField009(LocalDate val) { instance.stopField009 = val; return this; }
        public Builder stopField010(BigDecimal val) { instance.stopField010 = val; return this; }
        public Builder stopField011(String val) { instance.stopField011 = val; return this; }
        public StopDto040 build() { return instance; }
    }

    public Double getStopField000() { return stopField000; }
    public void setStopField000(Double stopField000) { this.stopField000 = stopField000; }

    public Integer getStopField001() { return stopField001; }
    public void setStopField001(Integer stopField001) { this.stopField001 = stopField001; }

    public Long getStopField002() { return stopField002; }
    public void setStopField002(Long stopField002) { this.stopField002 = stopField002; }

    public Long getStopField003() { return stopField003; }
    public void setStopField003(Long stopField003) { this.stopField003 = stopField003; }

    public Long getStopField004() { return stopField004; }
    public void setStopField004(Long stopField004) { this.stopField004 = stopField004; }

    public BigDecimal getStopField005() { return stopField005; }
    public void setStopField005(BigDecimal stopField005) { this.stopField005 = stopField005; }

    public String getStopField006() { return stopField006; }
    public void setStopField006(String stopField006) { this.stopField006 = stopField006; }

    public Double getStopField007() { return stopField007; }
    public void setStopField007(Double stopField007) { this.stopField007 = stopField007; }

    public Long getStopField008() { return stopField008; }
    public void setStopField008(Long stopField008) { this.stopField008 = stopField008; }

    public LocalDate getStopField009() { return stopField009; }
    public void setStopField009(LocalDate stopField009) { this.stopField009 = stopField009; }

    public BigDecimal getStopField010() { return stopField010; }
    public void setStopField010(BigDecimal stopField010) { this.stopField010 = stopField010; }

    public String getStopField011() { return stopField011; }
    public void setStopField011(String stopField011) { this.stopField011 = stopField011; }

    @Override
    public String toString() {
        return "StopDto040{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
