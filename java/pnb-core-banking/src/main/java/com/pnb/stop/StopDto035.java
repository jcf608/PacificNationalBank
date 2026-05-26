package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto035 — Data Transfer Object for stop operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto035 {

    @JsonProperty("stopField000")
    private Integer stopField000;

    @JsonProperty("stopField001")
    private LocalDate stopField001;

    @JsonProperty("stopField002")
    private Integer stopField002;

    @JsonProperty("stopField003")
    private Boolean stopField003;

    @JsonProperty("stopField004")
    private Boolean stopField004;

    @JsonProperty("stopField005")
    private LocalDate stopField005;

    @JsonProperty("stopField006")
    private Boolean stopField006;

    @Size(max = 200)
    @JsonProperty("stopField007")
    private String stopField007;

    @JsonProperty("stopField008")
    private Double stopField008;

    @Size(max = 100)
    @JsonProperty("stopField009")
    private String stopField009;

    @Size(max = 200)
    @JsonProperty("stopField010")
    private String stopField010;

    @JsonProperty("stopField011")
    private Double stopField011;

    @Size(max = 100)
    @JsonProperty("stopField012")
    private String stopField012;

    @JsonProperty("stopField013")
    private Integer stopField013;

    @JsonProperty("stopField014")
    private Long stopField014;

    @JsonProperty("stopField015")
    private Integer stopField015;

    @JsonProperty("stopField016")
    private Double stopField016;

    @JsonProperty("stopField017")
    private Integer stopField017;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField018")
    private BigDecimal stopField018;

    public StopDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto035 instance = new StopDto035();

        public Builder stopField000(Integer val) { instance.stopField000 = val; return this; }
        public Builder stopField001(LocalDate val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Integer val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Boolean val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Boolean val) { instance.stopField004 = val; return this; }
        public Builder stopField005(LocalDate val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Boolean val) { instance.stopField006 = val; return this; }
        public Builder stopField007(String val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Double val) { instance.stopField008 = val; return this; }
        public Builder stopField009(String val) { instance.stopField009 = val; return this; }
        public Builder stopField010(String val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Double val) { instance.stopField011 = val; return this; }
        public Builder stopField012(String val) { instance.stopField012 = val; return this; }
        public Builder stopField013(Integer val) { instance.stopField013 = val; return this; }
        public Builder stopField014(Long val) { instance.stopField014 = val; return this; }
        public Builder stopField015(Integer val) { instance.stopField015 = val; return this; }
        public Builder stopField016(Double val) { instance.stopField016 = val; return this; }
        public Builder stopField017(Integer val) { instance.stopField017 = val; return this; }
        public Builder stopField018(BigDecimal val) { instance.stopField018 = val; return this; }
        public StopDto035 build() { return instance; }
    }

    public Integer getStopField000() { return stopField000; }
    public void setStopField000(Integer stopField000) { this.stopField000 = stopField000; }

    public LocalDate getStopField001() { return stopField001; }
    public void setStopField001(LocalDate stopField001) { this.stopField001 = stopField001; }

    public Integer getStopField002() { return stopField002; }
    public void setStopField002(Integer stopField002) { this.stopField002 = stopField002; }

    public Boolean getStopField003() { return stopField003; }
    public void setStopField003(Boolean stopField003) { this.stopField003 = stopField003; }

    public Boolean getStopField004() { return stopField004; }
    public void setStopField004(Boolean stopField004) { this.stopField004 = stopField004; }

    public LocalDate getStopField005() { return stopField005; }
    public void setStopField005(LocalDate stopField005) { this.stopField005 = stopField005; }

    public Boolean getStopField006() { return stopField006; }
    public void setStopField006(Boolean stopField006) { this.stopField006 = stopField006; }

    public String getStopField007() { return stopField007; }
    public void setStopField007(String stopField007) { this.stopField007 = stopField007; }

    public Double getStopField008() { return stopField008; }
    public void setStopField008(Double stopField008) { this.stopField008 = stopField008; }

    public String getStopField009() { return stopField009; }
    public void setStopField009(String stopField009) { this.stopField009 = stopField009; }

    public String getStopField010() { return stopField010; }
    public void setStopField010(String stopField010) { this.stopField010 = stopField010; }

    public Double getStopField011() { return stopField011; }
    public void setStopField011(Double stopField011) { this.stopField011 = stopField011; }

    public String getStopField012() { return stopField012; }
    public void setStopField012(String stopField012) { this.stopField012 = stopField012; }

    public Integer getStopField013() { return stopField013; }
    public void setStopField013(Integer stopField013) { this.stopField013 = stopField013; }

    public Long getStopField014() { return stopField014; }
    public void setStopField014(Long stopField014) { this.stopField014 = stopField014; }

    public Integer getStopField015() { return stopField015; }
    public void setStopField015(Integer stopField015) { this.stopField015 = stopField015; }

    public Double getStopField016() { return stopField016; }
    public void setStopField016(Double stopField016) { this.stopField016 = stopField016; }

    public Integer getStopField017() { return stopField017; }
    public void setStopField017(Integer stopField017) { this.stopField017 = stopField017; }

    public BigDecimal getStopField018() { return stopField018; }
    public void setStopField018(BigDecimal stopField018) { this.stopField018 = stopField018; }

    @Override
    public String toString() {
        return "StopDto035{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
