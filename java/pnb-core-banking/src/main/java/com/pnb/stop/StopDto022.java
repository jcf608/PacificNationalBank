package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto022 — Data Transfer Object for stop operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto022 {

    @Size(max = 40)
    @JsonProperty("stopField000")
    private String stopField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField001")
    private BigDecimal stopField001;

    @JsonProperty("stopField002")
    private Boolean stopField002;

    @JsonProperty("stopField003")
    private Long stopField003;

    @Size(max = 40)
    @JsonProperty("stopField004")
    private String stopField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField005")
    private BigDecimal stopField005;

    @JsonProperty("stopField006")
    private Long stopField006;

    @JsonProperty("stopField007")
    private Long stopField007;

    @JsonProperty("stopField008")
    private LocalDate stopField008;

    @JsonProperty("stopField009")
    private Boolean stopField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField010")
    private BigDecimal stopField010;

    @JsonProperty("stopField011")
    private Long stopField011;

    @JsonProperty("stopField012")
    private Boolean stopField012;

    @Size(max = 100)
    @JsonProperty("stopField013")
    private String stopField013;

    @JsonProperty("stopField014")
    private Double stopField014;

    @Size(max = 20)
    @JsonProperty("stopField015")
    private String stopField015;

    @JsonProperty("stopField016")
    private Long stopField016;

    @Size(max = 20)
    @JsonProperty("stopField017")
    private String stopField017;

    public StopDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto022 instance = new StopDto022();

        public Builder stopField000(String val) { instance.stopField000 = val; return this; }
        public Builder stopField001(BigDecimal val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Boolean val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Long val) { instance.stopField003 = val; return this; }
        public Builder stopField004(String val) { instance.stopField004 = val; return this; }
        public Builder stopField005(BigDecimal val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Long val) { instance.stopField006 = val; return this; }
        public Builder stopField007(Long val) { instance.stopField007 = val; return this; }
        public Builder stopField008(LocalDate val) { instance.stopField008 = val; return this; }
        public Builder stopField009(Boolean val) { instance.stopField009 = val; return this; }
        public Builder stopField010(BigDecimal val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Long val) { instance.stopField011 = val; return this; }
        public Builder stopField012(Boolean val) { instance.stopField012 = val; return this; }
        public Builder stopField013(String val) { instance.stopField013 = val; return this; }
        public Builder stopField014(Double val) { instance.stopField014 = val; return this; }
        public Builder stopField015(String val) { instance.stopField015 = val; return this; }
        public Builder stopField016(Long val) { instance.stopField016 = val; return this; }
        public Builder stopField017(String val) { instance.stopField017 = val; return this; }
        public StopDto022 build() { return instance; }
    }

    public String getStopField000() { return stopField000; }
    public void setStopField000(String stopField000) { this.stopField000 = stopField000; }

    public BigDecimal getStopField001() { return stopField001; }
    public void setStopField001(BigDecimal stopField001) { this.stopField001 = stopField001; }

    public Boolean getStopField002() { return stopField002; }
    public void setStopField002(Boolean stopField002) { this.stopField002 = stopField002; }

    public Long getStopField003() { return stopField003; }
    public void setStopField003(Long stopField003) { this.stopField003 = stopField003; }

    public String getStopField004() { return stopField004; }
    public void setStopField004(String stopField004) { this.stopField004 = stopField004; }

    public BigDecimal getStopField005() { return stopField005; }
    public void setStopField005(BigDecimal stopField005) { this.stopField005 = stopField005; }

    public Long getStopField006() { return stopField006; }
    public void setStopField006(Long stopField006) { this.stopField006 = stopField006; }

    public Long getStopField007() { return stopField007; }
    public void setStopField007(Long stopField007) { this.stopField007 = stopField007; }

    public LocalDate getStopField008() { return stopField008; }
    public void setStopField008(LocalDate stopField008) { this.stopField008 = stopField008; }

    public Boolean getStopField009() { return stopField009; }
    public void setStopField009(Boolean stopField009) { this.stopField009 = stopField009; }

    public BigDecimal getStopField010() { return stopField010; }
    public void setStopField010(BigDecimal stopField010) { this.stopField010 = stopField010; }

    public Long getStopField011() { return stopField011; }
    public void setStopField011(Long stopField011) { this.stopField011 = stopField011; }

    public Boolean getStopField012() { return stopField012; }
    public void setStopField012(Boolean stopField012) { this.stopField012 = stopField012; }

    public String getStopField013() { return stopField013; }
    public void setStopField013(String stopField013) { this.stopField013 = stopField013; }

    public Double getStopField014() { return stopField014; }
    public void setStopField014(Double stopField014) { this.stopField014 = stopField014; }

    public String getStopField015() { return stopField015; }
    public void setStopField015(String stopField015) { this.stopField015 = stopField015; }

    public Long getStopField016() { return stopField016; }
    public void setStopField016(Long stopField016) { this.stopField016 = stopField016; }

    public String getStopField017() { return stopField017; }
    public void setStopField017(String stopField017) { this.stopField017 = stopField017; }

    @Override
    public String toString() {
        return "StopDto022{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
