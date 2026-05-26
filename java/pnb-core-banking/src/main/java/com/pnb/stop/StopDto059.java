package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto059 — Data Transfer Object for stop operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto059 {

    @JsonProperty("stopField000")
    private Double stopField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField001")
    private BigDecimal stopField001;

    @JsonProperty("stopField002")
    private LocalDate stopField002;

    @JsonProperty("stopField003")
    private Boolean stopField003;

    @JsonProperty("stopField004")
    private Double stopField004;

    @JsonProperty("stopField005")
    private Long stopField005;

    @JsonProperty("stopField006")
    private LocalDate stopField006;

    @JsonProperty("stopField007")
    private LocalDate stopField007;

    @JsonProperty("stopField008")
    private Integer stopField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField009")
    private BigDecimal stopField009;

    @JsonProperty("stopField010")
    private Integer stopField010;

    @JsonProperty("stopField011")
    private Long stopField011;

    @JsonProperty("stopField012")
    private LocalDate stopField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField013")
    private BigDecimal stopField013;

    @Size(max = 60)
    @JsonProperty("stopField014")
    private String stopField014;

    @JsonProperty("stopField015")
    private Boolean stopField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField016")
    private BigDecimal stopField016;

    @JsonProperty("stopField017")
    private LocalDate stopField017;

    @JsonProperty("stopField018")
    private Long stopField018;

    public StopDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto059 instance = new StopDto059();

        public Builder stopField000(Double val) { instance.stopField000 = val; return this; }
        public Builder stopField001(BigDecimal val) { instance.stopField001 = val; return this; }
        public Builder stopField002(LocalDate val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Boolean val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Double val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Long val) { instance.stopField005 = val; return this; }
        public Builder stopField006(LocalDate val) { instance.stopField006 = val; return this; }
        public Builder stopField007(LocalDate val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Integer val) { instance.stopField008 = val; return this; }
        public Builder stopField009(BigDecimal val) { instance.stopField009 = val; return this; }
        public Builder stopField010(Integer val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Long val) { instance.stopField011 = val; return this; }
        public Builder stopField012(LocalDate val) { instance.stopField012 = val; return this; }
        public Builder stopField013(BigDecimal val) { instance.stopField013 = val; return this; }
        public Builder stopField014(String val) { instance.stopField014 = val; return this; }
        public Builder stopField015(Boolean val) { instance.stopField015 = val; return this; }
        public Builder stopField016(BigDecimal val) { instance.stopField016 = val; return this; }
        public Builder stopField017(LocalDate val) { instance.stopField017 = val; return this; }
        public Builder stopField018(Long val) { instance.stopField018 = val; return this; }
        public StopDto059 build() { return instance; }
    }

    public Double getStopField000() { return stopField000; }
    public void setStopField000(Double stopField000) { this.stopField000 = stopField000; }

    public BigDecimal getStopField001() { return stopField001; }
    public void setStopField001(BigDecimal stopField001) { this.stopField001 = stopField001; }

    public LocalDate getStopField002() { return stopField002; }
    public void setStopField002(LocalDate stopField002) { this.stopField002 = stopField002; }

    public Boolean getStopField003() { return stopField003; }
    public void setStopField003(Boolean stopField003) { this.stopField003 = stopField003; }

    public Double getStopField004() { return stopField004; }
    public void setStopField004(Double stopField004) { this.stopField004 = stopField004; }

    public Long getStopField005() { return stopField005; }
    public void setStopField005(Long stopField005) { this.stopField005 = stopField005; }

    public LocalDate getStopField006() { return stopField006; }
    public void setStopField006(LocalDate stopField006) { this.stopField006 = stopField006; }

    public LocalDate getStopField007() { return stopField007; }
    public void setStopField007(LocalDate stopField007) { this.stopField007 = stopField007; }

    public Integer getStopField008() { return stopField008; }
    public void setStopField008(Integer stopField008) { this.stopField008 = stopField008; }

    public BigDecimal getStopField009() { return stopField009; }
    public void setStopField009(BigDecimal stopField009) { this.stopField009 = stopField009; }

    public Integer getStopField010() { return stopField010; }
    public void setStopField010(Integer stopField010) { this.stopField010 = stopField010; }

    public Long getStopField011() { return stopField011; }
    public void setStopField011(Long stopField011) { this.stopField011 = stopField011; }

    public LocalDate getStopField012() { return stopField012; }
    public void setStopField012(LocalDate stopField012) { this.stopField012 = stopField012; }

    public BigDecimal getStopField013() { return stopField013; }
    public void setStopField013(BigDecimal stopField013) { this.stopField013 = stopField013; }

    public String getStopField014() { return stopField014; }
    public void setStopField014(String stopField014) { this.stopField014 = stopField014; }

    public Boolean getStopField015() { return stopField015; }
    public void setStopField015(Boolean stopField015) { this.stopField015 = stopField015; }

    public BigDecimal getStopField016() { return stopField016; }
    public void setStopField016(BigDecimal stopField016) { this.stopField016 = stopField016; }

    public LocalDate getStopField017() { return stopField017; }
    public void setStopField017(LocalDate stopField017) { this.stopField017 = stopField017; }

    public Long getStopField018() { return stopField018; }
    public void setStopField018(Long stopField018) { this.stopField018 = stopField018; }

    @Override
    public String toString() {
        return "StopDto059{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
