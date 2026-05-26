package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto031 — Data Transfer Object for stop operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto031 {

    @Size(max = 40)
    @JsonProperty("stopField000")
    private String stopField000;

    @JsonProperty("stopField001")
    private Boolean stopField001;

    @JsonProperty("stopField002")
    private LocalDate stopField002;

    @JsonProperty("stopField003")
    private Long stopField003;

    @JsonProperty("stopField004")
    private Double stopField004;

    @JsonProperty("stopField005")
    private Boolean stopField005;

    @JsonProperty("stopField006")
    private Double stopField006;

    @Size(max = 200)
    @JsonProperty("stopField007")
    private String stopField007;

    @JsonProperty("stopField008")
    private Double stopField008;

    @JsonProperty("stopField009")
    private LocalDate stopField009;

    @JsonProperty("stopField010")
    private LocalDate stopField010;

    @JsonProperty("stopField011")
    private Integer stopField011;

    @JsonProperty("stopField012")
    private LocalDate stopField012;

    @JsonProperty("stopField013")
    private Double stopField013;

    @Size(max = 100)
    @JsonProperty("stopField014")
    private String stopField014;

    public StopDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto031 instance = new StopDto031();

        public Builder stopField000(String val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Boolean val) { instance.stopField001 = val; return this; }
        public Builder stopField002(LocalDate val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Long val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Double val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Boolean val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Double val) { instance.stopField006 = val; return this; }
        public Builder stopField007(String val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Double val) { instance.stopField008 = val; return this; }
        public Builder stopField009(LocalDate val) { instance.stopField009 = val; return this; }
        public Builder stopField010(LocalDate val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Integer val) { instance.stopField011 = val; return this; }
        public Builder stopField012(LocalDate val) { instance.stopField012 = val; return this; }
        public Builder stopField013(Double val) { instance.stopField013 = val; return this; }
        public Builder stopField014(String val) { instance.stopField014 = val; return this; }
        public StopDto031 build() { return instance; }
    }

    public String getStopField000() { return stopField000; }
    public void setStopField000(String stopField000) { this.stopField000 = stopField000; }

    public Boolean getStopField001() { return stopField001; }
    public void setStopField001(Boolean stopField001) { this.stopField001 = stopField001; }

    public LocalDate getStopField002() { return stopField002; }
    public void setStopField002(LocalDate stopField002) { this.stopField002 = stopField002; }

    public Long getStopField003() { return stopField003; }
    public void setStopField003(Long stopField003) { this.stopField003 = stopField003; }

    public Double getStopField004() { return stopField004; }
    public void setStopField004(Double stopField004) { this.stopField004 = stopField004; }

    public Boolean getStopField005() { return stopField005; }
    public void setStopField005(Boolean stopField005) { this.stopField005 = stopField005; }

    public Double getStopField006() { return stopField006; }
    public void setStopField006(Double stopField006) { this.stopField006 = stopField006; }

    public String getStopField007() { return stopField007; }
    public void setStopField007(String stopField007) { this.stopField007 = stopField007; }

    public Double getStopField008() { return stopField008; }
    public void setStopField008(Double stopField008) { this.stopField008 = stopField008; }

    public LocalDate getStopField009() { return stopField009; }
    public void setStopField009(LocalDate stopField009) { this.stopField009 = stopField009; }

    public LocalDate getStopField010() { return stopField010; }
    public void setStopField010(LocalDate stopField010) { this.stopField010 = stopField010; }

    public Integer getStopField011() { return stopField011; }
    public void setStopField011(Integer stopField011) { this.stopField011 = stopField011; }

    public LocalDate getStopField012() { return stopField012; }
    public void setStopField012(LocalDate stopField012) { this.stopField012 = stopField012; }

    public Double getStopField013() { return stopField013; }
    public void setStopField013(Double stopField013) { this.stopField013 = stopField013; }

    public String getStopField014() { return stopField014; }
    public void setStopField014(String stopField014) { this.stopField014 = stopField014; }

    @Override
    public String toString() {
        return "StopDto031{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
