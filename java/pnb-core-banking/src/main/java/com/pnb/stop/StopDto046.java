package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto046 — Data Transfer Object for stop operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto046 {

    @JsonProperty("stopField000")
    private Integer stopField000;

    @JsonProperty("stopField001")
    private Double stopField001;

    @JsonProperty("stopField002")
    private LocalDate stopField002;

    @JsonProperty("stopField003")
    private Boolean stopField003;

    @JsonProperty("stopField004")
    private LocalDate stopField004;

    @Size(max = 60)
    @JsonProperty("stopField005")
    private String stopField005;

    @JsonProperty("stopField006")
    private Double stopField006;

    @Size(max = 60)
    @JsonProperty("stopField007")
    private String stopField007;

    @JsonProperty("stopField008")
    private Integer stopField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField009")
    private BigDecimal stopField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField010")
    private BigDecimal stopField010;

    @JsonProperty("stopField011")
    private Double stopField011;

    @JsonProperty("stopField012")
    private LocalDate stopField012;

    @Size(max = 40)
    @JsonProperty("stopField013")
    private String stopField013;

    @JsonProperty("stopField014")
    private Boolean stopField014;

    @JsonProperty("stopField015")
    private Double stopField015;

    @JsonProperty("stopField016")
    private Double stopField016;

    @JsonProperty("stopField017")
    private Integer stopField017;

    public StopDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto046 instance = new StopDto046();

        public Builder stopField000(Integer val) { instance.stopField000 = val; return this; }
        public Builder stopField001(Double val) { instance.stopField001 = val; return this; }
        public Builder stopField002(LocalDate val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Boolean val) { instance.stopField003 = val; return this; }
        public Builder stopField004(LocalDate val) { instance.stopField004 = val; return this; }
        public Builder stopField005(String val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Double val) { instance.stopField006 = val; return this; }
        public Builder stopField007(String val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Integer val) { instance.stopField008 = val; return this; }
        public Builder stopField009(BigDecimal val) { instance.stopField009 = val; return this; }
        public Builder stopField010(BigDecimal val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Double val) { instance.stopField011 = val; return this; }
        public Builder stopField012(LocalDate val) { instance.stopField012 = val; return this; }
        public Builder stopField013(String val) { instance.stopField013 = val; return this; }
        public Builder stopField014(Boolean val) { instance.stopField014 = val; return this; }
        public Builder stopField015(Double val) { instance.stopField015 = val; return this; }
        public Builder stopField016(Double val) { instance.stopField016 = val; return this; }
        public Builder stopField017(Integer val) { instance.stopField017 = val; return this; }
        public StopDto046 build() { return instance; }
    }

    public Integer getStopField000() { return stopField000; }
    public void setStopField000(Integer stopField000) { this.stopField000 = stopField000; }

    public Double getStopField001() { return stopField001; }
    public void setStopField001(Double stopField001) { this.stopField001 = stopField001; }

    public LocalDate getStopField002() { return stopField002; }
    public void setStopField002(LocalDate stopField002) { this.stopField002 = stopField002; }

    public Boolean getStopField003() { return stopField003; }
    public void setStopField003(Boolean stopField003) { this.stopField003 = stopField003; }

    public LocalDate getStopField004() { return stopField004; }
    public void setStopField004(LocalDate stopField004) { this.stopField004 = stopField004; }

    public String getStopField005() { return stopField005; }
    public void setStopField005(String stopField005) { this.stopField005 = stopField005; }

    public Double getStopField006() { return stopField006; }
    public void setStopField006(Double stopField006) { this.stopField006 = stopField006; }

    public String getStopField007() { return stopField007; }
    public void setStopField007(String stopField007) { this.stopField007 = stopField007; }

    public Integer getStopField008() { return stopField008; }
    public void setStopField008(Integer stopField008) { this.stopField008 = stopField008; }

    public BigDecimal getStopField009() { return stopField009; }
    public void setStopField009(BigDecimal stopField009) { this.stopField009 = stopField009; }

    public BigDecimal getStopField010() { return stopField010; }
    public void setStopField010(BigDecimal stopField010) { this.stopField010 = stopField010; }

    public Double getStopField011() { return stopField011; }
    public void setStopField011(Double stopField011) { this.stopField011 = stopField011; }

    public LocalDate getStopField012() { return stopField012; }
    public void setStopField012(LocalDate stopField012) { this.stopField012 = stopField012; }

    public String getStopField013() { return stopField013; }
    public void setStopField013(String stopField013) { this.stopField013 = stopField013; }

    public Boolean getStopField014() { return stopField014; }
    public void setStopField014(Boolean stopField014) { this.stopField014 = stopField014; }

    public Double getStopField015() { return stopField015; }
    public void setStopField015(Double stopField015) { this.stopField015 = stopField015; }

    public Double getStopField016() { return stopField016; }
    public void setStopField016(Double stopField016) { this.stopField016 = stopField016; }

    public Integer getStopField017() { return stopField017; }
    public void setStopField017(Integer stopField017) { this.stopField017 = stopField017; }

    @Override
    public String toString() {
        return "StopDto046{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
