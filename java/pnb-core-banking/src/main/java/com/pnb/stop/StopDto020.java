package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto020 — Data Transfer Object for stop operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto020 {

    @JsonProperty("stopField000")
    private LocalDate stopField000;

    @Size(max = 100)
    @JsonProperty("stopField001")
    private String stopField001;

    @JsonProperty("stopField002")
    private Integer stopField002;

    @JsonProperty("stopField003")
    private Long stopField003;

    @JsonProperty("stopField004")
    private LocalDate stopField004;

    @JsonProperty("stopField005")
    private Double stopField005;

    @JsonProperty("stopField006")
    private Boolean stopField006;

    @JsonProperty("stopField007")
    private Double stopField007;

    @JsonProperty("stopField008")
    private Integer stopField008;

    @JsonProperty("stopField009")
    private Integer stopField009;

    @JsonProperty("stopField010")
    private Integer stopField010;

    @JsonProperty("stopField011")
    private Integer stopField011;

    @JsonProperty("stopField012")
    private Long stopField012;

    @JsonProperty("stopField013")
    private LocalDate stopField013;

    @JsonProperty("stopField014")
    private Long stopField014;

    @JsonProperty("stopField015")
    private LocalDate stopField015;

    public StopDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto020 instance = new StopDto020();

        public Builder stopField000(LocalDate val) { instance.stopField000 = val; return this; }
        public Builder stopField001(String val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Integer val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Long val) { instance.stopField003 = val; return this; }
        public Builder stopField004(LocalDate val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Double val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Boolean val) { instance.stopField006 = val; return this; }
        public Builder stopField007(Double val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Integer val) { instance.stopField008 = val; return this; }
        public Builder stopField009(Integer val) { instance.stopField009 = val; return this; }
        public Builder stopField010(Integer val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Integer val) { instance.stopField011 = val; return this; }
        public Builder stopField012(Long val) { instance.stopField012 = val; return this; }
        public Builder stopField013(LocalDate val) { instance.stopField013 = val; return this; }
        public Builder stopField014(Long val) { instance.stopField014 = val; return this; }
        public Builder stopField015(LocalDate val) { instance.stopField015 = val; return this; }
        public StopDto020 build() { return instance; }
    }

    public LocalDate getStopField000() { return stopField000; }
    public void setStopField000(LocalDate stopField000) { this.stopField000 = stopField000; }

    public String getStopField001() { return stopField001; }
    public void setStopField001(String stopField001) { this.stopField001 = stopField001; }

    public Integer getStopField002() { return stopField002; }
    public void setStopField002(Integer stopField002) { this.stopField002 = stopField002; }

    public Long getStopField003() { return stopField003; }
    public void setStopField003(Long stopField003) { this.stopField003 = stopField003; }

    public LocalDate getStopField004() { return stopField004; }
    public void setStopField004(LocalDate stopField004) { this.stopField004 = stopField004; }

    public Double getStopField005() { return stopField005; }
    public void setStopField005(Double stopField005) { this.stopField005 = stopField005; }

    public Boolean getStopField006() { return stopField006; }
    public void setStopField006(Boolean stopField006) { this.stopField006 = stopField006; }

    public Double getStopField007() { return stopField007; }
    public void setStopField007(Double stopField007) { this.stopField007 = stopField007; }

    public Integer getStopField008() { return stopField008; }
    public void setStopField008(Integer stopField008) { this.stopField008 = stopField008; }

    public Integer getStopField009() { return stopField009; }
    public void setStopField009(Integer stopField009) { this.stopField009 = stopField009; }

    public Integer getStopField010() { return stopField010; }
    public void setStopField010(Integer stopField010) { this.stopField010 = stopField010; }

    public Integer getStopField011() { return stopField011; }
    public void setStopField011(Integer stopField011) { this.stopField011 = stopField011; }

    public Long getStopField012() { return stopField012; }
    public void setStopField012(Long stopField012) { this.stopField012 = stopField012; }

    public LocalDate getStopField013() { return stopField013; }
    public void setStopField013(LocalDate stopField013) { this.stopField013 = stopField013; }

    public Long getStopField014() { return stopField014; }
    public void setStopField014(Long stopField014) { this.stopField014 = stopField014; }

    public LocalDate getStopField015() { return stopField015; }
    public void setStopField015(LocalDate stopField015) { this.stopField015 = stopField015; }

    @Override
    public String toString() {
        return "StopDto020{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
