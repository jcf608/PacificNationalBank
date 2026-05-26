package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto044 — Data Transfer Object for stop operations.
 * Variant 44 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto044 {

    @JsonProperty("stopField000")
    private Integer stopField000;

    @JsonProperty("stopField001")
    private LocalDate stopField001;

    @JsonProperty("stopField002")
    private LocalDate stopField002;

    @JsonProperty("stopField003")
    private Integer stopField003;

    @JsonProperty("stopField004")
    private Boolean stopField004;

    @JsonProperty("stopField005")
    private Long stopField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField006")
    private BigDecimal stopField006;

    @JsonProperty("stopField007")
    private Integer stopField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField008")
    private BigDecimal stopField008;

    @JsonProperty("stopField009")
    private Double stopField009;

    @JsonProperty("stopField010")
    private Long stopField010;

    @JsonProperty("stopField011")
    private Boolean stopField011;

    @JsonProperty("stopField012")
    private LocalDate stopField012;

    @JsonProperty("stopField013")
    private Long stopField013;

    @JsonProperty("stopField014")
    private Double stopField014;

    @JsonProperty("stopField015")
    private LocalDate stopField015;

    public StopDto044() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto044 instance = new StopDto044();

        public Builder stopField000(Integer val) { instance.stopField000 = val; return this; }
        public Builder stopField001(LocalDate val) { instance.stopField001 = val; return this; }
        public Builder stopField002(LocalDate val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Integer val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Boolean val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Long val) { instance.stopField005 = val; return this; }
        public Builder stopField006(BigDecimal val) { instance.stopField006 = val; return this; }
        public Builder stopField007(Integer val) { instance.stopField007 = val; return this; }
        public Builder stopField008(BigDecimal val) { instance.stopField008 = val; return this; }
        public Builder stopField009(Double val) { instance.stopField009 = val; return this; }
        public Builder stopField010(Long val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Boolean val) { instance.stopField011 = val; return this; }
        public Builder stopField012(LocalDate val) { instance.stopField012 = val; return this; }
        public Builder stopField013(Long val) { instance.stopField013 = val; return this; }
        public Builder stopField014(Double val) { instance.stopField014 = val; return this; }
        public Builder stopField015(LocalDate val) { instance.stopField015 = val; return this; }
        public StopDto044 build() { return instance; }
    }

    public Integer getStopField000() { return stopField000; }
    public void setStopField000(Integer stopField000) { this.stopField000 = stopField000; }

    public LocalDate getStopField001() { return stopField001; }
    public void setStopField001(LocalDate stopField001) { this.stopField001 = stopField001; }

    public LocalDate getStopField002() { return stopField002; }
    public void setStopField002(LocalDate stopField002) { this.stopField002 = stopField002; }

    public Integer getStopField003() { return stopField003; }
    public void setStopField003(Integer stopField003) { this.stopField003 = stopField003; }

    public Boolean getStopField004() { return stopField004; }
    public void setStopField004(Boolean stopField004) { this.stopField004 = stopField004; }

    public Long getStopField005() { return stopField005; }
    public void setStopField005(Long stopField005) { this.stopField005 = stopField005; }

    public BigDecimal getStopField006() { return stopField006; }
    public void setStopField006(BigDecimal stopField006) { this.stopField006 = stopField006; }

    public Integer getStopField007() { return stopField007; }
    public void setStopField007(Integer stopField007) { this.stopField007 = stopField007; }

    public BigDecimal getStopField008() { return stopField008; }
    public void setStopField008(BigDecimal stopField008) { this.stopField008 = stopField008; }

    public Double getStopField009() { return stopField009; }
    public void setStopField009(Double stopField009) { this.stopField009 = stopField009; }

    public Long getStopField010() { return stopField010; }
    public void setStopField010(Long stopField010) { this.stopField010 = stopField010; }

    public Boolean getStopField011() { return stopField011; }
    public void setStopField011(Boolean stopField011) { this.stopField011 = stopField011; }

    public LocalDate getStopField012() { return stopField012; }
    public void setStopField012(LocalDate stopField012) { this.stopField012 = stopField012; }

    public Long getStopField013() { return stopField013; }
    public void setStopField013(Long stopField013) { this.stopField013 = stopField013; }

    public Double getStopField014() { return stopField014; }
    public void setStopField014(Double stopField014) { this.stopField014 = stopField014; }

    public LocalDate getStopField015() { return stopField015; }
    public void setStopField015(LocalDate stopField015) { this.stopField015 = stopField015; }

    @Override
    public String toString() {
        return "StopDto044{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
