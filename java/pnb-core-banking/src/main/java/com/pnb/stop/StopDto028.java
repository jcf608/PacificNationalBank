package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto028 — Data Transfer Object for stop operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto028 {

    @JsonProperty("stopField000")
    private Long stopField000;

    @JsonProperty("stopField001")
    private Integer stopField001;

    @Size(max = 200)
    @JsonProperty("stopField002")
    private String stopField002;

    @JsonProperty("stopField003")
    private Long stopField003;

    @JsonProperty("stopField004")
    private Boolean stopField004;

    @JsonProperty("stopField005")
    private LocalDate stopField005;

    @JsonProperty("stopField006")
    private Boolean stopField006;

    @JsonProperty("stopField007")
    private LocalDate stopField007;

    @JsonProperty("stopField008")
    private Boolean stopField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField009")
    private BigDecimal stopField009;

    @JsonProperty("stopField010")
    private Long stopField010;

    @JsonProperty("stopField011")
    private Double stopField011;

    public StopDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto028 instance = new StopDto028();

        public Builder stopField000(Long val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Integer val) { instance.stopField001 = val; return this; }
        public Builder stopField002(String val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Long val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Boolean val) { instance.stopField004 = val; return this; }
        public Builder stopField005(LocalDate val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Boolean val) { instance.stopField006 = val; return this; }
        public Builder stopField007(LocalDate val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Boolean val) { instance.stopField008 = val; return this; }
        public Builder stopField009(BigDecimal val) { instance.stopField009 = val; return this; }
        public Builder stopField010(Long val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Double val) { instance.stopField011 = val; return this; }
        public StopDto028 build() { return instance; }
    }

    public Long getStopField000() { return stopField000; }
    public void setStopField000(Long stopField000) { this.stopField000 = stopField000; }

    public Integer getStopField001() { return stopField001; }
    public void setStopField001(Integer stopField001) { this.stopField001 = stopField001; }

    public String getStopField002() { return stopField002; }
    public void setStopField002(String stopField002) { this.stopField002 = stopField002; }

    public Long getStopField003() { return stopField003; }
    public void setStopField003(Long stopField003) { this.stopField003 = stopField003; }

    public Boolean getStopField004() { return stopField004; }
    public void setStopField004(Boolean stopField004) { this.stopField004 = stopField004; }

    public LocalDate getStopField005() { return stopField005; }
    public void setStopField005(LocalDate stopField005) { this.stopField005 = stopField005; }

    public Boolean getStopField006() { return stopField006; }
    public void setStopField006(Boolean stopField006) { this.stopField006 = stopField006; }

    public LocalDate getStopField007() { return stopField007; }
    public void setStopField007(LocalDate stopField007) { this.stopField007 = stopField007; }

    public Boolean getStopField008() { return stopField008; }
    public void setStopField008(Boolean stopField008) { this.stopField008 = stopField008; }

    public BigDecimal getStopField009() { return stopField009; }
    public void setStopField009(BigDecimal stopField009) { this.stopField009 = stopField009; }

    public Long getStopField010() { return stopField010; }
    public void setStopField010(Long stopField010) { this.stopField010 = stopField010; }

    public Double getStopField011() { return stopField011; }
    public void setStopField011(Double stopField011) { this.stopField011 = stopField011; }

    @Override
    public String toString() {
        return "StopDto028{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
