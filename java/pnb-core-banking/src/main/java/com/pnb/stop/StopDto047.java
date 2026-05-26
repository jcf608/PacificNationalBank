package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto047 — Data Transfer Object for stop operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto047 {

    @JsonProperty("stopField000")
    private Long stopField000;

    @JsonProperty("stopField001")
    private Long stopField001;

    @JsonProperty("stopField002")
    private Double stopField002;

    @Size(max = 200)
    @JsonProperty("stopField003")
    private String stopField003;

    @Size(max = 200)
    @JsonProperty("stopField004")
    private String stopField004;

    @JsonProperty("stopField005")
    private Double stopField005;

    @Size(max = 60)
    @JsonProperty("stopField006")
    private String stopField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField007")
    private BigDecimal stopField007;

    @JsonProperty("stopField008")
    private Integer stopField008;

    @Size(max = 20)
    @JsonProperty("stopField009")
    private String stopField009;

    @JsonProperty("stopField010")
    private Boolean stopField010;

    @JsonProperty("stopField011")
    private Boolean stopField011;

    @JsonProperty("stopField012")
    private Integer stopField012;

    @JsonProperty("stopField013")
    private Double stopField013;

    @JsonProperty("stopField014")
    private Long stopField014;

    @JsonProperty("stopField015")
    private Long stopField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField016")
    private BigDecimal stopField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField017")
    private BigDecimal stopField017;

    @JsonProperty("stopField018")
    private Integer stopField018;

    public StopDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto047 instance = new StopDto047();

        public Builder stopField000(Long val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Long val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Double val) { instance.stopField002 = val; return this; }
        public Builder stopField003(String val) { instance.stopField003 = val; return this; }
        public Builder stopField004(String val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Double val) { instance.stopField005 = val; return this; }
        public Builder stopField006(String val) { instance.stopField006 = val; return this; }
        public Builder stopField007(BigDecimal val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Integer val) { instance.stopField008 = val; return this; }
        public Builder stopField009(String val) { instance.stopField009 = val; return this; }
        public Builder stopField010(Boolean val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Boolean val) { instance.stopField011 = val; return this; }
        public Builder stopField012(Integer val) { instance.stopField012 = val; return this; }
        public Builder stopField013(Double val) { instance.stopField013 = val; return this; }
        public Builder stopField014(Long val) { instance.stopField014 = val; return this; }
        public Builder stopField015(Long val) { instance.stopField015 = val; return this; }
        public Builder stopField016(BigDecimal val) { instance.stopField016 = val; return this; }
        public Builder stopField017(BigDecimal val) { instance.stopField017 = val; return this; }
        public Builder stopField018(Integer val) { instance.stopField018 = val; return this; }
        public StopDto047 build() { return instance; }
    }

    public Long getStopField000() { return stopField000; }
    public void setStopField000(Long stopField000) { this.stopField000 = stopField000; }

    public Long getStopField001() { return stopField001; }
    public void setStopField001(Long stopField001) { this.stopField001 = stopField001; }

    public Double getStopField002() { return stopField002; }
    public void setStopField002(Double stopField002) { this.stopField002 = stopField002; }

    public String getStopField003() { return stopField003; }
    public void setStopField003(String stopField003) { this.stopField003 = stopField003; }

    public String getStopField004() { return stopField004; }
    public void setStopField004(String stopField004) { this.stopField004 = stopField004; }

    public Double getStopField005() { return stopField005; }
    public void setStopField005(Double stopField005) { this.stopField005 = stopField005; }

    public String getStopField006() { return stopField006; }
    public void setStopField006(String stopField006) { this.stopField006 = stopField006; }

    public BigDecimal getStopField007() { return stopField007; }
    public void setStopField007(BigDecimal stopField007) { this.stopField007 = stopField007; }

    public Integer getStopField008() { return stopField008; }
    public void setStopField008(Integer stopField008) { this.stopField008 = stopField008; }

    public String getStopField009() { return stopField009; }
    public void setStopField009(String stopField009) { this.stopField009 = stopField009; }

    public Boolean getStopField010() { return stopField010; }
    public void setStopField010(Boolean stopField010) { this.stopField010 = stopField010; }

    public Boolean getStopField011() { return stopField011; }
    public void setStopField011(Boolean stopField011) { this.stopField011 = stopField011; }

    public Integer getStopField012() { return stopField012; }
    public void setStopField012(Integer stopField012) { this.stopField012 = stopField012; }

    public Double getStopField013() { return stopField013; }
    public void setStopField013(Double stopField013) { this.stopField013 = stopField013; }

    public Long getStopField014() { return stopField014; }
    public void setStopField014(Long stopField014) { this.stopField014 = stopField014; }

    public Long getStopField015() { return stopField015; }
    public void setStopField015(Long stopField015) { this.stopField015 = stopField015; }

    public BigDecimal getStopField016() { return stopField016; }
    public void setStopField016(BigDecimal stopField016) { this.stopField016 = stopField016; }

    public BigDecimal getStopField017() { return stopField017; }
    public void setStopField017(BigDecimal stopField017) { this.stopField017 = stopField017; }

    public Integer getStopField018() { return stopField018; }
    public void setStopField018(Integer stopField018) { this.stopField018 = stopField018; }

    @Override
    public String toString() {
        return "StopDto047{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
