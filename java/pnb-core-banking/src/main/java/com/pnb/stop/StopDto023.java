package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto023 — Data Transfer Object for stop operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto023 {

    @Size(max = 60)
    @JsonProperty("stopField000")
    private String stopField000;

    @JsonProperty("stopField001")
    private Long stopField001;

    @JsonProperty("stopField002")
    private Integer stopField002;

    @Size(max = 60)
    @JsonProperty("stopField003")
    private String stopField003;

    @JsonProperty("stopField004")
    private LocalDate stopField004;

    @JsonProperty("stopField005")
    private Integer stopField005;

    @JsonProperty("stopField006")
    private Double stopField006;

    @JsonProperty("stopField007")
    private LocalDate stopField007;

    @Size(max = 60)
    @JsonProperty("stopField008")
    private String stopField008;

    @JsonProperty("stopField009")
    private LocalDate stopField009;

    @JsonProperty("stopField010")
    private Boolean stopField010;

    @Size(max = 40)
    @JsonProperty("stopField011")
    private String stopField011;

    @JsonProperty("stopField012")
    private Double stopField012;

    @JsonProperty("stopField013")
    private Boolean stopField013;

    @JsonProperty("stopField014")
    private Long stopField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField015")
    private BigDecimal stopField015;

    @JsonProperty("stopField016")
    private LocalDate stopField016;

    @JsonProperty("stopField017")
    private Boolean stopField017;

    @JsonProperty("stopField018")
    private Boolean stopField018;

    public StopDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto023 instance = new StopDto023();

        public Builder stopField000(String val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Long val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Integer val) { instance.stopField002 = val; return this; }
        public Builder stopField003(String val) { instance.stopField003 = val; return this; }
        public Builder stopField004(LocalDate val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Integer val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Double val) { instance.stopField006 = val; return this; }
        public Builder stopField007(LocalDate val) { instance.stopField007 = val; return this; }
        public Builder stopField008(String val) { instance.stopField008 = val; return this; }
        public Builder stopField009(LocalDate val) { instance.stopField009 = val; return this; }
        public Builder stopField010(Boolean val) { instance.stopField010 = val; return this; }
        public Builder stopField011(String val) { instance.stopField011 = val; return this; }
        public Builder stopField012(Double val) { instance.stopField012 = val; return this; }
        public Builder stopField013(Boolean val) { instance.stopField013 = val; return this; }
        public Builder stopField014(Long val) { instance.stopField014 = val; return this; }
        public Builder stopField015(BigDecimal val) { instance.stopField015 = val; return this; }
        public Builder stopField016(LocalDate val) { instance.stopField016 = val; return this; }
        public Builder stopField017(Boolean val) { instance.stopField017 = val; return this; }
        public Builder stopField018(Boolean val) { instance.stopField018 = val; return this; }
        public StopDto023 build() { return instance; }
    }

    public String getStopField000() { return stopField000; }
    public void setStopField000(String stopField000) { this.stopField000 = stopField000; }

    public Long getStopField001() { return stopField001; }
    public void setStopField001(Long stopField001) { this.stopField001 = stopField001; }

    public Integer getStopField002() { return stopField002; }
    public void setStopField002(Integer stopField002) { this.stopField002 = stopField002; }

    public String getStopField003() { return stopField003; }
    public void setStopField003(String stopField003) { this.stopField003 = stopField003; }

    public LocalDate getStopField004() { return stopField004; }
    public void setStopField004(LocalDate stopField004) { this.stopField004 = stopField004; }

    public Integer getStopField005() { return stopField005; }
    public void setStopField005(Integer stopField005) { this.stopField005 = stopField005; }

    public Double getStopField006() { return stopField006; }
    public void setStopField006(Double stopField006) { this.stopField006 = stopField006; }

    public LocalDate getStopField007() { return stopField007; }
    public void setStopField007(LocalDate stopField007) { this.stopField007 = stopField007; }

    public String getStopField008() { return stopField008; }
    public void setStopField008(String stopField008) { this.stopField008 = stopField008; }

    public LocalDate getStopField009() { return stopField009; }
    public void setStopField009(LocalDate stopField009) { this.stopField009 = stopField009; }

    public Boolean getStopField010() { return stopField010; }
    public void setStopField010(Boolean stopField010) { this.stopField010 = stopField010; }

    public String getStopField011() { return stopField011; }
    public void setStopField011(String stopField011) { this.stopField011 = stopField011; }

    public Double getStopField012() { return stopField012; }
    public void setStopField012(Double stopField012) { this.stopField012 = stopField012; }

    public Boolean getStopField013() { return stopField013; }
    public void setStopField013(Boolean stopField013) { this.stopField013 = stopField013; }

    public Long getStopField014() { return stopField014; }
    public void setStopField014(Long stopField014) { this.stopField014 = stopField014; }

    public BigDecimal getStopField015() { return stopField015; }
    public void setStopField015(BigDecimal stopField015) { this.stopField015 = stopField015; }

    public LocalDate getStopField016() { return stopField016; }
    public void setStopField016(LocalDate stopField016) { this.stopField016 = stopField016; }

    public Boolean getStopField017() { return stopField017; }
    public void setStopField017(Boolean stopField017) { this.stopField017 = stopField017; }

    public Boolean getStopField018() { return stopField018; }
    public void setStopField018(Boolean stopField018) { this.stopField018 = stopField018; }

    @Override
    public String toString() {
        return "StopDto023{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
