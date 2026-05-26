package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto032 — Data Transfer Object for stop operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto032 {

    @JsonProperty("stopField000")
    private Integer stopField000;

    @JsonProperty("stopField001")
    private Boolean stopField001;

    @JsonProperty("stopField002")
    private Integer stopField002;

    @JsonProperty("stopField003")
    private Boolean stopField003;

    @JsonProperty("stopField004")
    private LocalDate stopField004;

    @Size(max = 100)
    @JsonProperty("stopField005")
    private String stopField005;

    @JsonProperty("stopField006")
    private Double stopField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField007")
    private BigDecimal stopField007;

    @JsonProperty("stopField008")
    private Boolean stopField008;

    @JsonProperty("stopField009")
    private LocalDate stopField009;

    @Size(max = 100)
    @JsonProperty("stopField010")
    private String stopField010;

    @JsonProperty("stopField011")
    private Long stopField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField012")
    private BigDecimal stopField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField013")
    private BigDecimal stopField013;

    @Size(max = 20)
    @JsonProperty("stopField014")
    private String stopField014;

    @JsonProperty("stopField015")
    private Boolean stopField015;

    public StopDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto032 instance = new StopDto032();

        public Builder stopField000(Integer val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Boolean val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Integer val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Boolean val) { instance.stopField003 = val; return this; }
        public Builder stopField004(LocalDate val) { instance.stopField004 = val; return this; }
        public Builder stopField005(String val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Double val) { instance.stopField006 = val; return this; }
        public Builder stopField007(BigDecimal val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Boolean val) { instance.stopField008 = val; return this; }
        public Builder stopField009(LocalDate val) { instance.stopField009 = val; return this; }
        public Builder stopField010(String val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Long val) { instance.stopField011 = val; return this; }
        public Builder stopField012(BigDecimal val) { instance.stopField012 = val; return this; }
        public Builder stopField013(BigDecimal val) { instance.stopField013 = val; return this; }
        public Builder stopField014(String val) { instance.stopField014 = val; return this; }
        public Builder stopField015(Boolean val) { instance.stopField015 = val; return this; }
        public StopDto032 build() { return instance; }
    }

    public Integer getStopField000() { return stopField000; }
    public void setStopField000(Integer stopField000) { this.stopField000 = stopField000; }

    public Boolean getStopField001() { return stopField001; }
    public void setStopField001(Boolean stopField001) { this.stopField001 = stopField001; }

    public Integer getStopField002() { return stopField002; }
    public void setStopField002(Integer stopField002) { this.stopField002 = stopField002; }

    public Boolean getStopField003() { return stopField003; }
    public void setStopField003(Boolean stopField003) { this.stopField003 = stopField003; }

    public LocalDate getStopField004() { return stopField004; }
    public void setStopField004(LocalDate stopField004) { this.stopField004 = stopField004; }

    public String getStopField005() { return stopField005; }
    public void setStopField005(String stopField005) { this.stopField005 = stopField005; }

    public Double getStopField006() { return stopField006; }
    public void setStopField006(Double stopField006) { this.stopField006 = stopField006; }

    public BigDecimal getStopField007() { return stopField007; }
    public void setStopField007(BigDecimal stopField007) { this.stopField007 = stopField007; }

    public Boolean getStopField008() { return stopField008; }
    public void setStopField008(Boolean stopField008) { this.stopField008 = stopField008; }

    public LocalDate getStopField009() { return stopField009; }
    public void setStopField009(LocalDate stopField009) { this.stopField009 = stopField009; }

    public String getStopField010() { return stopField010; }
    public void setStopField010(String stopField010) { this.stopField010 = stopField010; }

    public Long getStopField011() { return stopField011; }
    public void setStopField011(Long stopField011) { this.stopField011 = stopField011; }

    public BigDecimal getStopField012() { return stopField012; }
    public void setStopField012(BigDecimal stopField012) { this.stopField012 = stopField012; }

    public BigDecimal getStopField013() { return stopField013; }
    public void setStopField013(BigDecimal stopField013) { this.stopField013 = stopField013; }

    public String getStopField014() { return stopField014; }
    public void setStopField014(String stopField014) { this.stopField014 = stopField014; }

    public Boolean getStopField015() { return stopField015; }
    public void setStopField015(Boolean stopField015) { this.stopField015 = stopField015; }

    @Override
    public String toString() {
        return "StopDto032{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
