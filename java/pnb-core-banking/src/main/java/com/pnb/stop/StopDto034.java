package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto034 — Data Transfer Object for stop operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto034 {

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField000")
    private BigDecimal stopField000;

    @JsonProperty("stopField001")
    private Long stopField001;

    @JsonProperty("stopField002")
    private Long stopField002;

    @JsonProperty("stopField003")
    private Boolean stopField003;

    @JsonProperty("stopField004")
    private Boolean stopField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField005")
    private BigDecimal stopField005;

    @JsonProperty("stopField006")
    private LocalDate stopField006;

    @JsonProperty("stopField007")
    private Long stopField007;

    @JsonProperty("stopField008")
    private LocalDate stopField008;

    @JsonProperty("stopField009")
    private Long stopField009;

    @Size(max = 100)
    @JsonProperty("stopField010")
    private String stopField010;

    @JsonProperty("stopField011")
    private Integer stopField011;

    @JsonProperty("stopField012")
    private Double stopField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField013")
    private BigDecimal stopField013;

    @Size(max = 40)
    @JsonProperty("stopField014")
    private String stopField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField015")
    private BigDecimal stopField015;

    @JsonProperty("stopField016")
    private LocalDate stopField016;

    @JsonProperty("stopField017")
    private LocalDate stopField017;

    public StopDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto034 instance = new StopDto034();

        public Builder stopField000(BigDecimal val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Long val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Long val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Boolean val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Boolean val) { instance.stopField004 = val; return this; }
        public Builder stopField005(BigDecimal val) { instance.stopField005 = val; return this; }
        public Builder stopField006(LocalDate val) { instance.stopField006 = val; return this; }
        public Builder stopField007(Long val) { instance.stopField007 = val; return this; }
        public Builder stopField008(LocalDate val) { instance.stopField008 = val; return this; }
        public Builder stopField009(Long val) { instance.stopField009 = val; return this; }
        public Builder stopField010(String val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Integer val) { instance.stopField011 = val; return this; }
        public Builder stopField012(Double val) { instance.stopField012 = val; return this; }
        public Builder stopField013(BigDecimal val) { instance.stopField013 = val; return this; }
        public Builder stopField014(String val) { instance.stopField014 = val; return this; }
        public Builder stopField015(BigDecimal val) { instance.stopField015 = val; return this; }
        public Builder stopField016(LocalDate val) { instance.stopField016 = val; return this; }
        public Builder stopField017(LocalDate val) { instance.stopField017 = val; return this; }
        public StopDto034 build() { return instance; }
    }

    public BigDecimal getStopField000() { return stopField000; }
    public void setStopField000(BigDecimal stopField000) { this.stopField000 = stopField000; }

    public Long getStopField001() { return stopField001; }
    public void setStopField001(Long stopField001) { this.stopField001 = stopField001; }

    public Long getStopField002() { return stopField002; }
    public void setStopField002(Long stopField002) { this.stopField002 = stopField002; }

    public Boolean getStopField003() { return stopField003; }
    public void setStopField003(Boolean stopField003) { this.stopField003 = stopField003; }

    public Boolean getStopField004() { return stopField004; }
    public void setStopField004(Boolean stopField004) { this.stopField004 = stopField004; }

    public BigDecimal getStopField005() { return stopField005; }
    public void setStopField005(BigDecimal stopField005) { this.stopField005 = stopField005; }

    public LocalDate getStopField006() { return stopField006; }
    public void setStopField006(LocalDate stopField006) { this.stopField006 = stopField006; }

    public Long getStopField007() { return stopField007; }
    public void setStopField007(Long stopField007) { this.stopField007 = stopField007; }

    public LocalDate getStopField008() { return stopField008; }
    public void setStopField008(LocalDate stopField008) { this.stopField008 = stopField008; }

    public Long getStopField009() { return stopField009; }
    public void setStopField009(Long stopField009) { this.stopField009 = stopField009; }

    public String getStopField010() { return stopField010; }
    public void setStopField010(String stopField010) { this.stopField010 = stopField010; }

    public Integer getStopField011() { return stopField011; }
    public void setStopField011(Integer stopField011) { this.stopField011 = stopField011; }

    public Double getStopField012() { return stopField012; }
    public void setStopField012(Double stopField012) { this.stopField012 = stopField012; }

    public BigDecimal getStopField013() { return stopField013; }
    public void setStopField013(BigDecimal stopField013) { this.stopField013 = stopField013; }

    public String getStopField014() { return stopField014; }
    public void setStopField014(String stopField014) { this.stopField014 = stopField014; }

    public BigDecimal getStopField015() { return stopField015; }
    public void setStopField015(BigDecimal stopField015) { this.stopField015 = stopField015; }

    public LocalDate getStopField016() { return stopField016; }
    public void setStopField016(LocalDate stopField016) { this.stopField016 = stopField016; }

    public LocalDate getStopField017() { return stopField017; }
    public void setStopField017(LocalDate stopField017) { this.stopField017 = stopField017; }

    @Override
    public String toString() {
        return "StopDto034{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
