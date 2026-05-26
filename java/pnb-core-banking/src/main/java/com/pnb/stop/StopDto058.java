package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto058 — Data Transfer Object for stop operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto058 {

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField000")
    private BigDecimal stopField000;

    @JsonProperty("stopField001")
    private LocalDate stopField001;

    @JsonProperty("stopField002")
    private Boolean stopField002;

    @JsonProperty("stopField003")
    private LocalDate stopField003;

    @JsonProperty("stopField004")
    private Integer stopField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField005")
    private BigDecimal stopField005;

    @JsonProperty("stopField006")
    private Integer stopField006;

    @Size(max = 60)
    @JsonProperty("stopField007")
    private String stopField007;

    @JsonProperty("stopField008")
    private Long stopField008;

    @JsonProperty("stopField009")
    private Boolean stopField009;

    @JsonProperty("stopField010")
    private Integer stopField010;

    @JsonProperty("stopField011")
    private Boolean stopField011;

    @Size(max = 60)
    @JsonProperty("stopField012")
    private String stopField012;

    @JsonProperty("stopField013")
    private Boolean stopField013;

    @JsonProperty("stopField014")
    private Boolean stopField014;

    @JsonProperty("stopField015")
    private LocalDate stopField015;

    @JsonProperty("stopField016")
    private Long stopField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField017")
    private BigDecimal stopField017;

    public StopDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto058 instance = new StopDto058();

        public Builder stopField000(BigDecimal val) { instance.stopField000 = val; return this; }
        public Builder stopField001(LocalDate val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Boolean val) { instance.stopField002 = val; return this; }
        public Builder stopField003(LocalDate val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Integer val) { instance.stopField004 = val; return this; }
        public Builder stopField005(BigDecimal val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Integer val) { instance.stopField006 = val; return this; }
        public Builder stopField007(String val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Long val) { instance.stopField008 = val; return this; }
        public Builder stopField009(Boolean val) { instance.stopField009 = val; return this; }
        public Builder stopField010(Integer val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Boolean val) { instance.stopField011 = val; return this; }
        public Builder stopField012(String val) { instance.stopField012 = val; return this; }
        public Builder stopField013(Boolean val) { instance.stopField013 = val; return this; }
        public Builder stopField014(Boolean val) { instance.stopField014 = val; return this; }
        public Builder stopField015(LocalDate val) { instance.stopField015 = val; return this; }
        public Builder stopField016(Long val) { instance.stopField016 = val; return this; }
        public Builder stopField017(BigDecimal val) { instance.stopField017 = val; return this; }
        public StopDto058 build() { return instance; }
    }

    public BigDecimal getStopField000() { return stopField000; }
    public void setStopField000(BigDecimal stopField000) { this.stopField000 = stopField000; }

    public LocalDate getStopField001() { return stopField001; }
    public void setStopField001(LocalDate stopField001) { this.stopField001 = stopField001; }

    public Boolean getStopField002() { return stopField002; }
    public void setStopField002(Boolean stopField002) { this.stopField002 = stopField002; }

    public LocalDate getStopField003() { return stopField003; }
    public void setStopField003(LocalDate stopField003) { this.stopField003 = stopField003; }

    public Integer getStopField004() { return stopField004; }
    public void setStopField004(Integer stopField004) { this.stopField004 = stopField004; }

    public BigDecimal getStopField005() { return stopField005; }
    public void setStopField005(BigDecimal stopField005) { this.stopField005 = stopField005; }

    public Integer getStopField006() { return stopField006; }
    public void setStopField006(Integer stopField006) { this.stopField006 = stopField006; }

    public String getStopField007() { return stopField007; }
    public void setStopField007(String stopField007) { this.stopField007 = stopField007; }

    public Long getStopField008() { return stopField008; }
    public void setStopField008(Long stopField008) { this.stopField008 = stopField008; }

    public Boolean getStopField009() { return stopField009; }
    public void setStopField009(Boolean stopField009) { this.stopField009 = stopField009; }

    public Integer getStopField010() { return stopField010; }
    public void setStopField010(Integer stopField010) { this.stopField010 = stopField010; }

    public Boolean getStopField011() { return stopField011; }
    public void setStopField011(Boolean stopField011) { this.stopField011 = stopField011; }

    public String getStopField012() { return stopField012; }
    public void setStopField012(String stopField012) { this.stopField012 = stopField012; }

    public Boolean getStopField013() { return stopField013; }
    public void setStopField013(Boolean stopField013) { this.stopField013 = stopField013; }

    public Boolean getStopField014() { return stopField014; }
    public void setStopField014(Boolean stopField014) { this.stopField014 = stopField014; }

    public LocalDate getStopField015() { return stopField015; }
    public void setStopField015(LocalDate stopField015) { this.stopField015 = stopField015; }

    public Long getStopField016() { return stopField016; }
    public void setStopField016(Long stopField016) { this.stopField016 = stopField016; }

    public BigDecimal getStopField017() { return stopField017; }
    public void setStopField017(BigDecimal stopField017) { this.stopField017 = stopField017; }

    @Override
    public String toString() {
        return "StopDto058{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
