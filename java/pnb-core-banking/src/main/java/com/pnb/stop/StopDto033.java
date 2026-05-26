package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto033 — Data Transfer Object for stop operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto033 {

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField000")
    private BigDecimal stopField000;

    @JsonProperty("stopField001")
    private Integer stopField001;

    @JsonProperty("stopField002")
    private Boolean stopField002;

    @JsonProperty("stopField003")
    private Boolean stopField003;

    @JsonProperty("stopField004")
    private Boolean stopField004;

    @JsonProperty("stopField005")
    private Boolean stopField005;

    @JsonProperty("stopField006")
    private Double stopField006;

    @JsonProperty("stopField007")
    private Double stopField007;

    @JsonProperty("stopField008")
    private LocalDate stopField008;

    @JsonProperty("stopField009")
    private Long stopField009;

    @JsonProperty("stopField010")
    private Double stopField010;

    @JsonProperty("stopField011")
    private Boolean stopField011;

    @JsonProperty("stopField012")
    private Double stopField012;

    @JsonProperty("stopField013")
    private Long stopField013;

    @JsonProperty("stopField014")
    private Boolean stopField014;

    @JsonProperty("stopField015")
    private Boolean stopField015;

    @JsonProperty("stopField016")
    private Long stopField016;

    public StopDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto033 instance = new StopDto033();

        public Builder stopField000(BigDecimal val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Integer val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Boolean val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Boolean val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Boolean val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Boolean val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Double val) { instance.stopField006 = val; return this; }
        public Builder stopField007(Double val) { instance.stopField007 = val; return this; }
        public Builder stopField008(LocalDate val) { instance.stopField008 = val; return this; }
        public Builder stopField009(Long val) { instance.stopField009 = val; return this; }
        public Builder stopField010(Double val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Boolean val) { instance.stopField011 = val; return this; }
        public Builder stopField012(Double val) { instance.stopField012 = val; return this; }
        public Builder stopField013(Long val) { instance.stopField013 = val; return this; }
        public Builder stopField014(Boolean val) { instance.stopField014 = val; return this; }
        public Builder stopField015(Boolean val) { instance.stopField015 = val; return this; }
        public Builder stopField016(Long val) { instance.stopField016 = val; return this; }
        public StopDto033 build() { return instance; }
    }

    public BigDecimal getStopField000() { return stopField000; }
    public void setStopField000(BigDecimal stopField000) { this.stopField000 = stopField000; }

    public Integer getStopField001() { return stopField001; }
    public void setStopField001(Integer stopField001) { this.stopField001 = stopField001; }

    public Boolean getStopField002() { return stopField002; }
    public void setStopField002(Boolean stopField002) { this.stopField002 = stopField002; }

    public Boolean getStopField003() { return stopField003; }
    public void setStopField003(Boolean stopField003) { this.stopField003 = stopField003; }

    public Boolean getStopField004() { return stopField004; }
    public void setStopField004(Boolean stopField004) { this.stopField004 = stopField004; }

    public Boolean getStopField005() { return stopField005; }
    public void setStopField005(Boolean stopField005) { this.stopField005 = stopField005; }

    public Double getStopField006() { return stopField006; }
    public void setStopField006(Double stopField006) { this.stopField006 = stopField006; }

    public Double getStopField007() { return stopField007; }
    public void setStopField007(Double stopField007) { this.stopField007 = stopField007; }

    public LocalDate getStopField008() { return stopField008; }
    public void setStopField008(LocalDate stopField008) { this.stopField008 = stopField008; }

    public Long getStopField009() { return stopField009; }
    public void setStopField009(Long stopField009) { this.stopField009 = stopField009; }

    public Double getStopField010() { return stopField010; }
    public void setStopField010(Double stopField010) { this.stopField010 = stopField010; }

    public Boolean getStopField011() { return stopField011; }
    public void setStopField011(Boolean stopField011) { this.stopField011 = stopField011; }

    public Double getStopField012() { return stopField012; }
    public void setStopField012(Double stopField012) { this.stopField012 = stopField012; }

    public Long getStopField013() { return stopField013; }
    public void setStopField013(Long stopField013) { this.stopField013 = stopField013; }

    public Boolean getStopField014() { return stopField014; }
    public void setStopField014(Boolean stopField014) { this.stopField014 = stopField014; }

    public Boolean getStopField015() { return stopField015; }
    public void setStopField015(Boolean stopField015) { this.stopField015 = stopField015; }

    public Long getStopField016() { return stopField016; }
    public void setStopField016(Long stopField016) { this.stopField016 = stopField016; }

    @Override
    public String toString() {
        return "StopDto033{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
