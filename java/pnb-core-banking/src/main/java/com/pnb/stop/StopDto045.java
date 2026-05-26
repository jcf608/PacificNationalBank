package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto045 — Data Transfer Object for stop operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto045 {

    @JsonProperty("stopField000")
    private Boolean stopField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField001")
    private BigDecimal stopField001;

    @JsonProperty("stopField002")
    private Integer stopField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField003")
    private BigDecimal stopField003;

    @JsonProperty("stopField004")
    private Long stopField004;

    @JsonProperty("stopField005")
    private Long stopField005;

    @JsonProperty("stopField006")
    private Long stopField006;

    @JsonProperty("stopField007")
    private LocalDate stopField007;

    @JsonProperty("stopField008")
    private LocalDate stopField008;

    @JsonProperty("stopField009")
    private Long stopField009;

    @JsonProperty("stopField010")
    private Boolean stopField010;

    @JsonProperty("stopField011")
    private Double stopField011;

    @JsonProperty("stopField012")
    private Double stopField012;

    @JsonProperty("stopField013")
    private LocalDate stopField013;

    @Size(max = 60)
    @JsonProperty("stopField014")
    private String stopField014;

    @JsonProperty("stopField015")
    private Boolean stopField015;

    @JsonProperty("stopField016")
    private Boolean stopField016;

    public StopDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto045 instance = new StopDto045();

        public Builder stopField000(Boolean val) { instance.stopField000 = val; return this; }
        public Builder stopField001(BigDecimal val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Integer val) { instance.stopField002 = val; return this; }
        public Builder stopField003(BigDecimal val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Long val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Long val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Long val) { instance.stopField006 = val; return this; }
        public Builder stopField007(LocalDate val) { instance.stopField007 = val; return this; }
        public Builder stopField008(LocalDate val) { instance.stopField008 = val; return this; }
        public Builder stopField009(Long val) { instance.stopField009 = val; return this; }
        public Builder stopField010(Boolean val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Double val) { instance.stopField011 = val; return this; }
        public Builder stopField012(Double val) { instance.stopField012 = val; return this; }
        public Builder stopField013(LocalDate val) { instance.stopField013 = val; return this; }
        public Builder stopField014(String val) { instance.stopField014 = val; return this; }
        public Builder stopField015(Boolean val) { instance.stopField015 = val; return this; }
        public Builder stopField016(Boolean val) { instance.stopField016 = val; return this; }
        public StopDto045 build() { return instance; }
    }

    public Boolean getStopField000() { return stopField000; }
    public void setStopField000(Boolean stopField000) { this.stopField000 = stopField000; }

    public BigDecimal getStopField001() { return stopField001; }
    public void setStopField001(BigDecimal stopField001) { this.stopField001 = stopField001; }

    public Integer getStopField002() { return stopField002; }
    public void setStopField002(Integer stopField002) { this.stopField002 = stopField002; }

    public BigDecimal getStopField003() { return stopField003; }
    public void setStopField003(BigDecimal stopField003) { this.stopField003 = stopField003; }

    public Long getStopField004() { return stopField004; }
    public void setStopField004(Long stopField004) { this.stopField004 = stopField004; }

    public Long getStopField005() { return stopField005; }
    public void setStopField005(Long stopField005) { this.stopField005 = stopField005; }

    public Long getStopField006() { return stopField006; }
    public void setStopField006(Long stopField006) { this.stopField006 = stopField006; }

    public LocalDate getStopField007() { return stopField007; }
    public void setStopField007(LocalDate stopField007) { this.stopField007 = stopField007; }

    public LocalDate getStopField008() { return stopField008; }
    public void setStopField008(LocalDate stopField008) { this.stopField008 = stopField008; }

    public Long getStopField009() { return stopField009; }
    public void setStopField009(Long stopField009) { this.stopField009 = stopField009; }

    public Boolean getStopField010() { return stopField010; }
    public void setStopField010(Boolean stopField010) { this.stopField010 = stopField010; }

    public Double getStopField011() { return stopField011; }
    public void setStopField011(Double stopField011) { this.stopField011 = stopField011; }

    public Double getStopField012() { return stopField012; }
    public void setStopField012(Double stopField012) { this.stopField012 = stopField012; }

    public LocalDate getStopField013() { return stopField013; }
    public void setStopField013(LocalDate stopField013) { this.stopField013 = stopField013; }

    public String getStopField014() { return stopField014; }
    public void setStopField014(String stopField014) { this.stopField014 = stopField014; }

    public Boolean getStopField015() { return stopField015; }
    public void setStopField015(Boolean stopField015) { this.stopField015 = stopField015; }

    public Boolean getStopField016() { return stopField016; }
    public void setStopField016(Boolean stopField016) { this.stopField016 = stopField016; }

    @Override
    public String toString() {
        return "StopDto045{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
