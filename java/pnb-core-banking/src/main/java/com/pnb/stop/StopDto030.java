package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto030 — Data Transfer Object for stop operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto030 {

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField000")
    private BigDecimal stopField000;

    @Size(max = 20)
    @JsonProperty("stopField001")
    private String stopField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField002")
    private BigDecimal stopField002;

    @JsonProperty("stopField003")
    private Integer stopField003;

    @JsonProperty("stopField004")
    private Long stopField004;

    @JsonProperty("stopField005")
    private Double stopField005;

    @JsonProperty("stopField006")
    private LocalDate stopField006;

    @JsonProperty("stopField007")
    private Double stopField007;

    @JsonProperty("stopField008")
    private LocalDate stopField008;

    @JsonProperty("stopField009")
    private Integer stopField009;

    @JsonProperty("stopField010")
    private LocalDate stopField010;

    @JsonProperty("stopField011")
    private Double stopField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField012")
    private BigDecimal stopField012;

    @JsonProperty("stopField013")
    private Double stopField013;

    public StopDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto030 instance = new StopDto030();

        public Builder stopField000(BigDecimal val) { instance.stopField000 = val; return this; }
        public Builder stopField001(String val) { instance.stopField001 = val; return this; }
        public Builder stopField002(BigDecimal val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Integer val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Long val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Double val) { instance.stopField005 = val; return this; }
        public Builder stopField006(LocalDate val) { instance.stopField006 = val; return this; }
        public Builder stopField007(Double val) { instance.stopField007 = val; return this; }
        public Builder stopField008(LocalDate val) { instance.stopField008 = val; return this; }
        public Builder stopField009(Integer val) { instance.stopField009 = val; return this; }
        public Builder stopField010(LocalDate val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Double val) { instance.stopField011 = val; return this; }
        public Builder stopField012(BigDecimal val) { instance.stopField012 = val; return this; }
        public Builder stopField013(Double val) { instance.stopField013 = val; return this; }
        public StopDto030 build() { return instance; }
    }

    public BigDecimal getStopField000() { return stopField000; }
    public void setStopField000(BigDecimal stopField000) { this.stopField000 = stopField000; }

    public String getStopField001() { return stopField001; }
    public void setStopField001(String stopField001) { this.stopField001 = stopField001; }

    public BigDecimal getStopField002() { return stopField002; }
    public void setStopField002(BigDecimal stopField002) { this.stopField002 = stopField002; }

    public Integer getStopField003() { return stopField003; }
    public void setStopField003(Integer stopField003) { this.stopField003 = stopField003; }

    public Long getStopField004() { return stopField004; }
    public void setStopField004(Long stopField004) { this.stopField004 = stopField004; }

    public Double getStopField005() { return stopField005; }
    public void setStopField005(Double stopField005) { this.stopField005 = stopField005; }

    public LocalDate getStopField006() { return stopField006; }
    public void setStopField006(LocalDate stopField006) { this.stopField006 = stopField006; }

    public Double getStopField007() { return stopField007; }
    public void setStopField007(Double stopField007) { this.stopField007 = stopField007; }

    public LocalDate getStopField008() { return stopField008; }
    public void setStopField008(LocalDate stopField008) { this.stopField008 = stopField008; }

    public Integer getStopField009() { return stopField009; }
    public void setStopField009(Integer stopField009) { this.stopField009 = stopField009; }

    public LocalDate getStopField010() { return stopField010; }
    public void setStopField010(LocalDate stopField010) { this.stopField010 = stopField010; }

    public Double getStopField011() { return stopField011; }
    public void setStopField011(Double stopField011) { this.stopField011 = stopField011; }

    public BigDecimal getStopField012() { return stopField012; }
    public void setStopField012(BigDecimal stopField012) { this.stopField012 = stopField012; }

    public Double getStopField013() { return stopField013; }
    public void setStopField013(Double stopField013) { this.stopField013 = stopField013; }

    @Override
    public String toString() {
        return "StopDto030{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
