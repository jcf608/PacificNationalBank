package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto021 — Data Transfer Object for stop operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto021 {

    @JsonProperty("stopField000")
    private Boolean stopField000;

    @JsonProperty("stopField001")
    private LocalDate stopField001;

    @JsonProperty("stopField002")
    private LocalDate stopField002;

    @JsonProperty("stopField003")
    private LocalDate stopField003;

    @JsonProperty("stopField004")
    private Double stopField004;

    @JsonProperty("stopField005")
    private LocalDate stopField005;

    @JsonProperty("stopField006")
    private Long stopField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField007")
    private BigDecimal stopField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField008")
    private BigDecimal stopField008;

    @JsonProperty("stopField009")
    private Boolean stopField009;

    @JsonProperty("stopField010")
    private Integer stopField010;

    @JsonProperty("stopField011")
    private Boolean stopField011;

    @Size(max = 100)
    @JsonProperty("stopField012")
    private String stopField012;

    @JsonProperty("stopField013")
    private LocalDate stopField013;

    @JsonProperty("stopField014")
    private Integer stopField014;

    @JsonProperty("stopField015")
    private Long stopField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField016")
    private BigDecimal stopField016;

    public StopDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto021 instance = new StopDto021();

        public Builder stopField000(Boolean val) { instance.stopField000 = val; return this; }
        public Builder stopField001(LocalDate val) { instance.stopField001 = val; return this; }
        public Builder stopField002(LocalDate val) { instance.stopField002 = val; return this; }
        public Builder stopField003(LocalDate val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Double val) { instance.stopField004 = val; return this; }
        public Builder stopField005(LocalDate val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Long val) { instance.stopField006 = val; return this; }
        public Builder stopField007(BigDecimal val) { instance.stopField007 = val; return this; }
        public Builder stopField008(BigDecimal val) { instance.stopField008 = val; return this; }
        public Builder stopField009(Boolean val) { instance.stopField009 = val; return this; }
        public Builder stopField010(Integer val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Boolean val) { instance.stopField011 = val; return this; }
        public Builder stopField012(String val) { instance.stopField012 = val; return this; }
        public Builder stopField013(LocalDate val) { instance.stopField013 = val; return this; }
        public Builder stopField014(Integer val) { instance.stopField014 = val; return this; }
        public Builder stopField015(Long val) { instance.stopField015 = val; return this; }
        public Builder stopField016(BigDecimal val) { instance.stopField016 = val; return this; }
        public StopDto021 build() { return instance; }
    }

    public Boolean getStopField000() { return stopField000; }
    public void setStopField000(Boolean stopField000) { this.stopField000 = stopField000; }

    public LocalDate getStopField001() { return stopField001; }
    public void setStopField001(LocalDate stopField001) { this.stopField001 = stopField001; }

    public LocalDate getStopField002() { return stopField002; }
    public void setStopField002(LocalDate stopField002) { this.stopField002 = stopField002; }

    public LocalDate getStopField003() { return stopField003; }
    public void setStopField003(LocalDate stopField003) { this.stopField003 = stopField003; }

    public Double getStopField004() { return stopField004; }
    public void setStopField004(Double stopField004) { this.stopField004 = stopField004; }

    public LocalDate getStopField005() { return stopField005; }
    public void setStopField005(LocalDate stopField005) { this.stopField005 = stopField005; }

    public Long getStopField006() { return stopField006; }
    public void setStopField006(Long stopField006) { this.stopField006 = stopField006; }

    public BigDecimal getStopField007() { return stopField007; }
    public void setStopField007(BigDecimal stopField007) { this.stopField007 = stopField007; }

    public BigDecimal getStopField008() { return stopField008; }
    public void setStopField008(BigDecimal stopField008) { this.stopField008 = stopField008; }

    public Boolean getStopField009() { return stopField009; }
    public void setStopField009(Boolean stopField009) { this.stopField009 = stopField009; }

    public Integer getStopField010() { return stopField010; }
    public void setStopField010(Integer stopField010) { this.stopField010 = stopField010; }

    public Boolean getStopField011() { return stopField011; }
    public void setStopField011(Boolean stopField011) { this.stopField011 = stopField011; }

    public String getStopField012() { return stopField012; }
    public void setStopField012(String stopField012) { this.stopField012 = stopField012; }

    public LocalDate getStopField013() { return stopField013; }
    public void setStopField013(LocalDate stopField013) { this.stopField013 = stopField013; }

    public Integer getStopField014() { return stopField014; }
    public void setStopField014(Integer stopField014) { this.stopField014 = stopField014; }

    public Long getStopField015() { return stopField015; }
    public void setStopField015(Long stopField015) { this.stopField015 = stopField015; }

    public BigDecimal getStopField016() { return stopField016; }
    public void setStopField016(BigDecimal stopField016) { this.stopField016 = stopField016; }

    @Override
    public String toString() {
        return "StopDto021{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
